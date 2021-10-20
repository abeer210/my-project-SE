package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: k7  reason: default package */
/* compiled from: AnimationUtilsCompat */
public class k7 {
    private static Interpolator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Interpolator n7Var;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals(C0201.m82(23581))) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals(C0201.m82(23582))) {
                            n7Var = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals(C0201.m82(23583))) {
                            n7Var = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals(C0201.m82(23584))) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals(C0201.m82(23585))) {
                            n7Var = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals(C0201.m82(23586))) {
                            n7Var = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals(C0201.m82(23587))) {
                            n7Var = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals(C0201.m82(23588))) {
                            n7Var = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals(C0201.m82(23589))) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals(C0201.m82(23590))) {
                            n7Var = new n7(context, asAttributeSet, xmlPullParser);
                        } else {
                            throw new RuntimeException(C0201.m82(23591) + xmlPullParser.getName());
                        }
                        interpolator = n7Var;
                    }
                }
            }
        }
        return interpolator;
    }

    public static Interpolator b(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        String r2 = C0201.m82(23592);
        if (i == 17563663) {
            try {
                return new l4();
            } catch (XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(r2 + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(r2 + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            } catch (Throwable th) {
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i == 17563661) {
            return new m4();
        } else {
            if (i == 17563662) {
                return new n4();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i);
            Interpolator a = a(context, context.getResources(), context.getTheme(), animation);
            if (animation != null) {
                animation.close();
            }
            return a;
        }
    }
}
