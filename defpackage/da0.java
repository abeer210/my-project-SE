package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import defpackage.w90;
import vigqyno.C0201;

/* renamed from: da0  reason: default package */
/* compiled from: GenericDraweeHierarchyInflater */
public class da0 {
    private static Drawable a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    private static fa0 b(ca0 ca0) {
        if (ca0.s() == null) {
            ca0.J(new fa0());
        }
        return ca0.s();
    }

    private static w90.c c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return w90.c.a;
            case 1:
                return w90.c.b;
            case 2:
                return w90.c.c;
            case 3:
                return w90.c.d;
            case 4:
                return w90.c.e;
            case 5:
                return w90.c.f;
            case 6:
                return w90.c.g;
            case 7:
                return w90.c.h;
            case 8:
                return w90.c.i;
            default:
                throw new RuntimeException(C0201.m82(24066));
        }
    }

    public static ca0 d(Context context, AttributeSet attributeSet) {
        if (oh0.d()) {
            oh0.a(C0201.m82(24067));
        }
        ca0 ca0 = new ca0(context.getResources());
        e(ca0, context, attributeSet);
        if (oh0.d()) {
            oh0.b();
        }
        return ca0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01cb, code lost:
        if (r14 != false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01e5, code lost:
        if (r5 != false) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0203  */
    public static ca0 e(ca0 ca0, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        Throwable th;
        boolean z5;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, z70.GenericDraweeHierarchy);
            try {
                int indexCount = obtainStyledAttributes.getIndexCount();
                boolean z6 = true;
                int i3 = 0;
                int i4 = 0;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                int i5 = 0;
                while (i4 < indexCount) {
                    try {
                        int index = obtainStyledAttributes.getIndex(i4);
                        if (index == z70.GenericDraweeHierarchy_actualImageScaleType) {
                            ca0.v(c(obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_placeholderImage) {
                            ca0.C(a(context2, obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_pressedStateOverlayImage) {
                            ca0.E(a(context2, obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_progressBarImage) {
                            ca0.F(a(context2, obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_fadeDuration) {
                            ca0.y(obtainStyledAttributes.getInt(index, 0));
                        } else if (index == z70.GenericDraweeHierarchy_viewAspectRatio) {
                            ca0.x(obtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == z70.GenericDraweeHierarchy_placeholderImageScaleType) {
                            ca0.D(c(obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_retryImage) {
                            ca0.H(a(context2, obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_retryImageScaleType) {
                            ca0.I(c(obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_failureImage) {
                            ca0.z(a(context2, obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_failureImageScaleType) {
                            ca0.A(c(obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_progressBarImageScaleType) {
                            ca0.G(c(obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                            i3 = obtainStyledAttributes.getInteger(index, i3);
                        } else if (index == z70.GenericDraweeHierarchy_backgroundImage) {
                            ca0.w(a(context2, obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_overlayImage) {
                            ca0.B(a(context2, obtainStyledAttributes, index));
                        } else if (index == z70.GenericDraweeHierarchy_roundAsCircle) {
                            b(ca0).s(obtainStyledAttributes.getBoolean(index, false));
                        } else if (index == z70.GenericDraweeHierarchy_roundedCornerRadius) {
                            i5 = obtainStyledAttributes.getDimensionPixelSize(index, i5);
                        } else {
                            if (index == z70.GenericDraweeHierarchy_roundTopLeft) {
                                z7 = obtainStyledAttributes.getBoolean(index, z7);
                            } else if (index == z70.GenericDraweeHierarchy_roundTopRight) {
                                z9 = obtainStyledAttributes.getBoolean(index, z9);
                            } else if (index == z70.GenericDraweeHierarchy_roundBottomLeft) {
                                z13 = obtainStyledAttributes.getBoolean(index, z13);
                            } else if (index == z70.GenericDraweeHierarchy_roundBottomRight) {
                                z11 = obtainStyledAttributes.getBoolean(index, z11);
                            } else if (index == z70.GenericDraweeHierarchy_roundTopStart) {
                                z8 = obtainStyledAttributes.getBoolean(index, z8);
                            } else if (index == z70.GenericDraweeHierarchy_roundTopEnd) {
                                z10 = obtainStyledAttributes.getBoolean(index, z10);
                            } else if (index == z70.GenericDraweeHierarchy_roundBottomStart) {
                                z6 = obtainStyledAttributes.getBoolean(index, z6);
                            } else if (index == z70.GenericDraweeHierarchy_roundBottomEnd) {
                                z12 = obtainStyledAttributes.getBoolean(index, z12);
                            } else if (index == z70.GenericDraweeHierarchy_roundWithOverlayColor) {
                                i5 = i5;
                                b(ca0).q(obtainStyledAttributes.getColor(index, 0));
                            } else {
                                i5 = i5;
                                if (index == z70.GenericDraweeHierarchy_roundingBorderWidth) {
                                    b(ca0).n((float) obtainStyledAttributes.getDimensionPixelSize(index, 0));
                                } else if (index == z70.GenericDraweeHierarchy_roundingBorderColor) {
                                    b(ca0).m(obtainStyledAttributes.getColor(index, 0));
                                } else if (index == z70.GenericDraweeHierarchy_roundingBorderPadding) {
                                    b(ca0).r((float) obtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    i4++;
                                    context2 = context;
                                }
                            }
                            i5 = i5;
                        }
                        i4++;
                        context2 = context;
                    } catch (Throwable th2) {
                        th = th2;
                        obtainStyledAttributes.recycle();
                        if (Build.VERSION.SDK_INT >= 17) {
                        }
                        throw th;
                    }
                }
                boolean z14 = false;
                obtainStyledAttributes.recycle();
                if (Build.VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
                    z5 = z7 && z8;
                    z4 = z9 && z10;
                    z3 = z11 && z12;
                    if (z13) {
                    }
                    z2 = z5;
                    i2 = i5;
                    z = z14;
                    i = i3;
                } else {
                    z5 = z7 && z10;
                    z4 = z9 && z8;
                    z3 = z11 && z6;
                    if (z13) {
                    }
                    z2 = z5;
                    i2 = i5;
                    z = z14;
                    i = i3;
                }
                z14 = true;
                z2 = z5;
                i2 = i5;
                z = z14;
                i = i3;
            } catch (Throwable th3) {
                th = th3;
                obtainStyledAttributes.recycle();
                if (Build.VERSION.SDK_INT >= 17) {
                    context.getResources().getConfiguration().getLayoutDirection();
                }
                throw th;
            }
        } else {
            z4 = true;
            i = 0;
            i2 = 0;
            z3 = true;
            z2 = true;
            z = true;
        }
        if (ca0.n() != null && i > 0) {
            ca0.F(new g90(ca0.n(), i));
        }
        if (i2 > 0) {
            b(ca0).o(z2 ? (float) i2 : 0.0f, z4 ? (float) i2 : 0.0f, z3 ? (float) i2 : 0.0f, z ? (float) i2 : 0.0f);
        }
        return ca0;
    }
}
