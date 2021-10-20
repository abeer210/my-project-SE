package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import defpackage.d4;
import vigqyno.C0201;

/* renamed from: c4  reason: default package */
/* compiled from: CursorAdapter */
public abstract class c4 extends BaseAdapter implements Filterable, d4.a {
    public boolean a;
    public boolean b;
    public Cursor c;
    public Context d;
    public int e;
    public a f;
    public DataSetObserver g;
    public d4 h;

    /* access modifiers changed from: private */
    /* renamed from: c4$a */
    /* compiled from: CursorAdapter */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            c4.this.i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c4$b */
    /* compiled from: CursorAdapter */
    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            c4 c4Var = c4.this;
            c4Var.a = true;
            c4Var.notifyDataSetChanged();
        }

        public void onInvalidated() {
            c4 c4Var = c4.this;
            c4Var.a = false;
            c4Var.notifyDataSetInvalidated();
        }
    }

    public c4(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    @Override // defpackage.d4.a
    public void a(Cursor cursor) {
        Cursor j = j(cursor);
        if (j != null) {
            j.close();
        }
    }

    @Override // defpackage.d4.a
    public Cursor b() {
        return this.c;
    }

    @Override // defpackage.d4.a
    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.b = true;
        } else {
            this.b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.c = cursor;
        this.a = z;
        this.d = context;
        this.e = z ? cursor.getColumnIndexOrThrow(C0201.m82(3988)) : -1;
        if ((i & 2) == 2) {
            this.f = new a();
            this.g = new b();
        } else {
            this.f = null;
            this.g = null;
        }
        if (z) {
            a aVar = this.f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            view = g(this.d, this.c, viewGroup);
        }
        e(view, this.d, this.c);
        return view;
    }

    public Filter getFilter() {
        if (this.h == null) {
            this.h = new d4(this);
        }
        return this.h;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.c.getLong(this.e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException(C0201.m82(3990));
        } else if (this.c.moveToPosition(i)) {
            if (view == null) {
                view = h(this.d, this.c, viewGroup);
            }
            e(view, this.d, this.c);
            return view;
        } else {
            throw new IllegalStateException(C0201.m82(3989) + i);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (this.b && (cursor = this.c) != null && !cursor.isClosed()) {
            this.a = this.c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.c = cursor;
        if (cursor != null) {
            a aVar2 = this.f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.e = cursor.getColumnIndexOrThrow(C0201.m82(3991));
            this.a = true;
            notifyDataSetChanged();
        } else {
            this.e = -1;
            this.a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
