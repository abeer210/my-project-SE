package com.shockwave.pdfium;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PdfDocument */
public class a {
    public long a;
    public ParcelFileDescriptor b;
    public final Map<Integer, Long> c = new r0();

    /* renamed from: com.shockwave.pdfium.a$a  reason: collision with other inner class name */
    /* compiled from: PdfDocument */
    public static class C0126a {
        private List<C0126a> a = new ArrayList();

        public List<C0126a> a() {
            return this.a;
        }
    }

    /* compiled from: PdfDocument */
    public static class b {
        private RectF a;
        private Integer b;
        private String c;

        public b(RectF rectF, Integer num, String str) {
            this.a = rectF;
            this.b = num;
            this.c = str;
        }

        public RectF a() {
            return this.a;
        }

        public Integer b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }
    }

    /* compiled from: PdfDocument */
    public static class c {
    }
}
