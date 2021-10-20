package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

public class AlertController {
    public NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    public ListAdapter H;
    public int I = -1;
    private int J;
    private int K;
    public int L;
    public int M;
    public int N;
    public int O;
    private boolean P;
    private int Q = 0;
    public Handler R;
    private final View.OnClickListener S = new a();
    private final Context a;
    public final g b;
    private final Window c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    public ListView g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n = false;
    public Button o;
    private CharSequence p;
    public Message q;
    private Drawable r;
    public Button s;
    private CharSequence t;
    public Message u;
    private Drawable v;
    public Button w;
    private CharSequence x;
    public Message y;
    private Drawable z;

    public static class RecycleListView extends ListView {
        private final int a;
        private final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.RecycleListView);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(m.RecycleListView_paddingBottomNoButtons, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(m.RecycleListView_paddingTopNoTitle, -1);
        }

        public void a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.a, getPaddingRight(), z2 ? getPaddingBottom() : this.b);
            }
        }
    }

    class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Message message;
            w30.g(view);
            try {
                if (view == AlertController.this.o && AlertController.this.q != null) {
                    message = Message.obtain(AlertController.this.q);
                } else if (view != AlertController.this.s || AlertController.this.u == null) {
                    message = (view != AlertController.this.w || AlertController.this.y == null) ? null : Message.obtain(AlertController.this.y);
                } else {
                    message = Message.obtain(AlertController.this.u);
                }
                if (message != null) {
                    message.sendToTarget();
                }
                AlertController.this.R.obtainMessage(1, AlertController.this.b).sendToTarget();
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements NestedScrollView.b {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        public b(AlertController alertController, View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.f(nestedScrollView, this.a, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        public c(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.A, this.a, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements AbsListView.OnScrollListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        public d(AlertController alertController, View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.f(absListView, this.a, this.b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        public e(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.g, this.a, this.b);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;
        public final Context a;
        public final LayoutInflater b;
        public int c = 0;
        public Drawable d;
        public int e = 0;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public boolean r;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        /* access modifiers changed from: package-private */
        public class a extends ArrayAdapter<CharSequence> {
            public final /* synthetic */ RecycleListView a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.a = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i]) {
                    this.a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends CursorAdapter {
            private final int a;
            private final int b;
            public final /* synthetic */ RecycleListView c;
            public final /* synthetic */ AlertController d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.c = recycleListView;
                this.d = alertController;
                Cursor cursor2 = getCursor();
                this.a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.a));
                RecycleListView recycleListView = this.c;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.b.inflate(this.d.M, viewGroup, false);
            }
        }

        /* access modifiers changed from: package-private */
        public class c implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AlertController a;

            public c(AlertController alertController) {
                this.a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w30.l(view, i);
                try {
                    f.this.x.onClick(this.a.b, i);
                    if (!f.this.H) {
                        this.a.b.dismiss();
                    }
                } finally {
                    w30.m();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public class d implements AdapterView.OnItemClickListener {
            public final /* synthetic */ RecycleListView a;
            public final /* synthetic */ AlertController b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.a = recycleListView;
                this.b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w30.l(view, i);
                try {
                    if (f.this.F != null) {
                        f.this.F[i] = this.a.isItemChecked(i);
                    }
                    f.this.J.onClick(this.b.b, i, this.a.isItemChecked(i));
                } finally {
                    w30.m();
                }
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.a = context;
            this.r = true;
            this.b = (LayoutInflater) context.getSystemService(C0201.m82(2296));
        }

        private void b(AlertController alertController) {
            ListAdapter listAdapter;
            int i2;
            RecycleListView recycleListView = (RecycleListView) this.b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                if (this.H) {
                    i2 = alertController.N;
                } else {
                    i2 = alertController.O;
                }
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.a, i2, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.a, i2, 16908308, this.v);
                    }
                }
            } else if (this.K == null) {
                listAdapter = new a(this.a, alertController.M, 16908308, this.v, recycleListView);
            } else {
                listAdapter = new b(this.a, this.K, false, recycleListView, alertController);
            }
            e eVar = this.O;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i2 = this.c;
                if (i2 != 0) {
                    alertController.m(i2);
                }
                int i3 = this.e;
                if (i3 != 0) {
                    alertController.m(alertController.c(i3));
                }
            }
            CharSequence charSequence2 = this.h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            if (!(this.i == null && this.j == null)) {
                alertController.k(-1, this.i, this.k, null, this.j);
            }
            if (!(this.l == null && this.m == null)) {
                alertController.k(-2, this.l, this.n, null, this.m);
            }
            if (!(this.o == null && this.p == null)) {
                alertController.k(-3, this.o, this.q, null, this.p);
            }
            if (!(this.v == null && this.K == null && this.w == null)) {
                b(alertController);
            }
            View view2 = this.z;
            if (view2 == null) {
                int i4 = this.y;
                if (i4 != 0) {
                    alertController.r(i4);
                }
            } else if (this.E) {
                alertController.t(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.s(view2);
            }
        }
    }

    private static final class g extends Handler {
        private WeakReference<DialogInterface> a;

        public g(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, g gVar, Window window) {
        this.a = context;
        this.b = gVar;
        this.c = window;
        this.R = new g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, m.AlertDialog, defpackage.d.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(m.AlertDialog_android_layout, 0);
        this.K = obtainStyledAttributes.getResourceId(m.AlertDialog_buttonPanelSideLayout, 0);
        this.L = obtainStyledAttributes.getResourceId(m.AlertDialog_listLayout, 0);
        this.M = obtainStyledAttributes.getResourceId(m.AlertDialog_multiChoiceItemLayout, 0);
        this.N = obtainStyledAttributes.getResourceId(m.AlertDialog_singleChoiceItemLayout, 0);
        this.O = obtainStyledAttributes.getResourceId(m.AlertDialog_listItemLayout, 0);
        this.P = obtainStyledAttributes.getBoolean(m.AlertDialog_showTitle, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(m.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        gVar.d(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static void f(View view, View view2, View view3) {
        int i2 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i2 = this.K;
        if (i2 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return i2;
        }
        return this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i2, int i3) {
        View findViewById = this.c.findViewById(i.scrollIndicatorUp);
        View findViewById2 = this.c.findViewById(i.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            k3.w0(view, i2, i3);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i2 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i2 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f != null) {
                this.A.setOnScrollChangeListener(new b(this, findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.g;
            if (listView != null) {
                listView.setOnScrollListener(new d(this, findViewById, findViewById2));
                this.g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z2;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.o = button;
        button.setOnClickListener(this.S);
        boolean z3 = true;
        if (!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i2 = this.d;
                drawable.setBounds(0, 0, i2, i2);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            z2 = true;
        } else {
            this.o.setVisibility(8);
            z2 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.s = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i3 = this.d;
                drawable2.setBounds(0, 0, i3, i3);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            z2 |= true;
        } else {
            this.s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.w = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable3 = this.r;
            if (drawable3 != null) {
                int i4 = this.d;
                drawable3.setBounds(0, 0, i4, i4);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.w.setVisibility(0);
            z2 |= true;
        } else {
            this.w.setVisibility(8);
        }
        if (z(this.a)) {
            if (z2) {
                b(this.o);
            } else if (z2) {
                b(this.s);
            } else if (z2) {
                b(this.w);
            }
        }
        if (!z2) {
            z3 = false;
        }
        if (!z3) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.c.findViewById(i.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        View view = this.h;
        boolean z2 = false;
        if (view == null) {
            view = this.i != 0 ? LayoutInflater.from(this.a).inflate(this.i, viewGroup, false) : null;
        }
        if (view != null) {
            z2 = true;
        }
        if (!z2 || !a(view)) {
            this.c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) this.c.findViewById(i.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                frameLayout.setPadding(this.j, this.k, this.l, this.m);
            }
            if (this.g != null) {
                ((i0.a) viewGroup.getLayoutParams()).a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.c.findViewById(i.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.e)) || !this.P) {
            this.c.findViewById(i.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.c.findViewById(i.alertTitle);
        this.E = textView;
        textView.setText(this.e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.c.findViewById(i.parentPanel);
        View findViewById4 = findViewById3.findViewById(i.topPanel);
        View findViewById5 = findViewById3.findViewById(i.contentPanel);
        View findViewById6 = findViewById3.findViewById(i.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(i.customPanel);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i.topPanel);
        View findViewById8 = viewGroup.findViewById(i.contentPanel);
        View findViewById9 = viewGroup.findViewById(i.buttonPanel);
        ViewGroup i2 = i(findViewById7, findViewById4);
        ViewGroup i3 = i(findViewById8, findViewById5);
        ViewGroup i4 = i(findViewById9, findViewById6);
        v(i3);
        u(i4);
        x(i2);
        int i5 = 0;
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (i2 == null || i2.getVisibility() == 8) ? false : true;
        boolean z4 = (i4 == null || i4.getVisibility() == 8) ? false : true;
        if (!(z4 || i3 == null || (findViewById2 = i3.findViewById(i.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z3) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f == null && this.g == null)) {
                view = i2.findViewById(i.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i3 == null || (findViewById = i3.findViewById(i.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z3, z4);
        }
        if (!z2) {
            View view2 = this.g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z4) {
                    i5 = 2;
                }
                int i6 = z3 ? 1 : 0;
                char c2 = z3 ? 1 : 0;
                char c3 = z3 ? 1 : 0;
                p(i3, view2, i6 | i5, 3);
            }
        }
        ListView listView2 = this.g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i7 = this.I;
            if (i7 > -1) {
                listView2.setItemChecked(i7, true);
                listView2.setSelection(i7);
            }
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(defpackage.d.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public int c(int i2) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.g;
    }

    public void e() {
        this.b.setContentView(j());
        y();
    }

    public boolean g(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public boolean h(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public void k(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else if (i2 == -1) {
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        } else {
            throw new IllegalArgumentException(C0201.m82(35593));
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i2) {
        this.h = null;
        this.i = i2;
        this.n = false;
    }

    public void s(View view) {
        this.h = view;
        this.i = 0;
        this.n = false;
    }

    public void t(View view, int i2, int i3, int i4, int i5) {
        this.h = view;
        this.i = 0;
        this.n = true;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
    }
}
