package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import vigqyno.C0201;

/* renamed from: jc2  reason: default package */
public class jc2 {
    private static final Pattern a = Pattern.compile(C0201.m82(25092));
    private static final String[] b;

    static {
        String[] strArr = {C0201.m82(25093), C0201.m82(25094), C0201.m82(25095), C0201.m82(25096), C0201.m82(25097), C0201.m82(25098), C0201.m82(25099), C0201.m82(25100), C0201.m82(25101), C0201.m82(25102), C0201.m82(25103), C0201.m82(25104), C0201.m82(25105), C0201.m82(25106)};
        b = strArr;
        Arrays.sort(strArr);
    }

    public static final void a(String str, X509Certificate x509Certificate, boolean z) throws SSLException {
        String[] d = d(x509Certificate);
        String[] e = e(x509Certificate);
        String r2 = C0201.m82(25108);
        pc2.b(r2, C0201.m82(25107) + Arrays.toString(d));
        pc2.b(r2, C0201.m82(25109) + Arrays.toString(e));
        g(str, d, e, z);
    }

    public static boolean b(String str) {
        int length = str.length();
        if (length < 7 || length > 9) {
            return true;
        }
        int i = length - 3;
        if (str.charAt(i) != '.') {
            return true;
        }
        if (Arrays.binarySearch(b, str.substring(2, i)) < 0) {
            return true;
        }
        return false;
    }

    public static int c(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static String[] d(X509Certificate x509Certificate) {
        List<String> b2 = new ic2(x509Certificate.getSubjectX500Principal()).b(C0201.m82(25110));
        if (b2.isEmpty()) {
            return null;
        }
        String[] strArr = new String[b2.size()];
        b2.toArray(strArr);
        return strArr;
    }

    public static String[] e(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            pc2.a(C0201.m82(25111), C0201.m82(25112), e);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    private static boolean f(String str) {
        return a.matcher(str).matches();
    }

    public static final void g(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
            Iterator it = linkedList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                stringBuffer.append(C0201.m82(25113));
                stringBuffer.append(lowerCase2);
                stringBuffer.append('>');
                if (it.hasNext()) {
                    stringBuffer.append(C0201.m82(25114));
                }
                boolean z3 = true;
                if (lowerCase2.startsWith(C0201.m82(25115)) && lowerCase2.indexOf(46, 2) != -1 && b(lowerCase2) && !f(str)) {
                    boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                    if (!endsWith || !z) {
                        z2 = endsWith;
                        continue;
                    } else {
                        if (c(lowerCase) != c(lowerCase2)) {
                            z3 = false;
                        }
                        z2 = z3;
                        continue;
                    }
                } else {
                    z2 = lowerCase.equals(lowerCase2);
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (!z2) {
                throw new SSLException(C0201.m82(25116) + str + C0201.m82(25117) + ((Object) stringBuffer));
            }
            return;
        }
        throw new SSLException(C0201.m82(25118) + str + C0201.m82(25119));
    }
}
