package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public final class g3 extends f5 {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String b = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private final f3 c = new f3(this, getContext(), C0201.m82(34982));
    private boolean d;

    static {
        C0201.m83(g3.class, 106);
    }

    public g3(o4 o4Var) {
        super(o4Var);
    }

    private final SQLiteDatabase B() throws SQLiteException {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    private static long D(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query(C0201.m82(34983), new String[]{C0201.m82(34984)}, C0201.m82(34985), new String[]{C0201.m82(34986)}, null, null, C0201.m82(34987), C0201.m82(34988));
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00de, code lost:
        if (r8.inTransaction() != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e0, code lost:
        r8.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f3, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f8, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fd, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010a, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010f, code lost:
        r10.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:9:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00da A[SYNTHETIC, Splitter:B:54:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012e A[SYNTHETIC] */
    private final boolean E(int i2, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteFullException e2;
        Cursor cursor;
        SQLiteException e3;
        String str = i;
        h();
        j();
        boolean z2 = false;
        if (this.d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(l, Integer.valueOf(i2));
        contentValues.put(e, bArr);
        int i3 = 0;
        int i4 = 5;
        for (int i5 = 5; i3 < i5; i5 = 5) {
            Cursor cursor2 = null;
            cursor2 = null;
            r8 = null;
            cursor2 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            Cursor cursor3 = null;
            try {
                sQLiteDatabase = B();
                if (sQLiteDatabase == null) {
                    try {
                        this.d = true;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return z2;
                    } catch (SQLiteFullException e4) {
                        e2 = e4;
                    } catch (SQLiteDatabaseLockedException unused) {
                    } catch (SQLiteException e5) {
                        e3 = e5;
                        cursor = null;
                        sQLiteDatabase2 = sQLiteDatabase;
                        if (sQLiteDatabase2 != null) {
                        }
                        e().E().a(str, e3);
                        this.d = true;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase2 == null) {
                        }
                        i3++;
                        z2 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor3 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } else {
                    sQLiteDatabase.beginTransaction();
                    long j2 = 0;
                    cursor = sQLiteDatabase.rawQuery(r, null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                int i6 = z2 ? 1 : 0;
                                int i7 = z2 ? 1 : 0;
                                int i8 = z2 ? 1 : 0;
                                j2 = cursor.getLong(i6);
                            }
                        } catch (SQLiteFullException e6) {
                            e2 = e6;
                            cursor2 = cursor;
                            e().E().a(str, e2);
                            this.d = true;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase == null) {
                                sQLiteDatabase.close();
                            }
                            i3++;
                            z2 = false;
                        } catch (SQLiteDatabaseLockedException unused2) {
                            cursor3 = cursor;
                            try {
                                SystemClock.sleep((long) i4);
                                i4 += 20;
                                if (cursor3 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                i3++;
                                z2 = false;
                            } catch (Throwable th3) {
                                th = th3;
                                if (cursor3 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteException e7) {
                            e3 = e7;
                            sQLiteDatabase2 = sQLiteDatabase;
                            if (sQLiteDatabase2 != null) {
                            }
                            e().E().a(str, e3);
                            this.d = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase2 == null) {
                            }
                            i3++;
                            z2 = false;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor3 = cursor;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    String str2 = s;
                    if (j2 >= 100000) {
                        e().E().d(n);
                        long j3 = (100000 - j2) + 1;
                        String str3 = z;
                        String[] strArr = new String[1];
                        String l2 = Long.toString(j3);
                        char c2 = z2 ? 1 : 0;
                        char c3 = z2 ? 1 : 0;
                        char c4 = z2 ? 1 : 0;
                        strArr[c2] = l2;
                        long delete = (long) sQLiteDatabase.delete(str2, str3, strArr);
                        if (delete != j3) {
                            e().E().c(g, Long.valueOf(j3), Long.valueOf(delete), Long.valueOf(j3 - delete));
                        }
                    }
                    sQLiteDatabase.insertOrThrow(str2, null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase == null) {
                        return true;
                    }
                    sQLiteDatabase.close();
                    return true;
                }
            } catch (SQLiteFullException e8) {
                e2 = e8;
                sQLiteDatabase = null;
                e().E().a(str, e2);
                this.d = true;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase == null) {
                }
                i3++;
                z2 = false;
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabase = null;
                SystemClock.sleep((long) i4);
                i4 += 20;
                if (cursor3 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                i3++;
                z2 = false;
            } catch (SQLiteException e9) {
                e3 = e9;
                cursor = null;
                if (sQLiteDatabase2 != null) {
                }
                e().E().a(str, e3);
                this.d = true;
                if (cursor != null) {
                }
                if (sQLiteDatabase2 == null) {
                }
                i3++;
                z2 = false;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase = null;
                if (cursor3 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        e().H().d(C);
        return false;
    }

    private final boolean J() {
        return getContext().getDatabasePath(C0201.m82(34989)).exists();
    }

    public final void C() {
        h();
        j();
        try {
            int delete = B().delete(C0201.m82(34990), null, null) + 0;
            if (delete > 0) {
                e().M().a(C0201.m82(34991), Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            e().E().a(C0201.m82(34992), e2);
        }
    }

    public final boolean F(j jVar) {
        Parcel obtain = Parcel.obtain();
        jVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return E(0, marshall);
        }
        e().H().d(C0201.m82(34993));
        return false;
    }

    public final boolean G(t8 t8Var) {
        Parcel obtain = Parcel.obtain();
        t8Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return E(1, marshall);
        }
        e().H().d(C0201.m82(34994));
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01d7, code lost:
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01dc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01dd, code lost:
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e0, code lost:
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e4, code lost:
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e8, code lost:
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01f2, code lost:
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0203, code lost:
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0204, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0217, code lost:
        if (r15.inTransaction() != false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0219, code lost:
        r15.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x022b, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0230, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x023e, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0243, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0265, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0266, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0267, code lost:
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x026a, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x026f, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        r15 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r15 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        r24 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        e().E().d(com.google.android.gms.measurement.internal.g3.A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        e().E().d(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012c, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0136, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0139, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0153, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        e().E().d(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0160, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016b, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0121 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0155 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d6 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:46:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:46:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e7 A[ExcHandler: all (th java.lang.Throwable), PHI: r24 
      PHI: (r24v3 android.database.sqlite.SQLiteDatabase) = (r24v5 android.database.sqlite.SQLiteDatabase), (r24v5 android.database.sqlite.SQLiteDatabase), (r24v9 android.database.sqlite.SQLiteDatabase), (r24v9 android.database.sqlite.SQLiteDatabase) binds: [B:43:0x00a3, B:44:?, B:30:0x0083, B:31:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:30:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), PHI: r24 
      PHI: (r24v1 android.database.sqlite.SQLiteDatabase) = (r24v5 android.database.sqlite.SQLiteDatabase), (r24v5 android.database.sqlite.SQLiteDatabase), (r24v9 android.database.sqlite.SQLiteDatabase), (r24v9 android.database.sqlite.SQLiteDatabase) binds: [B:43:0x00a3, B:44:?, B:30:0x0083, B:31:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:30:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01fc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0213 A[SYNTHETIC, Splitter:B:149:0x0213] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0261 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0261 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0261 A[SYNTHETIC] */
    public final List<ip0> H(int i2) {
        int i3;
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        SQLiteFullException e2;
        SQLiteDatabase sQLiteDatabase3;
        SQLiteException e3;
        SQLiteDatabase sQLiteDatabase4;
        Cursor cursor2;
        String[] strArr;
        String str;
        String str2 = y;
        j();
        h();
        Cursor cursor3 = null;
        if (this.d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!J()) {
            return arrayList;
        }
        int i4 = 5;
        for (i3 = 0; i3 < 5; i3++) {
            try {
                sQLiteDatabase2 = B();
                if (sQLiteDatabase2 == null) {
                    try {
                        this.d = true;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                        }
                        return null;
                    } catch (SQLiteFullException e4) {
                        e2 = e4;
                    } catch (SQLiteDatabaseLockedException unused) {
                    } catch (SQLiteException e5) {
                        e3 = e5;
                        cursor = null;
                        if (sQLiteDatabase2 != null) {
                        }
                        e().E().a(str2, e3);
                        this.d = true;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase2 != null) {
                        }
                    } catch (Throwable th2) {
                    }
                } else {
                    sQLiteDatabase2.beginTransaction();
                    boolean p2 = g().p(l.C0);
                    String str3 = x;
                    String str4 = m;
                    String str5 = q;
                    long j2 = -1;
                    if (p2) {
                        long D = D(sQLiteDatabase2);
                        if (D != -1) {
                            str = j;
                            strArr = new String[]{String.valueOf(D)};
                        } else {
                            str = null;
                            strArr = null;
                        }
                        sQLiteDatabase4 = sQLiteDatabase2;
                        try {
                            cursor2 = sQLiteDatabase2.query(b, new String[]{str5, str4, str3}, str, strArr, null, null, o, Integer.toString(100));
                        } catch (SQLiteFullException e6) {
                            e2 = e6;
                            sQLiteDatabase = sQLiteDatabase4;
                            cursor = null;
                            sQLiteDatabase2 = sQLiteDatabase;
                            e().E().a(str2, e2);
                            this.d = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase2 == null) {
                            }
                        } catch (SQLiteDatabaseLockedException unused2) {
                        } catch (SQLiteException e7) {
                            e3 = e7;
                            sQLiteDatabase = sQLiteDatabase4;
                            cursor = null;
                            sQLiteDatabase2 = sQLiteDatabase;
                            if (sQLiteDatabase2 != null) {
                            }
                            e().E().a(str2, e3);
                            this.d = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase2 != null) {
                            }
                        } catch (Throwable th3) {
                        }
                    } else {
                        sQLiteDatabase4 = sQLiteDatabase2;
                        cursor2 = sQLiteDatabase4.query(p, new String[]{str5, str4, str3}, null, null, null, null, h, Integer.toString(100));
                    }
                    cursor = cursor2;
                    while (cursor.moveToNext()) {
                        try {
                            j2 = cursor.getLong(0);
                            int i5 = cursor.getInt(1);
                            byte[] blob = cursor.getBlob(2);
                            if (i5 == 0) {
                                Parcel obtain = Parcel.obtain();
                                obtain.unmarshall(blob, 0, blob.length);
                                obtain.setDataPosition(0);
                                j createFromParcel = j.CREATOR.createFromParcel(obtain);
                                obtain.recycle();
                                if (createFromParcel != null) {
                                    arrayList.add(createFromParcel);
                                }
                            } else {
                                String str6 = u;
                                if (i5 == 1) {
                                    Parcel obtain2 = Parcel.obtain();
                                    obtain2.unmarshall(blob, 0, blob.length);
                                    obtain2.setDataPosition(0);
                                    t8 t8Var = t8.CREATOR.createFromParcel(obtain2);
                                    obtain2.recycle();
                                    if (t8Var != null) {
                                        arrayList.add(t8Var);
                                    }
                                } else if (i5 == 2) {
                                    Parcel obtain3 = Parcel.obtain();
                                    obtain3.unmarshall(blob, 0, blob.length);
                                    obtain3.setDataPosition(0);
                                    g9 g9Var = g9.CREATOR.createFromParcel(obtain3);
                                    obtain3.recycle();
                                    if (g9Var != null) {
                                        arrayList.add(g9Var);
                                    }
                                } else if (i5 == 3) {
                                    e().H().d(k);
                                } else {
                                    e().E().d(t);
                                }
                            }
                        } catch (SQLiteFullException e8) {
                            e2 = e8;
                            sQLiteDatabase2 = sQLiteDatabase4;
                            e().E().a(str2, e2);
                            this.d = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase2 == null) {
                            }
                        } catch (SQLiteDatabaseLockedException unused3) {
                        } catch (SQLiteException e9) {
                            e3 = e9;
                            sQLiteDatabase2 = sQLiteDatabase4;
                            if (sQLiteDatabase2 != null) {
                            }
                            e().E().a(str2, e3);
                            this.d = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase2 != null) {
                            }
                        } catch (Throwable th4) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase4;
                    try {
                        if (sQLiteDatabase.delete(w, v, new String[]{Long.toString(j2)}) < arrayList.size()) {
                            e().E().d(f);
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return arrayList;
                    } catch (SQLiteFullException e10) {
                        e2 = e10;
                        sQLiteDatabase2 = sQLiteDatabase;
                        e().E().a(str2, e2);
                        this.d = true;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase2 == null) {
                        }
                    } catch (SQLiteDatabaseLockedException unused4) {
                        sQLiteDatabase3 = sQLiteDatabase;
                        SystemClock.sleep((long) i4);
                        i4 += 20;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase3 != null) {
                        }
                    } catch (SQLiteException e11) {
                        e3 = e11;
                        sQLiteDatabase2 = sQLiteDatabase;
                        if (sQLiteDatabase2 != null) {
                        }
                        e().E().a(str2, e3);
                        this.d = true;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase2 != null) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                }
            } catch (SQLiteFullException e12) {
                e2 = e12;
                cursor = null;
                sQLiteDatabase2 = null;
                e().E().a(str2, e2);
                this.d = true;
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase2 == null) {
                    sQLiteDatabase2.close();
                }
            } catch (SQLiteDatabaseLockedException unused5) {
                cursor = null;
                sQLiteDatabase3 = null;
                SystemClock.sleep((long) i4);
                i4 += 20;
                if (cursor != null) {
                }
                if (sQLiteDatabase3 != null) {
                }
            } catch (SQLiteException e13) {
                e3 = e13;
                cursor = null;
                sQLiteDatabase2 = null;
                if (sQLiteDatabase2 != null) {
                }
                e().E().a(str2, e3);
                this.d = true;
                if (cursor != null) {
                }
                if (sQLiteDatabase2 != null) {
                }
            } catch (Throwable th6) {
                th = th6;
                sQLiteDatabase = null;
                if (cursor3 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        e().H().d(B);
        return null;
        cursor = null;
        e().E().a(str2, e2);
        this.d = true;
        if (cursor != null) {
        }
        if (sQLiteDatabase2 == null) {
        }
    }

    public final boolean I(g9 g9Var) {
        m();
        byte[] P = y8.P(g9Var);
        if (P.length <= 131072) {
            return E(2, P);
        }
        e().H().d(C0201.m82(34995));
        return false;
    }

    public final boolean K() {
        return E(3, new byte[0]);
    }

    public final boolean L() {
        String r0 = C0201.m82(34996);
        j();
        h();
        if (this.d || !J()) {
            return false;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase B2 = B();
                if (B2 == null) {
                    this.d = true;
                    if (B2 != null) {
                        B2.close();
                    }
                    return false;
                }
                B2.beginTransaction();
                B2.delete(C0201.m82(34997), C0201.m82(34998), new String[]{Integer.toString(3)});
                B2.setTransactionSuccessful();
                B2.endTransaction();
                if (B2 != null) {
                    B2.close();
                }
                return true;
            } catch (SQLiteFullException e2) {
                e().E().a(r0, e2);
                this.d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep((long) i2);
                i2 += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteException e3) {
                if (0 != 0) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
                e().E().a(r0, e3);
                this.d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        e().H().d(C0201.m82(34999));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    public final boolean z() {
        return false;
    }
}
