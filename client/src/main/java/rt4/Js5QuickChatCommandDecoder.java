package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Js5QuickChatCommandDecoder implements QuickChatCommandDecoder {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[IIJ)Lclient!na;")
	@Override
	public final JagString decode(@OriginalArg(0) int command, @OriginalArg(1) int[] params, @OriginalArg(3) long value) {
		if (command == 0) {
			@Pc(12) EnumType type = EnumTypeList.get(params[0]);
			return type.getString((int) value);
		} else if (command == 1 || command == 10) {
			@Pc(31) ObjType type = ObjTypeList.get((int) value);
			return type.name;
		} else if (command == 6 || command == 7 || command == 11) {
			return EnumTypeList.get(params[0]).getString((int) value);
		} else {
			return null;
		}
	}
}
