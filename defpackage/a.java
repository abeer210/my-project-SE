package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import vigqyno.C0201;

/* renamed from: a  reason: default package */
/* compiled from: PdfConverter */
public class a implements Runnable {
    private static a k;
    private Context a;
    private String b;
    private File c;
    private PrintAttributes d;
    private boolean e;
    private WebView f;
    private boolean g;
    private WritableMap h;
    private Promise i;
    private String j;

    /* renamed from: a$a  reason: collision with other inner class name */
    /* compiled from: PdfConverter */
    class C0000a extends WebViewClient {

        /* renamed from: a$a$a  reason: collision with other inner class name */
        /* compiled from: PdfConverter */
        class C0001a extends PrintDocumentAdapter.LayoutResultCallback {
            public C0001a(C0000a aVar) {
            }
        }

        /* renamed from: a$a$b */
        /* compiled from: PdfConverter */
        class b extends PrintDocumentAdapter.WriteResultCallback {
            public b() {
            }

            public void onWriteFinished(PageRange[] pageRangeArr) {
                try {
                    String r6 = C0201.m82(35148);
                    if (a.this.g) {
                        r6 = a.this.k(a.this.c);
                    }
                    int h = xs2.m(a.this.c).h();
                    a.this.h.putString(C0201.m82(35149), a.this.c.getAbsolutePath());
                    a.this.h.putString(C0201.m82(35150), String.valueOf(h));
                    a.this.h.putString(C0201.m82(35151), r6);
                    a.this.i.resolve(a.this.h);
                } catch (IOException e) {
                    a.this.i.reject(e.getMessage());
                } catch (Throwable th) {
                    a.this.j();
                    throw th;
                }
                a.this.j();
            }
        }

        public C0000a() {
        }

        public void onPageFinished(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                PrintDocumentAdapter createPrintDocumentAdapter = a.this.f.createPrintDocumentAdapter();
                createPrintDocumentAdapter.onLayout(null, a.this.o(), null, new C0001a(this), null);
                createPrintDocumentAdapter.onWrite(new PageRange[]{PageRange.ALL_PAGES}, a.this.n(), null, new b());
                return;
            }
            throw new RuntimeException(C0201.m82(21089));
        }
    }

    private a() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String k(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, C0201.m82(26728));
        byte[] bArr = new byte[((int) randomAccessFile.length())];
        randomAccessFile.readFully(bArr);
        return Base64.encodeToString(bArr, 0);
    }

    private PrintAttributes l() {
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        PrintAttributes.Builder mediaSize = new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.NA_LETTER);
        String r2 = C0201.m82(26729);
        return mediaSize.setResolution(new PrintAttributes.Resolution(r2, r2, 600, 600)).setMinMargins(PrintAttributes.Margins.NO_MARGINS).build();
    }

    public static synchronized a m() {
        a aVar;
        synchronized (a.class) {
            if (k == null) {
                k = new a();
            }
            aVar = k;
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private ParcelFileDescriptor n() {
        try {
            this.c.createNewFile();
            return ParcelFileDescriptor.open(this.c, 872415232);
        } catch (Exception e2) {
            Log.d(C0201.m82(26730), C0201.m82(26731), e2);
            return null;
        }
    }

    private void p(Runnable runnable) {
        new Handler(this.a.getMainLooper()).post(runnable);
    }

    public void i(Context context, String str, File file, boolean z, WritableMap writableMap, Promise promise, String str2) throws Exception {
        if (context == null) {
            throw new Exception(C0201.m82(26734));
        } else if (str == null) {
            throw new Exception(C0201.m82(26733));
        } else if (file == null) {
            throw new Exception(C0201.m82(26732));
        } else if (!this.e) {
            this.a = context;
            this.b = str;
            this.c = file;
            this.e = true;
            this.g = z;
            this.h = writableMap;
            this.i = promise;
            this.j = str2;
            p(this);
        }
    }

    public PrintAttributes o() {
        PrintAttributes printAttributes = this.d;
        return printAttributes != null ? printAttributes : l();
    }

    public void q(PrintAttributes printAttributes) {
        this.d = printAttributes;
    }

    public void run() {
        WebView webView = new WebView(this.a);
        this.f = webView;
        webView.setWebViewClient(new C0000a());
        this.f.getSettings().setDefaultTextEncodingName(C0201.m82(26735));
        this.f.loadDataWithBaseURL(this.j, this.b, C0201.m82(26736), C0201.m82(26737), null);
    }
}
