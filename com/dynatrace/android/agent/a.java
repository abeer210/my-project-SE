package com.dynatrace.android.agent;

import java.util.NoSuchElementException;
import java.util.Vector;
import vigqyno.C0201;

/* compiled from: ActionThreadLocal */
public final class a {
    private static final String a = (u.b + C0201.m82(2663));
    private static final ThreadLocal<Vector<o>> b = new C0035a();

    /* renamed from: com.dynatrace.android.agent.a$a  reason: collision with other inner class name */
    /* compiled from: ActionThreadLocal */
    static class C0035a extends ThreadLocal<Vector<o>> {
        /* renamed from: a */
        public Vector<o> initialValue() {
            return new Vector<>();
        }
    }

    public static final boolean a(o oVar) {
        e();
        if (oVar == null || oVar.x()) {
            return false;
        }
        return b.get().add(oVar);
    }

    public static final synchronized void b() {
        Vector vector;
        synchronized (a.class) {
            try {
                synchronized (b) {
                    vector = new Vector(b.get());
                }
                for (int i = 0; i < vector.size(); i++) {
                    o oVar = (o) vector.get(i);
                    if (oVar != null && !oVar.x()) {
                        oVar.c();
                    }
                }
            } catch (Exception e) {
                if (u.c) {
                    s30.s(a, C0201.m82(2664), e);
                }
            }
        }
    }

    public static final o c() {
        e();
        try {
            return b.get().lastElement();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public static final boolean d(o oVar) {
        boolean remove = b.get().remove(oVar);
        e();
        return remove;
    }

    public static final synchronized void e() {
        synchronized (a.class) {
            Vector vector = new Vector(b.get());
            for (int i = 0; i < vector.size(); i++) {
                try {
                    o oVar = b.get().get(i);
                    if (oVar != null && oVar.x()) {
                        b.get().remove(oVar);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            vector.clear();
        }
    }
}
