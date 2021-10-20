package defpackage;

/* renamed from: h30  reason: default package */
/* compiled from: SessionState */
public enum h30 {
    CREATED(true, false),
    ENABLED(true, true),
    DISABLED(false, true);
    
    private boolean a;
    private boolean b;

    private h30(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public boolean b() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }
}
