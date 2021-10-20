package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.a;
import defpackage.u4;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: t4  reason: default package */
/* compiled from: CursorLoader */
public class t4 extends s4<Cursor> {
    public final u4<Cursor>.a p = new u4.a();
    public Uri q;
    public String[] r;
    public String s;
    public String[] t;
    public String u;
    public Cursor v;
    public c2 w;

    public t4(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.q = uri;
        this.r = strArr;
        this.s = str;
        this.t = strArr2;
        this.u = str2;
    }

    @Override // defpackage.s4
    public void B() {
        super.B();
        synchronized (this) {
            if (this.w != null) {
                this.w.a();
            }
        }
    }

    /* renamed from: J */
    public void g(Cursor cursor) {
        if (!l()) {
            Cursor cursor2 = this.v;
            this.v = cursor;
            if (m()) {
                super.g(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: K */
    public Cursor G() {
        synchronized (this) {
            if (!F()) {
                this.w = new c2();
            } else {
                throw new d2();
            }
        }
        try {
            Cursor a = a.a(j().getContentResolver(), this.q, this.r, this.s, this.t, this.u, this.w);
            if (a != null) {
                try {
                    a.getCount();
                    a.registerContentObserver(this.p);
                } catch (RuntimeException e) {
                    a.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.w = null;
            }
            return a;
        } catch (Throwable th) {
            synchronized (this) {
                this.w = null;
                throw th;
            }
        }
    }

    /* renamed from: L */
    public void H(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    @Override // defpackage.s4, defpackage.u4
    @Deprecated
    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print(C0201.m82(3725));
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print(C0201.m82(3726));
        printWriter.println(Arrays.toString(this.r));
        printWriter.print(str);
        printWriter.print(C0201.m82(3727));
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print(C0201.m82(3728));
        printWriter.println(Arrays.toString(this.t));
        printWriter.print(str);
        printWriter.print(C0201.m82(3729));
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print(C0201.m82(3730));
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print(C0201.m82(3731));
        printWriter.println(this.h);
    }

    @Override // defpackage.u4
    public void r() {
        super.r();
        t();
        Cursor cursor = this.v;
        if (cursor != null && !cursor.isClosed()) {
            this.v.close();
        }
        this.v = null;
    }

    @Override // defpackage.u4
    public void s() {
        Cursor cursor = this.v;
        if (cursor != null) {
            g(cursor);
        }
        if (z() || this.v == null) {
            i();
        }
    }

    @Override // defpackage.u4
    public void t() {
        c();
    }
}
