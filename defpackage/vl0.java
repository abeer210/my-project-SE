package defpackage;

import android.os.AsyncTask;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;

/* renamed from: vl0  reason: default package */
/* compiled from: DecodingAsyncTask */
public class vl0 extends AsyncTask<Void, Void, Throwable> {
    private boolean a = false;
    private xl0 b;
    private PdfiumCore c;
    private String d;
    private rm0 e;
    private int[] f;
    private zl0 g;

    public vl0(rm0 rm0, String str, int[] iArr, xl0 xl0, PdfiumCore pdfiumCore) {
        this.e = rm0;
        this.f = iArr;
        this.b = xl0;
        this.d = str;
        this.c = pdfiumCore;
    }

    private Size b() {
        return new Size(this.b.getWidth(), this.b.getHeight());
    }

    /* renamed from: a */
    public Throwable doInBackground(Void... voidArr) {
        try {
            this.g = new zl0(this.c, this.e.a(this.b.getContext(), this.c, this.d), this.b.getPageFitPolicy(), b(), this.f, this.b.H(), this.b.getSpacingPx(), this.b.q());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* renamed from: c */
    public void onPostExecute(Throwable th) {
        if (th != null) {
            this.b.O(th);
        } else if (!this.a) {
            this.b.N(this.g);
        }
    }

    public void onCancelled() {
        this.a = true;
    }
}
