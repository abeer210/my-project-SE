package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import vigqyno.C0201;

/* compiled from: LayoutState */
public class f {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f = 0;
    public int g = 0;
    public boolean h;
    public boolean i;

    public boolean a(RecyclerView.a0 a0Var) {
        int i2 = this.c;
        return i2 >= 0 && i2 < a0Var.b();
    }

    public View b(RecyclerView.v vVar) {
        View o = vVar.o(this.c);
        this.c += this.d;
        return o;
    }

    public String toString() {
        return C0201.m82(15414) + this.b + C0201.m82(15415) + this.c + C0201.m82(15416) + this.d + C0201.m82(15417) + this.e + C0201.m82(15418) + this.f + C0201.m82(15419) + this.g + '}';
    }
}
