package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: h1  reason: default package */
/* compiled from: ComplexColorCompat */
public final class h1 {
    private final Shader a;
    private final ColorStateList b;
    private int c;

    private h1(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    private static h1 a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c2 = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals(C0201.m82(15482))) {
                    c2 = 0;
                }
            } else if (name.equals(C0201.m82(15483))) {
                c2 = 1;
            }
            if (c2 == 0) {
                return c(g1.b(resources, xml, asAttributeSet, theme));
            }
            if (c2 == 1) {
                return d(j1.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + C0201.m82(15484) + name);
        }
        throw new XmlPullParserException(C0201.m82(15485));
    }

    public static h1 b(int i) {
        return new h1(null, null, i);
    }

    public static h1 c(ColorStateList colorStateList) {
        return new h1(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static h1 d(Shader shader) {
        return new h1(shader, null, 0);
    }

    public static h1 g(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e) {
            Log.e(C0201.m82(15486), C0201.m82(15487), e);
            return null;
        }
    }

    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.a;
    }

    public boolean h() {
        return this.a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i) {
        this.c = i;
    }

    public boolean l() {
        return h() || this.c != 0;
    }
}
