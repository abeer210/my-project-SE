package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: aw  reason: default package */
/* compiled from: GifControlDirectory */
public class aw extends tr {
    public static final HashMap<Integer, String> e;

    /* renamed from: aw$a */
    /* compiled from: GifControlDirectory */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            iArr[b.DO_NOT_DISPOSE.ordinal()] = 1;
            a[b.INVALID.ordinal()] = 2;
            a[b.NOT_SPECIFIED.ordinal()] = 3;
            a[b.RESTORE_TO_BACKGROUND_COLOR.ordinal()] = 4;
            a[b.RESTORE_TO_PREVIOUS.ordinal()] = 5;
            try {
                a[b.TO_BE_DEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: aw$b */
    /* compiled from: GifControlDirectory */
    public enum b {
        NOT_SPECIFIED,
        DO_NOT_DISPOSE,
        RESTORE_TO_BACKGROUND_COLOR,
        RESTORE_TO_PREVIOUS,
        TO_BE_DEFINED,
        INVALID;

        public static b b(int i) {
            switch (i) {
                case 0:
                    return NOT_SPECIFIED;
                case 1:
                    return DO_NOT_DISPOSE;
                case 2:
                    return RESTORE_TO_BACKGROUND_COLOR;
                case 3:
                    return RESTORE_TO_PREVIOUS;
                case 4:
                case 5:
                case 6:
                case 7:
                    return TO_BE_DEFINED;
                default:
                    return INVALID;
            }
        }

        public String toString() {
            switch (a.a[ordinal()]) {
                case 1:
                    return "Don't Dispose";
                case 2:
                    return "Invalid value";
                case 3:
                    return "Not Specified";
                case 4:
                    return "Restore to Background Color";
                case 5:
                    return "Restore to Previous";
                case 6:
                    return "To Be Defined";
                default:
                    return super.toString();
            }
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(1, C0201.m82(4343));
        e.put(2, C0201.m82(4344));
        e.put(3, C0201.m82(4345));
        e.put(4, C0201.m82(4346));
        e.put(5, C0201.m82(4347));
    }

    public aw() {
        E(new zv(this));
    }

    @Override // defpackage.tr
    public String n() {
        return C0201.m82(4348);
    }

    @Override // defpackage.tr
    public HashMap<Integer, String> w() {
        return e;
    }
}
