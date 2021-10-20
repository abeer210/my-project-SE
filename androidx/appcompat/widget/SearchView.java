package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import vigqyno.C0201;

public class SearchView extends i0 implements x {
    public static final k t0 = new k();
    private final View A;
    private p B;
    private Rect C;
    private Rect D;
    private int[] E;
    private int[] F;
    private final ImageView G;
    private final Drawable H;
    private final int I;
    private final int J;
    private final Intent K;
    private final Intent L;
    private final CharSequence M;
    private m N;
    private l O;
    public View.OnFocusChangeListener P;
    private n Q;
    private View.OnClickListener R;
    private boolean S;
    private boolean T;
    public c4 U;
    private boolean V;
    private CharSequence W;
    private boolean a0;
    private boolean b0;
    private int c0;
    private boolean d0;
    private CharSequence e0;
    private CharSequence f0;
    private boolean g0;
    private int h0;
    public SearchableInfo i0;
    private Bundle j0;
    private final Runnable k0;
    private Runnable l0;
    private final WeakHashMap<String, Drawable.ConstantState> m0;
    private final View.OnClickListener n0;
    public View.OnKeyListener o0;
    public final SearchAutoComplete p;
    private final TextView.OnEditorActionListener p0;
    private final View q;
    private final AdapterView.OnItemClickListener q0;
    private final AdapterView.OnItemSelectedListener r0;
    private TextWatcher s0;
    private final View u;
    private final View v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final ImageView z;

    public static class SearchAutoComplete extends d {
        private int d;
        private SearchView e;
        private boolean f;
        public final Runnable g;

        class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, defpackage.d.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void b() {
            if (this.f) {
                ((InputMethodManager) getContext().getSystemService(C0201.m82(37770))).showSoftInput(this, 0);
                this.f = false;
            }
        }

        public boolean enoughToFilter() {
            return this.d <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f) {
                removeCallbacks(this.g);
                post(this.g);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.e.Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.e.hasFocus() && getVisibility() == 0) {
                this.f = true;
                if (SearchView.M(getContext())) {
                    SearchView.t0.c(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(C0201.m82(37771));
            if (!z) {
                this.f = false;
                removeCallbacks(this.g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f = false;
                removeCallbacks(this.g);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.e = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.d = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.g = new a();
            this.d = getThreshold();
        }
    }

    class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        public c() {
        }

        public void run() {
            c4 c4Var = SearchView.this.U;
            if (c4Var instanceof q0) {
                c4Var.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.P;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                if (view == SearchView.this.w) {
                    SearchView.this.V();
                } else if (view == SearchView.this.y) {
                    SearchView.this.R();
                } else if (view == SearchView.this.x) {
                    SearchView.this.W();
                } else if (view == SearchView.this.z) {
                    SearchView.this.a0();
                } else if (view == SearchView.this.p) {
                    SearchView.this.H();
                }
            } finally {
                w30.h();
            }
        }
    }

    class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.i0 == null) {
                return false;
            }
            if (searchView.p.isPopupShowing() && SearchView.this.p.getListSelection() != -1) {
                return SearchView.this.X(view, i, keyEvent);
            }
            if (SearchView.this.p.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            w30.l(view, i);
            try {
                SearchView.this.S(i, 0, null);
            } finally {
                w30.m();
            }
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            w30.n(view, i);
            try {
                SearchView.this.T(i);
            } finally {
                w30.o();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static class k {
        private Method a;
        private Method b;
        private Method c;

        public k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod(C0201.m82(30352), new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod(C0201.m82(30353), new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod(C0201.m82(30354), Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i);

        boolean b(int i);
    }

    /* access modifiers changed from: package-private */
    public static class o extends f4 {
        public static final Parcelable.Creator<o> CREATOR = new a();
        public boolean c;

        static class a implements Parcelable.ClassLoaderCreator<o> {
            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            /* renamed from: c */
            public o[] newArray(int i) {
                return new o[i];
            }
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return C0201.m82(31045) + Integer.toHexString(System.identityHashCode(this)) + C0201.m82(31046) + this.c + C0201.m82(31047);
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.c));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class p extends TouchDelegate {
        private final View a;
        private final Rect b = new Rect();
        private final Rect c = new Rect();
        private final Rect d = new Rect();
        private final int e;
        private boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                        if (z3) {
                            return false;
                        }
                        if (!z || this.c.contains(x, y)) {
                            Rect rect = this.c;
                            motionEvent.setLocation((float) (x - rect.left), (float) (y - rect.top));
                        } else {
                            motionEvent.setLocation((float) (this.a.getWidth() / 2), (float) (this.a.getHeight() / 2));
                        }
                        return this.a.dispatchTouchEvent(motionEvent);
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                    if (z3) {
                    }
                }
                z3 = z2;
            } else {
                if (this.b.contains(x, y)) {
                    this.f = true;
                }
                z = true;
                z3 = false;
                if (z3) {
                }
            }
            z = true;
            if (z3) {
            }
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra(C0201.m82(35290), this.f0);
        if (str3 != null) {
            intent.putExtra(C0201.m82(35291), str3);
        }
        if (str2 != null) {
            intent.putExtra(C0201.m82(35292), str2);
        }
        Bundle bundle = this.j0;
        if (bundle != null) {
            intent.putExtra(C0201.m82(35293), bundle);
        }
        if (i2 != 0) {
            intent.putExtra(C0201.m82(35294), i2);
            intent.putExtra(C0201.m82(35295), str4);
        }
        intent.setComponent(this.i0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i2, String str) {
        int i3;
        Uri uri;
        String o2;
        try {
            String o3 = q0.o(cursor, C0201.m82(35296));
            if (o3 == null) {
                o3 = this.i0.getSuggestIntentAction();
            }
            if (o3 == null) {
                o3 = C0201.m82(35297);
            }
            String o4 = q0.o(cursor, C0201.m82(35298));
            if (o4 == null) {
                o4 = this.i0.getSuggestIntentData();
            }
            if (!(o4 == null || (o2 = q0.o(cursor, C0201.m82(35299))) == null)) {
                o4 = o4 + C0201.m82(35300) + Uri.encode(o2);
            }
            if (o4 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o4);
            }
            return C(o3, uri, q0.o(cursor, C0201.m82(35302)), q0.o(cursor, C0201.m82(35301)), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w(C0201.m82(35305), C0201.m82(35303) + i3 + C0201.m82(35304), e2);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent(C0201.m82(35306));
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.j0;
        if (bundle2 != null) {
            bundle.putParcelable(C0201.m82(35307), bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : C0201.m82(35308);
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra(C0201.m82(35309), string);
        intent3.putExtra(C0201.m82(35310), string2);
        intent3.putExtra(C0201.m82(35311), string3);
        intent3.putExtra(C0201.m82(35312), i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra(C0201.m82(35313), str);
        intent3.putExtra(C0201.m82(35314), activity);
        intent3.putExtra(C0201.m82(35315), bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra(C0201.m82(35316), str);
        return intent2;
    }

    private void G() {
        this.p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.E);
        getLocationInWindow(this.F);
        int[] iArr = this.E;
        int i2 = iArr[1];
        int[] iArr2 = this.F;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.S || this.H == null) {
            return charSequence;
        }
        double textSize = (double) this.p.getTextSize();
        Double.isNaN(textSize);
        int i2 = (int) (textSize * 1.25d);
        this.H.setBounds(0, 0, i2, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C0201.m82(35317));
        spannableStringBuilder.setSpan(new ImageSpan(this.H), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.i0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.i0.getVoiceSearchLaunchWebSearch()) {
            intent = this.K;
        } else if (this.i0.getVoiceSearchLaunchRecognizer()) {
            intent = this.L;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.V || this.d0) && !L();
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e2) {
                Log.e(C0201.m82(35319), C0201.m82(35318) + intent, e2);
            }
        }
    }

    private boolean Q(int i2, int i3, String str) {
        Cursor b2 = this.U.b();
        if (b2 == null || !b2.moveToPosition(i2)) {
            return false;
        }
        O(D(b2, i3, str));
        return true;
    }

    private void b0() {
        post(this.k0);
    }

    private void c0(int i2) {
        Editable text = this.p.getText();
        Cursor b2 = this.U.b();
        if (b2 != null) {
            if (b2.moveToPosition(i2)) {
                CharSequence c2 = this.U.c(b2);
                if (c2 != null) {
                    setQuery(c2);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void e0() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.p.getText());
        int i2 = 0;
        if (!z3 && (!this.S || this.g0)) {
            z2 = false;
        }
        ImageView imageView = this.y;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.y.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.p;
        if (queryHint == null) {
            queryHint = C0201.m82(35320);
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(defpackage.g.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(defpackage.g.abc_search_view_preferred_width);
    }

    private void h0() {
        this.p.setThreshold(this.i0.getSuggestThreshold());
        this.p.setImeOptions(this.i0.getImeOptions());
        int inputType = this.i0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.i0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.p.setInputType(inputType);
        c4 c4Var = this.U;
        if (c4Var != null) {
            c4Var.a(null);
        }
        if (this.i0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.i0, this.m0);
            this.U = q0Var;
            this.p.setAdapter(q0Var);
            q0 q0Var2 = (q0) this.U;
            if (this.a0) {
                i2 = 2;
            }
            q0Var2.x(i2);
        }
    }

    private void i0() {
        this.v.setVisibility((!N() || !(this.x.getVisibility() == 0 || this.z.getVisibility() == 0)) ? 8 : 0);
    }

    private void j0(boolean z2) {
        this.x.setVisibility((!this.V || !N() || !hasFocus() || (!z2 && this.d0)) ? 8 : 0);
    }

    private void k0(boolean z2) {
        this.T = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.p.getText());
        this.w.setVisibility(i3);
        j0(z3);
        this.q.setVisibility(z2 ? 8 : 0);
        if (this.G.getDrawable() == null || this.S) {
            i2 = 8;
        }
        this.G.setVisibility(i2);
        e0();
        l0(!z3);
        i0();
    }

    private void l0(boolean z2) {
        int i2 = 8;
        if (this.d0 && !L() && z2) {
            this.x.setVisibility(8);
            i2 = 0;
        }
        this.z.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.p.setText(charSequence);
        this.p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void B() {
        int i2;
        if (this.A.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.u.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = d1.b(this);
            int dimensionPixelSize = this.S ? resources.getDimensionPixelSize(defpackage.g.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(defpackage.g.abc_dropdownitem_text_padding_left) : 0;
            this.p.getDropDownBackground().getPadding(rect);
            if (b2) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.p.setDropDownHorizontalOffset(i2);
            this.p.setDropDownWidth((((this.A.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.p.refreshAutoCompleteResults();
            return;
        }
        t0.b(this.p);
        t0.a(this.p);
    }

    public boolean L() {
        return this.T;
    }

    public void P(int i2, String str, String str2) {
        getContext().startActivity(C(C0201.m82(35321), null, null, str2, i2, str));
    }

    public void R() {
        if (!TextUtils.isEmpty(this.p.getText())) {
            this.p.setText(C0201.m82(35322));
            this.p.requestFocus();
            this.p.setImeVisibility(true);
        } else if (this.S) {
            l lVar = this.O;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    public boolean S(int i2, int i3, String str) {
        n nVar = this.Q;
        if (nVar != null && nVar.b(i2)) {
            return false;
        }
        Q(i2, 0, null);
        this.p.setImeVisibility(false);
        G();
        return true;
    }

    public boolean T(int i2) {
        n nVar = this.Q;
        if (nVar != null && nVar.a(i2)) {
            return false;
        }
        c0(i2);
        return true;
    }

    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void V() {
        k0(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void W() {
        Editable text = this.p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.N;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.i0 != null) {
                    P(0, null, text.toString());
                }
                this.p.setImeVisibility(false);
                G();
            }
        }
    }

    public boolean X(View view, int i2, KeyEvent keyEvent) {
        int i3;
        if (this.i0 != null && this.U != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return S(this.p.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                if (i2 == 21) {
                    i3 = 0;
                } else {
                    i3 = this.p.length();
                }
                this.p.setSelection(i3);
                this.p.setListSelection(0);
                this.p.clearListSelection();
                t0.c(this.p, true);
                return true;
            } else if (i2 != 19 || this.p.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    public void Y(CharSequence charSequence) {
        Editable text = this.p.getText();
        this.f0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        j0(z2);
        l0(!z2);
        e0();
        i0();
        if (this.N != null && !TextUtils.equals(charSequence, this.e0)) {
            this.N.a(charSequence.toString());
        }
        this.e0 = charSequence.toString();
    }

    public void Z() {
        k0(L());
        b0();
        if (this.p.hasFocus()) {
            H();
        }
    }

    public void a0() {
        SearchableInfo searchableInfo = this.i0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.K, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.L, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w(C0201.m82(35323), C0201.m82(35324));
            }
        }
    }

    @Override // defpackage.x
    public void c() {
        if (!this.g0) {
            this.g0 = true;
            int imeOptions = this.p.getImeOptions();
            this.h0 = imeOptions;
            this.p.setImeOptions(imeOptions | 33554432);
            this.p.setText(C0201.m82(35325));
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.b0 = true;
        super.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.b0 = false;
    }

    @Override // defpackage.x
    public void d() {
        d0(C0201.m82(35326), false);
        clearFocus();
        k0(true);
        this.p.setImeOptions(this.h0);
        this.g0 = false;
    }

    public void d0(CharSequence charSequence, boolean z2) {
        this.p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f0 = charSequence;
        }
        if (z2 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public void f0() {
        int[] iArr = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.c0;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.W;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.i0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.M;
        }
        return getContext().getText(this.i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.J;
    }

    public int getSuggestionRowLayout() {
        return this.I;
    }

    public c4 getSuggestionsAdapter() {
        return this.U;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.k0);
        post(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.i0
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            I(this.p, this.C);
            Rect rect = this.D;
            Rect rect2 = this.C;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.B;
            if (pVar == null) {
                p pVar2 = new p(this.D, this.C, this.p);
                this.B = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.D, this.C);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public void onMeasure(int i2, int i3) {
        int i4;
        if (L()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.c0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.c0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.c0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        k0(oVar.c);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.c = L();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        b0();
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.b0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.p.requestFocus(i2, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.j0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.S != z2) {
            this.S = z2;
            k0(z2);
            g0();
        }
    }

    public void setImeOptions(int i2) {
        this.p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.c0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.O = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.P = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.N = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.R = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.Q = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.W = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.a0 = z2;
        c4 c4Var = this.U;
        if (c4Var instanceof q0) {
            ((q0) c4Var).x(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.i0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K2 = K();
        this.d0 = K2;
        if (K2) {
            this.p.setPrivateImeOptions(C0201.m82(35327));
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.V = z2;
        k0(L());
    }

    public void setSuggestionsAdapter(c4 c4Var) {
        this.U = c4Var;
        this.p.setAdapter(c4Var);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, defpackage.d.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.C = new Rect();
        this.D = new Rect();
        this.E = new int[2];
        this.F = new int[2];
        this.k0 = new b();
        this.l0 = new c();
        this.m0 = new WeakHashMap<>();
        this.n0 = new f();
        this.o0 = new g();
        this.p0 = new h();
        this.q0 = new i();
        this.r0 = new j();
        this.s0 = new a();
        x0 u2 = x0.u(context, attributeSet, defpackage.m.SearchView, i2, 0);
        LayoutInflater.from(context).inflate(u2.n(defpackage.m.SearchView_layout, defpackage.j.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(defpackage.i.search_src_text);
        this.p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(defpackage.i.search_edit_frame);
        this.u = findViewById(defpackage.i.search_plate);
        this.v = findViewById(defpackage.i.submit_area);
        this.w = (ImageView) findViewById(defpackage.i.search_button);
        this.x = (ImageView) findViewById(defpackage.i.search_go_btn);
        this.y = (ImageView) findViewById(defpackage.i.search_close_btn);
        this.z = (ImageView) findViewById(defpackage.i.search_voice_btn);
        this.G = (ImageView) findViewById(defpackage.i.search_mag_icon);
        k3.k0(this.u, u2.g(defpackage.m.SearchView_queryBackground));
        k3.k0(this.v, u2.g(defpackage.m.SearchView_submitBackground));
        this.w.setImageDrawable(u2.g(defpackage.m.SearchView_searchIcon));
        this.x.setImageDrawable(u2.g(defpackage.m.SearchView_goIcon));
        this.y.setImageDrawable(u2.g(defpackage.m.SearchView_closeIcon));
        this.z.setImageDrawable(u2.g(defpackage.m.SearchView_voiceIcon));
        this.G.setImageDrawable(u2.g(defpackage.m.SearchView_searchIcon));
        this.H = u2.g(defpackage.m.SearchView_searchHintIcon);
        z0.a(this.w, getResources().getString(defpackage.k.abc_searchview_description_search));
        this.I = u2.n(defpackage.m.SearchView_suggestionRowLayout, defpackage.j.abc_search_dropdown_item_icons_2line);
        this.J = u2.n(defpackage.m.SearchView_commitIcon, 0);
        this.w.setOnClickListener(this.n0);
        this.y.setOnClickListener(this.n0);
        this.x.setOnClickListener(this.n0);
        this.z.setOnClickListener(this.n0);
        this.p.setOnClickListener(this.n0);
        this.p.addTextChangedListener(this.s0);
        this.p.setOnEditorActionListener(this.p0);
        this.p.setOnItemClickListener(this.q0);
        this.p.setOnItemSelectedListener(this.r0);
        this.p.setOnKeyListener(this.o0);
        this.p.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u2.a(defpackage.m.SearchView_iconifiedByDefault, true));
        int f2 = u2.f(defpackage.m.SearchView_android_maxWidth, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.M = u2.p(defpackage.m.SearchView_defaultQueryHint);
        this.W = u2.p(defpackage.m.SearchView_queryHint);
        int k2 = u2.k(defpackage.m.SearchView_android_imeOptions, -1);
        if (k2 != -1) {
            setImeOptions(k2);
        }
        int k3 = u2.k(defpackage.m.SearchView_android_inputType, -1);
        if (k3 != -1) {
            setInputType(k3);
        }
        setFocusable(u2.a(defpackage.m.SearchView_android_focusable, true));
        u2.v();
        Intent intent = new Intent(C0201.m82(35286));
        this.K = intent;
        intent.addFlags(268435456);
        this.K.putExtra(C0201.m82(35287), C0201.m82(35288));
        Intent intent2 = new Intent(C0201.m82(35289));
        this.L = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.p.getDropDownAnchor());
        this.A = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new e());
        }
        k0(this.S);
        g0();
    }
}
