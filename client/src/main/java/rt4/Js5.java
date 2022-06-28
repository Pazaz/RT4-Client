package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Arrays;

@OriginalClass("client!ve")
public final class Js5 {

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Z")
	public static final boolean RAISE_EXCEPTIONS = false;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "[[Ljava/lang/Object;")
	private Object[][] unpacked;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "[Ljava/lang/Object;")
	private Object[] packed;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!ii;")
	private Js5Index index = null;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!v;")
	private final Js5ResourceProvider provider;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Z")
	private final boolean discardPacked;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
	private final boolean discardUnpacked;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!v;ZZ)V")
	public Js5(@OriginalArg(0) Js5ResourceProvider provider, @OriginalArg(1) boolean discardPacked, @OriginalArg(2) boolean discardUnpacked) {
		this.provider = provider;
		this.discardPacked = discardPacked;
		this.discardUnpacked = discardUnpacked;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z")
	public final boolean fetchAll() {
		if (!this.isIndexReady()) {
			return false;
		}
		@Pc(20) boolean success = true;
		for (@Pc(22) int i = 0; i < this.index.groupIds.length; i++) {
			@Pc(38) int groupId = this.index.groupIds[i];
			if (this.packed[groupId] == null) {
				this.fetchGroup(groupId);
				if (this.packed[groupId] == null) {
					success = false;
				}
			}
		}
		return success;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	private int getPercentageComplete(@OriginalArg(0) int group) {
		if (this.isGroupValid(group)) {
			return this.packed[group] == null ? this.provider.getPercentageComplete(group) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZZ)V")
	public final void discardNames(@OriginalArg(1) boolean groups) {
		if (!this.isIndexReady()) {
			return;
		}
		if (groups) {
			this.index.groupNameHashes = null;
			this.index.groupNameHashTable = null;
		}
		this.index.fileNameHashTables = null;
		this.index.fileNameHashes = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!na;)I")
	public final int getPercentageComplete(@OriginalArg(1) JagString group) {
		if (this.isIndexReady()) {
			@Pc(15) JagString lower = group.toLowerCase();
			@Pc(29) int groupId = this.index.groupNameHashTable.get(lower.getHash());
			return this.getPercentageComplete(groupId);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z")
	public final boolean isGroupReady(@OriginalArg(1) int group) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			this.fetchGroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)I")
	public final int getChecksum() {
		if (!this.isIndexReady()) {
			throw new IllegalStateException("");
		}
		return this.index.checksum;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!na;B)I")
	public final int getGroupId(@OriginalArg(0) JagString group) {
		if (this.isIndexReady()) {
			@Pc(16) JagString lower = group.toLowerCase();
			@Pc(27) int groupId = this.index.groupNameHashTable.get(lower.getHash());
			return this.isGroupValid(groupId) ? groupId : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
	public final int capacity() {
		return this.isIndexReady() ? this.index.groupCapacities.length : -1;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Z")
	private boolean isIndexReady() {
		if (this.index == null) {
			this.index = this.provider.fetchIndex();
			if (this.index == null) {
				return false;
			}
			this.unpacked = new Object[this.index.capacity][];
			this.packed = new Object[this.index.capacity];
		}
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!na;Lclient!na;)[B")
	public final byte[] fetchFile(@OriginalArg(1) JagString file, @OriginalArg(2) JagString group) {
		if (!this.isIndexReady()) {
			return null;
		}
		@Pc(15) JagString groupLower = group.toLowerCase();
		@Pc(19) JagString fileLower = file.toLowerCase();
		@Pc(28) int groupId = this.index.groupNameHashTable.get(groupLower.getHash());
		if (this.isGroupValid(groupId)) {
			@Pc(53) int fileId = this.index.fileNameHashTables[groupId].get(fileLower.getHash());
			return this.fetchFile(groupId, fileId);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILclient!na;)V")
	public final void prefetchGroup(@OriginalArg(1) JagString group) {
		if (this.isIndexReady()) {
			@Pc(13) JagString lower = group.toLowerCase();
			@Pc(22) int groupId = this.index.groupNameHashTable.get(lower.getHash());
			this.prefetchGroup(groupId);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!na;BLclient!na;)Z")
	public final boolean isFileReady(@OriginalArg(0) JagString file, @OriginalArg(2) JagString group) {
		if (!this.isIndexReady()) {
			return false;
		}
		@Pc(17) JagString groupLower = group.toLowerCase();
		@Pc(21) JagString fileLower = file.toLowerCase();
		@Pc(30) int groupId = this.index.groupNameHashTable.get(groupLower.getHash());
		if (this.isGroupValid(groupId)) {
			@Pc(49) int fileId = this.index.fileNameHashTables[groupId].get(fileLower.getHash());
			return this.isFileReady(fileId, groupId);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[III)[B")
	public final byte[] fetchFile(@OriginalArg(0) int group, @OriginalArg(1) int[] key, @OriginalArg(3) int file) {
		if (!this.isFileValid(group, file)) {
			return null;
		}
		if (this.unpacked[group] == null || this.unpacked[group][file] == null) {
			@Pc(30) boolean success = this.unpackGroup(group, key);
			if (!success) {
				this.fetchGroup(group);
				success = this.unpackGroup(group, key);
				if (!success) {
					return null;
				}
			}
		}
		@Pc(64) byte[] bytes = ByteArray.unwrap(this.unpacked[group][file], false);
		if (this.discardUnpacked) {
			this.unpacked[group][file] = null;
			if (this.index.groupCapacities[group] == 1) {
				this.unpacked[group] = null;
			}
		}
		return bytes;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!na;)Z")
	public final boolean isGroupReady(@OriginalArg(1) JagString group) {
		if (this.isIndexReady()) {
			@Pc(14) JagString lower = group.toLowerCase();
			@Pc(25) int groupId = this.index.groupNameHashTable.get(lower.getHash());
			return this.isGroupReady(groupId);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V")
	public final void discardUnpacked(@OriginalArg(1) int group) {
		if (this.isGroupValid(group) && this.unpacked != null) {
			this.unpacked[group] = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)Z")
	public final boolean isFileReady(@OriginalArg(1) int file, @OriginalArg(2) int group) {
		if (!this.isFileValid(group, file)) {
			return false;
		} else if (this.unpacked[group] != null && this.unpacked[group][file] != null) {
			return true;
		} else if (this.packed[group] == null) {
			this.fetchGroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z")
	private boolean isGroupValid(@OriginalArg(1) int group) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && this.index.groupCapacities.length > group && this.index.groupCapacities[group] != 0) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(Integer.toString(group));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(II)V")
	private void prefetchGroup(@OriginalArg(1) int group) {
		this.provider.prefetchGroup(group);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ[I)Z")
	private boolean unpackGroup(@OriginalArg(0) int group, @OriginalArg(2) int[] key) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			return false;
		} else {
			@Pc(25) int[] fileIds = this.index.fileIds[group];
			@Pc(31) int groupSize = this.index.groupSizes[group];
			if (this.unpacked[group] == null) {
				this.unpacked[group] = new Object[this.index.groupCapacities[group]];
			}
			@Pc(48) boolean valid = true;
			@Pc(53) Object[] unpacked = this.unpacked[group];
			for (@Pc(55) int i = 0; i < groupSize; i++) {
				@Pc(62) int fileId;
				if (fileIds == null) {
					fileId = i;
				} else {
					fileId = fileIds[i];
				}
				if (unpacked[fileId] == null) {
					valid = false;
					break;
				}
			}
			if (valid) {
				return true;
			}
			@Pc(114) byte[] compressed;
			if (key == null || key[0] == 0 && key[1] == 0 && key[2] == 0 && key[3] == 0) {
				compressed = ByteArray.unwrap(this.packed[group], false);
			} else {
				compressed = ByteArray.unwrap(this.packed[group], true);
				@Pc(128) Buffer buffer = new Buffer(compressed);
				buffer.tinydec(key, buffer.data.length);
			}
			@Pc(140) byte[] uncompressed;
			try {
				uncompressed = Js5Compression.uncompress(compressed);
			} catch (@Pc(142) RuntimeException ex) {
				ex.printStackTrace();
				System.out.println("T3 - " + (key != null) + "," + group + "," + compressed.length + "," + Buffer.crc32(compressed, compressed.length) + "," + Buffer.crc32(compressed, compressed.length - 2) + "," + this.index.groupChecksums[group] + "," + this.index.checksum);
				uncompressed = new byte[]{0};
			}
			if (this.discardPacked) {
				this.packed[group] = null;
			}
			@Pc(213) int start;
			if (groupSize > 1) {
				start = uncompressed.length;
				@Pc(216) int position = start - 1;
				@Pc(220) int stripes = uncompressed[position] & 0xFF;
				@Pc(228) int bufferPosition = position - groupSize * stripes * 4;
				@Pc(233) Buffer buffer = new Buffer(uncompressed);
				buffer.offset = bufferPosition;
				@Pc(239) int[] lens = new int[groupSize];
				@Pc(250) int len;
				@Pc(252) int j;
				for (@Pc(241) int i = 0; i < stripes; i++) {
					len = 0;
					for (j = 0; j < groupSize; j++) {
						len += buffer.g4();
						lens[j] += len;
					}
				}
				@Pc(282) byte[][] extracted = new byte[groupSize][];
				for (len = 0; len < groupSize; len++) {
					extracted[len] = new byte[lens[len]];
					lens[len] = 0;
				}
				buffer.offset = bufferPosition;
				len = 0;
				@Pc(320) int off;
				for (j = 0; j < stripes; j++) {
					off = 0;
					for (@Pc(322) int k = 0; k < groupSize; k++) {
						off += buffer.g4();
						JagString.copy(uncompressed, len, extracted[k], lens[k], off);
						len += off;
						lens[k] += off;
					}
				}
				for (j = 0; j < groupSize; j++) {
					if (fileIds == null) {
						off = j;
					} else {
						off = fileIds[j];
					}
					if (this.discardUnpacked) {
						unpacked[off] = extracted[j];
					} else {
						unpacked[off] = ByteArray.wrap(extracted[j]);
					}
				}
			} else {
				if (fileIds == null) {
					start = 0;
				} else {
					start = fileIds[0];
				}
				if (this.discardUnpacked) {
					unpacked[start] = uncompressed;
				} else {
					unpacked[start] = ByteArray.wrap(uncompressed);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)[B")
	public final byte[] fetchFile(@OriginalArg(0) int group, @OriginalArg(2) int file) {
		return this.fetchFile(group, null, file);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ZI)V")
	private void fetchGroup(@OriginalArg(1) int group) {
		if (this.discardPacked) {
			this.packed[group] = this.provider.fetchGroup(group);
		} else {
			this.packed[group] = ByteArray.wrap(this.provider.fetchGroup(group));
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!na;I)Z")
	public final boolean isGroupNameValid(@OriginalArg(0) JagString group) {
		if (this.isIndexReady()) {
			@Pc(19) JagString lower = group.toLowerCase();
			@Pc(28) int groupId = this.index.groupNameHashTable.get(lower.getHash());
			return groupId >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)I")
	public final int getPercentageComplete() {
		if (!this.isIndexReady()) {
			return 0;
		}
		@Pc(18) int total = 0;
		@Pc(20) int complete = 0;
		for (@Pc(22) int i = 0; i < this.packed.length; i++) {
			if (this.index.groupSizes[i] > 0) {
				total += 100;
				complete += this.getPercentageComplete(i);
			}
		}
		if (total == 0) {
			return 100;
		} else {
			return complete * 100 / total;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V")
	public final void discardUnpacked() {
		if (this.unpacked != null) {
			Arrays.fill(this.unpacked, null);
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(II)[B")
	public final byte[] fetchFile(@OriginalArg(0) int id) {
		if (!this.isIndexReady()) {
			return null;
		} else if (this.index.groupCapacities.length == 1) {
			return this.fetchFile(0, id);
		} else if (!this.isGroupValid(id)) {
			return null;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.fetchFile(id, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
	private boolean isFileValid(@OriginalArg(0) int group, @OriginalArg(2) int file) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && file >= 0 && this.index.groupCapacities.length > group && this.index.groupCapacities[group] > file) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(group + "," + file);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)[B")
	public final byte[] fetchFileNoDiscard(@OriginalArg(0) int file, @OriginalArg(1) int group) {
		if (!this.isFileValid(group, file)) {
			return null;
		}
		if (this.unpacked[group] == null || this.unpacked[group][file] == null) {
			@Pc(34) boolean success = this.unpackGroup(group, null);
			if (!success) {
				this.fetchGroup(group);
				success = this.unpackGroup(group, null);
				if (!success) {
					return null;
				}
			}
		}
		return ByteArray.unwrap(this.unpacked[group][file], false);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[I")
	public final int[] getFileIds(@OriginalArg(1) int group) {
		if (!this.isGroupValid(group)) {
			return null;
		}
		@Pc(22) int[] fileIds = this.index.fileIds[group];
		if (fileIds == null) {
			fileIds = new int[this.index.groupSizes[group]];
			@Pc(34) int i = 0;
			while (fileIds.length > i) {
				fileIds[i] = i++;
			}
		}
		return fileIds;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I")
	public final int getGroupCapacity(@OriginalArg(0) int group) {
		return this.isGroupValid(group) ? this.index.groupCapacities[group] : 0;
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(II)Z")
	public final boolean isFileReady(@OriginalArg(1) int id) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.isFileReady(id, 0);
		} else if (!this.isGroupValid(id)) {
			return false;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.isFileReady(0, id);
		} else {
			throw new RuntimeException();
		}
	}
}
