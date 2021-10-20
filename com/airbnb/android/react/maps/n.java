package com.airbnb.android.react.maps;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import vigqyno.C0201;

/* compiled from: FileUtil */
public class n extends AsyncTask<String, Void, InputStream> {
    private Context a;

    public n(Context context) {
        this.a = context;
    }

    /* JADX INFO: finally extract failed */
    private InputStream b(Context context, Uri uri) throws IOException {
        File createTempFile = File.createTempFile(C0201.m82(31155), C0201.m82(31156), context.getApplicationContext().getCacheDir());
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

    /* renamed from: a */
    public InputStream doInBackground(String... strArr) {
        try {
            Uri parse = Uri.parse(strArr[0]);
            if (parse.getScheme().startsWith(C0201.m82(31157))) {
                return b(this.a, parse);
            }
            return this.a.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            f60.j(C0201.m82(31159), C0201.m82(31158) + strArr[0], e);
            return null;
        }
    }
}
