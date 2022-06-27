package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Js5Index {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "[[I")
	public int[][] fileNameHashes;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
	public int[] groupChecksums;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!jg;")
	public IntHashTable groupNameHashTable;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "[I")
	public int[] groupIds;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[I")
	public int[] groupCapacities;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
	public int[] groupNameHashes;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[I")
	public int[] groupSizes;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "[I")
	public int[] groupVersions;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "[[I")
	public int[][] fileIds;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public int capacity;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	public int version;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "[Lclient!jg;")
	public IntHashTable[] fileNameHashTables;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public final int checksum;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([BI)V")
	public Js5Index(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.checksum = Buffer.crc32(arg0, arg0.length);
		if (arg1 != this.checksum) {
			throw new RuntimeException();
		}
		this.method2293(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)V")
	private void method2293(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Buffer local12 = new Buffer(Js5Compression.uncompress(arg0));
		@Pc(16) int local16 = local12.g1();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.version = local12.g4();
		} else {
			this.version = 0;
		}
		@Pc(48) int local48 = local12.g1();
		@Pc(50) int local50 = 0;
		this.size = local12.g2();
		@Pc(59) int local59 = -1;
		this.groupIds = new int[this.size];
		@Pc(66) int local66;
		for (local66 = 0; local66 < this.size; local66++) {
			this.groupIds[local66] = local50 += local12.g2();
			if (this.groupIds[local66] > local59) {
				local59 = this.groupIds[local66];
			}
		}
		this.capacity = local59 + 1;
		this.groupVersions = new int[this.capacity];
		this.fileIds = new int[this.capacity][];
		this.groupChecksums = new int[this.capacity];
		this.groupCapacities = new int[this.capacity];
		this.groupSizes = new int[this.capacity];
		if (local48 != 0) {
			this.groupNameHashes = new int[this.capacity];
			for (local66 = 0; local66 < this.capacity; local66++) {
				this.groupNameHashes[local66] = -1;
			}
			for (local66 = 0; local66 < this.size; local66++) {
				this.groupNameHashes[this.groupIds[local66]] = local12.g4();
			}
			this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
		}
		for (local66 = 0; local66 < this.size; local66++) {
			this.groupChecksums[this.groupIds[local66]] = local12.g4();
		}
		for (local66 = 0; local66 < this.size; local66++) {
			this.groupVersions[this.groupIds[local66]] = local12.g4();
		}
		for (local66 = 0; local66 < this.size; local66++) {
			this.groupSizes[this.groupIds[local66]] = local12.g2();
		}
		@Pc(273) int local273;
		@Pc(278) int local278;
		@Pc(280) int local280;
		@Pc(288) int local288;
		for (local66 = 0; local66 < this.size; local66++) {
			local50 = 0;
			local273 = this.groupIds[local66];
			local278 = this.groupSizes[local273];
			local280 = -1;
			this.fileIds[local273] = new int[local278];
			for (local288 = 0; local288 < local278; local288++) {
				@Pc(306) int local306 = this.fileIds[local273][local288] = local50 += local12.g2();
				if (local306 > local280) {
					local280 = local306;
				}
			}
			this.groupCapacities[local273] = local280 + 1;
			if (local280 + 1 == local278) {
				this.fileIds[local273] = null;
			}
		}
		if (local48 == 0) {
			return;
		}
		this.fileNameHashTables = new IntHashTable[local59 + 1];
		this.fileNameHashes = new int[local59 + 1][];
		for (local66 = 0; local66 < this.size; local66++) {
			local273 = this.groupIds[local66];
			local278 = this.groupSizes[local273];
			this.fileNameHashes[local273] = new int[this.groupCapacities[local273]];
			for (local280 = 0; local280 < this.groupCapacities[local273]; local280++) {
				this.fileNameHashes[local273][local280] = -1;
			}
			for (local280 = 0; local280 < local278; local280++) {
				if (this.fileIds[local273] == null) {
					local288 = local280;
				} else {
					local288 = this.fileIds[local273][local280];
				}
				this.fileNameHashes[local273][local288] = local12.g4();
			}
			this.fileNameHashTables[local273] = new IntHashTable(this.fileNameHashes[local273]);
		}
	}
}
