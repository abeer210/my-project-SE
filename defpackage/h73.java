package defpackage;

import java.io.IOException;
import java.security.AlgorithmParameters;
import vigqyno.C0201;

/* renamed from: h73  reason: default package */
/* compiled from: AlgorithmParametersUtils */
public class h73 {
    public static void a(AlgorithmParameters algorithmParameters, g03 g03) throws IOException {
        try {
            algorithmParameters.init(g03.b().e(), C0201.m82(10810));
        } catch (Exception unused) {
            algorithmParameters.init(g03.b().e());
        }
    }
}
