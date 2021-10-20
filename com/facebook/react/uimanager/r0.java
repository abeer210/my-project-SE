package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.events.i;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: UIManagerModuleConstants */
public class r0 {
    public static Map a() {
        e.b a = e.a();
        String r1 = C0201.m82(17235);
        String r2 = C0201.m82(17236);
        String r3 = C0201.m82(17237);
        Map e = e.e(r1, r2, r3, C0201.m82(17238));
        String r4 = C0201.m82(17239);
        a.b(C0201.m82(17240), e.d(r4, e));
        a.b(C0201.m82(17243), e.d(r4, e.e(r1, C0201.m82(17241), r3, C0201.m82(17242))));
        a.b(i.b(i.START), e.d(r4, e.e(r1, C0201.m82(17244), r3, C0201.m82(17245))));
        a.b(i.b(i.MOVE), e.d(r4, e.e(r1, C0201.m82(17246), r3, C0201.m82(17247))));
        a.b(i.b(i.END), e.d(r4, e.e(r1, C0201.m82(17248), r3, C0201.m82(17249))));
        a.b(i.b(i.CANCEL), e.d(r4, e.e(r1, C0201.m82(17250), r3, C0201.m82(17251))));
        return a.a();
    }

    public static Map<String, Object> b() {
        HashMap b = e.b();
        b.put(C0201.m82(17256), e.d(C0201.m82(17255), e.f(C0201.m82(17252), Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), C0201.m82(17253), Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), C0201.m82(17254), Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        b.put(C0201.m82(17262), e.d(C0201.m82(17261), e.g(C0201.m82(17257), Integer.valueOf(r.NONE.ordinal()), C0201.m82(17258), Integer.valueOf(r.BOX_NONE.ordinal()), C0201.m82(17259), Integer.valueOf(r.BOX_ONLY.ordinal()), C0201.m82(17260), Integer.valueOf(r.AUTO.ordinal()))));
        String r1 = C0201.m82(17263);
        String r2 = C0201.m82(17264);
        b.put(C0201.m82(17265), e.e(r1, r1, r2, r2));
        b.put(C0201.m82(17269), e.f(C0201.m82(17266), 32, C0201.m82(17267), 8, C0201.m82(17268), 1));
        return b;
    }

    public static Map c() {
        e.b a = e.a();
        String r1 = C0201.m82(17270);
        a.b(C0201.m82(17272), e.d(r1, C0201.m82(17271)));
        a.b(C0201.m82(17274), e.d(r1, C0201.m82(17273)));
        a.b(C0201.m82(17276), e.d(r1, C0201.m82(17275)));
        a.b(C0201.m82(17278), e.d(r1, C0201.m82(17277)));
        a.b(C0201.m82(17280), e.d(r1, C0201.m82(17279)));
        a.b(C0201.m82(17282), e.d(r1, C0201.m82(17281)));
        a.b(C0201.m82(17284), e.d(r1, C0201.m82(17283)));
        a.b(C0201.m82(17286), e.d(r1, C0201.m82(17285)));
        a.b(C0201.m82(17288), e.d(r1, C0201.m82(17287)));
        a.b(C0201.m82(17290), e.d(r1, C0201.m82(17289)));
        a.b(C0201.m82(17292), e.d(r1, C0201.m82(17291)));
        a.b(C0201.m82(17294), e.d(r1, C0201.m82(17293)));
        a.b(C0201.m82(17296), e.d(r1, C0201.m82(17295)));
        return a.a();
    }
}
