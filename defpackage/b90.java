package defpackage;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: b90  reason: default package */
/* compiled from: ForwardingControllerListener */
public class b90<INFO> implements z80<INFO> {
    private final List<z80<? super INFO>> a = new ArrayList(2);

    private synchronized void i(String str, Throwable th) {
        Log.e(C0201.m82(24626), str, th);
    }

    @Override // defpackage.z80
    public void a(String str, INFO info) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                z80<? super INFO> z80 = this.a.get(i);
                if (z80 != null) {
                    z80.a(str, info);
                }
            } catch (Exception e) {
                i(C0201.m82(24627), e);
            }
        }
    }

    @Override // defpackage.z80
    public synchronized void b(String str, INFO info, Animatable animatable) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                z80<? super INFO> z80 = this.a.get(i);
                if (z80 != null) {
                    z80.b(str, info, animatable);
                }
            } catch (Exception e) {
                i(C0201.m82(24628), e);
            }
        }
    }

    @Override // defpackage.z80
    public synchronized void c(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                z80<? super INFO> z80 = this.a.get(i);
                if (z80 != null) {
                    z80.c(str, th);
                }
            } catch (Exception e) {
                i(C0201.m82(24629), e);
            }
        }
    }

    @Override // defpackage.z80
    public synchronized void d(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                z80<? super INFO> z80 = this.a.get(i);
                if (z80 != null) {
                    z80.d(str);
                }
            } catch (Exception e) {
                i(C0201.m82(24630), e);
            }
        }
    }

    @Override // defpackage.z80
    public synchronized void e(String str, Object obj) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                z80<? super INFO> z80 = this.a.get(i);
                if (z80 != null) {
                    z80.e(str, obj);
                }
            } catch (Exception e) {
                i(C0201.m82(24631), e);
            }
        }
    }

    @Override // defpackage.z80
    public void f(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                z80<? super INFO> z80 = this.a.get(i);
                if (z80 != null) {
                    z80.f(str, th);
                }
            } catch (Exception e) {
                i(C0201.m82(24632), e);
            }
        }
    }

    public synchronized void g(z80<? super INFO> z80) {
        this.a.add(z80);
    }

    public synchronized void h() {
        this.a.clear();
    }

    public synchronized void j(z80<? super INFO> z80) {
        int indexOf = this.a.indexOf(z80);
        if (indexOf != -1) {
            this.a.set(indexOf, null);
        }
    }
}
