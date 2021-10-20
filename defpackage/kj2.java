package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.StrictMode;
import android.view.View;
import android.view.Window;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: kj2  reason: default package */
/* compiled from: ImageLoader.kt */
public class kj2 {
    public static final a a = new a(null);

    /* renamed from: kj2$a */
    /* compiled from: ImageLoader.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final Drawable c(Context context, String str) {
            return pl0.a().b(context, str);
        }

        private final InputStream d(Context context, String str) throws FileNotFoundException {
            return context.getContentResolver().openInputStream(Uri.parse(str));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final InputStream e(Context context, String str) throws IOException {
            return fx2.c(str, C0201.m82(16125), false, 2, null) ? f(str) : d(context, str);
        }

        private final InputStream f(String str) throws IOException {
            InputStream openStream = new URL(str).openStream();
            ow2.b(openStream, C0201.m82(16126));
            return openStream;
        }

        public /* synthetic */ a(lw2 lw2) {
            this();
        }
    }

    /* renamed from: kj2$b */
    /* compiled from: ImageLoader.kt */
    public interface b {
        void a(Throwable th);

        void b(List<? extends Drawable> list);

        void c(Drawable drawable);
    }

    private final StrictMode.ThreadPolicy a(Context context) {
        if (!dj2.a(context)) {
            return null;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitNetwork().build());
        return threadPolicy;
    }

    private final Drawable c(Context context, String str) throws IOException {
        Drawable drawable;
        Uri parse = Uri.parse(str);
        ow2.b(parse, C0201.m82(33524));
        if (d(parse)) {
            drawable = e(context, str);
        } else {
            Drawable c = a.c(context, str);
            drawable = (c != null || !dj2.a(context)) ? c : i(context, str);
        }
        if (drawable != null) {
            return drawable;
        }
        throw new RuntimeException(C0201.m82(33525) + str);
    }

    private final boolean d(Uri uri) {
        return ow2.a(C0201.m82(33526), uri.getScheme());
    }

    private final Drawable e(Context context, String str) {
        Uri parse = Uri.parse(str);
        ow2.b(parse, C0201.m82(33527));
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeFile(parse.getPath()));
    }

    private final Drawable i(Context context, String str) throws IOException {
        StrictMode.ThreadPolicy a2 = a(context);
        Bitmap decodeStream = BitmapFactory.decodeStream(a.e(context, str));
        j(context, a2);
        return new BitmapDrawable(context.getResources(), decodeStream);
    }

    private final void j(Context context, StrictMode.ThreadPolicy threadPolicy) {
        if (dj2.a(context) && threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public Drawable b(Activity activity) {
        ow2.c(activity, C0201.m82(33528));
        Window window = activity.getWindow();
        ow2.b(window, C0201.m82(33529));
        View decorView = window.getDecorView();
        ow2.b(decorView, C0201.m82(33530));
        boolean z = true;
        if (decorView.getLayoutDirection() != 1) {
            z = false;
        }
        return androidx.core.content.b.f(activity, z ? pd2.ic_arrow_back_black_rtl_24dp : pd2.ic_arrow_back_black_24dp);
    }

    public Drawable f(Context context, String str) {
        ow2.c(context, C0201.m82(33531));
        if (str == null) {
            return null;
        }
        try {
            return c(context, str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void g(Context context, String str, b bVar) {
        ow2.c(context, C0201.m82(33532));
        ow2.c(str, C0201.m82(33533));
        ow2.c(bVar, C0201.m82(33534));
        try {
            bVar.c(c(context, str));
        } catch (IOException e) {
            bVar.a(e);
        }
    }

    public void h(Context context, List<String> list, b bVar) {
        ow2.c(context, C0201.m82(33535));
        ow2.c(list, C0201.m82(33536));
        ow2.c(bVar, C0201.m82(33537));
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(c(context, str));
            }
            bVar.b(arrayList);
        } catch (IOException e) {
            bVar.a(e);
        }
    }
}
