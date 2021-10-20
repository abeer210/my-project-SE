package defpackage;

/* renamed from: h80  reason: default package */
/* compiled from: DebugOverlayImageOriginListener */
public class h80 implements j80 {
    private int a = 1;

    @Override // defpackage.j80
    public void a(String str, int i, boolean z, String str2) {
        this.a = i;
    }

    public String b() {
        return l80.b(this.a);
    }
}
