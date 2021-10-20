package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: nc2  reason: default package */
public class nc2 extends AsyncTask<Context, Integer, InputStream> {
    private static final String a = nc2.class.getSimpleName();

    /* renamed from: a */
    public InputStream doInBackground(Context... contextArr) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = kc2.m(contextArr[0]);
        } catch (Exception e) {
            String str = a;
            pc2.e(str, C0201.m82(30776) + e.getMessage());
            inputStream = null;
        }
        String str2 = a;
        pc2.b(str2, C0201.m82(30777) + (System.currentTimeMillis() - currentTimeMillis) + C0201.m82(30778));
        return inputStream;
    }

    /* renamed from: b */
    public void onProgressUpdate(Integer... numArr) {
        String str = a;
        pc2.c(str, C0201.m82(30779) + Thread.currentThread().getName());
    }

    /* renamed from: c */
    public void onPostExecute(InputStream inputStream) {
        String str = a;
        pc2.b(str, C0201.m82(30780) + Thread.currentThread().getName());
        if (inputStream == null) {
            pc2.e(a, C0201.m82(30781));
        } else {
            fc2.b(inputStream);
        }
    }

    public void onPreExecute() {
        String str = a;
        pc2.b(str, C0201.m82(30782) + Thread.currentThread().getName());
    }
}
