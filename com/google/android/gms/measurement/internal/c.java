package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

public final class c {
    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append(C0201.m82(32987));
        sb.append(str);
        sb.append(C0201.m82(32988));
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static void b(k3 k3Var, SQLiteDatabase sQLiteDatabase) {
        if (k3Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                k3Var.H().d(C0201.m82(32989));
            }
            if (!file.setWritable(false, false)) {
                k3Var.H().d(C0201.m82(32990));
            }
            if (!file.setReadable(true, true)) {
                k3Var.H().d(C0201.m82(32991));
            }
            if (!file.setWritable(true, true)) {
                k3Var.H().d(C0201.m82(32992));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(32993));
    }

    public static void c(k3 k3Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        String r0 = C0201.m82(32994);
        if (k3Var != null) {
            if (!d(k3Var, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            if (k3Var != null) {
                try {
                    Set<String> a = a(sQLiteDatabase, str);
                    String[] split = str3.split(C0201.m82(32995));
                    for (String str4 : split) {
                        if (!a.remove(str4)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                            sb.append(C0201.m82(32996));
                            sb.append(str);
                            sb.append(C0201.m82(32997));
                            sb.append(str4);
                            throw new SQLiteException(sb.toString());
                        }
                    }
                    if (strArr != null) {
                        for (int i = 0; i < strArr.length; i += 2) {
                            if (!a.remove(strArr[i])) {
                                sQLiteDatabase.execSQL(strArr[i + 1]);
                            }
                        }
                    }
                    if (!a.isEmpty()) {
                        k3Var.H().b(C0201.m82(32998), str, TextUtils.join(C0201.m82(32999), a));
                    }
                } catch (SQLiteException e) {
                    k3Var.E().a(C0201.m82(33000), str);
                    throw e;
                }
            } else {
                throw new IllegalArgumentException(r0);
            }
        } else {
            throw new IllegalArgumentException(r0);
        }
    }

    private static boolean d(k3 k3Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (k3Var != null) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query(C0201.m82(33001), new String[]{C0201.m82(33002)}, C0201.m82(33003), new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                if (cursor != null) {
                    cursor.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                k3Var.H().b(C0201.m82(33004), str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(33005));
        }
    }
}
