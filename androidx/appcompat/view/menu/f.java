package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class f extends BaseAdapter {
    public g a;
    private int b = -1;
    private boolean c;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = gVar;
        this.f = i;
        a();
    }

    public void a() {
        i v = this.a.v();
        if (v != null) {
            ArrayList<i> z = this.a.z();
            int size = z.size();
            for (int i = 0; i < size; i++) {
                if (z.get(i) == v) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public g b() {
        return this.a;
    }

    /* renamed from: c */
    public i getItem(int i) {
        ArrayList<i> z = this.d ? this.a.z() : this.a.E();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return z.get(i);
    }

    public void d(boolean z) {
        this.c = z;
    }

    public int getCount() {
        ArrayList<i> z = this.d ? this.a.z() : this.a.E();
        if (this.b < 0) {
            return z.size();
        }
        return z.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.a.F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.f(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
