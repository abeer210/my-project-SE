package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import vigqyno.C0201;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public int a = -1;
    public Object b;
    public byte[] c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    public PorterDuff.Mode h = j;
    public String i = null;

    private static int b(Icon icon) {
        String r0 = C0201.m82(31160);
        String r1 = C0201.m82(31161);
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod(C0201.m82(31162), new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e(r1, r0, e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e(r1, r0, e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e(r1, r0, e4);
            return 0;
        }
    }

    private static String d(Icon icon) {
        String r0 = C0201.m82(31163);
        String r1 = C0201.m82(31164);
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod(C0201.m82(31165), new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e(r1, r0, e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e(r1, r0, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e(r1, r0, e4);
            return null;
        }
    }

    private static String g(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? C0201.m82(31166) : C0201.m82(31167) : C0201.m82(31168) : C0201.m82(31169) : C0201.m82(31170) : C0201.m82(31171);
    }

    public int a() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.b);
        }
        if (this.a == 2) {
            return this.e;
        }
        throw new IllegalStateException(C0201.m82(31172) + this);
    }

    public String c() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.b);
        }
        if (this.a == 2) {
            return ((String) this.b).split(C0201.m82(31173), -1)[0];
        }
        throw new IllegalStateException(C0201.m82(31174) + this);
    }

    public void e() {
        this.h = PorterDuff.Mode.valueOf(this.i);
        int i2 = this.a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.b = this.c;
                        return;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    }
                }
                this.b = new String(this.c, Charset.forName(C0201.m82(31175)));
                return;
            }
            Parcelable parcelable = this.d;
            if (parcelable != null) {
                this.b = parcelable;
                return;
            }
            byte[] bArr = this.c;
            this.b = bArr;
            this.a = 3;
            this.e = 0;
            this.f = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.d;
        if (parcelable2 != null) {
            this.b = parcelable2;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(31176));
    }

    public void f(boolean z) {
        this.i = this.h.name();
        int i2 = this.a;
        if (i2 != -1) {
            if (i2 != 1) {
                String r2 = C0201.m82(31177);
                if (i2 == 2) {
                    this.c = ((String) this.b).getBytes(Charset.forName(r2));
                    return;
                } else if (i2 == 3) {
                    this.c = (byte[]) this.b;
                    return;
                } else if (i2 == 4) {
                    this.c = this.b.toString().getBytes(Charset.forName(r2));
                    return;
                } else if (i2 != 5) {
                    return;
                }
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) this.b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.c = byteArrayOutputStream.toByteArray();
                return;
            }
            this.d = (Parcelable) this.b;
        } else if (!z) {
            this.d = (Parcelable) this.b;
        } else {
            throw new IllegalArgumentException(C0201.m82(31178));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r1 != 5) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e2  */
    public String toString() {
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder(C0201.m82(31179));
        sb.append(g(this.a));
        int i2 = this.a;
        if (i2 != 1) {
            if (i2 == 2) {
                sb.append(C0201.m82(31183));
                sb.append(c());
                sb.append(C0201.m82(31184));
                sb.append(String.format(C0201.m82(31185), Integer.valueOf(a())));
            } else if (i2 == 3) {
                sb.append(C0201.m82(31181));
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(C0201.m82(31182));
                    sb.append(this.f);
                }
            } else if (i2 == 4) {
                sb.append(C0201.m82(31180));
                sb.append(this.b);
            }
            if (this.g != null) {
                sb.append(C0201.m82(31188));
                sb.append(this.g);
            }
            if (this.h != j) {
                sb.append(C0201.m82(31189));
                sb.append(this.h);
            }
            sb.append(C0201.m82(31190));
            return sb.toString();
        }
        sb.append(C0201.m82(31186));
        sb.append(((Bitmap) this.b).getWidth());
        sb.append(C0201.m82(31187));
        sb.append(((Bitmap) this.b).getHeight());
        if (this.g != null) {
        }
        if (this.h != j) {
        }
        sb.append(C0201.m82(31190));
        return sb.toString();
    }
}
