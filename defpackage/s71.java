package defpackage;

import defpackage.s71;
import defpackage.u71;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import vigqyno.C0201;

/* renamed from: s71  reason: default package */
public abstract class s71<MessageType extends s71<MessageType, BuilderType>, BuilderType extends u71<MessageType, BuilderType>> implements wa1 {
    private static boolean zzacu;
    public int zzact = 0;

    static {
        C0201.m83(s71.class, 587);
    }

    public static <T> void i(Iterable<T> iterable, List<? super T> list) {
        m91.a(iterable);
        boolean z = iterable instanceof ca1;
        String r1 = C0201.m82(10942);
        String r2 = C0201.m82(10943);
        if (z) {
            List<?> Y0 = ((ca1) iterable).Y0();
            ca1 ca1 = (ca1) list;
            int size = list.size();
            for (Object obj : Y0) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append(r2);
                    sb.append(ca1.size() - size);
                    sb.append(r1);
                    String sb2 = sb.toString();
                    for (int size2 = ca1.size() - 1; size2 >= size; size2--) {
                        ca1.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof c81) {
                    ca1.Z((c81) obj);
                } else {
                    ca1.add((String) obj);
                }
            }
        } else if (iterable instanceof ib1) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append(r2);
                    sb3.append(list.size() - size3);
                    sb3.append(r1);
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }

    @Override // defpackage.wa1
    public final c81 c() {
        try {
            j81 g = c81.g(a());
            g(g.b());
            return g.a();
        } catch (IOException e) {
            String r2 = C0201.m82(10944);
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + r2.length());
            sb.append(C0201.m82(10945));
            sb.append(name);
            sb.append(C0201.m82(10946));
            sb.append(r2);
            sb.append(C0201.m82(10947));
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] h() {
        try {
            byte[] bArr = new byte[a()];
            r81 v0 = r81.v0(bArr);
            g(v0);
            v0.J0();
            return bArr;
        } catch (IOException e) {
            String r2 = C0201.m82(10948);
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + r2.length());
            sb.append(C0201.m82(10949));
            sb.append(name);
            sb.append(C0201.m82(10950));
            sb.append(r2);
            sb.append(C0201.m82(10951));
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public void j(int i) {
        throw new UnsupportedOperationException();
    }

    public int k() {
        throw new UnsupportedOperationException();
    }
}
