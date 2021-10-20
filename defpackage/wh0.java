package defpackage;

/* renamed from: wh0  reason: default package */
/* compiled from: SimpleImageTranscoderFactory */
public class wh0 implements sh0 {
    private final int a;

    public wh0(int i) {
        this.a = i;
    }

    @Override // defpackage.sh0
    public rh0 createImageTranscoder(ob0 ob0, boolean z) {
        return new vh0(z, this.a);
    }
}
