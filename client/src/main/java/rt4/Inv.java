package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Inv extends Node {

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "[I")
	public static final int[] updatedInventories = new int[32];
	@OriginalMember(owner = "client!kl", name = "u", descriptor = "Lclient!na;")
	public static final JagString aClass100_637 = JagString.parse("<col=ffffff>");
	@OriginalMember(owner = "client!ol", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_819 = JagString.parse("<col=00ff80>");
	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_559 = JagString.parse("<col=ffff00>");
	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_594 = JagString.parse("<)4col>");
	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public static int updatedInventoriesWriterIndex = 0;
	@OriginalMember(owner = "client!bj", name = "v", descriptor = "Lclient!sc;")
	public static HashTable objectContainerCache = new HashTable(32);
	@OriginalMember(owner = "client!qe", name = "p", descriptor = "[I")
	public int[] objectIds = new int[]{-1};

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "[I")
	public int[] anIntArray422 = new int[]{0};

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I")
	public static int getFreeSpace(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(17) Inv local17 = (Inv) objectContainerCache.get(arg0);
		if (local17 == null) {
			return InvTypeList.get(arg0).size;
		}
		@Pc(31) int freeSpaces = 0;
		for (@Pc(33) int id = 0; id < local17.objectIds.length; id++) {
			if (local17.objectIds[id] == -1) {
				freeSpaces++;
			}
		}
		return freeSpaces + InvTypeList.get(arg0).size - local17.objectIds.length;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZII)I")
	public static int getTotalParam(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Inv local19 = (Inv) objectContainerCache.get(arg1);
		if (local19 == null) {
			return 0;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local19.objectIds.length; local29++) {
			if (local19.objectIds[local29] >= 0 && ObjTypeList.capacity > local19.objectIds[local29]) {
				@Pc(56) ObjType local56 = ObjTypeList.get(local19.objectIds[local29]);
				if (local56.params != null) {
					@Pc(68) IntNode local68 = (IntNode) local56.params.get(arg2);
					if (local68 != null) {
						if (arg0) {
							local27 += local19.anIntArray422[local29] * local68.value;
						} else {
							local27 += local68.value;
						}
					}
				}
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)I")
	public static int getSlotTotal(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Inv local8 = (Inv) objectContainerCache.get(arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local8.anIntArray422.length; local27++) {
				if (arg1 == local8.objectIds[local27]) {
					local25 += local8.anIntArray422[local27];
				}
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I")
	public static int getItemCount(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Inv local10 = (Inv) objectContainerCache.get(arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray422.length) {
			return local10.anIntArray422[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	public static int getItemType(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Inv local10 = (Inv) objectContainerCache.get(arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.objectIds.length) {
			return local10.objectIds[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(II)V")
	public static void delete(@OriginalArg(0) int arg0) {
		@Pc(14) Inv local14 = (Inv) objectContainerCache.get(arg0);
		if (local14 != null) {
			local14.unlink();
		}
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(B)V")
	public static void clear() {
		objectContainerCache = new HashTable(32);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIB)V")
	public static void updateContainer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Inv local12 = (Inv) objectContainerCache.get(arg3);
		if (local12 == null) {
			local12 = new Inv();
			objectContainerCache.put(local12, arg3);
		}
		if (arg1 >= local12.objectIds.length) {
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(44) int[] local44 = new int[arg1 + 1];
			@Pc(46) int local46;
			for (local46 = 0; local46 < local12.objectIds.length; local46++) {
				local39[local46] = local12.objectIds[local46];
				local44[local46] = local12.anIntArray422[local46];
			}
			for (local46 = local12.objectIds.length; local46 < arg1; local46++) {
				local39[local46] = -1;
				local44[local46] = 0;
			}
			local12.objectIds = local39;
			local12.anIntArray422 = local44;
		}
		local12.objectIds[arg1] = arg0;
		local12.anIntArray422[arg1] = arg2;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIII)Lclient!qf;")
	public static Sprite getObjectSprite(@OriginalArg(0) int selected, @OriginalArg(1) int id, @OriginalArg(2) boolean drawText, @OriginalArg(3) int count, @OriginalArg(4) int shadow) {
		@Pc(27) int key = (drawText ? 65536 : 0) + id + (selected << 17) + (shadow << 19);
		@Pc(37) long uid = (long) key * 3849834839L + (long) count * 3147483667L;
		@Pc(43) Sprite sprite = (Sprite) ObjTypeList.objectSpriteCache.get(uid);
		if (sprite != null) {
			return sprite;
		}

		Rasteriser.textureHasTransparency = false;
		sprite = renderObjectSprite(shadow, false, id, drawText, selected, count, false);
		if (sprite != null && !Rasteriser.textureHasTransparency) {
			ObjTypeList.objectSpriteCache.put(sprite, uid);
		}

		return sprite;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBZIZIIZ)Lclient!qf;")
	public static Sprite renderObjectSprite(@OriginalArg(0) int shadow, @OriginalArg(2) boolean linked, @OriginalArg(3) int id, @OriginalArg(4) boolean drawText, @OriginalArg(5) int state, @OriginalArg(6) int stack, @OriginalArg(7) boolean cert) {
		@Pc(5) ObjType objType = ObjTypeList.get(id);
		if (stack > 1 && objType.countobj != null) {
			@Pc(15) int stackId = -1;
			for (@Pc(17) int i = 0; i < 10; i++) {
				if (stack >= objType.countco[i] && objType.countco[i] != 0) {
					stackId = objType.countobj[i];
				}
			}
			if (stackId != -1) {
				objType = ObjTypeList.get(stackId);
			}
		}

		@Pc(60) SoftwareModel model = objType.getInvModel();
		if (model == null) {
			return null;
		}

		@Pc(71) SoftwareSprite linkedSprite = null;
		if (objType.certtemplate != -1) {
			linkedSprite = (SoftwareSprite) renderObjectSprite(0, true, objType.certlink, false, 1, 10, true);
			if (linkedSprite == null) {
				return null;
			}
		} else if (objType.lentTemplate != -1) {
			linkedSprite = (SoftwareSprite) renderObjectSprite(shadow, true, objType.lentLink, false, state, stack, false);
			if (linkedSprite == null) {
				return null;
			}
		}

		@Pc(118) int[] pixels = SoftwareRaster.pixels;
		@Pc(120) int width = SoftwareRaster.width;
		@Pc(122) int height = SoftwareRaster.height;
		@Pc(125) int[] clip = new int[4];
		SoftwareRaster.saveClip(clip);

		final int canvasWidth = 36;
		final int canvasHeight = 32;

		@Pc(133) SoftwareSprite canvas = new SoftwareSprite(canvasWidth, canvasHeight);
		SoftwareRaster.setSize(canvas.pixels, canvasWidth, canvasHeight);
		Rasteriser.prepare();
		Rasteriser.setBounds(16, 16); // canvasWidth / 2, canvasHeight / 2);
		Rasteriser.jagged = false;

		@Pc(145) int zoom = objType.zoom2d; // / 4;
		if (cert) {
			zoom = (int) ((double) zoom * 1.5D);
		} else if (state == 2) {
			zoom = (int) ((double) zoom * 1.04D);
		}

		@Pc(176) int pitchcos = MathUtils.cos[objType.xAngle2D] * zoom >> 16;
		@Pc(185) int pitchsin = MathUtils.sin[objType.xAngle2D] * zoom >> 16;
		model.setCamera(objType.yAngle2D, objType.zAngle2D, objType.xAngle2D, objType.xOffset2D, pitchsin + objType.yOffset2D - model.getMinY() / 2, objType.yOffset2D + pitchcos, -1L);

		if (state >= 1) {
			canvas.drawOutline(1);
			if (state >= 2) {
				canvas.drawOutline(16777215);
			}
			SoftwareRaster.setSize(canvas.pixels, canvasWidth, canvasHeight);
		}

		if (shadow != 0) {
			canvas.drawShadow(shadow);
		}

		if (objType.certtemplate != -1) {
			linkedSprite.render(0, 0);
		} else if (objType.lentTemplate != -1) {
			SoftwareRaster.setSize(linkedSprite.pixels, canvasWidth, canvasHeight);
			canvas.render(0, 0);
			canvas = linkedSprite;
		}

		if (drawText && (objType.stackable == 1 || stack != 1) && stack != -1) {
			ObjTypeList.font.renderLeft(formatObjAmount(stack), 0, 9, 16776960, 1);
		}

		SoftwareRaster.setSize(pixels, width, height);
		SoftwareRaster.restoreClip(clip);
		Rasteriser.prepare();
		Rasteriser.jagged = true;
		return GlRenderer.enabled && !linked ? new GlSprite(canvas) : canvas;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Lclient!na;")
	public static JagString formatObjAmount(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return JagString.concatenate(new JagString[]{aClass100_559, JagString.parseInt(arg0), aClass100_594});
		} else if (arg0 >= 10000000) {
			return JagString.concatenate(new JagString[]{aClass100_819, JagString.parseInt(arg0 / 1000000), LocalizedText.MILLION, aClass100_594});
		} else {
			return JagString.concatenate(new JagString[]{aClass100_637, JagString.parseInt(arg0 / 1000), LocalizedText.THOUSAND, aClass100_594});
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V")
	public static void method475(@OriginalArg(1) int arg0) {
		@Pc(8) Inv local8 = (Inv) objectContainerCache.get(arg0);
		if (local8 != null) {
			for (@Pc(24) int local24 = 0; local24 < local8.objectIds.length; local24++) {
				local8.objectIds[local24] = -1;
				local8.anIntArray422[local24] = 0;
			}
		}
	}
}
