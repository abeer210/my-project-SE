package vigqyno;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vigqyno.∲  reason: contains not printable characters */
public class C0177 {

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public EnumC0219 f8;

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public Map<Integer, Object> f9 = new HashMap();

    public C0177(EnumC0219 r2) {
        this.f8 = r2;
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public int m15(int i) {
        Object obj = this.f9.get(Integer.valueOf(i));
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public String m16(int i) {
        Object obj = this.f9.get(Integer.valueOf(i));
        return obj != null ? (String) obj : "";
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public EnumC0219 m17() {
        return this.f8;
    }

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public boolean m18(int i) {
        Object obj = this.f9.get(Integer.valueOf(i));
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }
}
