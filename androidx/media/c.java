package androidx.media;

import java.util.Arrays;
import vigqyno.C0201;

/* compiled from: AudioAttributesImplBase */
public class c implements a {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    public int a() {
        return this.b;
    }

    public int b() {
        int i = this.c;
        int c2 = c();
        if (c2 == 6) {
            i |= 4;
        } else if (c2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int c() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.a(false, this.c, this.a);
    }

    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.a() && this.c == cVar.b() && this.a == cVar.d() && this.d == cVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0201.m82(17116));
        if (this.d != -1) {
            sb.append(C0201.m82(17117));
            sb.append(this.d);
            sb.append(C0201.m82(17118));
        }
        sb.append(C0201.m82(17119));
        sb.append(AudioAttributesCompat.b(this.a));
        sb.append(C0201.m82(17120));
        sb.append(this.b);
        sb.append(C0201.m82(17121));
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
