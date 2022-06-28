package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ClientScriptList {
	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!gn;")
	public static final LruHashTable scripts = new LruHashTable(128);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Lclient!qc;")
	public static ClientScript get(@OriginalArg(0) int id) {
		@Pc(12) ClientScript script = (ClientScript) scripts.get(id);
		if (script != null) {
			return script;
		}
		@Pc(22) byte[] bytes = client.js5Archive12.fetchFile(id, 0);
		if (bytes == null) {
			return null;
		}
		script = new ClientScript();
		@Pc(42) Buffer buffer = new Buffer(bytes);
		buffer.offset = buffer.data.length - 2;
		@Pc(53) int trailerLen = buffer.g2();
		@Pc(63) int trailerPos = buffer.data.length - trailerLen - 12 - 2;
		buffer.offset = trailerPos;
		@Pc(70) int instructions = buffer.g4();
		script.intLocals = buffer.g2();
		script.stringLocals = buffer.g2();
		script.intArgs = buffer.g2();
		script.stringArgs = buffer.g2();
		@Pc(98) int switches = buffer.g1();
		if (switches > 0) {
			script.switchTables = new HashTable[switches];
			for (int i = 0; i < switches; i++) {
				int cases = buffer.g2();
				@Pc(121) HashTable table = new HashTable(IntUtils.clp2(cases));
				script.switchTables[i] = table;
				while (cases-- > 0) {
					@Pc(136) int value = buffer.g4();
					@Pc(140) int offset = buffer.g4();
					table.put(new IntNode(offset), value);
				}
			}
		}
		buffer.offset = 0;
		script.name = buffer.fastgjstr();
		script.opcodes = new int[instructions];
		script.stringOperands = new JagString[instructions];
		int i = 0;
		script.intOperands = new int[instructions];
		while (trailerPos > buffer.offset) {
			int cases = buffer.g2();
			if (cases == 3) {
				script.stringOperands[i] = buffer.gjstr();
			} else if (cases >= 100 || cases == 21 || cases == 38 || cases == 39) {
				script.intOperands[i] = buffer.g1();
			} else {
				script.intOperands[i] = buffer.g4();
			}
			script.opcodes[i++] = cases;
		}
		scripts.put(script, id);
		return script;
	}
}
