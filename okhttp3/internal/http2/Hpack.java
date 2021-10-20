package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import vigqyno.C0188;
import vigqyno.C0201;

public final class Hpack {
    public static final Map<dy2, Integer> NAME_TO_FIRST_INDEX = nameToFirstIndex();
    private static final int PREFIX_4_BITS = 0;
    private static final int PREFIX_5_BITS = 0;
    private static final int PREFIX_6_BITS = 0;
    private static final int PREFIX_7_BITS = 0;
    public static final Header[] STATIC_HEADER_TABLE;

    static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        public int nextHeaderIndex;
        private final cy2 source;

        public Reader(int i, ty2 ty2) {
            this(i, i, ty2);
        }

        private void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private int evictToRecoverBytes(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        int i3 = this.nextHeaderIndex;
                        System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i2, this.headerCount);
                        this.nextHeaderIndex += i2;
                    } else {
                        Header[] headerArr2 = this.dynamicTable;
                        i -= headerArr2[length].hpackSize;
                        this.dynamicTableByteCount -= headerArr2[length].hpackSize;
                        this.headerCount--;
                        i2++;
                    }
                }
                Header[] headerArr3 = this.dynamicTable;
                int i32 = this.nextHeaderIndex;
                System.arraycopy(headerArr3, i32 + 1, headerArr3, i32 + 1 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private dy2 getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return Hpack.STATIC_HEADER_TABLE[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    return headerArr[dynamicTableIndex].name;
                }
            }
            throw new IOException(C0201.m82(3602) + (i + 1));
        }

        private void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                i2 -= this.dynamicTable[dynamicTableIndex(i)].hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length * 2)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.STATIC_HEADER_TABLE.length - 1;
        }

        private int readByte() throws IOException {
            return this.source.readByte() & 255;
        }

        private void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.STATIC_HEADER_TABLE[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException(C0201.m82(3603) + (i + 1));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        public List<Header> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.headerList);
            this.headerList.clear();
            return arrayList;
        }

        public int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public dy2 readByteString() throws IOException {
            int readByte = readByte();
            boolean z = (readByte & 128) == 128;
            int readInt = readInt(readByte, 127);
            if (z) {
                return dy2.q(Huffman.get().decode(this.source.O0((long) readInt)));
            }
            return this.source.q((long) readInt);
        }

        public void readHeaders() throws IOException {
            while (!this.source.M()) {
                int readByte = this.source.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException(C0201.m82(3605));
                } else if ((readByte & 128) == 128) {
                    readIndexedHeader(readInt(readByte, 127) - 1);
                } else if (readByte == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((readByte & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int readInt = readInt(readByte, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        throw new IOException(C0201.m82(3604) + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (readByte == 16 || readByte == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(readByte, 15) - 1);
                }
            }
        }

        public int readInt(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }

        public Reader(int i, int i2, ty2 ty2) {
            this.headerList = new ArrayList();
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.source = jy2.d(ty2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Writer {
        private static final int SETTINGS_HEADER_TABLE_SIZE = 0;
        private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 0;
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        public int nextHeaderIndex;
        private final ay2 out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        static {
            C0201.m83(Writer.class, 268);
        }

        public Writer(ay2 ay2) {
            this(4096, true, ay2);
        }

        private void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        int i3 = this.nextHeaderIndex;
                        System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i2, this.headerCount);
                        Header[] headerArr2 = this.dynamicTable;
                        int i4 = this.nextHeaderIndex;
                        Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                        this.nextHeaderIndex += i2;
                    } else {
                        Header[] headerArr3 = this.dynamicTable;
                        i -= headerArr3[length].hpackSize;
                        this.dynamicTableByteCount -= headerArr3[length].hpackSize;
                        this.headerCount--;
                        i2++;
                    }
                }
                Header[] headerArr4 = this.dynamicTable;
                int i32 = this.nextHeaderIndex;
                System.arraycopy(headerArr4, i32 + 1, headerArr4, i32 + 1 + i2, this.headerCount);
                Header[] headerArr22 = this.dynamicTable;
                int i42 = this.nextHeaderIndex;
                Arrays.fill(headerArr22, i42 + 1, i42 + 1 + i2, (Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public void setHeaderTableSizeSetting(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 != min) {
                if (min < i2) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = min;
                adjustDynamicTableByteCount();
            }
        }

        public void writeByteString(dy2 dy2) throws IOException {
            if (!this.useCompression || Huffman.get().encodedLength(dy2) >= dy2.A()) {
                writeInt(dy2.A(), 127, 0);
                this.out.V(dy2);
                return;
            }
            ay2 ay2 = new ay2();
            Huffman.get().encode(dy2, ay2);
            dy2 D = ay2.D();
            writeInt(D.A(), 127, 128);
            this.out.V(D);
        }

        public void writeHeaders(List<Header> list) throws IOException {
            int i;
            int i2;
            if (this.emitDynamicTableSizeUpdate) {
                int i3 = this.smallestHeaderTableSizeSetting;
                if (i3 < this.maxDynamicTableByteCount) {
                    writeInt(i3, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = C0188.f24;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Header header = list.get(i4);
                dy2 H = header.name.H();
                dy2 dy2 = header.value;
                Integer num = Hpack.NAME_TO_FIRST_INDEX.get(H);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (Util.equal(Hpack.STATIC_HEADER_TABLE[i2 - 1].value, dy2)) {
                            i = i2;
                        } else if (Util.equal(Hpack.STATIC_HEADER_TABLE[i2].value, dy2)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Util.equal(this.dynamicTable[i5].name, H)) {
                            if (Util.equal(this.dynamicTable[i5].value, dy2)) {
                                i2 = Hpack.STATIC_HEADER_TABLE.length + (i5 - this.nextHeaderIndex);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.nextHeaderIndex) + Hpack.STATIC_HEADER_TABLE.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    writeInt(i2, 127, 128);
                } else if (i == -1) {
                    this.out.c0(64);
                    writeByteString(H);
                    writeByteString(dy2);
                    insertIntoDynamicTable(header);
                } else if (!H.C(Header.PSEUDO_PREFIX) || Header.TARGET_AUTHORITY.equals(H)) {
                    writeInt(i, 63, 64);
                    writeByteString(dy2);
                    insertIntoDynamicTable(header);
                } else {
                    writeInt(i, 15, 0);
                    writeByteString(dy2);
                }
            }
        }

        public void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.c0(i | i3);
                return;
            }
            this.out.c0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.c0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.c0(i4);
        }

        public Writer(int i, boolean z, ay2 ay2) {
            this.smallestHeaderTableSizeSetting = C0188.f24;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i;
            this.useCompression = z;
            this.out = ay2;
        }
    }

    static {
        C0201.m83(Hpack.class, 217);
        dy2 dy2 = Header.TARGET_AUTHORITY;
        String r3 = C0201.m82(26034);
        STATIC_HEADER_TABLE = new Header[]{new Header(dy2, r3), new Header(Header.TARGET_METHOD, C0201.m82(26035)), new Header(Header.TARGET_METHOD, C0201.m82(26036)), new Header(Header.TARGET_PATH, C0201.m82(26037)), new Header(Header.TARGET_PATH, C0201.m82(26038)), new Header(Header.TARGET_SCHEME, C0201.m82(26039)), new Header(Header.TARGET_SCHEME, C0201.m82(26040)), new Header(Header.RESPONSE_STATUS, C0201.m82(26041)), new Header(Header.RESPONSE_STATUS, C0201.m82(26042)), new Header(Header.RESPONSE_STATUS, C0201.m82(26043)), new Header(Header.RESPONSE_STATUS, C0201.m82(26044)), new Header(Header.RESPONSE_STATUS, C0201.m82(26045)), new Header(Header.RESPONSE_STATUS, C0201.m82(26046)), new Header(Header.RESPONSE_STATUS, C0201.m82(26047)), new Header(C0201.m82(26048), r3), new Header(C0201.m82(26049), C0201.m82(26050)), new Header(C0201.m82(26051), r3), new Header(C0201.m82(26052), r3), new Header(C0201.m82(26053), r3), new Header(C0201.m82(26054), r3), new Header(C0201.m82(26055), r3), new Header(C0201.m82(26056), r3), new Header(C0201.m82(26057), r3), new Header(C0201.m82(26058), r3), new Header(C0201.m82(26059), r3), new Header(C0201.m82(26060), r3), new Header(C0201.m82(26061), r3), new Header(C0201.m82(26062), r3), new Header(C0201.m82(26063), r3), new Header(C0201.m82(26064), r3), new Header(C0201.m82(26065), r3), new Header(C0201.m82(26066), r3), new Header(C0201.m82(26067), r3), new Header(C0201.m82(26068), r3), new Header(C0201.m82(26069), r3), new Header(C0201.m82(26070), r3), new Header(C0201.m82(26071), r3), new Header(C0201.m82(26072), r3), new Header(C0201.m82(26073), r3), new Header(C0201.m82(26074), r3), new Header(C0201.m82(26075), r3), new Header(C0201.m82(26076), r3), new Header(C0201.m82(26077), r3), new Header(C0201.m82(26078), r3), new Header(C0201.m82(26079), r3), new Header(C0201.m82(26080), r3), new Header(C0201.m82(26081), r3), new Header(C0201.m82(26082), r3), new Header(C0201.m82(26083), r3), new Header(C0201.m82(26084), r3), new Header(C0201.m82(26085), r3), new Header(C0201.m82(26086), r3), new Header(C0201.m82(26087), r3), new Header(C0201.m82(26088), r3), new Header(C0201.m82(26089), r3), new Header(C0201.m82(26090), r3), new Header(C0201.m82(26091), r3), new Header(C0201.m82(26092), r3), new Header(C0201.m82(26093), r3), new Header(C0201.m82(26094), r3), new Header(C0201.m82(26095), r3)};
    }

    private Hpack() {
    }

    public static dy2 checkLowercase(dy2 dy2) throws IOException {
        int A = dy2.A();
        for (int i = 0; i < A; i++) {
            byte l = dy2.l(i);
            if (l >= 65 && l <= 90) {
                throw new IOException(C0201.m82(26096) + dy2.J());
            }
        }
        return dy2;
    }

    private static Map<dy2, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i = 0;
        while (true) {
            Header[] headerArr = STATIC_HEADER_TABLE;
            if (i >= headerArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(headerArr[i].name)) {
                linkedHashMap.put(STATIC_HEADER_TABLE[i].name, Integer.valueOf(i));
            }
            i++;
        }
    }
}
