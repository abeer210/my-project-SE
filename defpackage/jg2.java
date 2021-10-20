package defpackage;

import com.aurelhubert.ahbottomnavigation.q;

/* renamed from: jg2  reason: default package */
/* compiled from: TitleDisplayMode */
public enum jg2 {
    ALWAYS_SHOW(q.f.ALWAYS_SHOW),
    SHOW_WHEN_ACTIVE(q.f.SHOW_WHEN_ACTIVE),
    ALWAYS_HIDE(q.f.ALWAYS_HIDE),
    SHOW_WHEN_ACTIVE_FORCE(q.f.SHOW_WHEN_ACTIVE_FORCE),
    UNDEFINED(null);
    
    private q.f a;

    private jg2(q.f fVar) {
        this.a = fVar;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static jg2 b(String str) {
        char c;
        switch (str.hashCode()) {
            case -363722962:
                if (str.equals("showWhenActiveForce")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1183597553:
                if (str.equals("alwaysHide")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1183924652:
                if (str.equals("alwaysShow")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1414341053:
                if (str.equals("showWhenActive")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return ALWAYS_SHOW;
        }
        if (c == 1) {
            return SHOW_WHEN_ACTIVE;
        }
        if (c == 2) {
            return ALWAYS_HIDE;
        }
        if (c != 3) {
            return UNDEFINED;
        }
        return SHOW_WHEN_ACTIVE_FORCE;
    }

    public q.f d(q.f fVar) {
        q.f fVar2 = this.a;
        return fVar2 == null ? fVar : fVar2;
    }

    public boolean e() {
        return this.a != null;
    }

    public q.f f() {
        q.f fVar = this.a;
        if (fVar != null) {
            return fVar;
        }
        throw new RuntimeException("TitleDisplayMode is undefined");
    }
}
