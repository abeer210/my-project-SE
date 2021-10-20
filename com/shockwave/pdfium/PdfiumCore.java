package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import com.shockwave.pdfium.a;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class PdfiumCore {
    private static final String b = null;
    private static final Class c = FileDescriptor.class;
    private static final Object d = new Object();
    private static Field e = null;
    public static final String f = null;
    public static final String g = null;
    private int a;

    static {
        C0201.m83(PdfiumCore.class, 103);
        try {
            System.loadLibrary(C0201.m82(33741));
            System.loadLibrary(C0201.m82(33742));
            System.loadLibrary(C0201.m82(33743));
            System.loadLibrary(C0201.m82(33744));
            System.loadLibrary(C0201.m82(33745));
        } catch (UnsatisfiedLinkError e2) {
            String str = b;
            Log.e(str, C0201.m82(33746) + e2);
        }
    }

    public PdfiumCore(Context context) {
        this.a = context.getResources().getDisplayMetrics().densityDpi;
        Log.d(b, C0201.m82(33747));
    }

    public static int c(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            if (e == null) {
                Field declaredField = c.getDeclaredField(C0201.m82(33748));
                e = declaredField;
                declaredField.setAccessible(true);
            }
            return e.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return -1;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    private void l(List<a.C0126a> list, a aVar, long j) {
        a.C0126a aVar2 = new a.C0126a();
        nativeGetBookmarkTitle(j);
        nativeGetBookmarkDestIndex(aVar.a, j);
        list.add(aVar2);
        Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(aVar.a, Long.valueOf(j));
        if (nativeGetFirstChildBookmark != null) {
            l(aVar2.a(), aVar, nativeGetFirstChildBookmark.longValue());
        }
        Long nativeGetSiblingBookmark = nativeGetSiblingBookmark(aVar.a, j);
        if (nativeGetSiblingBookmark != null) {
            l(list, aVar, nativeGetSiblingBookmark.longValue());
        }
    }

    private native void nativeCloseDocument(long j);

    private native void nativeClosePage(long j);

    private native void nativeClosePages(long[] jArr);

    private native long nativeGetBookmarkDestIndex(long j, long j2);

    private native String nativeGetBookmarkTitle(long j);

    private native Integer nativeGetDestPageIndex(long j, long j2);

    private native String nativeGetDocumentMetaText(long j, String str);

    private native Long nativeGetFirstChildBookmark(long j, Long l);

    private native RectF nativeGetLinkRect(long j);

    private native String nativeGetLinkURI(long j, long j2);

    private native int nativeGetPageCount(long j);

    private native int nativeGetPageHeightPixel(long j, int i);

    private native int nativeGetPageHeightPoint(long j);

    private native long[] nativeGetPageLinks(long j);

    private native Size nativeGetPageSizeByIndex(long j, int i, int i2);

    private native int nativeGetPageWidthPixel(long j, int i);

    private native int nativeGetPageWidthPoint(long j);

    private native Long nativeGetSiblingBookmark(long j, long j2);

    private native long nativeLoadPage(long j, int i);

    private native long[] nativeLoadPages(long j, int i, int i2);

    private native long nativeOpenDocument(int i, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native Point nativePageCoordsToDevice(long j, int i, int i2, int i3, int i4, int i5, double d2, double d3);

    private native void nativeRenderPage(long j, Surface surface, int i, int i2, int i3, int i4, int i5, boolean z);

    private native void nativeRenderPageBitmap(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z);

    public void a(a aVar) {
        synchronized (d) {
            for (Integer num : aVar.c.keySet()) {
                nativeClosePage(aVar.c.get(num).longValue());
            }
            aVar.c.clear();
            nativeCloseDocument(aVar.a);
            if (aVar.b != null) {
                try {
                    aVar.b.close();
                } catch (IOException unused) {
                }
                aVar.b = null;
            }
        }
    }

    public a.c b(a aVar) {
        a.c cVar;
        synchronized (d) {
            cVar = new a.c();
            nativeGetDocumentMetaText(aVar.a, C0201.m82(33749));
            nativeGetDocumentMetaText(aVar.a, C0201.m82(33750));
            nativeGetDocumentMetaText(aVar.a, C0201.m82(33751));
            nativeGetDocumentMetaText(aVar.a, C0201.m82(33752));
            nativeGetDocumentMetaText(aVar.a, C0201.m82(33753));
            nativeGetDocumentMetaText(aVar.a, C0201.m82(33754));
            nativeGetDocumentMetaText(aVar.a, C0201.m82(33755));
            nativeGetDocumentMetaText(aVar.a, C0201.m82(33756));
        }
        return cVar;
    }

    public int d(a aVar) {
        int nativeGetPageCount;
        synchronized (d) {
            nativeGetPageCount = nativeGetPageCount(aVar.a);
        }
        return nativeGetPageCount;
    }

    public List<a.b> e(a aVar, int i) {
        synchronized (d) {
            ArrayList arrayList = new ArrayList();
            Long l = aVar.c.get(Integer.valueOf(i));
            if (l == null) {
                return arrayList;
            }
            long[] nativeGetPageLinks = nativeGetPageLinks(l.longValue());
            for (long j : nativeGetPageLinks) {
                Integer nativeGetDestPageIndex = nativeGetDestPageIndex(aVar.a, j);
                String nativeGetLinkURI = nativeGetLinkURI(aVar.a, j);
                RectF nativeGetLinkRect = nativeGetLinkRect(j);
                if (!(nativeGetLinkRect == null || (nativeGetDestPageIndex == null && nativeGetLinkURI == null))) {
                    arrayList.add(new a.b(nativeGetLinkRect, nativeGetDestPageIndex, nativeGetLinkURI));
                }
            }
            return arrayList;
        }
    }

    public Size f(a aVar, int i) {
        Size nativeGetPageSizeByIndex;
        synchronized (d) {
            nativeGetPageSizeByIndex = nativeGetPageSizeByIndex(aVar.a, i, this.a);
        }
        return nativeGetPageSizeByIndex;
    }

    public List<a.C0126a> g(a aVar) {
        ArrayList arrayList;
        synchronized (d) {
            arrayList = new ArrayList();
            Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(aVar.a, null);
            if (nativeGetFirstChildBookmark != null) {
                l(arrayList, aVar, nativeGetFirstChildBookmark.longValue());
            }
        }
        return arrayList;
    }

    public Point h(a aVar, int i, int i2, int i3, int i4, int i5, int i6, double d2, double d3) {
        return nativePageCoordsToDevice(aVar.c.get(Integer.valueOf(i)).longValue(), i2, i3, i4, i5, i6, d2, d3);
    }

    public RectF i(a aVar, int i, int i2, int i3, int i4, int i5, int i6, RectF rectF) {
        Point h = h(aVar, i, i2, i3, i4, i5, i6, (double) rectF.left, (double) rectF.top);
        Point h2 = h(aVar, i, i2, i3, i4, i5, i6, (double) rectF.right, (double) rectF.bottom);
        return new RectF((float) h.x, (float) h.y, (float) h2.x, (float) h2.y);
    }

    public a j(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        a aVar = new a();
        aVar.b = parcelFileDescriptor;
        synchronized (d) {
            aVar.a = nativeOpenDocument(c(parcelFileDescriptor), str);
        }
        return aVar;
    }

    public long k(a aVar, int i) {
        long nativeLoadPage;
        synchronized (d) {
            nativeLoadPage = nativeLoadPage(aVar.a, i);
            aVar.c.put(Integer.valueOf(i), Long.valueOf(nativeLoadPage));
        }
        return nativeLoadPage;
    }

    public void m(a aVar, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z) {
        Throwable th;
        NullPointerException e2;
        Exception e3;
        synchronized (d) {
            try {
                try {
                    nativeRenderPageBitmap(aVar.c.get(Integer.valueOf(i)).longValue(), bitmap, this.a, i2, i3, i4, i5, z);
                } catch (NullPointerException e4) {
                    e2 = e4;
                } catch (Exception e5) {
                    e3 = e5;
                    Log.e(b, f);
                    e3.printStackTrace();
                }
            } catch (NullPointerException e6) {
                e2 = e6;
                Log.e(b, g);
                e2.printStackTrace();
            } catch (Exception e7) {
                e3 = e7;
                Log.e(b, f);
                e3.printStackTrace();
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
