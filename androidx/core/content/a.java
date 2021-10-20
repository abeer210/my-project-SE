package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* compiled from: ContentResolverCompat */
public final class a {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, c2 c2Var) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 16) {
            if (c2Var != null) {
                try {
                    obj = c2Var.b();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new d2();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
        if (c2Var != null) {
            c2Var.d();
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
