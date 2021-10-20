package defpackage;

/* renamed from: z23  reason: default package */
/* compiled from: OIDTokenizer */
public class z23 {
    private String a;
    private int b = 0;

    public z23(String str) {
        this.a = str;
    }

    public boolean a() {
        return this.b != -1;
    }

    public String b() {
        int i = this.b;
        if (i == -1) {
            return null;
        }
        int indexOf = this.a.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.a.substring(this.b);
            this.b = -1;
            return substring;
        }
        String substring2 = this.a.substring(this.b, indexOf);
        this.b = indexOf + 1;
        return substring2;
    }
}
