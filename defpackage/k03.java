package defpackage;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: k03  reason: default package */
/* compiled from: ASN1GeneralizedTime */
public class k03 extends u03 {
    private byte[] a;

    public k03(byte[] bArr) {
        this.a = bArr;
    }

    private String q() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        String r2 = C0201.m82(18185);
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = C0201.m82(18186);
        } else {
            str = r2;
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (((i * 60) * 60) * C0188.f18)) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(s())) {
                i += str.equals(r2) ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        return C0201.m82(18187) + str + r(i) + C0201.m82(18188) + r(i2);
    }

    private String r(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return C0201.m82(18189) + i;
    }

    public static k03 t(Object obj) {
        if (obj == null || (obj instanceof k03)) {
            return (k03) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (k03) u03.k((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(C0201.m82(18190) + e.toString());
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(18191) + obj.getClass().getName());
        }
    }

    private boolean v() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof k03)) {
            return false;
        }
        return hb3.a(this.a, ((k03) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return hb3.h(this.a);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.g(24, this.a);
    }

    @Override // defpackage.u03
    public int j() {
        int length = this.a.length;
        return a33.a(length) + 1 + length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public Date s() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        String b = mb3.b(this.a);
        String r1 = C0201.m82(18192);
        if (b.endsWith(r1)) {
            if (v()) {
                simpleDateFormat = new SimpleDateFormat(C0201.m82(18193));
            } else {
                simpleDateFormat = new SimpleDateFormat(C0201.m82(18194));
            }
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, r1));
        } else if (b.indexOf(45) > 0 || b.indexOf(43) > 0) {
            b = u();
            if (v()) {
                simpleDateFormat = new SimpleDateFormat(C0201.m82(18197));
            } else {
                simpleDateFormat = new SimpleDateFormat(C0201.m82(18198));
            }
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, r1));
        } else {
            if (v()) {
                simpleDateFormat2 = new SimpleDateFormat(C0201.m82(18195));
            } else {
                simpleDateFormat2 = new SimpleDateFormat(C0201.m82(18196));
            }
            simpleDateFormat = simpleDateFormat2;
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (v()) {
            String substring = b.substring(14);
            int i = 1;
            while (i < substring.length() && '0' <= (r7 = substring.charAt(i)) && r7 <= '9') {
                i++;
            }
            int i2 = i - 1;
            if (i2 > 3) {
                b = b.substring(0, 14) + (substring.substring(0, 4) + substring.substring(i));
            } else if (i2 == 1) {
                b = b.substring(0, 14) + (substring.substring(0, i) + C0201.m82(18199) + substring.substring(i));
            } else if (i2 == 2) {
                b = b.substring(0, 14) + (substring.substring(0, i) + C0201.m82(18200) + substring.substring(i));
            }
        }
        return simpleDateFormat.parse(b);
    }

    public String u() {
        String b = mb3.b(this.a);
        if (b.charAt(b.length() - 1) == 'Z') {
            return b.substring(0, b.length() - 1) + C0201.m82(18201);
        }
        int length = b.length() - 5;
        char charAt = b.charAt(length);
        String r4 = C0201.m82(18202);
        if (charAt == '-' || charAt == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(b.substring(0, length));
            sb.append(r4);
            int i = length + 3;
            sb.append(b.substring(length, i));
            sb.append(C0201.m82(18204));
            sb.append(b.substring(i));
            return sb.toString();
        }
        int length2 = b.length() - 3;
        char charAt2 = b.charAt(length2);
        if (charAt2 == '-' || charAt2 == '+') {
            return b.substring(0, length2) + r4 + b.substring(length2) + C0201.m82(18203);
        }
        return b + q();
    }
}
