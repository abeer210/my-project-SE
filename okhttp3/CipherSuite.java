package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public final class CipherSuite {
    private static final Map<String, CipherSuite> INSTANCES = new LinkedHashMap();
    public static final Comparator<String> ORDER_BY_NAME = new Comparator<String>() {
        /* class okhttp3.CipherSuite.AnonymousClass1 */

        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    if (charAt < charAt2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    };
    public static final CipherSuite TLS_AES_128_CCM_SHA256 = init(C0201.m82(25394), 4868);
    public static final CipherSuite TLS_AES_128_GCM_SHA256 = init(C0201.m82(25391), 4865);
    public static final CipherSuite TLS_AES_256_CCM_8_SHA256 = init(C0201.m82(25395), 4869);
    public static final CipherSuite TLS_AES_256_GCM_SHA384 = init(C0201.m82(25392), 4866);
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256 = init(C0201.m82(25393), 4867);
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = init(C0201.m82(25285), 17);
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25287), 19);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = init(C0201.m82(25307), 50);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = init(C0201.m82(25317), 64);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = init(C0201.m82(25338), 162);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = init(C0201.m82(25311), 56);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = init(C0201.m82(25322), 106);
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = init(C0201.m82(25339), 163);
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = init(C0201.m82(25319), 68);
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = init(C0201.m82(25327), 135);
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA = init(C0201.m82(25286), 18);
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = init(C0201.m82(25288), 20);
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25290), 22);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = init(C0201.m82(25308), 51);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = init(C0201.m82(25321), 103);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = init(C0201.m82(25336), 158);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = init(C0201.m82(25312), 57);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = init(C0201.m82(25323), 107);
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = init(C0201.m82(25337), 159);
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = init(C0201.m82(25320), 69);
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = init(C0201.m82(25328), 136);
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = init(C0201.m82(25389), 52394);
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA = init(C0201.m82(25289), 21);
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = init(C0201.m82(25293), 25);
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = init(C0201.m82(25291), 23);
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25295), 27);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA = init(C0201.m82(25309), 52);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256 = init(C0201.m82(25324), 108);
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256 = init(C0201.m82(25340), 166);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA = init(C0201.m82(25313), 58);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256 = init(C0201.m82(25325), 109);
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384 = init(C0201.m82(25341), 167);
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA = init(C0201.m82(25294), 26);
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5 = init(C0201.m82(25292), 24);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25351), 49160);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = init(C0201.m82(25352), 49161);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = init(C0201.m82(25369), 49187);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = init(C0201.m82(25377), 49195);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = init(C0201.m82(25353), 49162);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = init(C0201.m82(25370), 49188);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = init(C0201.m82(25378), 49196);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = init(C0201.m82(25388), 52393);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA = init(C0201.m82(25349), 49158);
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = init(C0201.m82(25350), 49159);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = init(C0201.m82(25385), 49205);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = init(C0201.m82(25386), 49206);
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = init(C0201.m82(25390), 52396);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25361), 49170);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = init(C0201.m82(25362), 49171);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = init(C0201.m82(25373), 49191);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = init(C0201.m82(25381), 49199);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = init(C0201.m82(25363), 49172);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = init(C0201.m82(25374), 49192);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = init(C0201.m82(25382), 49200);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = init(C0201.m82(25387), 52392);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA = init(C0201.m82(25359), 49168);
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA = init(C0201.m82(25360), 49169);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25346), 49155);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = init(C0201.m82(25347), 49156);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = init(C0201.m82(25371), 49189);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = init(C0201.m82(25379), 49197);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = init(C0201.m82(25348), 49157);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = init(C0201.m82(25372), 49190);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = init(C0201.m82(25380), 49198);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA = init(C0201.m82(25344), 49153);
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA = init(C0201.m82(25345), 49154);
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25356), 49165);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = init(C0201.m82(25357), 49166);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = init(C0201.m82(25375), 49193);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = init(C0201.m82(25383), 49201);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = init(C0201.m82(25358), 49167);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = init(C0201.m82(25376), 49194);
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = init(C0201.m82(25384), 49202);
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA = init(C0201.m82(25354), 49163);
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA = init(C0201.m82(25355), 49164);
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25366), 49175);
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA = init(C0201.m82(25367), 49176);
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA = init(C0201.m82(25368), 49177);
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA = init(C0201.m82(25364), 49173);
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA = init(C0201.m82(25365), 49174);
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV = init(C0201.m82(25342), 255);
    public static final CipherSuite TLS_FALLBACK_SCSV = init(C0201.m82(25343), 22016);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = init(C0201.m82(25304), 41);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = init(C0201.m82(25302), 38);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = init(C0201.m82(25305), 43);
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA = init(C0201.m82(25303), 40);
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = init(C0201.m82(25300), 35);
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25297), 31);
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5 = init(C0201.m82(25299), 34);
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA = init(C0201.m82(25296), 30);
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5 = init(C0201.m82(25301), 36);
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA = init(C0201.m82(25298), 32);
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25330), 139);
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA = init(C0201.m82(25331), 140);
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA = init(C0201.m82(25332), 141);
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA = init(C0201.m82(25329), 138);
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = init(C0201.m82(25282), 8);
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5 = init(C0201.m82(25279), 3);
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA = init(C0201.m82(25284), 10);
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = init(C0201.m82(25306), 47);
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256 = init(C0201.m82(25315), 60);
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256 = init(C0201.m82(25334), 156);
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = init(C0201.m82(25310), 53);
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256 = init(C0201.m82(25316), 61);
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384 = init(C0201.m82(25335), 157);
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = init(C0201.m82(25318), 65);
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = init(C0201.m82(25326), 132);
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA = init(C0201.m82(25283), 9);
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5 = init(C0201.m82(25277), 1);
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA = init(C0201.m82(25278), 2);
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256 = init(C0201.m82(25314), 59);
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5 = init(C0201.m82(25280), 4);
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA = init(C0201.m82(25281), 5);
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA = init(C0201.m82(25333), 150);
    public final String javaName;

    private CipherSuite(String str) {
        if (str != null) {
            this.javaName = str;
            return;
        }
        throw null;
    }

    public static synchronized CipherSuite forJavaName(String str) {
        CipherSuite cipherSuite;
        synchronized (CipherSuite.class) {
            cipherSuite = INSTANCES.get(str);
            if (cipherSuite == null) {
                cipherSuite = INSTANCES.get(secondaryName(str));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(str);
                }
                INSTANCES.put(str, cipherSuite);
            }
        }
        return cipherSuite;
    }

    public static List<CipherSuite> forJavaNames(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(forJavaName(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static CipherSuite init(String str, int i) {
        CipherSuite cipherSuite = new CipherSuite(str);
        INSTANCES.put(str, cipherSuite);
        return cipherSuite;
    }

    private static String secondaryName(String str) {
        String r0 = C0201.m82(25396);
        boolean startsWith = str.startsWith(r0);
        String r3 = C0201.m82(25397);
        if (startsWith) {
            return r3 + str.substring(4);
        } else if (!str.startsWith(r3)) {
            return str;
        } else {
            return r0 + str.substring(4);
        }
    }

    public String javaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }
}
