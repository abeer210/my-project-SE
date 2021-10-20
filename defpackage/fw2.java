package defpackage;

import vigqyno.C0201;

/* renamed from: fw2  reason: default package */
/* compiled from: JvmClassMapping.kt */
public final class fw2 {
    public static final <T> Class<T> a(ax2<T> ax2) {
        ow2.c(ax2, C0201.m82(15777));
        Class<T> cls = (Class<T>) ((iw2) ax2).a();
        boolean isPrimitive = cls.isPrimitive();
        String r1 = C0201.m82(15778);
        if (isPrimitive) {
            String name = cls.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals(C0201.m82(15787))) {
                            cls = (Class<T>) Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals(C0201.m82(15786))) {
                            cls = (Class<T>) Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals(C0201.m82(15785))) {
                            cls = (Class<T>) Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals(C0201.m82(15784))) {
                            cls = (Class<T>) Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals(C0201.m82(15783))) {
                            cls = (Class<T>) Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals(C0201.m82(15782))) {
                            cls = (Class<T>) Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals(C0201.m82(15781))) {
                            cls = (Class<T>) Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals(C0201.m82(15780))) {
                            cls = (Class<T>) Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals(C0201.m82(15779))) {
                            cls = (Class<T>) Short.class;
                            break;
                        }
                        break;
                }
            }
            if (cls != null) {
                return cls;
            }
            throw new fv2(r1);
        } else if (cls != null) {
            return cls;
        } else {
            throw new fv2(r1);
        }
    }
}
