package defpackage;

/* renamed from: vh  reason: default package */
/* compiled from: DiskCacheStrategy */
public abstract class vh {
    public static final vh a = new a();
    public static final vh b = new b();
    public static final vh c = new c();

    /* renamed from: vh$a */
    /* compiled from: DiskCacheStrategy */
    class a extends vh {
        @Override // defpackage.vh
        public boolean a() {
            return false;
        }

        @Override // defpackage.vh
        public boolean b() {
            return false;
        }

        @Override // defpackage.vh
        public boolean c(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // defpackage.vh
        public boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    /* renamed from: vh$b */
    /* compiled from: DiskCacheStrategy */
    class b extends vh {
        @Override // defpackage.vh
        public boolean a() {
            return true;
        }

        @Override // defpackage.vh
        public boolean b() {
            return false;
        }

        @Override // defpackage.vh
        public boolean c(com.bumptech.glide.load.a aVar) {
            return (aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }

        @Override // defpackage.vh
        public boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    /* renamed from: vh$c */
    /* compiled from: DiskCacheStrategy */
    class c extends vh {
        @Override // defpackage.vh
        public boolean a() {
            return true;
        }

        @Override // defpackage.vh
        public boolean b() {
            return true;
        }

        @Override // defpackage.vh
        public boolean c(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.REMOTE;
        }

        @Override // defpackage.vh
        public boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return ((z && aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE) || aVar == com.bumptech.glide.load.a.LOCAL) && cVar == com.bumptech.glide.load.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(com.bumptech.glide.load.a aVar);

    public abstract boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar);
}
