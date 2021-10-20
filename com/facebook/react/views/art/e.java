package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: ARTTextShadowNode */
public class e extends b {
    private ReadableMap m;
    private int n = 0;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    private void j(Paint paint) {
        ReadableMap map;
        boolean z;
        String r4;
        boolean z2;
        int i = this.n;
        int i2 = 2;
        if (i == 0) {
            paint.setTextAlign(Paint.Align.LEFT);
        } else if (i == 1) {
            paint.setTextAlign(Paint.Align.RIGHT);
        } else if (i == 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        }
        ReadableMap readableMap = this.m;
        if (readableMap != null) {
            String r3 = C0201.m82(9141);
            if (readableMap.hasKey(r3) && (map = this.m.getMap(r3)) != null) {
                float f = 12.0f;
                String r42 = C0201.m82(9142);
                if (map.hasKey(r42)) {
                    f = (float) map.getDouble(r42);
                }
                paint.setTextSize(f * this.c);
                String r32 = C0201.m82(9143);
                if (map.hasKey(r32)) {
                    if (C0201.m82(9144).equals(map.getString(r32))) {
                        z = true;
                        r4 = C0201.m82(9145);
                        if (map.hasKey(r4)) {
                            if (C0201.m82(9146).equals(map.getString(r4))) {
                                z2 = true;
                                if (!z && z2) {
                                    i2 = 3;
                                } else if (z) {
                                    i2 = 1;
                                } else if (!z2) {
                                    i2 = 0;
                                }
                                paint.setTypeface(Typeface.create(map.getString(C0201.m82(9147)), i2));
                            }
                        }
                        z2 = false;
                        if (!z) {
                        }
                        if (z) {
                        }
                        paint.setTypeface(Typeface.create(map.getString(C0201.m82(9147)), i2));
                    }
                }
                z = false;
                r4 = C0201.m82(9145);
                if (map.hasKey(r4)) {
                }
                z2 = false;
                if (!z) {
                }
                if (z) {
                }
                paint.setTypeface(Typeface.create(map.getString(C0201.m82(9147)), i2));
            }
        }
    }

    @Override // com.facebook.react.views.art.b, com.facebook.react.views.art.f
    public void b(Canvas canvas, Paint paint, float f) {
        ReadableArray array;
        ReadableMap readableMap = this.m;
        if (readableMap != null) {
            float f2 = f * this.a;
            if (f2 > 0.01f) {
                String r1 = C0201.m82(9148);
                if (!(!readableMap.hasKey(r1) || (array = this.m.getArray(r1)) == null || array.size() == 0)) {
                    d(canvas);
                    int size = array.size();
                    String[] strArr = new String[size];
                    for (int i = 0; i < size; i++) {
                        strArr[i] = array.getString(i);
                    }
                    String join = TextUtils.join(C0201.m82(9149), strArr);
                    if (i(paint, f2)) {
                        j(paint);
                        Path path = this.f;
                        if (path == null) {
                            canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                        } else {
                            canvas.drawTextOnPath(join, path, 0.0f, 0.0f, paint);
                        }
                    }
                    if (h(paint, f2)) {
                        j(paint);
                        Path path2 = this.f;
                        if (path2 == null) {
                            canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                        } else {
                            canvas.drawTextOnPath(join, path2, 0.0f, 0.0f, paint);
                        }
                    }
                    c(canvas);
                    markUpdateSeen();
                }
            }
        }
    }

    @xj0(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.n = i;
    }

    @xj0(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.m = readableMap;
    }
}
