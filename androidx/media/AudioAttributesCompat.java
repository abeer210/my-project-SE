package androidx.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.c;
import vigqyno.C0188;
import vigqyno.C0201;

public class AudioAttributesCompat implements c {
    private static final SparseIntArray b;
    public a a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.put(5, 1);
        b.put(6, 2);
        b.put(7, 2);
        b.put(8, 1);
        b.put(9, 1);
        b.put(10, 1);
    }

    public static int a(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
                if (z) {
                    return C0188.f23;
                }
                return 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException(C0201.m82(22561) + i2 + C0201.m82(22562));
        }
    }

    public static String b(int i) {
        switch (i) {
            case 0:
                return C0201.m82(22579);
            case 1:
                return C0201.m82(22578);
            case 2:
                return C0201.m82(22577);
            case 3:
                return C0201.m82(22576);
            case 4:
                return C0201.m82(22575);
            case 5:
                return C0201.m82(22574);
            case 6:
                return C0201.m82(22573);
            case 7:
                return C0201.m82(22572);
            case 8:
                return C0201.m82(22571);
            case 9:
                return C0201.m82(22570);
            case 10:
                return C0201.m82(22569);
            case 11:
                return C0201.m82(22568);
            case 12:
                return C0201.m82(22567);
            case 13:
                return C0201.m82(22566);
            case 14:
                return C0201.m82(22565);
            case 15:
            default:
                return C0201.m82(22563) + i;
            case 16:
                return C0201.m82(22564);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        a aVar = this.a;
        if (aVar != null) {
            return aVar.equals(audioAttributesCompat.a);
        }
        if (audioAttributesCompat.a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
