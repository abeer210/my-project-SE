package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import vigqyno.C0201;

/* compiled from: RequestBodyUtil */
public class m {

    /* access modifiers changed from: package-private */
    /* compiled from: RequestBodyUtil */
    public static class a extends RequestBody {
        public final /* synthetic */ MediaType a;
        public final /* synthetic */ InputStream b;

        public a(MediaType mediaType, InputStream inputStream) {
            this.a = mediaType;
            this.b = inputStream;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            try {
                return (long) this.b.available();
            } catch (IOException unused) {
                return 0;
            }
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(by2 by2) throws IOException {
            ty2 ty2 = null;
            try {
                ty2 = jy2.k(this.b);
                by2.x0(ty2);
            } finally {
                Util.closeQuietly(ty2);
            }
        }
    }

    public static RequestBody a(MediaType mediaType, InputStream inputStream) {
        return new a(mediaType, inputStream);
    }

    public static RequestBody b(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static i c(RequestBody requestBody, h hVar) {
        return new i(requestBody, hVar);
    }

    /* JADX INFO: finally extract failed */
    private static InputStream d(Context context, Uri uri) throws IOException {
        File createTempFile = File.createTempFile(C0201.m82(9431), C0201.m82(9432), context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.getChannel().transferFrom(newChannel, 0, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    fileOutputStream.close();
                    newChannel.close();
                    return fileInputStream;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                newChannel.close();
                throw th2;
            }
        } finally {
            openStream.close();
        }
    }

    public static RequestBody e(String str) {
        if (str.equals(C0201.m82(9433)) || str.equals(C0201.m82(9434)) || str.equals(C0201.m82(9435))) {
            return RequestBody.create((MediaType) null, dy2.e);
        }
        return null;
    }

    public static InputStream f(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith(C0201.m82(9436))) {
                return d(context, parse);
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            f60.j(C0201.m82(9438), C0201.m82(9437) + str, e);
            return null;
        }
    }

    public static boolean g(String str) {
        return C0201.m82(9439).equalsIgnoreCase(str);
    }
}
