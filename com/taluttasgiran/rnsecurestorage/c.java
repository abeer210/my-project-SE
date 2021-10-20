package com.taluttasgiran.rnsecurestorage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Storage */
public final class c {
    public static boolean a(Context context, String str) throws IOException {
        File fileStreamPath = context.getFileStreamPath(str);
        return fileStreamPath != null && fileStreamPath.exists();
    }

    public static byte[] b(Context context, String str) throws IOException {
        FileInputStream openFileInput = context.openFileInput(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] bArr = new byte[1024];
        for (int read = openFileInput.read(bArr); read != -1; read = openFileInput.read(bArr)) {
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void c(Context context, String str, byte[] bArr) throws IOException {
        FileOutputStream openFileOutput = context.openFileOutput(str, 0);
        openFileOutput.write(bArr);
        openFileOutput.close();
    }
}
