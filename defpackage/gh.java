package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: gh  reason: default package */
/* compiled from: StreamLocalUriFetcher */
public class gh extends dh<InputStream> {
    private static final UriMatcher d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        String r1 = C0201.m82(17372);
        uriMatcher.addURI(r1, C0201.m82(17373), 1);
        d.addURI(r1, C0201.m82(17374), 1);
        d.addURI(r1, C0201.m82(17375), 2);
        d.addURI(r1, C0201.m82(17376), 3);
        d.addURI(r1, C0201.m82(17377), 4);
        d.addURI(r1, C0201.m82(17378), 5);
    }

    public gh(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = d.match(uri);
        if (match != 1) {
            if (match == 3) {
                return j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException(C0201.m82(17379));
    }

    private InputStream j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // defpackage.vg
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i = i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        throw new FileNotFoundException(C0201.m82(17380) + uri);
    }
}
