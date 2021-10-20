package defpackage;

/* renamed from: k80  reason: default package */
/* compiled from: ImageOriginRequestListener */
public class k80 extends ef0 {
    private String a;
    private final j80 b;

    public k80(String str, j80 j80) {
        this.b = j80;
        l(str);
    }

    @Override // defpackage.ef0, defpackage.ug0
    public void e(String str, String str2, boolean z) {
        j80 j80 = this.b;
        if (j80 != null) {
            j80.a(this.a, l80.a(str2), z, str2);
        }
    }

    public void l(String str) {
        this.a = str;
    }
}
