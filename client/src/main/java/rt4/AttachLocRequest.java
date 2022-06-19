package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class AttachLocRequest extends Node {

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lclient!ih;")
	public static final LinkedList queue = new LinkedList();
    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public int anInt1187;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
	public int anInt1188;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
	public int locId;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
	public int anInt1191;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	public int entityId;

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	public int anInt1197;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
	public int shape;

	@OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
	public int anInt1200;

	@OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
	public int angle;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public static void loop() {
		while (true) {
			@Pc(17) AttachLocRequest request = (AttachLocRequest) queue.removeHead();
			if (request == null) {
				return;
			}
			@Pc(40) PathingEntity entity;
			@Pc(29) int playerId;
			if (request.entityId < 0) {
				playerId = -request.entityId - 1;
				if (playerId == PlayerList.selfId) {
					entity = PlayerList.self;
				} else {
					entity = PlayerList.players[playerId];
				}
			} else {
				playerId = request.entityId - 1;
				entity = NpcList.npcs[playerId];
			}
			if (entity != null) {
				@Pc(63) LocType type = LocTypeList.get(request.locId);
				if (Player.level < 3) {
				}
				@Pc(86) int width;
				@Pc(83) int length;
				if (request.angle == 1 || request.angle == 3) {
					length = type.width;
					width = type.length;
				} else {
					width = type.width;
					length = type.length;
				}
				@Pc(103) int centerX1 = (width + 1 >> 1) + request.x;
				@Pc(110) int centerX0 = (width >> 1) + request.x;
				@Pc(117) int centerZ0 = (length >> 1) + request.z;
				@Pc(126) int centerZ1 = (length + 1 >> 1) + request.z;
				@Pc(130) int[][] tileHeights = SceneGraph.tileHeights[Player.level];
				@Pc(157) int y = tileHeights[centerX1][centerZ1] + tileHeights[centerX0][centerZ1] + tileHeights[centerX0][centerZ0] + tileHeights[centerX1][centerZ0] >> 2;
				@Pc(159) Entity attachment = null;
				@Pc(164) int layer = Loc.LAYERS[request.shape];
				if (layer == 0) {
					@Pc(176) Wall wall = SceneGraph.getWall(Player.level, request.x, request.z);
					if (wall != null) {
						attachment = wall.primary;
					}
				} else if (layer == 1) {
					@Pc(231) WallDecor wallDecor = SceneGraph.getWallDecor(Player.level, request.x, request.z);
					if (wallDecor != null) {
						attachment = wallDecor.primary;
					}
				} else if (layer == 2) {
					@Pc(198) Scenery scenery = SceneGraph.getScenery(Player.level, request.x, request.z);
					if (scenery != null) {
						attachment = scenery.primary;
					}
				} else if (layer == 3) {
					@Pc(216) GroundDecor groundDecor = SceneGraph.getGroundDecor(Player.level, request.x, request.z);
					if (groundDecor != null) {
						attachment = groundDecor.primary;
					}
				}
				if (attachment != null) {
					ChangeLocRequest.push(Player.level, request.z, 0, request.x, request.anInt1205 + 1, -1, layer, 0, request.anInt1187 + 1);
					entity.anInt3375 = request.anInt1205 + client.loop;
					entity.attachmentZFine = length * 64 + request.z * 128;
					entity.attachmentXFine = width * 64 + request.x * 128;
					entity.attachment = attachment;
					@Pc(292) int x0Delta = request.anInt1188;
					entity.attachmentY = y;
					entity.anInt3390 = client.loop + request.anInt1187;
					@Pc(304) int x1Delta = request.anInt1191;
					@Pc(307) int z0Delta = request.anInt1197;
					@Pc(310) int z1Delta = request.anInt1200;
					@Pc(316) int temp;
					if (x0Delta > x1Delta) {
						temp = x0Delta;
						x0Delta = x1Delta;
						x1Delta = temp;
					}
					entity.attachmentX1 = request.x + x1Delta;
					if (z0Delta > z1Delta) {
						temp = z0Delta;
						z0Delta = z1Delta;
						z1Delta = temp;
					}
					entity.attachmentZ0 = request.z + z0Delta;
					entity.attachmentZ1 = z1Delta + request.z;
					entity.atachmentX0 = request.x + x0Delta;
				}
			}
		}
	}
}