package net.alhazmy13.hijridatepicker.date.hijri;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeSet;
import net.alhazmy13.hijridatepicker.date.hijri.d;
import net.alhazmy13.hijridatepicker.f;
import net.alhazmy13.hijridatepicker.g;
import net.alhazmy13.hijridatepicker.h;
import net.alhazmy13.hijridatepicker.i;
import net.alhazmy13.hijridatepicker.j;
import vigqyno.C0201;

/* compiled from: HijriDatePickerDialog */
public class c extends androidx.fragment.app.c implements View.OnClickListener, a {
    private static SimpleDateFormat g0 = new SimpleDateFormat(C0201.m82(20395), Locale.getDefault());
    private static SimpleDateFormat h0 = new SimpleDateFormat(C0201.m82(20396), Locale.getDefault());
    private static SimpleDateFormat i0 = new SimpleDateFormat(C0201.m82(20397), Locale.getDefault());
    private static SimpleDateFormat j0;
    public static Locale k0 = Locale.getDefault();
    private i A;
    private int B = -1;
    private int C = this.l.getFirstDayOfWeek();
    private int D = 1400;
    private int E = 1450;
    private String F;
    private in0 G;
    private in0 H;
    private HashSet<in0> I = new HashSet<>();
    private TreeSet<in0> J = new TreeSet<>();
    private HashSet<in0> K = new HashSet<>();
    private boolean L = false;
    private boolean M = false;
    private int N = -1;
    private boolean O = true;
    private boolean P = false;
    private boolean Q = false;
    private int R = 0;
    private int S = g.mdtp_ok;
    private String T;
    private int U = -1;
    private int V = g.mdtp_cancel;
    private String W;
    private int X = -1;
    private e Y;
    private TimeZone Z;
    private net.alhazmy13.hijridatepicker.a a0;
    private boolean b0 = true;
    private String c0;
    private String d0;
    private String e0;
    private String f0;
    private final in0 l;
    private d m;
    private HashSet<AbstractC0158c> n = new HashSet<>();
    private DialogInterface.OnCancelListener o;
    private DialogInterface.OnDismissListener p;
    private AccessibleDateAnimator q;
    private TextView u;
    private LinearLayout v;
    private TextView w;
    private TextView x;
    private TextView y;
    private b z;

    /* access modifiers changed from: package-private */
    /* compiled from: HijriDatePickerDialog */
    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                c.this.a();
                c.this.L();
                c.this.t();
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: HijriDatePickerDialog */
    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                c.this.a();
                if (c.this.v() != null) {
                    c.this.v().cancel();
                }
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.alhazmy13.hijridatepicker.date.hijri.c$c  reason: collision with other inner class name */
    /* compiled from: HijriDatePickerDialog */
    public interface AbstractC0158c {
        void a();
    }

    /* compiled from: HijriDatePickerDialog */
    public interface d {
        void a(c cVar, int i, int i2, int i3);
    }

    /* compiled from: HijriDatePickerDialog */
    public enum e {
        VERSION_1,
        VERSION_2
    }

    public c() {
        in0 in0 = new in0(getTimeZone(), Locale.getDefault());
        W(in0);
        this.l = in0;
    }

    private void D(in0 in0) {
        int i = in0.get(5);
        int actualMaximum = in0.getActualMaximum(5);
        if (i > actualMaximum) {
            in0.set(5, actualMaximum);
        }
        V(in0);
    }

    private boolean F(in0 in0) {
        in0 in02 = this.H;
        return in02 != null && in0.after(in02);
    }

    private boolean G(in0 in0) {
        in0 in02 = this.G;
        return in02 != null && in0.before(in02);
    }

    private boolean H(in0 in0) {
        HashSet<in0> hashSet = this.K;
        W(in0);
        return hashSet.contains(in0) || G(in0) || F(in0);
    }

    private boolean J(in0 in0) {
        if (!this.J.isEmpty()) {
            TreeSet<in0> treeSet = this.J;
            W(in0);
            return treeSet.contains(in0);
        }
    }

    public static c K(d dVar, h hVar) {
        c cVar = new c();
        cVar.E(dVar, hVar);
        if (hVar.b() != null) {
            cVar.O(new Locale(hVar.b()));
        }
        return cVar;
    }

    private void M(h hVar) {
        this.l.set(1, hVar.i());
        this.l.set(2, hVar.g());
        this.l.set(5, hVar.a());
    }

    private void N(int i) {
        long timeInMillis = this.l.getTimeInMillis();
        String r4 = C0201.m82(20398);
        if (i == 0) {
            if (this.Y == e.VERSION_1) {
                ObjectAnimator c = j.c(this.v, 0.9f, 1.05f);
                if (this.b0) {
                    c.setStartDelay(500);
                    this.b0 = false;
                }
                this.z.a();
                if (this.B != i) {
                    this.v.setSelected(true);
                    this.y.setSelected(false);
                    this.q.setDisplayedChild(0);
                    this.B = i;
                }
                c.start();
            } else {
                this.z.a();
                if (this.B != i) {
                    this.v.setSelected(true);
                    this.y.setSelected(false);
                    this.q.setDisplayedChild(0);
                    this.B = i;
                }
            }
            String formatDateTime = DateUtils.formatDateTime(getActivity(), timeInMillis, 16);
            AccessibleDateAnimator accessibleDateAnimator = this.q;
            accessibleDateAnimator.setContentDescription(this.c0 + r4 + formatDateTime);
            j.g(this.q, this.d0);
        } else if (i == 1) {
            if (this.Y == e.VERSION_1) {
                ObjectAnimator c2 = j.c(this.y, 0.85f, 1.1f);
                if (this.b0) {
                    c2.setStartDelay(500);
                    this.b0 = false;
                }
                this.A.a();
                if (this.B != i) {
                    this.v.setSelected(false);
                    this.y.setSelected(true);
                    this.q.setDisplayedChild(1);
                    this.B = i;
                }
                c2.start();
            } else {
                this.A.a();
                if (this.B != i) {
                    this.v.setSelected(false);
                    this.y.setSelected(true);
                    this.q.setDisplayedChild(1);
                    this.B = i;
                }
            }
            String format = g0.format(Long.valueOf(timeInMillis));
            AccessibleDateAnimator accessibleDateAnimator2 = this.q;
            accessibleDateAnimator2.setContentDescription(this.e0 + r4 + ((Object) format));
            j.g(this.q, this.f0);
        }
    }

    private void Q(h hVar) {
        P(hVar.e());
    }

    private void S(h hVar) {
        R(hVar.e());
    }

    private void V(in0 in0) {
        if (!this.J.isEmpty()) {
            in0 in02 = null;
            in0 ceiling = this.J.ceiling(in0);
            in0 lower = this.J.lower(in0);
            if (ceiling == null && lower != null) {
                in02 = lower;
            } else if (lower == null && ceiling != null) {
                in02 = ceiling;
            }
            if (in02 != null || ceiling == null) {
                if (in02 == null) {
                    in02 = in0;
                }
                in02.setTimeZone(getTimeZone());
                in0.setTimeInMillis(in02.getTimeInMillis());
                return;
            }
            if (Math.abs(in0.getTimeInMillis() - lower.getTimeInMillis()) < Math.abs(ceiling.getTimeInMillis() - in0.getTimeInMillis())) {
                in0.setTimeInMillis(lower.getTimeInMillis());
            } else {
                in0.setTimeInMillis(ceiling.getTimeInMillis());
            }
        } else {
            if (!this.K.isEmpty()) {
                in0 in03 = (in0) in0.clone();
                in0 in04 = (in0) in0.clone();
                while (H(in03) && H(in04)) {
                    in03.add(5, 1);
                    in04.add(5, -1);
                }
                if (!H(in04)) {
                    in0.setTimeInMillis(in04.getTimeInMillis());
                    return;
                } else if (!H(in03)) {
                    in0.setTimeInMillis(in03.getTimeInMillis());
                    return;
                }
            }
            if (G(in0)) {
                in0.setTimeInMillis(this.G.getTimeInMillis());
            } else if (F(in0)) {
                in0.setTimeInMillis(this.H.getTimeInMillis());
            }
        }
    }

    private in0 W(in0 in0) {
        in0.set(11, 0);
        in0.set(12, 0);
        in0.set(13, 0);
        in0.set(14, 0);
        return in0;
    }

    private void X(boolean z2) {
        TextView textView = this.y;
        Locale r = r();
        Object[] objArr = {Integer.valueOf(this.l.get(1))};
        String r4 = C0201.m82(20399);
        textView.setText(String.format(r, r4, objArr));
        if (this.Y == e.VERSION_1) {
            TextView textView2 = this.u;
            if (textView2 != null) {
                String str = this.F;
                if (str != null) {
                    textView2.setText(str.toUpperCase(r()));
                } else {
                    textView2.setText(this.l.getDisplayName(7, 2, r()).toUpperCase(r()));
                }
            }
            this.w.setText(String.valueOf(this.l.getDisplayName(2, 1, r())));
            this.x.setText(String.format(r(), r4, Integer.valueOf(this.l.get(5))));
        }
        if (this.Y == e.VERSION_2) {
            this.x.setText(this.l.getDisplayName(7, 1, r()) + C0201.m82(20400) + this.l.getDisplayName(2, 1, r()) + C0201.m82(20401) + String.format(r(), r4, Integer.valueOf(this.l.get(5))));
            String str2 = this.F;
            if (str2 != null) {
                this.u.setText(str2.toUpperCase(k0));
            } else {
                this.u.setVisibility(8);
            }
        }
        long timeInMillis = this.l.getTimeInMillis();
        this.q.setDateMillis(timeInMillis);
        this.v.setContentDescription(DateUtils.formatDateTime(getActivity(), timeInMillis, 24));
        if (z2) {
            j.g(this.q, DateUtils.formatDateTime(getActivity(), timeInMillis, 20));
        }
    }

    private void Y() {
        Iterator<AbstractC0158c> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void E(d dVar, h hVar) {
        this.m = dVar;
        try {
            if (hVar.f() != 0) {
                hVar.h(hVar.f());
                M(hVar);
            }
            if (hVar.c() != 0) {
                hVar.h(hVar.c());
                Q(hVar);
            }
            if (hVar.d() != 0) {
                hVar.h(hVar.d());
                S(hVar);
            }
        } catch (IllegalArgumentException unused) {
        }
        U(this.l.getTimeZone());
        this.Y = Build.VERSION.SDK_INT < 23 ? e.VERSION_1 : e.VERSION_2;
    }

    public boolean I(in0 in0) {
        W(in0);
        return H(in0) || !J(in0);
    }

    public void L() {
        d dVar = this.m;
        if (dVar != null) {
            dVar.a(this, this.l.get(1), this.l.get(2), this.l.get(5));
        }
    }

    public void O(Locale locale) {
        k0 = locale;
        this.C = Calendar.getInstance(this.Z, locale).getFirstDayOfWeek();
        g0 = new SimpleDateFormat(C0201.m82(20402), locale);
        h0 = new SimpleDateFormat(C0201.m82(20403), locale);
        i0 = new SimpleDateFormat(C0201.m82(20404), locale);
    }

    public void P(in0 in0) {
        in0 in02 = (in0) in0.clone();
        W(in02);
        this.H = in02;
        b bVar = this.z;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void R(in0 in0) {
        in0 in02 = (in0) in0.clone();
        W(in02);
        this.G = in02;
        b bVar = this.z;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void T(DialogInterface.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    public void U(TimeZone timeZone) {
        this.Z = timeZone;
        this.l.setTimeZone(timeZone);
        g0.setTimeZone(timeZone);
        h0.setTimeZone(timeZone);
        i0.setTimeZone(timeZone);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public void a() {
        if (this.O) {
            this.a0.h();
        }
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public int c() {
        return this.C;
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public boolean d(int i, int i2, int i3) {
        in0 in0 = new in0();
        in0.set(1, i);
        in0.set(2, i2);
        in0.set(5, i3);
        W(in0);
        return this.I.contains(in0);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public void f(int i, int i2, int i3) {
        this.l.set(1, i);
        this.l.set(2, i2);
        this.l.set(5, i3);
        Y();
        X(true);
        if (this.Q) {
            L();
            t();
        }
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public TimeZone getTimeZone() {
        TimeZone timeZone = this.Z;
        return timeZone == null ? TimeZone.getDefault() : timeZone;
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public in0 i() {
        if (!this.J.isEmpty()) {
            return this.J.last();
        }
        in0 in0 = this.H;
        if (in0 != null) {
            return in0;
        }
        in0 in02 = new in0(getTimeZone(), r());
        in02.set(1, this.E);
        in02.set(5, 31);
        in02.set(2, 11);
        return in02;
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public boolean j(int i, int i2, int i3) {
        in0 in0 = new in0();
        in0.set(1, i);
        in0.set(2, i2);
        in0.set(5, i3);
        return I(in0);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public int k() {
        return this.N;
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public boolean l() {
        return this.L;
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public void m(int i) {
        this.l.set(1, i);
        D(this.l);
        Y();
        N(0);
        X(true);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public void n(AbstractC0158c cVar) {
        this.n.add(cVar);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public int o() {
        if (!this.J.isEmpty()) {
            return this.J.last().get(1);
        }
        in0 in0 = this.H;
        return (in0 == null || in0.get(1) <= 0) ? this.E : this.H.get(1);
    }

    @Override // androidx.fragment.app.c
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.o;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public void onClick(View view) {
        w30.g(view);
        try {
            a();
            if (view.getId() == net.alhazmy13.hijridatepicker.e.mdtp_hijri_date_picker_year) {
                N(1);
            } else if (view.getId() == net.alhazmy13.hijridatepicker.e.mdtp_hijri_date_picker_month_and_day) {
                N(0);
            }
        } finally {
            w30.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViewsInLayout();
            viewGroup.addView(onCreateView(getActivity().getLayoutInflater(), viewGroup, null));
        }
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.d activity = getActivity();
        activity.getWindow().setSoftInputMode(3);
        this.B = -1;
        if (bundle != null) {
            this.l.set(1, bundle.getInt(C0201.m82(20405)));
            this.l.set(2, bundle.getInt(C0201.m82(20406)));
            this.l.set(5, bundle.getInt(C0201.m82(20407)));
            this.R = bundle.getInt(C0201.m82(20408));
        }
        if (Build.VERSION.SDK_INT < 18) {
            j0 = new SimpleDateFormat(activity.getResources().getString(g.mdtp_date_v2_daymonthyear), r());
        } else {
            j0 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(r(), C0201.m82(20409)), r());
        }
        j0.setTimeZone(getTimeZone());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3 = this.R;
        if (bundle != null) {
            this.C = bundle.getInt(C0201.m82(20410));
            this.D = bundle.getInt(C0201.m82(20411));
            this.E = bundle.getInt(C0201.m82(20412));
            i3 = bundle.getInt(C0201.m82(20413));
            i2 = bundle.getInt(C0201.m82(20414));
            i = bundle.getInt(C0201.m82(20415));
            this.G = (in0) bundle.getSerializable(C0201.m82(20416));
            this.H = (in0) bundle.getSerializable(C0201.m82(20417));
            this.I = (HashSet) bundle.getSerializable(C0201.m82(20418));
            this.J = (TreeSet) bundle.getSerializable(C0201.m82(20419));
            this.K = (HashSet) bundle.getSerializable(C0201.m82(20420));
            this.L = bundle.getBoolean(C0201.m82(20421));
            this.M = bundle.getBoolean(C0201.m82(20422));
            this.N = bundle.getInt(C0201.m82(20423));
            this.O = bundle.getBoolean(C0201.m82(20424));
            this.P = bundle.getBoolean(C0201.m82(20425));
            this.Q = bundle.getBoolean(C0201.m82(20426));
            this.F = bundle.getString(C0201.m82(20427));
            this.S = bundle.getInt(C0201.m82(20428));
            this.T = bundle.getString(C0201.m82(20429));
            this.U = bundle.getInt(C0201.m82(20430));
            this.V = bundle.getInt(C0201.m82(20431));
            this.W = bundle.getString(C0201.m82(20432));
            this.X = bundle.getInt(C0201.m82(20433));
            this.Y = (e) bundle.getSerializable(C0201.m82(20434));
            this.Z = (TimeZone) bundle.getSerializable(C0201.m82(20435));
        } else {
            i2 = -1;
            i = 0;
        }
        View inflate = layoutInflater.inflate(this.Y == e.VERSION_1 ? f.hdp_mdtp_hijri_date_picker_dialog : f.hdp_mdtp_hijri_date_picker_dialog_v2, viewGroup, false);
        V(this.l);
        this.u = (TextView) inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_hijri_date_picker_header);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_hijri_date_picker_month_and_day);
        this.v = linearLayout;
        linearLayout.setOnClickListener(this);
        this.w = (TextView) inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_hijri_date_picker_month);
        this.x = (TextView) inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_hijri_date_picker_day);
        TextView textView = (TextView) inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_hijri_date_picker_year);
        this.y = textView;
        textView.setOnClickListener(this);
        androidx.fragment.app.d activity = getActivity();
        this.z = new f(activity, this);
        this.A = new i(activity, this);
        if (!this.M) {
            this.L = j.d(activity, this.L);
        }
        Resources resources = getResources();
        this.c0 = resources.getString(g.mdtp_day_picker_description);
        this.d0 = resources.getString(g.mdtp_select_day);
        this.e0 = resources.getString(g.mdtp_year_picker_description);
        this.f0 = resources.getString(g.mdtp_select_year);
        inflate.setBackgroundColor(androidx.core.content.b.d(activity, this.L ? net.alhazmy13.hijridatepicker.c.mdtp_date_picker_view_animator_dark_theme : net.alhazmy13.hijridatepicker.c.mdtp_date_picker_view_animator));
        AccessibleDateAnimator accessibleDateAnimator = (AccessibleDateAnimator) inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_hijri_animator);
        this.q = accessibleDateAnimator;
        accessibleDateAnimator.addView(this.z);
        this.q.addView(this.A);
        this.q.setDateMillis(this.l.getTimeInMillis());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        this.q.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300);
        this.q.setOutAnimation(alphaAnimation2);
        Button button = (Button) inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_ok);
        button.setOnClickListener(new a());
        String r5 = C0201.m82(20436);
        button.setTypeface(i.a(activity, r5));
        String str = this.T;
        if (str != null) {
            button.setText(str);
        } else {
            button.setText(this.S);
        }
        Button button2 = (Button) inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_cancel);
        button2.setOnClickListener(new b());
        button2.setTypeface(i.a(activity, r5));
        String str2 = this.W;
        if (str2 != null) {
            button2.setText(str2);
        } else {
            button2.setText(this.V);
        }
        button2.setVisibility(x() ? 0 : 8);
        if (this.N == -1) {
            this.N = j.b(getActivity());
        }
        TextView textView2 = this.u;
        if (textView2 != null) {
            textView2.setBackgroundColor(j.a(this.N));
        }
        inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_hijri_day_picker_selected_date_layout).setBackgroundColor(this.N);
        int i4 = this.U;
        if (i4 != -1) {
            button.setTextColor(i4);
        } else {
            button.setTextColor(this.N);
        }
        int i5 = this.X;
        if (i5 != -1) {
            button2.setTextColor(i5);
        } else {
            button2.setTextColor(this.N);
        }
        if (v() == null) {
            inflate.findViewById(net.alhazmy13.hijridatepicker.e.mdtp_done_background).setVisibility(8);
        }
        X(false);
        N(i3);
        if (i2 != -1) {
            if (i3 == 0) {
                this.z.h(i2);
            } else if (i3 == 1) {
                this.A.g(i2, i);
            }
        }
        this.a0 = new net.alhazmy13.hijridatepicker.a(activity);
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.a0.g();
        if (this.P) {
            t();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a0.f();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        bundle.putInt(C0201.m82(20437), this.l.get(1));
        bundle.putInt(C0201.m82(20438), this.l.get(2));
        bundle.putInt(C0201.m82(20439), this.l.get(5));
        bundle.putInt(C0201.m82(20440), this.C);
        bundle.putInt(C0201.m82(20441), this.D);
        bundle.putInt(C0201.m82(20442), this.E);
        bundle.putInt(C0201.m82(20443), this.B);
        int i2 = this.B;
        if (i2 == 0) {
            i = this.z.getMostVisiblePosition();
        } else if (i2 == 1) {
            i = this.A.getFirstVisiblePosition();
            bundle.putInt(C0201.m82(20444), this.A.getFirstPositionOffset());
        } else {
            i = -1;
        }
        bundle.putInt(C0201.m82(20445), i);
        bundle.putSerializable(C0201.m82(20446), this.G);
        bundle.putSerializable(C0201.m82(20447), this.H);
        bundle.putSerializable(C0201.m82(20448), this.I);
        bundle.putSerializable(C0201.m82(20449), this.J);
        bundle.putSerializable(C0201.m82(20450), this.K);
        bundle.putBoolean(C0201.m82(20451), this.L);
        bundle.putBoolean(C0201.m82(20452), this.M);
        bundle.putInt(C0201.m82(20453), this.N);
        bundle.putBoolean(C0201.m82(20454), this.O);
        bundle.putBoolean(C0201.m82(20455), this.P);
        bundle.putBoolean(C0201.m82(20456), this.Q);
        bundle.putInt(C0201.m82(20457), this.R);
        bundle.putString(C0201.m82(20458), this.F);
        bundle.putInt(C0201.m82(20459), this.S);
        bundle.putString(C0201.m82(20460), this.T);
        bundle.putInt(C0201.m82(20461), this.U);
        bundle.putInt(C0201.m82(20462), this.V);
        bundle.putString(C0201.m82(20463), this.W);
        bundle.putInt(C0201.m82(20464), this.X);
        bundle.putSerializable(C0201.m82(20465), this.Y);
        bundle.putSerializable(C0201.m82(20466), this.Z);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public int p() {
        if (!this.J.isEmpty()) {
            return this.J.first().get(1);
        }
        in0 in0 = this.G;
        return (in0 == null || in0.get(1) <= 0) ? this.D : this.G.get(1);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public d.a q() {
        return new d.a(this.l, getTimeZone());
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public Locale r() {
        return k0;
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.a
    public in0 s() {
        if (!this.J.isEmpty()) {
            return this.J.first();
        }
        in0 in0 = this.G;
        if (in0 != null) {
            return in0;
        }
        in0 in02 = new in0(getTimeZone(), r());
        in02.set(1, this.D);
        in02.set(5, 1);
        in02.set(2, 0);
        return in02;
    }

    @Override // androidx.fragment.app.c
    public Dialog y(Bundle bundle) {
        Dialog y2 = super.y(bundle);
        y2.requestWindowFeature(1);
        return y2;
    }
}
