package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: eg0  reason: default package */
/* compiled from: LocalContentUriFetchProducer */
public class eg0 extends hg0 {
    private static final String[] d = {C0201.m82(25201), C0201.m82(25202)};
    private final ContentResolver c;

    public eg0(Executor executor, r60 r60, ContentResolver contentResolver) {
        super(executor, r60);
        this.c = contentResolver;
    }

    private af0 g(Uri uri) throws IOException {
        Cursor query = this.c.query(uri, d, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex(C0201.m82(25203)));
            if (string != null) {
                af0 e = e(new FileInputStream(string), h(string));
                query.close();
                return e;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    @Override // defpackage.hg0
    public af0 d(ih0 ih0) throws IOException {
        af0 g;
        InputStream inputStream;
        Uri q = ih0.q();
        if (h70.g(q)) {
            if (q.toString().endsWith(C0201.m82(25204))) {
                inputStream = this.c.openInputStream(q);
            } else {
                boolean endsWith = q.toString().endsWith(C0201.m82(25205));
                String r2 = C0201.m82(25206);
                if (endsWith) {
                    try {
                        inputStream = this.c.openAssetFileDescriptor(q, C0201.m82(25207)).createInputStream();
                    } catch (IOException unused) {
                        throw new IOException(r2 + q);
                    }
                } else {
                    InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.c, q);
                    if (openContactPhotoInputStream != null) {
                        inputStream = openContactPhotoInputStream;
                    } else {
                        throw new IOException(r2 + q);
                    }
                }
            }
            return e(inputStream, -1);
        } else if (!h70.f(q) || (g = g(q)) == null) {
            return e(this.c.openInputStream(q), -1);
        } else {
            return g;
        }
    }

    @Override // defpackage.hg0
    public String f() {
        return C0201.m82(25208);
    }
}
