package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: ff0  reason: default package */
/* compiled from: ForwardingRequestListener */
public class ff0 implements gf0 {
    private final List<gf0> a;

    public ff0(Set<gf0> set) {
        this.a = new ArrayList(set.size());
        for (gf0 gf0 : set) {
            if (gf0 != null) {
                this.a.add(gf0);
            }
        }
    }

    private void m(String str, Throwable th) {
        f60.j(C0201.m82(15705), str, th);
    }

    @Override // defpackage.gf0
    public void a(ih0 ih0, Object obj, String str, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).a(ih0, obj, str, z);
            } catch (Exception e) {
                m(C0201.m82(15706), e);
            }
        }
    }

    @Override // defpackage.ug0
    public void b(String str, String str2) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).b(str, str2);
            } catch (Exception e) {
                m(C0201.m82(15707), e);
            }
        }
    }

    @Override // defpackage.gf0
    public void c(ih0 ih0, String str, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).c(ih0, str, z);
            } catch (Exception e) {
                m(C0201.m82(15708), e);
            }
        }
    }

    @Override // defpackage.ug0
    public void d(String str, String str2, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).d(str, str2, map);
            } catch (Exception e) {
                m(C0201.m82(15709), e);
            }
        }
    }

    @Override // defpackage.ug0
    public void e(String str, String str2, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).e(str, str2, z);
            } catch (Exception e) {
                m(C0201.m82(15710), e);
            }
        }
    }

    @Override // defpackage.ug0
    public boolean f(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i).f(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gf0
    public void g(ih0 ih0, String str, Throwable th, boolean z) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).g(ih0, str, th, z);
            } catch (Exception e) {
                m(C0201.m82(15711), e);
            }
        }
    }

    @Override // defpackage.ug0
    public void h(String str, String str2, String str3) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).h(str, str2, str3);
            } catch (Exception e) {
                m(C0201.m82(15712), e);
            }
        }
    }

    @Override // defpackage.ug0
    public void i(String str, String str2, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).i(str, str2, map);
            } catch (Exception e) {
                m(C0201.m82(15713), e);
            }
        }
    }

    @Override // defpackage.ug0
    public void j(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).j(str, str2, th, map);
            } catch (Exception e) {
                m(C0201.m82(15714), e);
            }
        }
    }

    @Override // defpackage.gf0
    public void k(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.get(i).k(str);
            } catch (Exception e) {
                m(C0201.m82(15715), e);
            }
        }
    }

    public void l(gf0 gf0) {
        this.a.add(gf0);
    }

    public ff0(gf0... gf0Arr) {
        this.a = new ArrayList(gf0Arr.length);
        for (gf0 gf0 : gf0Arr) {
            if (gf0 != null) {
                this.a.add(gf0);
            }
        }
    }
}
