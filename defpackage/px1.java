package defpackage;

/* renamed from: px1  reason: default package */
/* compiled from: CutCornerTreatment */
public class px1 extends ox1 {
    public float a = -1.0f;

    @Override // defpackage.ox1
    public void a(xx1 xx1, float f, float f2, float f3) {
        xx1.n(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double sin = Math.sin(Math.toRadians((double) f));
        double d = (double) f3;
        Double.isNaN(d);
        double d2 = (double) f2;
        Double.isNaN(d2);
        double sin2 = Math.sin(Math.toRadians((double) (90.0f - f)));
        Double.isNaN(d);
        Double.isNaN(d2);
        xx1.l((float) (sin * d * d2), (float) (sin2 * d * d2));
    }
}
