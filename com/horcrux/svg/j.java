package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: GlyphPathBag */
public class j {
    private final ArrayList<Path> a;
    private final int[][] b = new int[256][];
    private final Paint c;

    public j(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.a = arrayList;
        this.c = paint;
        arrayList.add(new Path());
    }

    private int a(char c2) {
        int[] iArr = this.b[c2 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c2 & 255];
    }

    public Path b(char c2, String str) {
        Path path;
        int a2 = a(c2);
        if (a2 != 0) {
            path = this.a.get(a2);
        } else {
            Path path2 = new Path();
            this.c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.b;
            int i = c2 >> '\b';
            int[] iArr2 = iArr[i];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i] = iArr2;
            }
            iArr2[c2 & 255] = this.a.size();
            this.a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
