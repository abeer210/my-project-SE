package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import defpackage.b61;
import defpackage.x51;
import defpackage.z51;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

public final class n9 extends n8 {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String aA = null;
    public static final String aB = null;
    public static final String aC = null;
    public static final String aD = null;
    public static final String aE = null;
    public static final String aF = null;
    public static final String aG = null;
    public static final String aH = null;
    public static final String aI = null;
    public static final String aJ = null;
    public static final String aK = null;
    public static final String aL = null;
    public static final String aM = null;
    public static final String aN = null;
    public static final String aO = null;
    public static final String aP = null;
    public static final String aQ = null;
    public static final String aR = null;
    public static final String aS = null;
    public static final String aT = null;
    public static final String aU = null;
    public static final String aV = null;
    public static final String aW = null;
    public static final String aX = null;
    public static final String aY = null;
    public static final String aZ = null;
    public static final String aa = null;
    public static final String ab = null;
    public static final String ac = null;
    public static final String ad = null;
    public static final String ae = null;
    public static final String af = null;
    public static final String ag = null;
    public static final String ah = null;
    public static final String ai = null;
    public static final String aj = null;
    public static final String ak = null;
    public static final String al = null;
    public static final String am = null;
    public static final String an = null;
    public static final String ao = null;
    public static final String ap = null;
    public static final String aq = null;
    public static final String ar = null;
    public static final String as = null;
    public static final String at = null;
    public static final String au = null;
    public static final String av = null;
    public static final String aw = null;
    public static final String ax = null;
    public static final String ay = null;
    public static final String az = null;
    public static final String bA = null;
    public static final String ba = null;
    public static final String bb = null;
    public static final String bc = null;
    public static final String bd = null;
    public static final String be = null;
    public static final String bf = null;
    public static final String bg = null;
    public static final String bh = null;
    public static final String bi = null;
    public static final String bj = null;
    public static final String bk = null;
    public static final String bl = null;
    public static final String bm = null;
    public static final String bn = null;
    public static final String bo = null;
    public static final String bp = null;
    public static final String bq = null;
    public static final String br = null;
    public static final String bs = null;
    public static final String bt = null;
    public static final String bu = null;
    public static final String bv = null;
    public static final String bw = null;
    public static final String bx = null;
    public static final String by = null;
    public static final String bz = null;
    public static final String c = null;
    public static final String cA = null;
    public static final String ca = null;
    public static final String cb = null;
    public static final String cc = null;
    public static final String cd = null;
    public static final String ce = null;
    public static final String cf = null;
    public static final String cg = null;
    public static final String ch = null;
    public static final String ci = null;
    public static final String cj = null;
    public static final String ck = null;

    /* renamed from: cl  reason: collision with root package name */
    public static final String f50cl = null;
    public static final String cm = null;
    public static final String cn = null;
    public static final String co = null;
    public static final String cp = null;
    public static final String cq = null;
    public static final String cr = null;
    public static final String cs = null;
    public static final String ct = null;
    public static final String cu = null;
    public static final String cv = null;
    public static final String cw = null;
    public static final String cx = null;
    public static final String cy = null;
    public static final String cz = null;
    public static final String da = null;
    public static final String db = null;
    public static final String dc = null;
    public static final String dd = null;
    public static final String de = null;
    public static final String df = null;
    public static final String dg = null;
    public static final String dh = null;
    public static final String di = null;
    public static final String dj = null;
    public static final String dk = null;
    public static final String dl = null;
    public static final String dm = null;
    public static final String dn = null;

    /* renamed from: do  reason: not valid java name */
    public static final String f1do = null;
    public static final String dp = null;
    public static final String dq = null;
    public static final String dr = null;
    public static final String ds = null;
    public static final String dt = null;
    public static final String du = null;
    private static final String[] f = {C0201.m82(14621), C0201.m82(14622), C0201.m82(14623), C0201.m82(14624), C0201.m82(14625), C0201.m82(14626), C0201.m82(14627), C0201.m82(14628), C0201.m82(14629), C0201.m82(14630), C0201.m82(14631), C0201.m82(14632)};
    private static final String[] g = {C0201.m82(14633), C0201.m82(14634)};
    private static final String[] h = {C0201.m82(14635), C0201.m82(14636), C0201.m82(14637), C0201.m82(14638), C0201.m82(14639), C0201.m82(14640), C0201.m82(14641), C0201.m82(14642), C0201.m82(14643), C0201.m82(14644), C0201.m82(14645), C0201.m82(14646), C0201.m82(14647), C0201.m82(14648), C0201.m82(14649), C0201.m82(14650), C0201.m82(14651), C0201.m82(14652), C0201.m82(14653), C0201.m82(14654), C0201.m82(14655), C0201.m82(14656), C0201.m82(14657), C0201.m82(14658), C0201.m82(14659), C0201.m82(14660), C0201.m82(14661), C0201.m82(14662), C0201.m82(14663), C0201.m82(14664), C0201.m82(14665), C0201.m82(14666), C0201.m82(14667), C0201.m82(14668), C0201.m82(14669), C0201.m82(14670), C0201.m82(14671), C0201.m82(14672), C0201.m82(14673), C0201.m82(14674), C0201.m82(14675), C0201.m82(14676), C0201.m82(14677), C0201.m82(14678), C0201.m82(14679), C0201.m82(14680), C0201.m82(14681), C0201.m82(14682), C0201.m82(14683), C0201.m82(14684)};
    private static final String[] i = {C0201.m82(14685), C0201.m82(14686)};
    private static final String[] j = {C0201.m82(14687), C0201.m82(14688), C0201.m82(14689), C0201.m82(14690)};
    private static final String[] k;
    private static final String[] l;
    private static final String[] m = {C0201.m82(14694), C0201.m82(14695)};
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
    private final o9 d = new o9(this, getContext(), C0201.m82(14696));
    private final j8 e = new j8(b());

    static {
        C0201.m83(n9.class, 48);
        String r0 = C0201.m82(14691);
        k = new String[]{r0, C0201.m82(14692)};
        l = new String[]{r0, C0201.m82(14693)};
    }

    public n9(m8 m8Var) {
        super(m8Var);
    }

    private final long A(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = x().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            throw new SQLiteException(C0201.m82(14697));
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14698), str, e2);
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long B(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = x().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j3;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14699), str, e2);
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object F(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            e().E().d(C0201.m82(14702));
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                e().E().a(C0201.m82(14700), Integer.valueOf(type));
                return null;
            }
            e().E().d(C0201.m82(14701));
            return null;
        }
    }

    private static void I(ContentValues contentValues, String str, Object obj) {
        u.g(str);
        u.k(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException(C0201.m82(14703));
        }
    }

    private final boolean Q(String str, int i2, l51 l51) {
        t();
        j();
        u.g(str);
        u.k(l51);
        Integer num = null;
        if (TextUtils.isEmpty(l51.K())) {
            m3 H2 = e().H();
            Object B2 = k3.B(str);
            Integer valueOf = Integer.valueOf(i2);
            if (l51.M()) {
                num = Integer.valueOf(l51.C());
            }
            H2.c(C0201.m82(14704), B2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] h2 = l51.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14705), str);
        contentValues.put(C0201.m82(14706), Integer.valueOf(i2));
        contentValues.put(C0201.m82(14707), l51.M() ? Integer.valueOf(l51.C()) : null);
        contentValues.put(C0201.m82(14708), l51.K());
        if (g().G(str, l.x0)) {
            contentValues.put(C0201.m82(14709), l51.S() ? Boolean.valueOf(l51.T()) : null);
        }
        contentValues.put(C0201.m82(14710), h2);
        try {
            if (x().insertWithOnConflict(C0201.m82(14711), null, contentValues, 5) != -1) {
                return true;
            }
            e().E().a(C0201.m82(14712), k3.B(str));
            return true;
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14713), k3.B(str), e2);
            return false;
        }
    }

    private final boolean R(String str, int i2, o51 o51) {
        t();
        j();
        u.g(str);
        u.k(o51);
        Integer num = null;
        if (TextUtils.isEmpty(o51.D())) {
            m3 H2 = e().H();
            Object B2 = k3.B(str);
            Integer valueOf = Integer.valueOf(i2);
            if (o51.I()) {
                num = Integer.valueOf(o51.C());
            }
            H2.c(C0201.m82(14714), B2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] h2 = o51.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14715), str);
        contentValues.put(C0201.m82(14716), Integer.valueOf(i2));
        contentValues.put(C0201.m82(14717), o51.I() ? Integer.valueOf(o51.C()) : null);
        contentValues.put(C0201.m82(14718), o51.D());
        if (g().G(str, l.x0)) {
            contentValues.put(C0201.m82(14719), o51.L() ? Boolean.valueOf(o51.M()) : null);
        }
        contentValues.put(C0201.m82(14720), h2);
        try {
            if (x().insertWithOnConflict(C0201.m82(14721), null, contentValues, 5) != -1) {
                return true;
            }
            e().E().a(C0201.m82(14722), k3.B(str));
            return false;
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14723), k3.B(str), e2);
            return false;
        }
    }

    private final boolean T(String str, List<Integer> list) {
        u.g(str);
        t();
        j();
        SQLiteDatabase x2 = x();
        try {
            long A2 = A(C0201.m82(14724), new String[]{str});
            int max = Math.max(0, Math.min(2000, g().r(str, l.K)));
            if (A2 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(C0201.m82(14725), arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append(C0201.m82(14726));
            sb.append(join);
            sb.append(C0201.m82(14727));
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append(C0201.m82(14728));
            sb3.append(sb2);
            sb3.append(C0201.m82(14729));
            return x2.delete(C0201.m82(14730), sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14731), k3.B(str), e2);
            return false;
        }
    }

    private final boolean n0() {
        return getContext().getDatabasePath(C0201.m82(14732)).exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    public final Map<Integer, List<l51>> A0(String str, String str2) {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        t();
        j();
        u.g(str);
        u.g(str2);
        r0 r0Var = new r0();
        Cursor cursor2 = null;
        try {
            cursor = x().query(dg, new String[]{dh, cq}, cp, new String[]{str, str2}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    Map<Integer, List<l51>> emptyMap = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        l51 D2 = l51.D(cursor.getBlob(1), y81.e());
                        int i2 = cursor.getInt(0);
                        List list = (List) r0Var.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            r0Var.put(Integer.valueOf(i2), list);
                        }
                        list.add(D2);
                    } catch (IOException e3) {
                        e().E().b(w, k3.B(str), e3);
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return r0Var;
            } catch (SQLiteException e4) {
                e2 = e4;
                try {
                    e().E().b(dn, k3.B(str), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            cursor = null;
            e().E().b(dn, k3.B(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    public final Map<Integer, List<o51>> B0(String str, String str2) {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        t();
        j();
        u.g(str);
        u.g(str2);
        r0 r0Var = new r0();
        Cursor cursor2 = null;
        try {
            cursor = x().query(am, new String[]{R, dj}, da, new String[]{str, str2}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    Map<Integer, List<o51>> emptyMap = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        o51 H2 = o51.H(cursor.getBlob(1), y81.e());
                        int i2 = cursor.getInt(0);
                        List list = (List) r0Var.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            r0Var.put(Integer.valueOf(i2), list);
                        }
                        list.add(H2);
                    } catch (IOException e3) {
                        e().E().b(H, k3.B(str), e3);
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return r0Var;
            } catch (SQLiteException e4) {
                e2 = e4;
                try {
                    e().E().b(aA, k3.B(str), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            cursor = null;
            e().E().b(aA, k3.B(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    public final Pair<x51, Long> C(String str, Long l2) {
        Throwable th;
        SQLiteException e2;
        Cursor cursor;
        j();
        t();
        Cursor cursor2 = null;
        try {
            cursor = x().rawQuery(C0201.m82(14733), new String[]{str, String.valueOf(l2)});
            try {
                if (!cursor.moveToFirst()) {
                    e().M().d(C0201.m82(14734));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                try {
                    Pair<x51, Long> create = Pair.create(x51.U(cursor.getBlob(0), y81.e()), Long.valueOf(cursor.getLong(1)));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return create;
                } catch (IOException e3) {
                    e().E().c(C0201.m82(14735), k3.B(str), l2, e3);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (SQLiteException e4) {
                e2 = e4;
                try {
                    e().E().a(C0201.m82(14736), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            cursor = null;
            e().E().a(C0201.m82(14736), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final long C0(String str, String str2) {
        Throwable th;
        SQLiteException e2;
        long B2;
        String str3;
        String str4;
        u.g(str);
        u.g(str2);
        j();
        t();
        SQLiteDatabase x2 = x();
        x2.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append(cx);
            sb.append(str2);
            sb.append(r);
            try {
                B2 = B(sb.toString(), new String[]{str}, -1);
                str3 = cj;
                str4 = aj;
                if (B2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(str4, str);
                    contentValues.put(aN, (Integer) 0);
                    contentValues.put(F, (Integer) 0);
                    if (x2.insertWithOnConflict(str3, null, contentValues, 5) == -1) {
                        e().E().b(aZ, k3.B(str), str2);
                        x2.endTransaction();
                        return -1;
                    }
                    B2 = 0;
                }
            } catch (SQLiteException e3) {
                e2 = e3;
                try {
                    e().E().c(aU, k3.B(str), str2, e2);
                    x2.endTransaction();
                    return j2;
                } catch (Throwable th2) {
                    th = th2;
                    x2.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str4, str);
                contentValues2.put(str2, Long.valueOf(1 + B2));
                if (((long) x2.update(str3, contentValues2, aO, new String[]{str})) == 0) {
                    e().E().b(dp, k3.B(str), str2);
                    x2.endTransaction();
                    return -1;
                }
                x2.setTransactionSuccessful();
                x2.endTransaction();
                return B2;
            } catch (SQLiteException e4) {
                e2 = e4;
                j2 = B2;
                e().E().c(aU, k3.B(str), str2, e2);
                x2.endTransaction();
                return j2;
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            e().E().c(aU, k3.B(str), str2, e2);
            x2.endTransaction();
            return j2;
        } catch (Throwable th3) {
            th = th3;
            x2.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    public final String D0(long j2) {
        Throwable th;
        SQLiteException e2;
        Cursor cursor;
        j();
        t();
        Cursor cursor2 = null;
        try {
            cursor = x().rawQuery(C0201.m82(14737), new String[]{String.valueOf(j2)});
            try {
                if (!cursor.moveToFirst()) {
                    e().M().d(C0201.m82(14738));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                String string = cursor.getString(0);
                if (cursor != null) {
                    cursor.close();
                }
                return string;
            } catch (SQLiteException e3) {
                e2 = e3;
                try {
                    e().E().a(C0201.m82(14739), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursor = null;
            e().E().a(C0201.m82(14739), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final m9 E(long j2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        u.g(str);
        j();
        t();
        String[] strArr = {str};
        m9 m9Var = new m9();
        Cursor cursor = null;
        try {
            SQLiteDatabase x2 = x();
            Cursor query = x2.query(by, new String[]{bm, aH, aL, aa, au, bg}, aY, new String[]{str}, null, null, null);
            if (!query.moveToFirst()) {
                e().H().a(ba, k3.B(str));
                if (query != null) {
                    query.close();
                }
                return m9Var;
            }
            if (query.getLong(0) == j2) {
                m9Var.b = query.getLong(1);
                m9Var.a = query.getLong(2);
                m9Var.c = query.getLong(3);
                m9Var.d = query.getLong(4);
                m9Var.e = query.getLong(5);
            }
            if (z2) {
                m9Var.b++;
            }
            if (z3) {
                m9Var.a++;
            }
            if (z4) {
                m9Var.c++;
            }
            if (z5) {
                m9Var.d++;
            }
            if (z6) {
                m9Var.e++;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(du, Long.valueOf(j2));
            contentValues.put(aQ, Long.valueOf(m9Var.a));
            contentValues.put(dr, Long.valueOf(m9Var.b));
            contentValues.put(s, Long.valueOf(m9Var.c));
            contentValues.put(cd, Long.valueOf(m9Var.d));
            contentValues.put(ca, Long.valueOf(m9Var.e));
            x2.update(cb, contentValues, bz, strArr);
            if (query != null) {
                query.close();
            }
            return m9Var;
        } catch (SQLiteException e2) {
            e().E().b(br, k3.B(str), e2);
            if (0 != 0) {
                cursor.close();
            }
            return m9Var;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<Pair<b61, Long>> G(String str, int i2, int i3) {
        j();
        t();
        u.a(i2 > 0);
        u.a(i3 > 0);
        u.g(str);
        Cursor cursor = null;
        try {
            Cursor query = x().query(W, new String[]{de, I, cm}, aG, new String[]{str}, null, null, cf, String.valueOf(i2));
            if (!query.moveToFirst()) {
                List<Pair<b61, Long>> emptyList = Collections.emptyList();
                if (query != null) {
                    query.close();
                }
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            do {
                long j2 = query.getLong(0);
                try {
                    byte[] P2 = n().P(query.getBlob(1));
                    if (!arrayList.isEmpty() && P2.length + i4 > i3) {
                        break;
                    }
                    try {
                        b61.a D2 = b61.D2();
                        D2.l(P2, y81.e());
                        b61.a aVar = D2;
                        if (!query.isNull(2)) {
                            aVar.L0(query.getInt(2));
                        }
                        i4 += P2.length;
                        arrayList.add(Pair.create((b61) ((l91) aVar.G0()), Long.valueOf(j2)));
                    } catch (IOException e2) {
                        e().E().b(as, k3.B(str), e2);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } catch (IOException e3) {
                    e().E().b(bw, k3.B(str), e3);
                }
            } while (i4 <= i3);
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLiteException e4) {
            e().E().b(dm, k3.B(str), e4);
            List<Pair<b61, Long>> emptyList2 = Collections.emptyList();
            if (0 != 0) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0127  */
    public final List<v8> H(String str, String str2, String str3) {
        Throwable th;
        Cursor cursor;
        String str4;
        SQLiteException e2;
        u.g(str);
        j();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(str);
            StringBuilder sb = new StringBuilder(ac);
            if (!TextUtils.isEmpty(str2)) {
                str4 = str2;
                arrayList2.add(str4);
                sb.append(cg);
            } else {
                str4 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList2.add(String.valueOf(str3).concat(aw));
                sb.append(aV);
            }
            cursor = x().query(ay, new String[]{v, cy, ag, ch}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, ab, ar);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                while (true) {
                    if (arrayList.size() >= 1000) {
                        e().E().a(O, Integer.valueOf((int) C0188.f18));
                        break;
                    }
                    String string = cursor.getString(0);
                    long j2 = cursor.getLong(1);
                    try {
                        Object F2 = F(cursor, 2);
                        String string2 = cursor.getString(3);
                        if (F2 == null) {
                            try {
                                e().E().c(bb, k3.B(str), string2, str3);
                            } catch (SQLiteException e3) {
                                e2 = e3;
                                str4 = string2;
                                try {
                                    e().E().c(an, k3.B(str), str4, e2);
                                    if (cursor != null) {
                                        cursor.close();
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
                        } else {
                            arrayList.add(new v8(str, string2, string, j2, F2));
                        }
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        str4 = string2;
                    } catch (SQLiteException e4) {
                        e2 = e4;
                        e().E().c(an, k3.B(str), str4, e2);
                        if (cursor != null) {
                        }
                        return null;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e5) {
                e2 = e5;
                e().E().c(an, k3.B(str), str4, e2);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e6) {
            e2 = e6;
            str4 = str2;
            cursor = null;
            e().E().c(an, k3.B(str), str4, e2);
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th4) {
        }
    }

    public final void J(f fVar) {
        u.k(fVar);
        j();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14740), fVar.a);
        contentValues.put(C0201.m82(14741), fVar.b);
        contentValues.put(C0201.m82(14742), Long.valueOf(fVar.c));
        contentValues.put(C0201.m82(14743), Long.valueOf(fVar.d));
        contentValues.put(C0201.m82(14744), Long.valueOf(fVar.f));
        contentValues.put(C0201.m82(14745), Long.valueOf(fVar.g));
        contentValues.put(C0201.m82(14746), fVar.h);
        contentValues.put(C0201.m82(14747), fVar.i);
        contentValues.put(C0201.m82(14748), fVar.j);
        if (g().G(fVar.a, l.y0)) {
            contentValues.put(C0201.m82(14749), Long.valueOf(fVar.e));
        }
        Boolean bool = fVar.k;
        contentValues.put(C0201.m82(14750), (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (x().insertWithOnConflict(C0201.m82(14751), null, contentValues, 5) == -1) {
                e().E().a(C0201.m82(14752), k3.B(fVar.a));
            }
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14753), k3.B(fVar.a), e2);
        }
    }

    public final void K(f4 f4Var) {
        String r0 = C0201.m82(14754);
        u.k(f4Var);
        j();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14755), f4Var.j());
        contentValues.put(C0201.m82(14756), f4Var.a());
        contentValues.put(C0201.m82(14757), f4Var.c());
        contentValues.put(C0201.m82(14758), f4Var.l());
        contentValues.put(C0201.m82(14759), Long.valueOf(f4Var.u()));
        contentValues.put(C0201.m82(14760), Long.valueOf(f4Var.m()));
        contentValues.put(C0201.m82(14761), Long.valueOf(f4Var.n()));
        contentValues.put(C0201.m82(14762), f4Var.o());
        contentValues.put(C0201.m82(14763), f4Var.q());
        contentValues.put(C0201.m82(14764), Long.valueOf(f4Var.r()));
        contentValues.put(C0201.m82(14765), Long.valueOf(f4Var.s()));
        contentValues.put(C0201.m82(14766), Boolean.valueOf(f4Var.d()));
        contentValues.put(C0201.m82(14767), Long.valueOf(f4Var.y()));
        contentValues.put(C0201.m82(14768), Long.valueOf(f4Var.z()));
        contentValues.put(C0201.m82(14769), Long.valueOf(f4Var.A()));
        contentValues.put(C0201.m82(14770), Long.valueOf(f4Var.B()));
        contentValues.put(C0201.m82(14771), Long.valueOf(f4Var.v()));
        contentValues.put(C0201.m82(14772), Long.valueOf(f4Var.w()));
        contentValues.put(C0201.m82(14773), Long.valueOf(f4Var.p()));
        contentValues.put(C0201.m82(14774), f4Var.b());
        contentValues.put(C0201.m82(14775), Long.valueOf(f4Var.F()));
        contentValues.put(C0201.m82(14776), Long.valueOf(f4Var.C()));
        contentValues.put(C0201.m82(14777), f4Var.G());
        contentValues.put(C0201.m82(14778), Long.valueOf(f4Var.I()));
        contentValues.put(C0201.m82(14779), Boolean.valueOf(f4Var.J()));
        contentValues.put(C0201.m82(14780), Boolean.valueOf(f4Var.K()));
        contentValues.put(C0201.m82(14781), f4Var.k());
        contentValues.put(C0201.m82(14782), Long.valueOf(f4Var.t()));
        if (f4Var.M() != null) {
            if (f4Var.M().size() == 0) {
                e().H().a(C0201.m82(14783), f4Var.j());
            } else {
                contentValues.put(C0201.m82(14785), TextUtils.join(C0201.m82(14784), f4Var.M()));
            }
        }
        try {
            SQLiteDatabase x2 = x();
            if (((long) x2.update(r0, contentValues, C0201.m82(14786), new String[]{f4Var.j()})) == 0 && x2.insertWithOnConflict(r0, null, contentValues, 5) == -1) {
                e().E().a(C0201.m82(14787), k3.B(f4Var.j()));
            }
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14788), k3.B(f4Var.j()), e2);
        }
    }

    public final void L(String str, h61[] h61Arr) {
        boolean z2;
        String str2 = z;
        String str3 = n;
        String str4 = df;
        String str5 = ds;
        t();
        j();
        u.g(str);
        u.k(h61Arr);
        SQLiteDatabase x2 = x();
        x2.beginTransaction();
        try {
            t();
            j();
            u.g(str);
            SQLiteDatabase x3 = x();
            x3.delete(str5, str4, new String[]{str});
            x3.delete(str3, str4, new String[]{str});
            for (h61 h61 : h61Arr) {
                t();
                j();
                u.g(str);
                u.k(h61);
                u.k(h61.e);
                u.k(h61.d);
                if (h61.c == null) {
                    e().H().a(bc, k3.B(str));
                } else {
                    int intValue = h61.c.intValue();
                    l51[] l51Arr = h61.e;
                    int length = l51Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            o51[] o51Arr = h61.d;
                            int length2 = o51Arr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    l51[] l51Arr2 = h61.e;
                                    int length3 = l51Arr2.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= length3) {
                                            z2 = true;
                                            break;
                                        } else if (!Q(str, intValue, l51Arr2[i4])) {
                                            z2 = false;
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (z2) {
                                        o51[] o51Arr2 = h61.d;
                                        int length4 = o51Arr2.length;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length4) {
                                                break;
                                            } else if (!R(str, intValue, o51Arr2[i5])) {
                                                z2 = false;
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        t();
                                        j();
                                        u.g(str);
                                        SQLiteDatabase x4 = x();
                                        x4.delete(str5, str2, new String[]{str, String.valueOf(intValue)});
                                        x4.delete(str3, str2, new String[]{str, String.valueOf(intValue)});
                                    }
                                } else if (!o51Arr[i3].I()) {
                                    e().H().b(aq, k3.B(str), h61.c);
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        } else if (!l51Arr[i2].M()) {
                            e().H().b(dq, k3.B(str), h61.c);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (h61 h612 : h61Arr) {
                arrayList.add(h612.c);
            }
            T(str, arrayList);
            x2.setTransactionSuccessful();
        } finally {
            x2.endTransaction();
        }
    }

    public final boolean M(b61 b61, boolean z2) {
        j();
        t();
        u.k(b61);
        u.g(b61.U());
        u.n(b61.Q1());
        h0();
        long a = b().a();
        if (b61.F1() < a - i9.y() || b61.F1() > i9.y() + a) {
            e().H().c(C0201.m82(14789), k3.B(b61.U()), Long.valueOf(a), Long.valueOf(b61.F1()));
        }
        try {
            byte[] R2 = n().R(b61.h());
            e().M().a(C0201.m82(14790), Integer.valueOf(R2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(C0201.m82(14791), b61.U());
            contentValues.put(C0201.m82(14792), Long.valueOf(b61.F1()));
            contentValues.put(C0201.m82(14793), R2);
            contentValues.put(C0201.m82(14794), Integer.valueOf(z2 ? 1 : 0));
            if (b61.z2()) {
                contentValues.put(C0201.m82(14795), Integer.valueOf(b61.A2()));
            }
            try {
                if (x().insert(C0201.m82(14796), null, contentValues) != -1) {
                    return true;
                }
                e().E().a(C0201.m82(14797), k3.B(b61.U()));
                return false;
            } catch (SQLiteException e2) {
                e().E().b(C0201.m82(14798), k3.B(b61.U()), e2);
                return false;
            }
        } catch (IOException e3) {
            e().E().b(C0201.m82(14799), k3.B(b61.U()), e3);
            return false;
        }
    }

    public final boolean N(g gVar, long j2, boolean z2) {
        j();
        t();
        u.k(gVar);
        u.g(gVar.a);
        x51.a e0 = x51.e0();
        e0.C(gVar.e);
        Iterator<String> it = gVar.f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            z51.a Y2 = z51.Y();
            Y2.w(next);
            n().F(Y2, gVar.f.o(next));
            e0.y(Y2);
        }
        byte[] h2 = ((x51) ((l91) e0.G0())).h();
        e().M().b(C0201.m82(14800), l().v(gVar.b), Integer.valueOf(h2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14801), gVar.a);
        contentValues.put(C0201.m82(14802), gVar.b);
        contentValues.put(C0201.m82(14803), Long.valueOf(gVar.d));
        contentValues.put(C0201.m82(14804), Long.valueOf(j2));
        contentValues.put(C0201.m82(14805), h2);
        contentValues.put(C0201.m82(14806), Integer.valueOf(z2 ? 1 : 0));
        try {
            if (x().insert(C0201.m82(14807), null, contentValues) != -1) {
                return true;
            }
            e().E().a(C0201.m82(14808), k3.B(gVar.a));
            return false;
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14809), k3.B(gVar.a), e2);
            return false;
        }
    }

    public final boolean O(v8 v8Var) {
        u.k(v8Var);
        j();
        t();
        if (x0(v8Var.a, v8Var.c) == null) {
            if (y8.Y(v8Var.c)) {
                if (A(C0201.m82(14810), new String[]{v8Var.a}) >= 25) {
                    return false;
                }
            } else {
                boolean G2 = g().G(v8Var.a, l.j0);
                String r6 = C0201.m82(14811);
                if (G2) {
                    if (!C0201.m82(14812).equals(v8Var.c)) {
                        if (A(r6, new String[]{v8Var.a, v8Var.b}) >= 25) {
                            return false;
                        }
                    }
                } else {
                    if (A(r6, new String[]{v8Var.a, v8Var.b}) >= 25) {
                        return false;
                    }
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14813), v8Var.a);
        contentValues.put(C0201.m82(14814), v8Var.b);
        contentValues.put(C0201.m82(14815), v8Var.c);
        contentValues.put(C0201.m82(14816), Long.valueOf(v8Var.d));
        I(contentValues, C0201.m82(14817), v8Var.e);
        try {
            if (x().insertWithOnConflict(C0201.m82(14818), null, contentValues, 5) == -1) {
                e().E().a(C0201.m82(14819), k3.B(v8Var.a));
            }
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14820), k3.B(v8Var.a), e2);
        }
        return true;
    }

    public final boolean P(g9 g9Var) {
        u.k(g9Var);
        j();
        t();
        if (x0(g9Var.a, g9Var.c.b) == null) {
            if (A(C0201.m82(14821), new String[]{g9Var.a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14822), g9Var.a);
        contentValues.put(C0201.m82(14823), g9Var.b);
        contentValues.put(C0201.m82(14824), g9Var.c.b);
        I(contentValues, C0201.m82(14825), g9Var.c.o());
        contentValues.put(C0201.m82(14826), Boolean.valueOf(g9Var.e));
        contentValues.put(C0201.m82(14827), g9Var.f);
        contentValues.put(C0201.m82(14828), Long.valueOf(g9Var.h));
        m();
        contentValues.put(C0201.m82(14829), y8.P(g9Var.g));
        contentValues.put(C0201.m82(14830), Long.valueOf(g9Var.d));
        m();
        contentValues.put(C0201.m82(14831), y8.P(g9Var.i));
        contentValues.put(C0201.m82(14832), Long.valueOf(g9Var.c.c));
        contentValues.put(C0201.m82(14833), Long.valueOf(g9Var.j));
        m();
        contentValues.put(C0201.m82(14834), y8.P(g9Var.k));
        try {
            if (x().insertWithOnConflict(C0201.m82(14835), null, contentValues, 5) == -1) {
                e().E().a(C0201.m82(14836), k3.B(g9Var.a));
            }
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14837), k3.B(g9Var.a), e2);
        }
        return true;
    }

    public final boolean S(String str, Long l2, long j2, x51 x51) {
        j();
        t();
        u.k(x51);
        u.g(str);
        u.k(l2);
        byte[] h2 = x51.h();
        e().M().b(C0201.m82(14838), l().v(str), Integer.valueOf(h2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14839), str);
        contentValues.put(C0201.m82(14840), l2);
        contentValues.put(C0201.m82(14841), Long.valueOf(j2));
        contentValues.put(C0201.m82(14842), h2);
        try {
            if (x().insertWithOnConflict(C0201.m82(14843), null, contentValues, 5) != -1) {
                return true;
            }
            e().E().a(C0201.m82(14844), k3.B(str));
            return false;
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14845), k3.B(str), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    public final List<v8> U(String str) {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        u.g(str);
        j();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            cursor = x().query(di, new String[]{bo, ad, y, U}, cw, new String[]{str}, null, null, cs, bh);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = cr;
                    }
                    long j2 = cursor.getLong(2);
                    Object F2 = F(cursor, 3);
                    if (F2 == null) {
                        e().E().a(aE, k3.B(str));
                    } else {
                        arrayList.add(new v8(str, string2, string, j2, F2));
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e3) {
                e2 = e3;
                try {
                    e().E().b(cu, k3.B(str), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursor = null;
            e().E().b(cu, k3.B(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0119 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x011d A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0153 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0155 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0164 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0179 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0195 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0196 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a5 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c0 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0204  */
    public final f4 V(String str) {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        boolean z2;
        boolean z3;
        u.g(str);
        j();
        t();
        Cursor cursor2 = null;
        try {
            boolean z4 = true;
            cursor = x().query(bs, new String[]{ax, az, G, dc, co, ao, x, ck, dl, cn, u, cz, cv, ct, V, ai, bt, X, dt, Y, aX, Z, ah, aR, db, bp, T, aP}, cA, new String[]{str}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                try {
                    f4 f4Var = new f4(this.b.g0(), str);
                    f4Var.g(cursor.getString(0));
                    f4Var.D(cursor.getString(1));
                    f4Var.P(cursor.getString(2));
                    f4Var.a0(cursor.getLong(3));
                    f4Var.Q(cursor.getLong(4));
                    f4Var.S(cursor.getLong(5));
                    f4Var.T(cursor.getString(6));
                    f4Var.V(cursor.getString(7));
                    f4Var.W(cursor.getLong(8));
                    f4Var.Y(cursor.getLong(9));
                    if (!cursor.isNull(10)) {
                        if (cursor.getInt(10) == 0) {
                            z2 = false;
                            f4Var.e(z2);
                            f4Var.d0(cursor.getLong(11));
                            f4Var.e0(cursor.getLong(12));
                            f4Var.f0(cursor.getLong(13));
                            f4Var.g0(cursor.getLong(14));
                            f4Var.b0(cursor.getLong(15));
                            f4Var.c0(cursor.getLong(16));
                            f4Var.U(!cursor.isNull(17) ? -2147483648L : (long) cursor.getInt(17));
                            f4Var.R(cursor.getString(18));
                            f4Var.i0(cursor.getLong(19));
                            f4Var.h0(cursor.getLong(20));
                            f4Var.X(cursor.getString(21));
                            long j2 = 0;
                            f4Var.j0(!cursor.isNull(22) ? 0 : cursor.getLong(22));
                            if (!cursor.isNull(23)) {
                                if (cursor.getInt(23) == 0) {
                                    z3 = false;
                                    f4Var.E(z3);
                                    if (!cursor.isNull(24)) {
                                        if (cursor.getInt(24) == 0) {
                                            z4 = false;
                                        }
                                    }
                                    f4Var.O(z4);
                                    f4Var.N(cursor.getString(25));
                                    if (!cursor.isNull(26)) {
                                        j2 = cursor.getLong(26);
                                    }
                                    f4Var.Z(j2);
                                    if (!cursor.isNull(27)) {
                                        f4Var.h(Arrays.asList(cursor.getString(27).split(L, -1)));
                                    }
                                    f4Var.i();
                                    if (cursor.moveToNext()) {
                                        e().E().a(bn, k3.B(str));
                                    }
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return f4Var;
                                }
                            }
                            z3 = true;
                            f4Var.E(z3);
                            if (!cursor.isNull(24)) {
                            }
                            f4Var.O(z4);
                            f4Var.N(cursor.getString(25));
                            if (!cursor.isNull(26)) {
                            }
                            f4Var.Z(j2);
                            if (!cursor.isNull(27)) {
                            }
                            f4Var.i();
                            if (cursor.moveToNext()) {
                            }
                            if (cursor != null) {
                            }
                            return f4Var;
                        }
                    }
                    z2 = true;
                    f4Var.e(z2);
                    f4Var.d0(cursor.getLong(11));
                    f4Var.e0(cursor.getLong(12));
                    f4Var.f0(cursor.getLong(13));
                    f4Var.g0(cursor.getLong(14));
                    f4Var.b0(cursor.getLong(15));
                    f4Var.c0(cursor.getLong(16));
                    f4Var.U(!cursor.isNull(17) ? -2147483648L : (long) cursor.getInt(17));
                    f4Var.R(cursor.getString(18));
                    f4Var.i0(cursor.getLong(19));
                    f4Var.h0(cursor.getLong(20));
                    f4Var.X(cursor.getString(21));
                    long j22 = 0;
                    f4Var.j0(!cursor.isNull(22) ? 0 : cursor.getLong(22));
                    if (!cursor.isNull(23)) {
                    }
                    z3 = true;
                    f4Var.E(z3);
                    if (!cursor.isNull(24)) {
                    }
                    f4Var.O(z4);
                    f4Var.N(cursor.getString(25));
                    if (!cursor.isNull(26)) {
                    }
                    f4Var.Z(j22);
                    if (!cursor.isNull(27)) {
                    }
                    f4Var.i();
                    if (cursor.moveToNext()) {
                    }
                    if (cursor != null) {
                    }
                    return f4Var;
                } catch (SQLiteException e3) {
                    e2 = e3;
                    try {
                        e().E().b(M, k3.B(str), e2);
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
            } catch (SQLiteException e4) {
                e2 = e4;
                e().E().b(M, k3.B(str), e2);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            cursor = null;
            e().E().b(M, k3.B(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final long W(String str) {
        u.g(str);
        j();
        t();
        try {
            SQLiteDatabase x2 = x();
            String valueOf = String.valueOf(Math.max(0, Math.min(1000000, g().r(str, l.u))));
            return (long) x2.delete(C0201.m82(14846), C0201.m82(14847), new String[]{str, valueOf});
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14848), k3.B(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    public final byte[] X(String str) {
        Throwable th;
        SQLiteException e2;
        Cursor cursor;
        u.g(str);
        j();
        t();
        Cursor cursor2 = null;
        try {
            cursor = x().query(C0201.m82(14849), new String[]{C0201.m82(14850)}, C0201.m82(14851), new String[]{str}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                byte[] blob = cursor.getBlob(0);
                if (cursor.moveToNext()) {
                    e().E().a(C0201.m82(14852), k3.B(str));
                }
                if (cursor != null) {
                    cursor.close();
                }
                return blob;
            } catch (SQLiteException e3) {
                e2 = e3;
                try {
                    e().E().b(C0201.m82(14853), k3.B(str), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursor = null;
            e().E().b(C0201.m82(14853), k3.B(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    public final Map<Integer, List<Integer>> Y(String str) {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        t();
        j();
        u.g(str);
        r0 r0Var = new r0();
        Cursor cursor2 = null;
        try {
            cursor = x().rawQuery(C0201.m82(14854), new String[]{str, str});
            try {
                if (!cursor.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap;
                }
                do {
                    int i2 = cursor.getInt(0);
                    List list = (List) r0Var.get(Integer.valueOf(i2));
                    if (list == null) {
                        list = new ArrayList();
                        r0Var.put(Integer.valueOf(i2), list);
                    }
                    list.add(Integer.valueOf(cursor.getInt(1)));
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return r0Var;
            } catch (SQLiteException e3) {
                e2 = e3;
                try {
                    e().E().b(C0201.m82(14855), k3.B(str), e2);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursor = null;
            e().E().b(C0201.m82(14855), k3.B(str), e2);
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    public final Map<Integer, d61> Z(String str) {
        Throwable th;
        SQLiteException e2;
        Cursor cursor;
        t();
        j();
        u.g(str);
        Cursor cursor2 = null;
        try {
            cursor = x().query(C0201.m82(14856), new String[]{C0201.m82(14857), C0201.m82(14858)}, C0201.m82(14859), new String[]{str}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                r0 r0Var = new r0();
                do {
                    int i2 = cursor.getInt(0);
                    try {
                        r0Var.put(Integer.valueOf(i2), d61.P(cursor.getBlob(1), y81.e()));
                    } catch (IOException e3) {
                        e().E().c(C0201.m82(14860), k3.B(str), Integer.valueOf(i2), e3);
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return r0Var;
            } catch (SQLiteException e4) {
                e2 = e4;
                try {
                    e().E().b(C0201.m82(14861), k3.B(str), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            cursor = null;
            e().E().b(C0201.m82(14861), k3.B(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final long a0(String str) {
        u.g(str);
        return B(C0201.m82(14862), new String[]{str}, 0);
    }

    public final List<g9> b0(String str, String str2, String str3) {
        u.g(str);
        j();
        t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder(C0201.m82(14863));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(C0201.m82(14864));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(C0201.m82(14865)));
            sb.append(C0201.m82(14866));
        }
        return c0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<g9> c0(String str, String[] strArr) {
        j();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = x().query(J, new String[]{aM, f50cl, av, bj, ce, ci, al, bd, dk, cc, af, ak, aC}, str, strArr, null, null, be, bi);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z2 = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object F2 = F(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z2 = true;
                    }
                    String string4 = cursor.getString(5);
                    long j2 = cursor.getLong(6);
                    long j3 = cursor.getLong(8);
                    arrayList.add(new g9(string, string2, new t8(string3, cursor.getLong(10), F2, string2), j3, z2, string4, (j) n().w(cursor.getBlob(7), j.CREATOR), j2, (j) n().w(cursor.getBlob(9), j.CREATOR), cursor.getLong(11), (j) n().w(cursor.getBlob(12), j.CREATOR)));
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    e().E().a(bv, Integer.valueOf((int) C0188.f18));
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            e().E().a(aI, e2);
            List<g9> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void d0(List<Long> list) {
        j();
        t();
        u.k(list);
        u.m(list.size());
        if (n0()) {
            String join = TextUtils.join(C0201.m82(14867), list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append(C0201.m82(14868));
            sb.append(join);
            sb.append(C0201.m82(14869));
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append(C0201.m82(14870));
            sb3.append(sb2);
            sb3.append(C0201.m82(14871));
            if (A(sb3.toString(), null) > 0) {
                e().H().d(C0201.m82(14872));
            }
            try {
                SQLiteDatabase x2 = x();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append(C0201.m82(14873));
                sb4.append(sb2);
                sb4.append(C0201.m82(14874));
                x2.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                e().E().a(C0201.m82(14875), e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    public final String e0() {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        try {
            cursor = x().rawQuery(C0201.m82(14876), null);
            try {
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e2 = e3;
                try {
                    e().E().a(C0201.m82(14877), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursor = null;
            e().E().a(C0201.m82(14877), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean f0() {
        return A(C0201.m82(14878), null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0163  */
    public final f g0(String str, String str2) {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        Cursor cursor2;
        Boolean bool;
        u.g(str);
        u.g(str2);
        j();
        t();
        boolean G2 = g().G(str, l.y0);
        ArrayList arrayList = new ArrayList(Arrays.asList(aT, q, B, aB, bk, c, dd, at));
        if (G2) {
            arrayList.add(f1do);
        }
        Cursor cursor3 = null;
        try {
            boolean z2 = false;
            cursor = x().query(aW, (String[]) arrayList.toArray(new String[0]), bu, new String[]{str, str2}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                long j2 = cursor.getLong(0);
                long j3 = cursor.getLong(1);
                long j4 = cursor.getLong(2);
                long j5 = 0;
                long j6 = cursor.isNull(3) ? 0 : cursor.getLong(3);
                Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
                Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
                Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
                if (!cursor.isNull(7)) {
                    try {
                        if (cursor.getLong(7) == 1) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                    } catch (SQLiteException e3) {
                        e2 = e3;
                        try {
                            e().E().c(bf, k3.B(str), l().v(str2), e2);
                            if (cursor != null) {
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor3 = cursor;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    bool = null;
                }
                if (G2 && !cursor.isNull(8)) {
                    j5 = cursor.getLong(8);
                }
                cursor2 = cursor;
                try {
                    f fVar = new f(str, str2, j2, j3, j5, j4, j6, valueOf, valueOf2, valueOf3, bool);
                    if (cursor2.moveToNext()) {
                        e().E().a(aD, k3.B(str));
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return fVar;
                } catch (SQLiteException e4) {
                    e2 = e4;
                    cursor = cursor2;
                    e().E().c(bf, k3.B(str), l().v(str2), e2);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e5) {
                e2 = e5;
                e().E().c(bf, k3.B(str), l().v(str2), e2);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
                cursor3 = cursor2;
                if (cursor3 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e6) {
            e2 = e6;
            cursor = null;
            e().E().c(bf, k3.B(str), l().v(str2), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th5) {
            th = th5;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    public final void h0() {
        int delete;
        j();
        t();
        if (n0()) {
            long a = f().h.a();
            long b = b().b();
            if (Math.abs(b - a) > l.D.a(null).longValue()) {
                f().h.b(b);
                j();
                t();
                if (n0() && (delete = x().delete(C0201.m82(14879), C0201.m82(14880), new String[]{String.valueOf(b().a()), String.valueOf(i9.y())})) > 0) {
                    e().M().a(C0201.m82(14881), Integer.valueOf(delete));
                }
            }
        }
    }

    public final long i0() {
        return B(C0201.m82(14882), null, 0);
    }

    public final long j0() {
        return B(C0201.m82(14883), null, 0);
    }

    public final boolean k0() {
        return A(C0201.m82(14884), null) != 0;
    }

    public final boolean l0() {
        return A(C0201.m82(14885), null) != 0;
    }

    public final long m0() {
        Cursor cursor = null;
        try {
            cursor = x().rawQuery(C0201.m82(14886), null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j2 = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            e().E().a(C0201.m82(14887), e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.n8
    public final boolean u() {
        return false;
    }

    public final void v() {
        t();
        x().beginTransaction();
    }

    public final void w() {
        t();
        x().endTransaction();
    }

    public final void w0(String str, String str2) {
        u.g(str);
        u.g(str2);
        j();
        t();
        try {
            e().M().a(C0201.m82(14890), Integer.valueOf(x().delete(C0201.m82(14888), C0201.m82(14889), new String[]{str, str2})));
        } catch (SQLiteException e2) {
            e().E().c(C0201.m82(14891), k3.B(str), l().x(str2), e2);
        }
    }

    public final SQLiteDatabase x() {
        j();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e2) {
            e().H().a(C0201.m82(14892), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    public final v8 x0(String str, String str2) {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        u.g(str);
        u.g(str2);
        j();
        t();
        Cursor cursor2 = null;
        try {
            cursor = x().query(t, new String[]{aS, bq, bA}, N, new String[]{str, str2}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                try {
                    v8 v8Var = new v8(str, cursor.getString(2), str2, cursor.getLong(0), F(cursor, 1));
                    if (cursor.moveToNext()) {
                        e().E().a(aK, k3.B(str));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return v8Var;
                } catch (SQLiteException e3) {
                    e2 = e3;
                    try {
                        e().E().c(D, k3.B(str), l().x(str2), e2);
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
            } catch (SQLiteException e4) {
                e2 = e4;
                e().E().c(D, k3.B(str), l().x(str2), e2);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            cursor = null;
            e().E().c(D, k3.B(str), l().x(str2), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final void y() {
        t();
        x().setTransactionSuccessful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0125  */
    public final g9 y0(String str, String str2) {
        Throwable th;
        Cursor cursor;
        SQLiteException e2;
        u.g(str);
        u.g(str2);
        j();
        t();
        Cursor cursor2 = null;
        try {
            cursor = x().query(ae, new String[]{Q, aJ, ap, E, o, A, aF, P, bl, p, K}, S, new String[]{str, str2}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                String string = cursor.getString(0);
                try {
                    Object F2 = F(cursor, 1);
                    boolean z2 = cursor.getInt(2) != 0;
                    g9 g9Var = new g9(str, string, new t8(str2, cursor.getLong(8), F2, string), cursor.getLong(6), z2, cursor.getString(3), (j) n().w(cursor.getBlob(5), j.CREATOR), cursor.getLong(4), (j) n().w(cursor.getBlob(7), j.CREATOR), cursor.getLong(9), (j) n().w(cursor.getBlob(10), j.CREATOR));
                    if (cursor.moveToNext()) {
                        e().E().b(bx, k3.B(str), l().x(str2));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return g9Var;
                } catch (SQLiteException e3) {
                    e2 = e3;
                    try {
                        e().E().c(C, k3.B(str), l().x(str2), e2);
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
            } catch (SQLiteException e4) {
                e2 = e4;
                e().E().c(C, k3.B(str), l().x(str2), e2);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            cursor = null;
            e().E().c(C, k3.B(str), l().x(str2), e2);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final long z(b61 b61) throws IOException {
        j();
        t();
        u.k(b61);
        u.g(b61.U());
        byte[] h2 = b61.h();
        long v2 = n().v(h2);
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0201.m82(14893), b61.U());
        contentValues.put(C0201.m82(14894), Long.valueOf(v2));
        contentValues.put(C0201.m82(14895), h2);
        try {
            x().insertWithOnConflict(C0201.m82(14896), null, contentValues, 4);
            return v2;
        } catch (SQLiteException e2) {
            e().E().b(C0201.m82(14897), k3.B(b61.U()), e2);
            throw e2;
        }
    }

    public final int z0(String str, String str2) {
        u.g(str);
        u.g(str2);
        j();
        t();
        try {
            return x().delete(C0201.m82(14898), C0201.m82(14899), new String[]{str, str2});
        } catch (SQLiteException e2) {
            e().E().c(C0201.m82(14900), k3.B(str), l().x(str2), e2);
            return 0;
        }
    }
}
