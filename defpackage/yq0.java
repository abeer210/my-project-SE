package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: yq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public interface yq0 extends IInterface {

    /* renamed from: yq0$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static abstract class a extends h01 implements yq0 {

        /* renamed from: yq0$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
        public static class C0228a extends i01 implements yq0 {
            public C0228a(IBinder iBinder) {
                super(iBinder, C0201.m82(21857));
            }
        }

        public a() {
            super(C0201.m82(33596));
        }

        public static yq0 U3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(33597));
            if (queryLocalInterface instanceof yq0) {
                return (yq0) queryLocalInterface;
            }
            return new C0228a(iBinder);
        }
    }
}
