package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;
import vigqyno.C0201;

/* compiled from: JobIntentService */
public abstract class f extends Service {
    public static final Object g = new Object();
    public static final HashMap<ComponentName, h> h = new HashMap<>();
    public b a;
    public h b;
    public a c;
    public boolean d = false;
    public boolean e = false;
    public final ArrayList<d> f;

    /* access modifiers changed from: package-private */
    /* compiled from: JobIntentService */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a2 = f.this.a();
                if (a2 == null) {
                    return null;
                }
                f.this.g(a2.getIntent());
                a2.a();
            }
        }

        /* renamed from: b */
        public void onCancelled(Void r1) {
            f.this.i();
        }

        /* renamed from: c */
        public void onPostExecute(Void r1) {
            f.this.i();
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: JobIntentService */
    public interface b {
        IBinder a();

        e b();
    }

    /* access modifiers changed from: package-private */
    /* compiled from: JobIntentService */
    public static final class c extends h {
        private final Context d;
        private final PowerManager.WakeLock e;
        private final PowerManager.WakeLock f;
        public boolean g;
        public boolean h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService(C0201.m82(22310));
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + C0201.m82(22311));
            this.e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + C0201.m82(22312));
            this.f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.f.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.f.h
        public void c() {
            synchronized (this) {
                if (this.h) {
                    if (this.g) {
                        this.e.acquire(60000);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }

        @Override // androidx.core.app.f.h
        public void d() {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(600000);
                    this.e.release();
                }
            }
        }

        @Override // androidx.core.app.f.h
        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: JobIntentService */
    public final class d implements e {
        public final Intent a;
        public final int b;

        public d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // androidx.core.app.f.e
        public void a() {
            f.this.stopSelf(this.b);
        }

        @Override // androidx.core.app.f.e
        public Intent getIntent() {
            return this.a;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: JobIntentService */
    public interface e {
        void a();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.f$f  reason: collision with other inner class name */
    /* compiled from: JobIntentService */
    static final class job.JobServiceEngineC0014f extends JobServiceEngine implements b {
        public final f a;
        public final Object b = new Object();
        public JobParameters c;

        /* renamed from: androidx.core.app.f$f$a */
        /* compiled from: JobIntentService */
        final class a implements e {
            public final JobWorkItem a;

            public a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            @Override // androidx.core.app.f.e
            public void a() {
                synchronized (job.JobServiceEngineC0014f.this.b) {
                    if (job.JobServiceEngineC0014f.this.c != null) {
                        job.JobServiceEngineC0014f.this.c.completeWork(this.a);
                    }
                }
            }

            @Override // androidx.core.app.f.e
            public Intent getIntent() {
                return this.a.getIntent();
            }
        }

        public job.JobServiceEngineC0014f(f fVar) {
            super(fVar);
            this.a = fVar;
        }

        @Override // androidx.core.app.f.b
        public IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new androidx.core.app.f.job.JobServiceEngineC0014f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        @Override // androidx.core.app.f.b
        public e b() {
            synchronized (this.b) {
                if (this.c == null) {
                    return null;
                }
                JobWorkItem dequeueWork = this.c.dequeueWork();
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b2 = this.a.b();
            synchronized (this.b) {
                this.c = null;
            }
            return b2;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: JobIntentService */
    public static final class g extends h {
        private final JobInfo d;
        private final JobScheduler e;

        public g(Context context, ComponentName componentName, int i) {
            super(componentName);
            b(i);
            this.d = new JobInfo.Builder(i, this.a).setOverrideDeadline(0).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService(C0201.m82(21927));
        }

        @Override // androidx.core.app.f.h
        public void a(Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: JobIntentService */
    public static abstract class h {
        public final ComponentName a;
        public boolean b;
        public int c;

        public h(ComponentName componentName) {
            this.a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c != i) {
                throw new IllegalArgumentException(C0201.m82(21635) + i + C0201.m82(21636) + this.c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public f() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f = null;
        } else {
            this.f = new ArrayList<>();
        }
    }

    public static void c(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (g) {
                h f2 = f(context, componentName, true, i);
                f2.b(i);
                f2.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(21407));
    }

    public static void d(Context context, Class cls, int i, Intent intent) {
        c(context, new ComponentName(context, cls), i, intent);
    }

    public static h f(Context context, ComponentName componentName, boolean z, int i) {
        h hVar;
        h hVar2 = h.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z) {
            hVar = new g(context, componentName, i);
        } else {
            throw new IllegalArgumentException(C0201.m82(21408));
        }
        h.put(componentName, hVar);
        return hVar;
    }

    public e a() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f) {
            if (this.f.size() <= 0) {
                return null;
            }
            return this.f.remove(0);
        }
    }

    public boolean b() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.cancel(this.d);
        }
        return h();
    }

    public void e(boolean z) {
        if (this.c == null) {
            this.c = new a();
            h hVar = this.b;
            if (hVar != null && z) {
                hVar.d();
            }
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    public void i() {
        ArrayList<d> arrayList = this.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.c = null;
                if (this.f != null && this.f.size() > 0) {
                    e(false);
                } else if (!this.e) {
                    this.b.c();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new job.JobServiceEngineC0014f(this);
            this.b = null;
            return;
        }
        this.a = null;
        this.b = f(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.e = true;
                this.b.c();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f == null) {
            return 2;
        }
        this.b.e();
        synchronized (this.f) {
            ArrayList<d> arrayList = this.f;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i2));
            e(true);
        }
        return 3;
    }
}
