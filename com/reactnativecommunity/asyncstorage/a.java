package com.reactnativecommunity.asyncstorage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: AsyncLocalStorageUtil */
public class a {
    public static String a(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, C0201.m82(8621));
        return C0201.m82(8622) + TextUtils.join(C0201.m82(8623), strArr) + C0201.m82(8624);
    }

    public static String[] b(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    private static void c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject == null || optJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                c(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            }
        }
    }

    public static String d(SQLiteDatabase sQLiteDatabase, String str) {
        String r2 = C0201.m82(8626);
        Cursor query = sQLiteDatabase.query(r2, new String[]{C0201.m82(8625)}, C0201.m82(8627), new String[]{str}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            String string = query.getString(0);
            query.close();
            return string;
        } finally {
            query.close();
        }
    }

    public static boolean e(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String d = d(sQLiteDatabase, str);
        if (d != null) {
            JSONObject jSONObject = new JSONObject(d);
            c(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return f(sQLiteDatabase, str, str2);
    }

    public static boolean f(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(8628), str);
        contentValues.put(C0201.m82(8629), str2);
        return -1 != sQLiteDatabase.insertWithOnConflict(C0201.m82(8630), null, contentValues, 5);
    }
}
