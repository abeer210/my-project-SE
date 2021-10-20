package defpackage;

/* renamed from: jt  reason: default package */
/* compiled from: PanasonicRawWbInfoDescriptor */
public class jt extends as<kt> {
    public jt(kt ktVar) {
        super(ktVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        if (i == 1 || i == 4 || i == 7 || i == 10 || i == 13 || i == 16 || i == 19) {
            return v(i);
        }
        return super.f(i);
    }

    public String v(int i) {
        Integer l = ((kt) this.a).l(i);
        if (l == null) {
            return null;
        }
        return super.o(l.shortValue());
    }
}
