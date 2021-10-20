package defpackage;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import vigqyno.C0201;

/* renamed from: dv  reason: default package */
/* compiled from: ReconyxHyperFireMakernoteDescriptor */
public class dv extends as<ev> {
    public dv(ev evVar) {
        super(evVar);
    }

    @Override // defpackage.as
    public String f(int i) {
        String r1 = C0201.m82(10981);
        switch (i) {
            case 0:
                return String.format(r1, ((ev) this.a).l(i));
            case 2:
                return ((ev) this.a).r(i);
            case 12:
                return ((ev) this.a).r(i);
            case 14:
                int[] k = ((ev) this.a).k(i);
                if (k == null) {
                    return null;
                }
                return String.format(C0201.m82(10994), Integer.valueOf(k[0]), Integer.valueOf(k[1]));
            case 18:
                return String.format(r1, ((ev) this.a).l(i));
            case 22:
                String r = ((ev) this.a).r(i);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0201.m82(10993));
                    return simpleDateFormat.format(simpleDateFormat.parse(r));
                } catch (ParseException unused) {
                    return null;
                }
            case 36:
                return m(i, C0201.m82(10985), C0201.m82(10986), C0201.m82(10987), C0201.m82(10988), C0201.m82(10989), C0201.m82(10990), C0201.m82(10991), C0201.m82(10992));
            case 38:
            case 40:
                return String.format(r1, ((ev) this.a).l(i));
            case 42:
                yr t = ((ev) this.a).t(i);
                if (t == null) {
                    return null;
                }
                return t.toString();
            case 72:
            case 74:
            case 76:
            case 78:
                return String.format(r1, ((ev) this.a).l(i));
            case 80:
                return m(i, C0201.m82(10983), C0201.m82(10984));
            case 82:
                return String.format(r1, ((ev) this.a).l(i));
            case 84:
                Double h = ((ev) this.a).h(i);
                DecimalFormat decimalFormat = new DecimalFormat(C0201.m82(10982));
                if (h == null) {
                    return null;
                }
                return decimalFormat.format(h);
            case 86:
                return ((ev) this.a).r(i);
            default:
                return super.f(i);
        }
    }
}
