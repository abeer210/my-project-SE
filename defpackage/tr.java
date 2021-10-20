package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: tr  reason: default package */
/* compiled from: Directory */
public abstract class tr {
    public final Map<Integer, Object> a = new HashMap();
    public final Collection<zr> b = new ArrayList();
    private final Collection<String> c = new ArrayList(4);
    public as d;

    public boolean A() {
        return this.c.isEmpty() && this.b.isEmpty();
    }

    public void B(int i, boolean z) {
        M(i, Boolean.valueOf(z));
    }

    public void C(int i, byte[] bArr) {
        N(i, bArr);
    }

    public void D(int i, Date date) {
        M(i, date);
    }

    public void E(as asVar) {
        if (asVar != null) {
            this.d = asVar;
            return;
        }
        throw new NullPointerException(C0201.m82(8289));
    }

    public void F(int i, double d2) {
        M(i, Double.valueOf(d2));
    }

    public void G(int i, double[] dArr) {
        N(i, dArr);
    }

    public void H(int i, float f) {
        M(i, Float.valueOf(f));
    }

    public void I(int i, float[] fArr) {
        N(i, fArr);
    }

    public void J(int i, int i2) {
        M(i, Integer.valueOf(i2));
    }

    public void K(int i, int[] iArr) {
        N(i, iArr);
    }

    public void L(int i, long j) {
        M(i, Long.valueOf(j));
    }

    public void M(int i, Object obj) {
        if (obj != null) {
            if (!this.a.containsKey(Integer.valueOf(i))) {
                this.b.add(new zr(i, this));
            }
            this.a.put(Integer.valueOf(i), obj);
            return;
        }
        throw new NullPointerException(C0201.m82(8290));
    }

    public void N(int i, Object obj) {
        M(i, obj);
    }

    public void O(tr trVar) {
    }

    public void P(int i, mr mrVar) {
        M(i, mrVar);
    }

    public void Q(int i, mr[] mrVarArr) {
        N(i, mrVarArr);
    }

    public void R(int i, String str) {
        if (str != null) {
            M(i, str);
            return;
        }
        throw new NullPointerException(C0201.m82(8291));
    }

    public void S(int i, String[] strArr) {
        N(i, strArr);
    }

    public void T(int i, yr yrVar) {
        if (yrVar != null) {
            M(i, yrVar);
            return;
        }
        throw new NullPointerException(C0201.m82(8292));
    }

    public void U(int i, yr[] yrVarArr) {
        N(i, yrVarArr);
    }

    public void a(String str) {
        this.c.add(str);
    }

    public boolean b(int i) {
        return this.a.containsKey(Integer.valueOf(i));
    }

    public boolean c(int i) throws xr {
        Boolean d2 = d(i);
        if (d2 != null) {
            return d2.booleanValue();
        }
        Object o = o(i);
        String r1 = C0201.m82(8293);
        if (o == null) {
            throw new xr(r1 + v(i) + C0201.m82(8294));
        }
        throw new xr(r1 + i + C0201.m82(8295) + o.getClass() + C0201.m82(8296));
    }

    public Boolean d(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof Boolean) {
            return (Boolean) o;
        }
        if ((o instanceof String) || (o instanceof yr)) {
            try {
                return Boolean.valueOf(Boolean.getBoolean(o.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (!(o instanceof Number)) {
            return null;
        } else {
            return Boolean.valueOf(((Number) o).doubleValue() != 0.0d);
        }
    }

    public byte[] e(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof yr) {
            return ((yr) o).a();
        }
        int i2 = 0;
        if (o instanceof mr[]) {
            mr[] mrVarArr = (mr[]) o;
            int length = mrVarArr.length;
            byte[] bArr = new byte[length];
            while (i2 < length) {
                bArr[i2] = mrVarArr[i2].byteValue();
                i2++;
            }
            return bArr;
        } else if (o instanceof byte[]) {
            return (byte[]) o;
        } else {
            if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                byte[] bArr2 = new byte[iArr.length];
                while (i2 < iArr.length) {
                    bArr2[i2] = (byte) iArr[i2];
                    i2++;
                }
                return bArr2;
            } else if (o instanceof short[]) {
                short[] sArr = (short[]) o;
                byte[] bArr3 = new byte[sArr.length];
                while (i2 < sArr.length) {
                    bArr3[i2] = (byte) sArr[i2];
                    i2++;
                }
                return bArr3;
            } else if (o instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) o;
                byte[] bArr4 = new byte[charSequence.length()];
                while (i2 < charSequence.length()) {
                    bArr4[i2] = (byte) charSequence.charAt(i2);
                    i2++;
                }
                return bArr4;
            } else if (!(o instanceof Integer)) {
                return null;
            } else {
                return new byte[]{((Integer) o).byteValue()};
            }
        }
    }

    public String f(int i) {
        return this.d.f(i);
    }

    public double g(int i) throws xr {
        Double h = h(i);
        if (h != null) {
            return h.doubleValue();
        }
        Object o = o(i);
        String r1 = C0201.m82(8297);
        if (o == null) {
            throw new xr(r1 + v(i) + C0201.m82(8298));
        }
        throw new xr(r1 + i + C0201.m82(8299) + o.getClass() + C0201.m82(8300));
    }

    public Double h(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if ((o instanceof String) || (o instanceof yr)) {
            try {
                return Double.valueOf(Double.parseDouble(o.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (o instanceof Number) {
            return Double.valueOf(((Number) o).doubleValue());
        } else {
            return null;
        }
    }

    public Float i(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if ((o instanceof String) || (o instanceof yr)) {
            try {
                return Float.valueOf(Float.parseFloat(o.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (o instanceof Number) {
            return Float.valueOf(((Number) o).floatValue());
        } else {
            return null;
        }
    }

    public int j(int i) throws xr {
        Integer l = l(i);
        if (l != null) {
            return l.intValue();
        }
        Object o = o(i);
        String r1 = C0201.m82(8301);
        if (o == null) {
            throw new xr(r1 + v(i) + C0201.m82(8302));
        }
        throw new xr(r1 + i + C0201.m82(8303) + o.getClass() + C0201.m82(8304));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    public int[] k(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof int[]) {
            return (int[]) o;
        }
        int i2 = 0;
        if (o instanceof mr[]) {
            mr[] mrVarArr = (mr[]) o;
            int length = mrVarArr.length;
            int[] iArr = new int[length];
            while (i2 < length) {
                iArr[i2] = mrVarArr[i2].intValue();
                i2++;
            }
            return iArr;
        } else if (o instanceof short[]) {
            short[] sArr = (short[]) o;
            int[] iArr2 = new int[sArr.length];
            while (i2 < sArr.length) {
                iArr2[i2] = sArr[i2];
                i2++;
            }
            return iArr2;
        } else if (o instanceof byte[]) {
            byte[] bArr = (byte[]) o;
            int[] iArr3 = new int[bArr.length];
            while (i2 < bArr.length) {
                iArr3[i2] = bArr[i2];
                i2++;
            }
            return iArr3;
        } else if (o instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) o;
            int[] iArr4 = new int[charSequence.length()];
            while (i2 < charSequence.length()) {
                iArr4[i2] = charSequence.charAt(i2);
                i2++;
            }
            return iArr4;
        } else if (!(o instanceof Integer)) {
            return null;
        } else {
            return new int[]{((Integer) o).intValue()};
        }
    }

    public Integer l(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof Number) {
            return Integer.valueOf(((Number) o).intValue());
        }
        if ((o instanceof String) || (o instanceof yr)) {
            try {
                return Integer.valueOf(Integer.parseInt(o.toString()));
            } catch (NumberFormatException unused) {
                long j = 0;
                for (byte b2 : o.toString().getBytes()) {
                    j = (j << 8) + ((long) (b2 & 255));
                }
                return Integer.valueOf((int) j);
            }
        } else {
            if (o instanceof mr[]) {
                mr[] mrVarArr = (mr[]) o;
                if (mrVarArr.length == 1) {
                    return Integer.valueOf(mrVarArr[0].intValue());
                }
            } else if (o instanceof byte[]) {
                byte[] bArr = (byte[]) o;
                if (bArr.length == 1) {
                    return Integer.valueOf(bArr[0]);
                }
            } else if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                if (iArr.length == 1) {
                    return Integer.valueOf(iArr[0]);
                }
            } else if (o instanceof short[]) {
                short[] sArr = (short[]) o;
                if (sArr.length == 1) {
                    return Integer.valueOf(sArr[0]);
                }
            }
            return null;
        }
    }

    public Long m(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof Number) {
            return Long.valueOf(((Number) o).longValue());
        }
        if ((o instanceof String) || (o instanceof yr)) {
            try {
                return Long.valueOf(Long.parseLong(o.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else {
            if (o instanceof mr[]) {
                mr[] mrVarArr = (mr[]) o;
                if (mrVarArr.length == 1) {
                    return Long.valueOf(mrVarArr[0].longValue());
                }
            } else if (o instanceof byte[]) {
                byte[] bArr = (byte[]) o;
                if (bArr.length == 1) {
                    return Long.valueOf((long) bArr[0]);
                }
            } else if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                if (iArr.length == 1) {
                    return Long.valueOf((long) iArr[0]);
                }
            } else if (o instanceof short[]) {
                short[] sArr = (short[]) o;
                if (sArr.length == 1) {
                    return Long.valueOf((long) sArr[0]);
                }
            }
            return null;
        }
    }

    public abstract String n();

    public Object o(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    public mr p(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof mr) {
            return (mr) o;
        }
        if (o instanceof Integer) {
            return new mr((long) ((Integer) o).intValue(), 1);
        }
        if (o instanceof Long) {
            return new mr(((Long) o).longValue(), 1);
        }
        return null;
    }

    public mr[] q(int i) {
        Object o = o(i);
        if (o != null && (o instanceof mr[])) {
            return (mr[]) o;
        }
        return null;
    }

    public String r(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof mr) {
            return ((mr) o).l(true);
        }
        boolean isArray = o.getClass().isArray();
        String r1 = C0201.m82(8305);
        if (isArray) {
            int length = Array.getLength(o);
            Class<?> componentType = o.getClass().getComponentType();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (Object.class.isAssignableFrom(componentType)) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.get(o, i2).toString());
                    i2++;
                }
            } else if (componentType.getName().equals(C0201.m82(8306))) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getInt(o, i2));
                    i2++;
                }
            } else if (componentType.getName().equals(C0201.m82(8307))) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append((int) Array.getShort(o, i2));
                    i2++;
                }
            } else if (componentType.getName().equals(C0201.m82(8308))) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getLong(o, i2));
                    i2++;
                }
            } else {
                boolean equals = componentType.getName().equals(C0201.m82(8309));
                String r7 = C0201.m82(8310);
                String r8 = C0201.m82(8311);
                if (equals) {
                    DecimalFormat decimalFormat = new DecimalFormat(r1);
                    while (i2 < length) {
                        if (i2 != 0) {
                            sb.append(' ');
                        }
                        String format = decimalFormat.format((double) Array.getFloat(o, i2));
                        if (format.equals(r8)) {
                            format = r7;
                        }
                        sb.append(format);
                        i2++;
                    }
                } else if (componentType.getName().equals(C0201.m82(8312))) {
                    DecimalFormat decimalFormat2 = new DecimalFormat(r1);
                    while (i2 < length) {
                        if (i2 != 0) {
                            sb.append(' ');
                        }
                        String format2 = decimalFormat2.format(Array.getDouble(o, i2));
                        if (format2.equals(r8)) {
                            format2 = r7;
                        }
                        sb.append(format2);
                        i2++;
                    }
                } else if (componentType.getName().equals(C0201.m82(8313))) {
                    while (i2 < length) {
                        if (i2 != 0) {
                            sb.append(' ');
                        }
                        sb.append(Array.getByte(o, i2) & 255);
                        i2++;
                    }
                } else {
                    a(C0201.m82(8314) + componentType.getName());
                }
            }
            return sb.toString();
        } else if (o instanceof Double) {
            return new DecimalFormat(r1).format(((Double) o).doubleValue());
        } else {
            if (o instanceof Float) {
                return new DecimalFormat(r1).format((double) ((Float) o).floatValue());
            }
            return o.toString();
        }
    }

    public String[] s(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof String[]) {
            return (String[]) o;
        }
        int i2 = 0;
        if (o instanceof String) {
            return new String[]{(String) o};
        } else if (o instanceof yr) {
            return new String[]{o.toString()};
        } else if (o instanceof yr[]) {
            yr[] yrVarArr = (yr[]) o;
            int length = yrVarArr.length;
            String[] strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = yrVarArr[i2].toString();
                i2++;
            }
            return strArr;
        } else if (o instanceof int[]) {
            int[] iArr = (int[]) o;
            int length2 = iArr.length;
            String[] strArr2 = new String[length2];
            while (i2 < length2) {
                strArr2[i2] = Integer.toString(iArr[i2]);
                i2++;
            }
            return strArr2;
        } else if (o instanceof byte[]) {
            byte[] bArr = (byte[]) o;
            int length3 = bArr.length;
            String[] strArr3 = new String[length3];
            while (i2 < length3) {
                strArr3[i2] = Byte.toString(bArr[i2]);
                i2++;
            }
            return strArr3;
        } else if (!(o instanceof mr[])) {
            return null;
        } else {
            mr[] mrVarArr = (mr[]) o;
            int length4 = mrVarArr.length;
            String[] strArr4 = new String[length4];
            for (int i3 = 0; i3 < length4; i3++) {
                strArr4[i3] = mrVarArr[i3].l(false);
            }
            return strArr4;
        }
    }

    public yr t(int i) {
        Object o = o(i);
        if (o instanceof yr) {
            return (yr) o;
        }
        return null;
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = n();
        objArr[1] = Integer.valueOf(this.a.size());
        objArr[2] = this.a.size() == 1 ? C0201.m82(8315) : C0201.m82(8316);
        return String.format(C0201.m82(8317), objArr);
    }

    public yr[] u(int i) {
        Object o = o(i);
        if (o == null) {
            return null;
        }
        if (o instanceof yr[]) {
            return (yr[]) o;
        }
        if (!(o instanceof yr)) {
            return null;
        }
        return new yr[]{(yr) o};
    }

    public String v(int i) {
        HashMap<Integer, String> w = w();
        if (w.containsKey(Integer.valueOf(i))) {
            return w.get(Integer.valueOf(i));
        }
        String hexString = Integer.toHexString(i);
        while (hexString.length() < 4) {
            hexString = C0201.m82(8318) + hexString;
        }
        return C0201.m82(8319) + hexString + C0201.m82(8320);
    }

    public abstract HashMap<Integer, String> w();

    public Collection<zr> x() {
        return Collections.unmodifiableCollection(this.b);
    }

    public boolean y() {
        return this.c.size() > 0;
    }

    public boolean z(int i) {
        return w().containsKey(Integer.valueOf(i));
    }
}
