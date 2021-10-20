package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: he  reason: default package */
/* compiled from: AnimatableValueParser */
public class he {
    private static <T> List<bg<T>> a(qf qfVar, float f, ea eaVar, nf<T> nfVar) throws IOException {
        return ve.a(qfVar, eaVar, f, nfVar);
    }

    private static <T> List<bg<T>> b(qf qfVar, ea eaVar, nf<T> nfVar) throws IOException {
        return ve.a(qfVar, eaVar, 1.0f, nfVar);
    }

    public static oc c(qf qfVar, ea eaVar) throws IOException {
        return new oc(b(qfVar, eaVar, je.a));
    }

    public static xc d(qf qfVar, ea eaVar) throws IOException {
        return new xc(b(qfVar, eaVar, le.a));
    }

    public static pc e(qf qfVar, ea eaVar) throws IOException {
        return f(qfVar, eaVar, true);
    }

    public static pc f(qf qfVar, ea eaVar, boolean z) throws IOException {
        return new pc(a(qfVar, z ? ag.e() : 1.0f, eaVar, me.a));
    }

    public static qc g(qf qfVar, ea eaVar, int i) throws IOException {
        return new qc(b(qfVar, eaVar, new pe(i)));
    }

    public static rc h(qf qfVar, ea eaVar) throws IOException {
        return new rc(b(qfVar, eaVar, se.a));
    }

    public static tc i(qf qfVar, ea eaVar) throws IOException {
        return new tc(a(qfVar, ag.e(), eaVar, cf.a));
    }

    public static uc j(qf qfVar, ea eaVar) throws IOException {
        return new uc(b(qfVar, eaVar, gf.a));
    }

    public static vc k(qf qfVar, ea eaVar) throws IOException {
        return new vc(a(qfVar, ag.e(), eaVar, hf.a));
    }
}
