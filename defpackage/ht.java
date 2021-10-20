package defpackage;

/* renamed from: ht  reason: default package */
/* compiled from: PanasonicRawWbInfo2Descriptor */
public class ht extends as<it> {
    public ht(it itVar) {
        super(itVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 1 || i == 5 || i == 9 || i == 13 || i == 17 || i == 21 || i == 25) {
            return v(i);
        }
        return super.f(i);
    }

    public String v(int i) {
        Integer l = ((it) this.a).l(i);
        if (l == null) {
            return null;
        }
        return super.o(l.shortValue());
    }
}
