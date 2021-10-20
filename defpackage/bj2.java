package defpackage;

/* renamed from: bj2  reason: default package */
/* compiled from: CommandListenerAdapter */
public class bj2 implements aj2 {
    private aj2 a;

    public bj2() {
    }

    @Override // defpackage.aj2
    public void a(String str) {
        aj2 aj2 = this.a;
        if (aj2 != null) {
            aj2.a(str);
        }
    }

    @Override // defpackage.aj2
    public void onError(String str) {
        aj2 aj2 = this.a;
        if (aj2 != null) {
            aj2.onError(str);
        }
    }

    public bj2(aj2 aj2) {
        this.a = aj2;
    }
}
