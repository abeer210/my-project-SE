package defpackage;

import com.facebook.imagepipeline.nativecode.c;
import vigqyno.C0201;

/* renamed from: uh0  reason: default package */
/* compiled from: MultiImageTranscoderFactory */
public class uh0 implements sh0 {
    private final int a;
    private final boolean b;
    private final sh0 c;
    private final Integer d;

    public uh0(int i, boolean z, sh0 sh0, Integer num) {
        this.a = i;
        this.b = z;
        this.c = sh0;
        this.d = num;
    }

    private rh0 a(ob0 ob0, boolean z) {
        sh0 sh0 = this.c;
        if (sh0 == null) {
            return null;
        }
        return sh0.createImageTranscoder(ob0, z);
    }

    private rh0 b(ob0 ob0, boolean z) {
        Integer num = this.d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return c(ob0, z);
        }
        if (intValue == 1) {
            return d(ob0, z);
        }
        throw new IllegalArgumentException(C0201.m82(31101));
    }

    private rh0 c(ob0 ob0, boolean z) {
        return c.a(this.a, this.b).createImageTranscoder(ob0, z);
    }

    private rh0 d(ob0 ob0, boolean z) {
        return new wh0(this.a).createImageTranscoder(ob0, z);
    }

    @Override // defpackage.sh0
    public rh0 createImageTranscoder(ob0 ob0, boolean z) {
        rh0 a2 = a(ob0, z);
        if (a2 == null) {
            a2 = b(ob0, z);
        }
        if (a2 == null) {
            a2 = c(ob0, z);
        }
        return a2 == null ? d(ob0, z) : a2;
    }
}
