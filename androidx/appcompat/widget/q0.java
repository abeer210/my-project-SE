package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import vigqyno.C0201;

@SuppressLint({"RestrictedAPI"})
/* compiled from: SuggestionsAdapter */
public class q0 extends e4 implements View.OnClickListener {
    private int A = -1;
    private int B = -1;
    private final SearchView l;
    private final SearchableInfo m;
    private final Context n;
    private final WeakHashMap<String, Drawable.ConstantState> o;
    private final int p;
    private boolean q = false;
    private int u = 1;
    private ColorStateList v;
    private int w = -1;
    private int x = -1;
    private int y = -1;
    private int z = -1;

    /* access modifiers changed from: private */
    /* compiled from: SuggestionsAdapter */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(i.edit_query);
        }
    }

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        SearchManager searchManager = (SearchManager) this.d.getSystemService(C0201.m82(33548));
        this.l = searchView;
        this.m = searchableInfo;
        this.p = searchView.getSuggestionCommitIconResId();
        this.n = context;
        this.o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean(C0201.m82(33549))) {
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.v == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(d.textColorSearchUrl, typedValue, true);
            this.v = this.d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.v, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        String r0 = C0201.m82(33550);
        PackageManager packageManager = this.d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w(r0, C0201.m82(33551) + iconResource + C0201.m82(33552) + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(r0, e.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.o.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.o.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.n.getResources());
        }
        Drawable m2 = m(componentName);
        if (m2 != null) {
            constantState = m2.getConstantState();
        }
        this.o.put(flattenToShortString, constantState);
        return m2;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p(Cursor cursor) {
        Drawable n2 = n(this.m.getSearchActivity());
        if (n2 != null) {
            return n2;
        }
        return this.d.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        String r0 = C0201.m82(33553);
        String r1 = C0201.m82(33554);
        try {
            if (C0201.m82(33555).equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException(C0201.m82(33556) + uri);
                }
            } else {
                InputStream openInputStream = this.n.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        return Drawable.createFromStream(openInputStream, null);
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException e) {
                            Log.e(r1, r0 + uri, e);
                        }
                    }
                } else {
                    throw new FileNotFoundException(C0201.m82(33557) + uri);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w(r1, C0201.m82(33558) + uri + C0201.m82(33559) + e2.getMessage());
            return null;
        }
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || C0201.m82(33560).equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = C0201.m82(33561) + this.n.getPackageName() + C0201.m82(33562) + parseInt;
            Drawable k = k(str2);
            if (k != null) {
                return k;
            }
            Drawable f = b.f(this.n, parseInt);
            A(str2, f);
            return f;
        } catch (NumberFormatException unused) {
            Drawable k2 = k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q2 = q(Uri.parse(str));
            A(str, q2);
            return q2;
        } catch (Resources.NotFoundException unused2) {
            Log.w(C0201.m82(33564), C0201.m82(33563) + str);
            return null;
        }
    }

    private Drawable t(Cursor cursor) {
        int i = this.z;
        if (i == -1) {
            return null;
        }
        Drawable s = s(cursor.getString(i));
        if (s != null) {
            return s;
        }
        return p(cursor);
    }

    private Drawable u(Cursor cursor) {
        int i = this.A;
        if (i == -1) {
            return null;
        }
        return s(cursor.getString(i));
    }

    private static String w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(C0201.m82(33565), C0201.m82(33566), e);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // defpackage.c4, defpackage.d4.a
    public void a(Cursor cursor) {
        boolean z2 = this.q;
        String r1 = C0201.m82(33567);
        if (z2) {
            Log.w(r1, C0201.m82(33568));
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.w = cursor.getColumnIndex(C0201.m82(33569));
                this.x = cursor.getColumnIndex(C0201.m82(33570));
                this.y = cursor.getColumnIndex(C0201.m82(33571));
                this.z = cursor.getColumnIndex(C0201.m82(33572));
                this.A = cursor.getColumnIndex(C0201.m82(33573));
                this.B = cursor.getColumnIndex(C0201.m82(33574));
            }
        } catch (Exception e) {
            Log.e(r1, C0201.m82(33575), e);
        }
    }

    @Override // defpackage.c4, defpackage.d4.a
    public CharSequence c(Cursor cursor) {
        String o2;
        String o3;
        if (cursor == null) {
            return null;
        }
        String o4 = o(cursor, C0201.m82(33576));
        if (o4 != null) {
            return o4;
        }
        if (this.m.shouldRewriteQueryFromData() && (o3 = o(cursor, C0201.m82(33577))) != null) {
            return o3;
        }
        if (!this.m.shouldRewriteQueryFromText() || (o2 = o(cursor, C0201.m82(33578))) == null) {
            return null;
        }
        return o2;
    }

    @Override // defpackage.d4.a
    public Cursor d(CharSequence charSequence) {
        String r5 = charSequence == null ? C0201.m82(33579) : charSequence.toString();
        if (this.l.getVisibility() == 0 && this.l.getWindowVisibility() == 0) {
            try {
                Cursor v2 = v(this.m, r5, 50);
                if (v2 != null) {
                    v2.getCount();
                    return v2;
                }
            } catch (RuntimeException e) {
                Log.w(C0201.m82(33580), C0201.m82(33581), e);
            }
        }
        return null;
    }

    @Override // defpackage.c4
    public void e(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        a aVar = (a) view.getTag();
        int i = this.B;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.a != null) {
            z(aVar.a, w(cursor, this.w));
        }
        if (aVar.b != null) {
            String w2 = w(cursor, this.y);
            if (w2 != null) {
                charSequence = l(w2);
            } else {
                charSequence = w(cursor, this.x);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.a.setMaxLines(1);
                }
            }
            z(aVar.b, charSequence);
        }
        ImageView imageView = aVar.c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i3 = this.u;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.e.setVisibility(0);
            aVar.e.setTag(aVar.a.getText());
            aVar.e.setOnClickListener(this);
            return;
        }
        aVar.e.setVisibility(8);
    }

    @Override // defpackage.c4
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(C0201.m82(33582), C0201.m82(33583), e);
            View g = g(this.d, this.c, viewGroup);
            if (g != null) {
                ((a) g.getTag()).a.setText(e.toString());
            }
            return g;
        }
    }

    @Override // defpackage.c4
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(C0201.m82(33584), C0201.m82(33585), e);
            View h = h(this.d, this.c, viewGroup);
            if (h != null) {
                ((a) h.getTag()).a.setText(e.toString());
            }
            return h;
        }
    }

    @Override // defpackage.c4, defpackage.e4
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.h(context, cursor, viewGroup);
        h.setTag(new a(h));
        ((ImageView) h.findViewById(i.edit_query)).setImageResource(this.p);
        return h;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    public void onClick(View view) {
        w30.g(view);
        try {
            Object tag = view.getTag();
            if (tag instanceof CharSequence) {
                this.l.U((CharSequence) tag);
            }
        } finally {
            w30.h();
        }
    }

    public Drawable r(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.d.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(C0201.m82(33586) + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(C0201.m82(33588) + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException(C0201.m82(33587) + uri);
                }
                throw new FileNotFoundException(C0201.m82(33589) + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(C0201.m82(33590) + uri);
            }
        } else {
            throw new FileNotFoundException(C0201.m82(33591) + uri);
        }
    }

    public Cursor v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder authority = new Uri.Builder().scheme(C0201.m82(33592)).authority(suggestAuthority);
        String r2 = C0201.m82(33593);
        Uri.Builder fragment = authority.query(r2).fragment(r2);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath(C0201.m82(33594));
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter(C0201.m82(33595), String.valueOf(i));
        }
        return this.d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    public void x(int i) {
        this.u = i;
    }
}
