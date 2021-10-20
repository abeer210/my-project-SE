package defpackage;

/* renamed from: za2  reason: default package */
/* compiled from: QRCodeDecoderMetaData */
public final class za2 {
    private final boolean a;

    public za2(boolean z) {
        this.a = z;
    }

    public void a(v62[] v62Arr) {
        if (this.a && v62Arr != null && v62Arr.length >= 3) {
            v62 v62 = v62Arr[0];
            v62Arr[0] = v62Arr[2];
            v62Arr[2] = v62;
        }
    }
}
