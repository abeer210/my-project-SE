package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: NotificationCompat */
public class i {

    /* compiled from: NotificationCompat */
    public static class a {
        public final Bundle a;
        private final m[] b;
        private final m[] c;
        private boolean d;
        public boolean e;
        private final int f;
        public int g;
        public CharSequence h;
        public PendingIntent i;

        /* renamed from: androidx.core.app.i$a$a  reason: collision with other inner class name */
        /* compiled from: NotificationCompat */
        public static final class C0015a {
            private final int a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList<m> f;
            private int g;
            private boolean h;

            public C0015a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
            }

            public C0015a a(m mVar) {
                if (this.f == null) {
                    this.f = new ArrayList<>();
                }
                this.f.add(mVar);
                return this;
            }

            public a b() {
                m[] mVarArr;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<m> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator<m> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        m next = it.next();
                        if (next.k()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                m[] mVarArr2 = null;
                if (arrayList.isEmpty()) {
                    mVarArr = null;
                } else {
                    mVarArr = (m[]) arrayList.toArray(new m[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    mVarArr2 = (m[]) arrayList2.toArray(new m[arrayList2.size()]);
                }
                return new a(this.a, this.b, this.c, this.e, mVarArr2, mVarArr, this.d, this.g, this.h);
            }

            public C0015a c(boolean z) {
                this.d = z;
                return this;
            }

            private C0015a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, m[] mVarArr, boolean z, int i2, boolean z2) {
                ArrayList<m> arrayList;
                this.d = true;
                this.h = true;
                this.a = i;
                this.b = d.f(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                if (mVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(mVarArr));
                }
                this.f = arrayList;
                this.d = z;
                this.g = i2;
                this.h = z2;
            }
        }

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        public PendingIntent a() {
            return this.i;
        }

        public boolean b() {
            return this.d;
        }

        public m[] c() {
            return this.c;
        }

        public Bundle d() {
            return this.a;
        }

        public int e() {
            return this.g;
        }

        public m[] f() {
            return this.b;
        }

        public int g() {
            return this.f;
        }

        public boolean h() {
            return this.e;
        }

        public CharSequence i() {
            return this.h;
        }

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, m[] mVarArr, m[] mVarArr2, boolean z, int i3, boolean z2) {
            this.e = true;
            this.g = i2;
            this.h = d.f(charSequence);
            this.i = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.b = mVarArr;
            this.c = mVarArr2;
            this.d = z;
            this.f = i3;
            this.e = z2;
        }
    }

    /* compiled from: NotificationCompat */
    public static class b extends e {
        private Bitmap e;
        private Bitmap f;
        private boolean g;

        @Override // androidx.core.app.i.e
        public void b(h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(hVar.a()).setBigContentTitle(this.b).bigPicture(this.e);
                if (this.g) {
                    bigPicture.bigLargeIcon(this.f);
                }
                if (this.d) {
                    bigPicture.setSummaryText(this.c);
                }
            }
        }

        public b g(Bitmap bitmap) {
            this.f = bitmap;
            this.g = true;
            return this;
        }

        public b h(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.b = d.f(charSequence);
            return this;
        }

        public b j(CharSequence charSequence) {
            this.c = d.f(charSequence);
            this.d = true;
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static class c extends e {
        private CharSequence e;

        @Override // androidx.core.app.i.e
        public void b(h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.a()).setBigContentTitle(this.b).bigText(this.e);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                }
            }
        }

        public c g(CharSequence charSequence) {
            this.e = d.f(charSequence);
            return this;
        }

        public c h(CharSequence charSequence) {
            this.b = d.f(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.c = d.f(charSequence);
            this.d = true;
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static abstract class e {
        public d a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
        }

        public abstract void b(h hVar);

        public RemoteViews c(h hVar) {
            return null;
        }

        public RemoteViews d(h hVar) {
            return null;
        }

        public RemoteViews e(h hVar) {
            return null;
        }

        public void f(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                if (dVar != null) {
                    dVar.N(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return k.c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat */
    public static class d {
        public String A;
        public Bundle B;
        public int C;
        public int D;
        public Notification E;
        public RemoteViews F;
        public RemoteViews G;
        public RemoteViews H;
        public String I;
        public int J;
        public String K;
        public long L;
        public int M;
        public Notification N;
        @Deprecated
        public ArrayList<String> O;
        public Context a;
        public ArrayList<a> b;
        public ArrayList<a> c;
        public CharSequence d;
        public CharSequence e;
        public PendingIntent f;
        public PendingIntent g;
        public RemoteViews h;
        public Bitmap i;
        public CharSequence j;
        public int k;
        public int l;
        public boolean m;
        public boolean n;
        public e o;
        public CharSequence p;
        public CharSequence[] q;
        public int r;
        public int s;
        public boolean t;
        public String u;
        public boolean v;
        public String w;
        public boolean x;
        public boolean y;
        public boolean z;

        public d(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            Notification notification = new Notification();
            this.N = notification;
            this.a = context;
            this.I = str;
            notification.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        public static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap g(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(d1.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(d1.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d2 = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d2);
            Double.isNaN(max);
            double d3 = d2 / max;
            double d4 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d4);
            Double.isNaN(max2);
            double min = Math.min(d3, d4 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        private void u(int i2, boolean z2) {
            if (z2) {
                Notification notification = this.N;
                notification.flags = i2 | notification.flags;
                return;
            }
            Notification notification2 = this.N;
            notification2.flags = (i2 ^ -1) & notification2.flags;
        }

        public d A(boolean z2) {
            this.x = z2;
            return this;
        }

        public d B(int i2) {
            this.k = i2;
            return this;
        }

        public d C(boolean z2) {
            u(2, z2);
            return this;
        }

        public d D(boolean z2) {
            u(8, z2);
            return this;
        }

        public d E(int i2) {
            this.l = i2;
            return this;
        }

        public d F(int i2, int i3, boolean z2) {
            this.r = i2;
            this.s = i3;
            this.t = z2;
            return this;
        }

        public d G(CharSequence[] charSequenceArr) {
            this.q = charSequenceArr;
            return this;
        }

        public d H(String str) {
            this.K = str;
            return this;
        }

        public d I(boolean z2) {
            this.m = z2;
            return this;
        }

        public d J(int i2) {
            this.N.icon = i2;
            return this;
        }

        public d K(int i2, int i3) {
            Notification notification = this.N;
            notification.icon = i2;
            notification.iconLevel = i3;
            return this;
        }

        public d L(String str) {
            this.w = str;
            return this;
        }

        public d M(Uri uri) {
            Notification notification = this.N;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public d N(e eVar) {
            if (this.o != eVar) {
                this.o = eVar;
                if (eVar != null) {
                    eVar.f(this);
                }
            }
            return this;
        }

        public d O(CharSequence charSequence) {
            this.p = f(charSequence);
            return this;
        }

        public d P(CharSequence charSequence) {
            this.N.tickerText = f(charSequence);
            return this;
        }

        public d Q(long j2) {
            this.L = j2;
            return this;
        }

        public d R(boolean z2) {
            this.n = z2;
            return this;
        }

        public d S(long[] jArr) {
            this.N.vibrate = jArr;
            return this;
        }

        public d T(int i2) {
            this.D = i2;
            return this;
        }

        public d U(long j2) {
            this.N.when = j2;
            return this;
        }

        public d a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public d b(a aVar) {
            this.b.add(aVar);
            return this;
        }

        public d c(String str) {
            this.O.add(str);
            return this;
        }

        public Notification d() {
            return new j(this).c();
        }

        public Bundle e() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public d h(boolean z2) {
            u(16, z2);
            return this;
        }

        public d i(int i2) {
            this.J = i2;
            return this;
        }

        public d j(String str) {
            this.A = str;
            return this;
        }

        public d k(String str) {
            this.I = str;
            return this;
        }

        public d l(int i2) {
            this.C = i2;
            return this;
        }

        public d m(boolean z2) {
            this.y = z2;
            this.z = true;
            return this;
        }

        public d n(CharSequence charSequence) {
            this.j = f(charSequence);
            return this;
        }

        public d o(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public d p(CharSequence charSequence) {
            this.e = f(charSequence);
            return this;
        }

        public d q(CharSequence charSequence) {
            this.d = f(charSequence);
            return this;
        }

        public d r(int i2) {
            Notification notification = this.N;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public d s(PendingIntent pendingIntent) {
            this.N.deleteIntent = pendingIntent;
            return this;
        }

        public d t(Bundle bundle) {
            this.B = bundle;
            return this;
        }

        public d v(String str) {
            this.u = str;
            return this;
        }

        public d w(int i2) {
            this.M = i2;
            return this;
        }

        public d x(boolean z2) {
            this.v = z2;
            return this;
        }

        public d y(Bitmap bitmap) {
            this.i = g(bitmap);
            return this;
        }

        public d z(int i2, int i3, int i4) {
            Notification notification = this.N;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            int i5 = (i3 == 0 || i4 == 0) ? 0 : 1;
            Notification notification2 = this.N;
            notification2.flags = i5 | (notification2.flags & -2);
            return this;
        }

        @Deprecated
        public d(Context context) {
            this(context, null);
        }
    }
}
