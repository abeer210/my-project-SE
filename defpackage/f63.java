package defpackage;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: f63  reason: default package */
/* compiled from: CMSUtils */
public class f63 {
    private static final Set a = new HashSet();
    private static final Set b = new HashSet();

    static {
        a.add(x43.t);
        a.add(f43.k);
        a.add(f43.l);
        a.add(f43.m);
        a.add(f43.n);
        b.add(x43.s);
        b.add(x43.r);
        b.add(f43.g);
        b.add(f43.c);
        b.add(f43.h);
        b.add(f43.d);
        b.add(f43.i);
        b.add(f43.e);
        b.add(f43.j);
        b.add(f43.f);
    }

    public static void a(AlgorithmParameters algorithmParameters, g03 g03) throws h53 {
        try {
            h73.a(algorithmParameters, g03);
        } catch (IOException e) {
            throw new h53(C0201.m82(28336), e);
        }
    }
}
