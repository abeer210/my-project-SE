package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.dynatrace.android.agent.b;
import com.dynatrace.android.agent.f;
import com.dynatrace.android.agent.l;
import com.dynatrace.android.agent.u;
import defpackage.k30;
import java.util.ArrayList;
import java.util.LinkedList;
import vigqyno.C0201;

/* renamed from: j30  reason: default package */
/* compiled from: DataAccessObject */
public class j30 {
    private static final String c = (u.b + C0201.m82(27630));
    private final n30 a;
    private final l30 b;

    public j30(Context context) {
        this(new l30(context), new n30(context));
    }

    public boolean a() {
        try {
            return this.b.a();
        } catch (Exception e) {
            if (u.c) {
                s30.u(c, C0201.m82(27631), e);
            }
            return false;
        }
    }

    public synchronized void b(long j, long j2) {
        try {
            this.b.k(j, j2);
        } catch (Exception e) {
            if (u.c) {
                s30.s(c, C0201.m82(27632), e);
            }
        }
    }

    public synchronized void c(int i) {
        try {
            this.b.h(l30.d, i);
        } catch (Exception e) {
            if (u.c) {
                s30.u(c, C0201.m82(27633), e);
            }
        }
    }

    public synchronized void d(long j, boolean z) {
        try {
            this.b.c(j - 540000, z);
        } catch (Exception e) {
            if (u.c) {
                s30.u(c, C0201.m82(27634), e);
            }
        }
    }

    public synchronized void e(m30 m30) {
        try {
            this.b.m(m30.a, m30.b, m30.c, m30.d, m30.e);
        } catch (Exception e) {
            if (u.c) {
                s30.s(c, C0201.m82(27635), e);
            }
        }
    }

    public void f() {
        try {
            this.a.o();
        } catch (Exception e) {
            if (u.c) {
                s30.u(c, C0201.m82(27636), e);
            }
        }
    }

    public m30 g(long j, f.a aVar, long j2, l.a aVar2) {
        boolean z;
        long j3;
        int i;
        int i2;
        long j4;
        long j5;
        String str;
        long j6;
        int i3;
        int i4;
        long j7 = j2 - 540000;
        Cursor o = this.b.o();
        if (o == null) {
            if (u.c) {
                s30.r(c, C0201.m82(27637));
            }
            return null;
        } else if (!o.moveToFirst()) {
            o.close();
            return null;
        } else {
            int columnIndexOrThrow = o.getColumnIndexOrThrow(C0201.m82(27638));
            int columnIndexOrThrow2 = o.getColumnIndexOrThrow(C0201.m82(27639));
            int columnIndexOrThrow3 = o.getColumnIndexOrThrow(C0201.m82(27640));
            int columnIndexOrThrow4 = o.getColumnIndexOrThrow(C0201.m82(27641));
            int columnIndexOrThrow5 = o.getColumnIndexOrThrow(C0201.m82(27642));
            int columnIndexOrThrow6 = o.getColumnIndexOrThrow(C0201.m82(27643));
            int columnIndexOrThrow7 = o.getColumnIndexOrThrow(C0201.m82(27644));
            int columnIndexOrThrow8 = o.getColumnIndexOrThrow(C0201.m82(27645));
            int columnIndexOrThrow9 = o.getColumnIndexOrThrow(C0201.m82(27646));
            int columnIndexOrThrow10 = o.getColumnIndexOrThrow(C0201.m82(27647));
            int columnIndexOrThrow11 = o.getColumnIndexOrThrow(C0201.m82(27648));
            ArrayList arrayList = new ArrayList();
            long j8 = 0;
            long j9 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            long j10 = -1;
            String str2 = null;
            while (true) {
                long j11 = o.getLong(columnIndexOrThrow2);
                long j12 = o.getLong(columnIndexOrThrow3);
                int i8 = o.getInt(columnIndexOrThrow4);
                String string = o.getString(columnIndexOrThrow6);
                int i9 = o.getInt(columnIndexOrThrow7);
                int i10 = o.getInt(columnIndexOrThrow11);
                if (i9 == l30.d && o.getLong(columnIndexOrThrow8) + o.getLong(columnIndexOrThrow9) < j7) {
                    string = aVar2.a(string);
                }
                if (str2 != null) {
                    j6 = j7;
                    int length = i6 + 1 + string.length();
                    if (j8 == j11 && j9 == j12 && i5 == i8) {
                        i4 = i7;
                        if (i4 != i10) {
                            break;
                        }
                        i3 = columnIndexOrThrow8;
                        if (((long) length) > j) {
                            break;
                        }
                        arrayList.add(string);
                        i6 = length;
                        i7 = i4;
                        j10 = o.getLong(columnIndexOrThrow);
                    } else {
                        i4 = i7;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(o.getString(columnIndexOrThrow5));
                    j6 = j7;
                    sb.append(aVar.a(o.getLong(columnIndexOrThrow8), o.getInt(columnIndexOrThrow10)));
                    String sb2 = sb.toString();
                    arrayList.add(string);
                    i6 = sb2.length() + 1 + string.length();
                    i5 = i8;
                    i7 = i10;
                    i3 = columnIndexOrThrow8;
                    j10 = o.getLong(columnIndexOrThrow);
                    j8 = j11;
                    j9 = j12;
                    str2 = sb2;
                }
                if (!o.moveToNext()) {
                    i2 = i5;
                    str = str2;
                    j3 = j10;
                    j5 = j8;
                    j4 = j9;
                    i = i7;
                    z = true;
                    break;
                }
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow8 = i3;
                columnIndexOrThrow4 = columnIndexOrThrow4;
                columnIndexOrThrow6 = columnIndexOrThrow6;
                columnIndexOrThrow7 = columnIndexOrThrow7;
                j7 = j6;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            i = i4;
            i2 = i5;
            str = str2;
            j3 = j10;
            j5 = j8;
            j4 = j9;
            z = false;
            o.close();
            return new m30(j5, j4, i2, i, j3, new u10(str, arrayList), z);
        }
    }

    public long h() {
        long j = 0;
        for (int i = 0; i < 3; i++) {
            j += Double.valueOf(Double.valueOf(Math.random()).doubleValue() * 65536.0d).longValue() << (i * 8);
        }
        return j;
    }

    public long i() {
        String r0 = C0201.m82(27649);
        try {
            Long m = this.a.m();
            if (m == null) {
                this.a.a();
            } else if (m.longValue() != 0) {
                return m.longValue();
            }
        } catch (Exception e) {
            if (u.c) {
                s30.u(c, r0, e);
            }
        }
        long h = h();
        try {
            b.d().g(false);
            this.a.r(h);
        } catch (Exception e2) {
            if (u.c) {
                s30.u(c, r0, e2);
            }
        }
        return h;
    }

    public synchronized void j(LinkedList<k30.a> linkedList, n20 n20) {
        this.b.r(linkedList);
        if (n20.H()) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= linkedList.size()) {
                    break;
                } else if (linkedList.get(i).d == l30.d) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                try {
                    this.b.h(l30.d, n20.v());
                } catch (Exception e) {
                    if (u.c) {
                        s30.s(c, C0201.m82(27650), e);
                    }
                }
            }
        }
    }

    public synchronized boolean k(g30 g30) {
        try {
        } catch (Exception e) {
            s30.u(c, C0201.m82(27651), e);
            return false;
        }
        return this.b.u(g30);
    }

    public long l() {
        try {
            synchronized (this.a) {
                Long k = this.a.k();
                if (k == null) {
                    return -1;
                }
                long longValue = k.longValue() + 1;
                this.a.p(longValue);
                return longValue;
            }
        } catch (Exception e) {
            if (u.c) {
                s30.u(c, C0201.m82(27652), e);
            }
            return -1;
        }
    }

    public j30(l30 l30, n30 n30) {
        this.b = l30;
        this.a = n30;
    }
}
