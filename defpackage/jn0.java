package defpackage;

import java.util.Arrays;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: jn0  reason: default package */
/* compiled from: UmmalquraDateFormatSymbols */
public class jn0 {
    private static final String[] d = {C0201.m82(5526), C0201.m82(5527), C0201.m82(5528), C0201.m82(5529), C0201.m82(5530), C0201.m82(5531), C0201.m82(5532), C0201.m82(5533), C0201.m82(5534), C0201.m82(5535), C0201.m82(5536), C0201.m82(5537)};
    private static final String[] e = {C0201.m82(5538), C0201.m82(5539), C0201.m82(5540), C0201.m82(5541), C0201.m82(5542), C0201.m82(5543), C0201.m82(5544), C0201.m82(5545), C0201.m82(5546), C0201.m82(5547), C0201.m82(5548), C0201.m82(5549)};
    private static final String[] f = {C0201.m82(5550), C0201.m82(5551), C0201.m82(5552), C0201.m82(5553), C0201.m82(5554), C0201.m82(5555), C0201.m82(5556), C0201.m82(5557), C0201.m82(5558), C0201.m82(5559), C0201.m82(5560), C0201.m82(5561)};
    private static final String[] g = {C0201.m82(5562), C0201.m82(5563), C0201.m82(5564), C0201.m82(5565), C0201.m82(5566), C0201.m82(5567), C0201.m82(5568), C0201.m82(5569), C0201.m82(5570), C0201.m82(5571), C0201.m82(5572), C0201.m82(5573)};
    public Locale a;
    public String[] b = null;
    public String[] c = null;

    public jn0(Locale locale) {
        c(locale);
    }

    private void c(Locale locale) {
        String language = locale.getLanguage();
        String r1 = C0201.m82(5574);
        if (!r1.equalsIgnoreCase(language)) {
            if (!C0201.m82(5575).equalsIgnoreCase(locale.getLanguage())) {
                throw new IllegalArgumentException(C0201.m82(5576));
            }
        }
        this.a = locale;
        this.b = r1.equalsIgnoreCase(locale.getLanguage()) ? d : e;
        this.c = r1.equalsIgnoreCase(locale.getLanguage()) ? f : g;
    }

    public String[] a() {
        String[] strArr = this.b;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] b() {
        String[] strArr = this.c;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
