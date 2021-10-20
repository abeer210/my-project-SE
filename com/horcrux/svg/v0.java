package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import vigqyno.C0201;

/* compiled from: ViewBox */
public class v0 {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0113  */
    public static Matrix a(RectF rectF, RectF rectF2, String str, int i) {
        double d;
        double d2;
        double d3;
        double d4 = (double) rectF.left;
        double d5 = (double) rectF.top;
        double width = (double) rectF.width();
        double height = (double) rectF.height();
        double d6 = (double) rectF2.left;
        double d7 = (double) rectF2.top;
        double width2 = (double) rectF2.width();
        double height2 = (double) rectF2.height();
        Double.isNaN(width2);
        Double.isNaN(width);
        double d8 = width2 / width;
        Double.isNaN(height2);
        Double.isNaN(height);
        double d9 = height2 / height;
        Double.isNaN(d4);
        Double.isNaN(d6);
        double d10 = d6 - (d4 * d8);
        Double.isNaN(d5);
        Double.isNaN(d7);
        double d11 = d7 - (d5 * d9);
        if (i == 2) {
            d = Math.min(d8, d9);
            if (d > 1.0d) {
                Double.isNaN(width2);
                Double.isNaN(width);
                d2 = 2.0d;
                d10 -= ((width2 / d) - width) / 2.0d;
                Double.isNaN(height2);
                Double.isNaN(height);
                d3 = (height2 / d) - height;
            } else {
                d2 = 2.0d;
                Double.isNaN(width);
                Double.isNaN(width2);
                d10 -= (width2 - (width * d)) / 2.0d;
                Double.isNaN(height);
                Double.isNaN(height2);
                d3 = height2 - (height * d);
            }
            d11 -= d3 / d2;
            d9 = d;
        } else {
            String r3 = C0201.m82(9837);
            if (str.equals(r3) || i != 0) {
                if (!str.equals(r3) && i == 1) {
                    d8 = Math.max(d8, d9);
                }
                if (str.contains(C0201.m82(9838))) {
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    d10 += (width2 - (width * d8)) / 2.0d;
                }
                if (str.contains(C0201.m82(9839))) {
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    d10 += width2 - (width * d8);
                }
                if (str.contains(C0201.m82(9840))) {
                    Double.isNaN(height);
                    Double.isNaN(height2);
                    d11 += (height2 - (height * d9)) / 2.0d;
                }
                if (str.contains(C0201.m82(9841))) {
                    Double.isNaN(height);
                    Double.isNaN(height2);
                    d11 += height2 - (height * d9);
                }
                d = d8;
            } else {
                d8 = Math.min(d8, d9);
            }
            d9 = d8;
            if (str.contains(C0201.m82(9838))) {
            }
            if (str.contains(C0201.m82(9839))) {
            }
            if (str.contains(C0201.m82(9840))) {
            }
            if (str.contains(C0201.m82(9841))) {
            }
            d = d8;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d10, (float) d11);
        matrix.preScale((float) d, (float) d9);
        return matrix;
    }
}
