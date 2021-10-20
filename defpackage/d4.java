package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: d4  reason: default package */
/* compiled from: CursorFilter */
public class d4 extends Filter {
    public a a;

    /* renamed from: d4$a */
    /* compiled from: CursorFilter */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    public d4(a aVar) {
        this.a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
            filterResults.values = d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.a.a((Cursor) obj);
        }
    }
}
