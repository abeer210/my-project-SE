package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* compiled from: FontMetricsUtil */
public class e {
    public static WritableArray a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        Rect rect = new Rect();
        textPaint2.getTextBounds(C0201.m82(165), 0, 1, rect);
        double height = (double) ((((float) rect.height()) / 100.0f) / displayMetrics.density);
        Rect rect2 = new Rect();
        String r3 = C0201.m82(166);
        textPaint2.getTextBounds(r3, 0, 1, rect2);
        double height2 = (double) ((((float) rect2.height()) / 100.0f) / displayMetrics.density);
        for (int i = 0; i < layout.getLineCount(); i++) {
            Rect rect3 = new Rect();
            layout.getLineBounds(i, rect3);
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(r3, (double) (layout.getLineLeft(i) / displayMetrics.density));
            createMap.putDouble(C0201.m82(167), (double) (((float) rect3.top) / displayMetrics.density));
            createMap.putDouble(C0201.m82(168), (double) (layout.getLineWidth(i) / displayMetrics.density));
            createMap.putDouble(C0201.m82(169), (double) (((float) rect3.height()) / displayMetrics.density));
            createMap.putDouble(C0201.m82(170), (double) (((float) layout.getLineDescent(i)) / displayMetrics.density));
            createMap.putDouble(C0201.m82(171), (double) (((float) (-layout.getLineAscent(i))) / displayMetrics.density));
            createMap.putDouble(C0201.m82(172), (double) (((float) layout.getLineBaseline(i)) / displayMetrics.density));
            createMap.putDouble(C0201.m82(173), height);
            createMap.putDouble(C0201.m82(174), height2);
            createMap.putString(C0201.m82(175), charSequence.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}
