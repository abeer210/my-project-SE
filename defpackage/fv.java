package defpackage;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import vigqyno.C0201;

/* renamed from: fv  reason: default package */
/* compiled from: ReconyxUltraFireMakernoteDescriptor */
public class fv extends as<gv> {
    public fv(gv gvVar) {
        super(gvVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        String r0 = C0201.m82(15974);
        String r2 = C0201.m82(15975);
        switch (i) {
            case 0:
                return ((gv) this.a).r(i);
            case 10:
                return String.format(r0, ((gv) this.a).l(i));
            case 14:
                return String.format(r2, ((gv) this.a).l(i));
            case 18:
                return String.format(r0, ((gv) this.a).l(i));
            case 22:
                return String.format(r2, ((gv) this.a).l(i));
            case 24:
            case 31:
            case 38:
            case 45:
            case 52:
                return ((gv) this.a).r(i);
            case 53:
                int[] k = ((gv) this.a).k(i);
                if (k == null) {
                    return null;
                }
                return String.format(C0201.m82(15988), Integer.valueOf(k[0]), Integer.valueOf(k[1]));
            case 55:
                return String.format(r2, ((gv) this.a).l(i));
            case 59:
                String r = ((gv) this.a).r(i);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0201.m82(15987));
                    return simpleDateFormat.format(simpleDateFormat.parse(r));
                } catch (ParseException unused) {
                    return null;
                }
            case 67:
                return m(i, C0201.m82(15979), C0201.m82(15980), C0201.m82(15981), C0201.m82(15982), C0201.m82(15983), C0201.m82(15984), C0201.m82(15985), C0201.m82(15986));
            case 68:
            case 70:
                return String.format(r2, ((gv) this.a).l(i));
            case 72:
                return m(i, C0201.m82(15977), C0201.m82(15978));
            case 73:
                Double h = ((gv) this.a).h(i);
                DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(15976));
                if (h == null) {
                    return null;
                }
                return decimalFormat.format(h);
            case 75:
                yr t = ((gv) this.a).t(i);
                if (t == null) {
                    return null;
                }
                return t.toString();
            case 80:
                return ((gv) this.a).r(i);
            default:
                return super.f(i);
        }
    }
}
