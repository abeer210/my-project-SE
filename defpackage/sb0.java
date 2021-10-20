package defpackage;

/* renamed from: sb0  reason: default package */
/* compiled from: AnimatedDrawableFrameInfo */
public class sb0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final a e;
    public final b f;

    /* renamed from: sb0$a */
    /* compiled from: AnimatedDrawableFrameInfo */
    public enum a {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    /* renamed from: sb0$b */
    /* compiled from: AnimatedDrawableFrameInfo */
    public enum b {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public sb0(int i, int i2, int i3, int i4, int i5, a aVar, b bVar) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = aVar;
        this.f = bVar;
    }
}
