package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
	public static int anInt986;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_32 = new LinkedList();

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static void method843() {
		if (InterfaceList.clickedInventoryComponent != null || Static40.aClass13_14 != null) {
			return;
		}
		@Pc(20) int local20 = Mouse.clickButton;
		@Pc(93) int local93;
		@Pc(99) int local99;
		if (!Static40.aBoolean108) {
			if (local20 == 1 && MiniMenu.size > 0) {
				@Pc(37) short local37 = MiniMenu.actions[MiniMenu.size - 1];
				if (local37 == 25 || local37 == 23 || local37 == 48 || local37 == 7 || local37 == 13 || local37 == 47 || local37 == 5 || local37 == 43 || local37 == 35 || local37 == 58 || local37 == 22 || local37 == 1006) {
					local93 = MiniMenu.intArgs1[MiniMenu.size - 1];
					local99 = MiniMenu.intArgs2[MiniMenu.size - 1];
					@Pc(103) Component local103 = InterfaceList.getComponent(local99);
					@Pc(106) ServerActiveProperties local106 = InterfaceList.getServerActiveProperties(local103);
					if (local106.method511() || local106.isObjReplaceEnabled()) {
						InterfaceList.clickedInventoryComponentCycle = 0;
						Static123.draggingClickedInventoryObject = false;
						if (InterfaceList.clickedInventoryComponent != null) {
							InterfaceList.redraw(InterfaceList.clickedInventoryComponent);
						}
						InterfaceList.clickedInventoryComponent = InterfaceList.getComponent(local99);
						InterfaceList.clickedInventoryComponentX = Mouse.clickX;
						InterfaceList.clickedInventoryComponentY = Mouse.clickY;
						Static4.mouseOverInventoryObjectIndex = local93;
						InterfaceList.redraw(InterfaceList.clickedInventoryComponent);
						return;
					}
				}
			}
			if (local20 == 1 && (VarpDomain.anInt2952 == 1 && MiniMenu.size > 2 || MiniMenu.method4640(MiniMenu.size - 1))) {
				local20 = 2;
			}
			if (local20 == 2 && MiniMenu.size > 0 || Static226.anInt3953 == 1) {
				Static226.method3901();
			}
			if (local20 == 1 && MiniMenu.size > 0 || Static226.anInt3953 == 2) {
				Static59.method1372();
			}
			return;
		}
		@Pc(204) int local204;
		if (local20 != 1) {
			local93 = Mouse.lastMouseY;
			local204 = Mouse.lastMouseX;
			if (local204 < InterfaceList.anInt4271 - 10 || local204 > InterfaceList.anInt761 + InterfaceList.anInt4271 + 10 || InterfaceList.anInt5138 - 10 > local93 || local93 > InterfaceList.anInt436 + InterfaceList.anInt5138 + 10) {
				Static40.aBoolean108 = false;
				InterfaceList.method4012(InterfaceList.anInt4271, InterfaceList.anInt761, InterfaceList.anInt5138, InterfaceList.anInt436);
			}
		}
		if (local20 != 1) {
			return;
		}
		local204 = InterfaceList.anInt4271;
		local93 = InterfaceList.anInt5138;
		local99 = InterfaceList.anInt761;
		@Pc(265) int local265 = Mouse.clickX;
		@Pc(267) int local267 = Mouse.clickY;
		@Pc(269) int local269 = -1;
		for (@Pc(271) int local271 = 0; local271 < MiniMenu.size; local271++) {
			@Pc(289) int local289;
			if (Static40.aBoolean298) {
				local289 = (MiniMenu.size - local271 - 1) * 15 + local93 + 35;
			} else {
				local289 = (MiniMenu.size - local271 - 1) * 15 + local93 + 31;
			}
			if (local265 > local204 && local204 + local99 > local265 && local289 - 13 < local267 && local289 + 3 > local267) {
				local269 = local271;
			}
		}
		if (local269 != -1) {
			MiniMenu.doAction(local269);
		}
		Static40.aBoolean108 = false;
		InterfaceList.method4012(InterfaceList.anInt4271, InterfaceList.anInt761, InterfaceList.anInt5138, InterfaceList.anInt436);
	}
}
