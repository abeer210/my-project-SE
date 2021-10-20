package defpackage;

import android.content.Context;
import android.net.Uri;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.a;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: sm0  reason: default package */
/* compiled from: UriSource */
public class sm0 implements rm0 {
    private Uri a;

    public sm0(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.rm0
    public a a(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.j(context.getContentResolver().openFileDescriptor(this.a, C0201.m82(23015)), str);
    }
}
