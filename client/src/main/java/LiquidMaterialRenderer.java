import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class LiquidMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	private int anInt4829 = -1;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	private int anInt4831 = -1;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	private int anInt4830;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public LiquidMaterialRenderer() {
		if (this.anInt4831 < 0 && (GlRenderer.arbVertexProgramSupported && GlRenderer.maxTextureUnits >= 2)) {
			@Pc(19) int[] local19 = new int[1];
			@Pc(21) GL2 local21 = GlRenderer.gl;
			local21.glGenProgramsARB(1, local19, 0);
			this.anInt4830 = local19[0];
			@Pc(42) int[][] local42 = Static33.method874(0.4F);
			@Pc(53) int[][] local53 = Static33.method874(0.4F);
			@Pc(58) Buffer local58 = new Buffer(262144);
			for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
				@Pc(67) int[] local67 = local42[local60];
				@Pc(71) int[] local71 = local53[local60];
				for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
					if (GlRenderer.bigEndian) {
						local58.pFloat((float) local67[local73] / 4096.0F);
						local58.pFloat((float) local71[local73] / 4096.0F);
						local58.pFloat(1.0F);
						local58.pFloat(1.0F);
					} else {
						local58.gFloat((float) local67[local73] / 4096.0F);
						local58.gFloat((float) local71[local73] / 4096.0F);
						local58.gFloat(1.0F);
						local58.gFloat(1.0F);
					}
				}
			}
			@Pc(141) ByteBuffer local141 = ByteBuffer.allocateDirect(local58.offset).order(ByteOrder.nativeOrder());
			local141.put(local58.data, 0, local58.offset);
			local141.flip();
			this.aFloatBuffer1 = local141.asFloatBuffer().asReadOnlyBuffer();
			this.method3719();
			this.method3720();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
	@Override
	public final void method4602() {
		if (this.anInt4831 >= 0) {
			@Pc(5) GL2 local5 = GlRenderer.gl;
			local5.glCallList(this.anInt4831 + 1);
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()I")
	@Override
	public final int method4605() {
		return 0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
	@Override
	public final void method4603() {
		if (this.anInt4831 < 0) {
			return;
		}
		@Pc(5) GL2 local5 = GlRenderer.gl;
		local5.glCallList(this.anInt4831);
		local5.glActiveTexture(GL2.GL_TEXTURE1);
		local5.glMatrixMode(GL2.GL_TEXTURE);
		local5.glTranslatef((float) Static12.anInt406, (float) Static199.anInt4675, (float) Static230.anInt5158);
		local5.glRotatef(-((float) Static59.anInt1815 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static254.anInt5559 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local5.glMatrixMode(GL2.GL_MODELVIEW);
		if (!Static151.aBoolean176) {
			local5.glBindTexture(GL2.GL_TEXTURE_2D, Static151.anIntArray341[(int) ((float) (GlRenderer.anInt5323 * 64) * 0.005F) % 64]);
		}
		local5.glActiveTexture(GL2.GL_TEXTURE0);
		if (this.anInt4829 == GlRenderer.anInt5323) {
			return;
		}
		@Pc(85) int local85 = (GlRenderer.anInt5323 & 0xFF) * 256;
		for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
			this.aFloatBuffer1.position(local85);
			local5.glProgramLocalParameter4fvARB(GL2.GL_VERTEX_PROGRAM_ARB, local87, this.aFloatBuffer1);
			local85 += 4;
		}
		if (Static151.aBoolean176) {
			local5.glProgramLocalParameter4fARB(GL2.GL_VERTEX_PROGRAM_ARB, 65, (float) GlRenderer.anInt5323 * 0.005F, 0.0F, 0.0F, 1.0F);
		} else {
			local5.glProgramLocalParameter4fARB(GL2.GL_VERTEX_PROGRAM_ARB, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4829 = GlRenderer.anInt5323;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "()V")
	private void method3719() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		this.anInt4831 = local1.glGenLists(2);
		local1.glNewList(this.anInt4831, GL2.GL_COMPILE);
		local1.glActiveTexture(GL2.GL_TEXTURE1);
		if (Static151.aBoolean176) {
			local1.glBindTexture(GL2.GL_TEXTURE_3D, Static151.anInt3587);
		}
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_ADD);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_REPLACE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_PREVIOUS);
		local1.glActiveTexture(GL2.GL_TEXTURE0);
		local1.glBindProgramARB(GL2.GL_VERTEX_PROGRAM_ARB, this.anInt4830);
		local1.glEnable(GL2.GL_VERTEX_PROGRAM_ARB);
		local1.glEndList();
		local1.glNewList(this.anInt4831 + 1, GL2.GL_COMPILE);
		local1.glActiveTexture(GL2.GL_TEXTURE1);
		local1.glMatrixMode(GL2.GL_TEXTURE);
		local1.glLoadIdentity();
		local1.glMatrixMode(GL2.GL_MODELVIEW);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_TEXTURE);
		local1.glDisable(Static151.aBoolean176 ? GL2.GL_TEXTURE_3D : GL2.GL_TEXTURE_2D);
		local1.glActiveTexture(GL2.GL_TEXTURE0);
		local1.glBindProgramARB(GL2.GL_VERTEX_PROGRAM_ARB, 0);
		local1.glDisable(GL2.GL_VERTEX_PROGRAM_ARB);
		local1.glDisable(GL2.GL_FRAGMENT_PROGRAM_ARB);
		local1.glEndList();
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "()V")
	private void method3720() {
		if (this.anInt4831 < 0) {
			return;
		}
		@Pc(4) GL2 local4 = GlRenderer.gl;
		@Pc(7) int[] local7 = new int[1];
		local4.glBindProgramARB(GL2.GL_VERTEX_PROGRAM_ARB, this.anInt4830);
		local4.glProgramStringARB(GL2.GL_VERTEX_PROGRAM_ARB, GL2.GL_PROGRAM_FORMAT_ASCII_ARB, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
		local4.glGetIntegerv(GL2.GL_PROGRAM_ERROR_POSITION_ARB, local7, 0);
		if (local7[0] != -1) {
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	@Override
	public final void method4604(@OriginalArg(0) int arg0) {
		if (this.anInt4831 < 0) {
			return;
		}
		@Pc(5) GL2 local5 = GlRenderer.gl;
		local5.glActiveTexture(GL2.GL_TEXTURE1);
		if ((arg0 & 0x80) == 0) {
			local5.glEnable(Static151.aBoolean176 ? GL2.GL_TEXTURE_3D : GL2.GL_TEXTURE_2D);
		} else {
			local5.glDisable(Static151.aBoolean176 ? GL2.GL_TEXTURE_3D : GL2.GL_TEXTURE_2D);
		}
		local5.glActiveTexture(GL2.GL_TEXTURE0);
		if ((arg0 & 0x40) == 0) {
			local5.glGetFloatv(GL2.GL_LIGHT_MODEL_AMBIENT, Static212.aFloatArray24, 0);
			local5.glProgramLocalParameter4fvARB(GL2.GL_VERTEX_PROGRAM_ARB, 66, Static212.aFloatArray24, 0);
		} else {
			local5.glProgramLocalParameter4fARB(GL2.GL_VERTEX_PROGRAM_ARB, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		@Pc(58) int local58 = arg0 & 0x3;
		if (local58 == 2) {
			local5.glProgramLocalParameter4fARB(GL2.GL_VERTEX_PROGRAM_ARB, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local58 == 3) {
			local5.glProgramLocalParameter4fARB(GL2.GL_VERTEX_PROGRAM_ARB, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			local5.glProgramLocalParameter4fARB(GL2.GL_VERTEX_PROGRAM_ARB, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
