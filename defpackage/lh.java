package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import vigqyno.C0201;

/* renamed from: lh  reason: default package */
/* compiled from: ThumbnailStreamOpener */
public class lh {
    private static final hh f = new hh();
    private final hh a;
    private final kh b;
    private final ni c;
    private final ContentResolver d;
    private final List<ImageHeaderParser> e;

    public lh(List<ImageHeaderParser> list, kh khVar, ni niVar, ContentResolver contentResolver) {
        this(list, f, khVar, niVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    private String b(Uri uri) {
        Throwable th;
        SecurityException e2;
        Cursor cursor;
        String r0 = C0201.m82(29062);
        Cursor cursor2 = null;
        try {
            cursor = this.b.a(uri);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (SecurityException e3) {
                    e2 = e3;
                    try {
                        if (Log.isLoggable(r0, 3)) {
                        }
                        if (cursor != null) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (SecurityException e4) {
            e2 = e4;
            cursor = null;
            if (Log.isLoggable(r0, 3)) {
                Log.d(r0, C0201.m82(29063) + uri, e2);
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.a.a(file) && 0 < this.a.c(file);
    }

    public int a(Uri uri) {
        String r0 = C0201.m82(29064);
        InputStream inputStream = null;
        try {
            inputStream = this.d.openInputStream(uri);
            int b2 = f.b(this.e, inputStream, this.c);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return b2;
        } catch (IOException | NullPointerException e2) {
            if (Log.isLoggable(r0, 3)) {
                Log.d(r0, C0201.m82(29065) + uri, e2);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public InputStream d(Uri uri) throws FileNotFoundException {
        String b2 = b(uri);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        File b3 = this.a.b(b2);
        if (!c(b3)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b3);
        try {
            return this.d.openInputStream(fromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException(C0201.m82(29066) + uri + C0201.m82(29067) + fromFile).initCause(e2));
        }
    }

    public lh(List<ImageHeaderParser> list, hh hhVar, kh khVar, ni niVar, ContentResolver contentResolver) {
        this.a = hhVar;
        this.b = khVar;
        this.c = niVar;
        this.d = contentResolver;
        this.e = list;
    }
}
