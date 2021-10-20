package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.b;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import vigqyno.C0188;
import vigqyno.C0201;

public class UCropActivity extends androidx.appcompat.app.c {
    public static final Bitmap.CompressFormat Z = Bitmap.CompressFormat.JPEG;
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F = true;
    private UCropView G;
    private GestureCropImageView H;
    private OverlayView I;
    private ViewGroup J;
    private ViewGroup K;
    private ViewGroup L;
    private ViewGroup M;
    private ViewGroup N;
    private ViewGroup O;
    private List<ViewGroup> P = new ArrayList();
    private TextView Q;
    private TextView R;
    private View S;
    private e6 T;
    private Bitmap.CompressFormat U = Z;
    private int V = 90;
    private int[] W = {1, 2, 3};
    private b.AbstractC0134b X = new a();
    private final View.OnClickListener Y = new g();
    private String v;
    private int w;
    private int x;
    private int y;
    private int z;

    class a implements b.AbstractC0134b {
        public a() {
        }

        @Override // com.yalantis.ucrop.view.b.AbstractC0134b
        public void a(float f) {
            UCropActivity.this.d0(f);
        }

        @Override // com.yalantis.ucrop.view.b.AbstractC0134b
        public void b() {
            UCropActivity.this.G.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.S.setClickable(false);
            UCropActivity.this.F = false;
            UCropActivity.this.z();
        }

        @Override // com.yalantis.ucrop.view.b.AbstractC0134b
        public void c(Exception exc) {
            UCropActivity.this.h0(exc);
            UCropActivity.this.finish();
        }

        @Override // com.yalantis.ucrop.view.b.AbstractC0134b
        public void d(float f) {
            UCropActivity.this.j0(f);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                UCropActivity.this.H.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).i(view.isSelected()));
                UCropActivity.this.H.z();
                if (!view.isSelected()) {
                    for (ViewGroup viewGroup : UCropActivity.this.P) {
                        viewGroup.setSelected(viewGroup == view);
                    }
                }
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements HorizontalProgressWheelView.a {
        public c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.H.z();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b(float f, float f2) {
            UCropActivity.this.H.x(f / 42.0f);
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c() {
            UCropActivity.this.H.t();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                UCropActivity.this.a0();
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                UCropActivity.this.b0(90);
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements HorizontalProgressWheelView.a {
        public f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.H.z();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b(float f, float f2) {
            if (f > 0.0f) {
                UCropActivity.this.H.C(UCropActivity.this.H.getCurrentScale() + (f * ((UCropActivity.this.H.getMaxScale() - UCropActivity.this.H.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.H.E(UCropActivity.this.H.getCurrentScale() + (f * ((UCropActivity.this.H.getMaxScale() - UCropActivity.this.H.getMinScale()) / 15000.0f)));
            }
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c() {
            UCropActivity.this.H.t();
        }
    }

    class g implements View.OnClickListener {
        public g() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                if (!view.isSelected()) {
                    UCropActivity.this.m0(view.getId());
                }
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements du2 {
        public h() {
        }

        @Override // defpackage.du2
        public void a(Uri uri, int i, int i2, int i3, int i4) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.i0(uri, uCropActivity.H.getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity.this.finish();
        }

        @Override // defpackage.du2
        public void b(Throwable th) {
            UCropActivity.this.h0(th);
            UCropActivity.this.finish();
        }
    }

    static {
        androidx.appcompat.app.e.z(true);
    }

    private void V() {
        if (this.S == null) {
            this.S = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, d.toolbar);
            this.S.setLayoutParams(layoutParams);
            this.S.setClickable(true);
        }
        ((RelativeLayout) findViewById(d.ucrop_photobox)).addView(this.S);
    }

    private void W(int i) {
        g6.a((ViewGroup) findViewById(d.ucrop_photobox), this.T);
        int i2 = 0;
        this.L.findViewById(d.text_view_scale).setVisibility(i == d.state_scale ? 0 : 8);
        this.J.findViewById(d.text_view_crop).setVisibility(i == d.state_aspect_ratio ? 0 : 8);
        View findViewById = this.K.findViewById(d.text_view_rotate);
        if (i != d.state_rotate) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    private void Y() {
        UCropView uCropView = (UCropView) findViewById(d.ucrop);
        this.G = uCropView;
        this.H = uCropView.getCropImageView();
        this.I = this.G.getOverlayView();
        this.H.setTransformImageListener(this.X);
        ((ImageView) findViewById(d.image_view_logo)).setColorFilter(this.D, PorterDuff.Mode.SRC_ATOP);
        findViewById(d.ucrop_frame).setBackgroundColor(this.A);
        if (!this.E) {
            ((RelativeLayout.LayoutParams) findViewById(d.ucrop_frame).getLayoutParams()).bottomMargin = 0;
            findViewById(d.ucrop_frame).requestLayout();
        }
    }

    private void Z(Intent intent) {
        String stringExtra = intent.getStringExtra(C0201.m82(26099));
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (valueOf == null) {
            valueOf = Z;
        }
        this.U = valueOf;
        this.V = intent.getIntExtra(C0201.m82(26100), 90);
        int[] intArrayExtra = intent.getIntArrayExtra(C0201.m82(26101));
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.W = intArrayExtra;
        }
        this.H.setMaxBitmapSize(intent.getIntExtra(C0201.m82(26102), 0));
        this.H.setMaxScaleMultiplier(intent.getFloatExtra(C0201.m82(26103), 10.0f));
        this.H.setImageToWrapCropBoundsAnimDuration((long) intent.getIntExtra(C0201.m82(26104), C0188.f21));
        this.I.setFreestyleCropEnabled(intent.getBooleanExtra(C0201.m82(26105), false));
        this.I.setDimmedColor(intent.getIntExtra(C0201.m82(26106), getResources().getColor(a.ucrop_color_default_dimmed)));
        this.I.setCircleDimmedLayer(intent.getBooleanExtra(C0201.m82(26107), false));
        this.I.setShowCropFrame(intent.getBooleanExtra(C0201.m82(26108), true));
        this.I.setCropFrameColor(intent.getIntExtra(C0201.m82(26109), getResources().getColor(a.ucrop_color_default_crop_frame)));
        this.I.setCropFrameStrokeWidth(intent.getIntExtra(C0201.m82(26110), getResources().getDimensionPixelSize(b.ucrop_default_crop_frame_stoke_width)));
        this.I.setShowCropGrid(intent.getBooleanExtra(C0201.m82(26111), true));
        this.I.setCropGridRowCount(intent.getIntExtra(C0201.m82(26112), 2));
        this.I.setCropGridColumnCount(intent.getIntExtra(C0201.m82(26113), 2));
        this.I.setCropGridColor(intent.getIntExtra(C0201.m82(26114), getResources().getColor(a.ucrop_color_default_crop_grid)));
        this.I.setCropGridCornerColor(intent.getIntExtra(C0201.m82(26115), getResources().getColor(a.ucrop_color_default_crop_grid)));
        this.I.setCropGridStrokeWidth(intent.getIntExtra(C0201.m82(26116), getResources().getDimensionPixelSize(b.ucrop_default_crop_grid_stoke_width)));
        float floatExtra = intent.getFloatExtra(C0201.m82(26117), 0.0f);
        float floatExtra2 = intent.getFloatExtra(C0201.m82(26118), 0.0f);
        int intExtra = intent.getIntExtra(C0201.m82(26119), 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(C0201.m82(26120));
        if (floatExtra > 0.0f && floatExtra2 > 0.0f) {
            ViewGroup viewGroup = this.J;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.H.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.H.setTargetAspectRatio(0.0f);
        } else {
            this.H.setTargetAspectRatio(((hu2) parcelableArrayListExtra.get(intExtra)).b() / ((hu2) parcelableArrayListExtra.get(intExtra)).c());
        }
        int intExtra2 = intent.getIntExtra(C0201.m82(26121), 0);
        int intExtra3 = intent.getIntExtra(C0201.m82(26122), 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.H.setMaxResultImageSizeX(intExtra2);
            this.H.setMaxResultImageSizeY(intExtra3);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a0() {
        GestureCropImageView gestureCropImageView = this.H;
        gestureCropImageView.x(-gestureCropImageView.getCurrentAngle());
        this.H.z();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b0(int i) {
        this.H.x((float) i);
        this.H.z();
    }

    private void c0(int i) {
        GestureCropImageView gestureCropImageView = this.H;
        int[] iArr = this.W;
        boolean z2 = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.H;
        int[] iArr2 = this.W;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z2 = true;
        }
        gestureCropImageView2.setRotateEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d0(float f2) {
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), C0201.m82(26123), Float.valueOf(f2)));
        }
    }

    private void e0(int i) {
        TextView textView = this.Q;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    private void f0(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra(C0201.m82(26124));
        Uri uri2 = (Uri) intent.getParcelableExtra(C0201.m82(26125));
        Z(intent);
        if (uri == null || uri2 == null) {
            h0(new NullPointerException(getString(g.ucrop_error_input_data_is_absent)));
            finish();
            return;
        }
        try {
            this.H.n(uri, uri2);
        } catch (Exception e2) {
            h0(e2);
            finish();
        }
    }

    private void g0() {
        if (!this.E) {
            c0(0);
        } else if (this.J.getVisibility() == 0) {
            m0(d.state_aspect_ratio);
        } else {
            m0(d.state_scale);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j0(float f2) {
        TextView textView = this.R;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), C0201.m82(26126), Integer.valueOf((int) (f2 * 100.0f))));
        }
    }

    private void k0(int i) {
        TextView textView = this.R;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @TargetApi(21)
    private void l0(int i) {
        Window window;
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.addFlags(C0188.f23);
            window.setStatusBarColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m0(int i) {
        if (this.E) {
            this.J.setSelected(i == d.state_aspect_ratio);
            this.K.setSelected(i == d.state_rotate);
            this.L.setSelected(i == d.state_scale);
            int i2 = 8;
            this.M.setVisibility(i == d.state_aspect_ratio ? 0 : 8);
            this.N.setVisibility(i == d.state_rotate ? 0 : 8);
            ViewGroup viewGroup = this.O;
            if (i == d.state_scale) {
                i2 = 0;
            }
            viewGroup.setVisibility(i2);
            W(i);
            if (i == d.state_scale) {
                c0(0);
            } else if (i == d.state_rotate) {
                c0(1);
            } else {
                c0(2);
            }
        }
    }

    private void n0() {
        l0(this.x);
        Toolbar toolbar = (Toolbar) findViewById(d.toolbar);
        toolbar.setBackgroundColor(this.w);
        toolbar.setTitleTextColor(this.z);
        TextView textView = (TextView) toolbar.findViewById(d.toolbar_title);
        textView.setTextColor(this.z);
        textView.setText(this.v);
        Drawable mutate = androidx.core.content.b.f(this, this.B).mutate();
        mutate.setColorFilter(this.z, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        I(toolbar);
        androidx.appcompat.app.a B2 = B();
        if (B2 != null) {
            B2.s(false);
        }
    }

    private void o0(Intent intent) {
        int intExtra = intent.getIntExtra(C0201.m82(26127), 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(C0201.m82(26128));
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new hu2(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new hu2(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new hu2(getString(g.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new hu2(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new hu2(null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(d.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(e.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.y);
            aspectRatioTextView.setAspectRatio((hu2) it.next());
            linearLayout.addView(frameLayout);
            this.P.add(frameLayout);
        }
        this.P.get(intExtra).setSelected(true);
        for (ViewGroup viewGroup : this.P) {
            viewGroup.setOnClickListener(new b());
        }
    }

    private void p0() {
        this.Q = (TextView) findViewById(d.text_view_rotate);
        ((HorizontalProgressWheelView) findViewById(d.rotate_scroll_wheel)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(d.rotate_scroll_wheel)).setMiddleLineColor(this.y);
        findViewById(d.wrapper_reset_rotate).setOnClickListener(new d());
        findViewById(d.wrapper_rotate_by_angle).setOnClickListener(new e());
        e0(this.y);
    }

    private void q0() {
        this.R = (TextView) findViewById(d.text_view_scale);
        ((HorizontalProgressWheelView) findViewById(d.scale_scroll_wheel)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(d.scale_scroll_wheel)).setMiddleLineColor(this.y);
        k0(this.y);
    }

    private void r0() {
        ImageView imageView = (ImageView) findViewById(d.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(d.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(d.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new tu2(imageView.getDrawable(), this.y));
        imageView2.setImageDrawable(new tu2(imageView2.getDrawable(), this.y));
        imageView3.setImageDrawable(new tu2(imageView3.getDrawable(), this.y));
    }

    private void s0(Intent intent) {
        this.x = intent.getIntExtra(C0201.m82(26129), androidx.core.content.b.d(this, a.ucrop_color_statusbar));
        this.w = intent.getIntExtra(C0201.m82(26130), androidx.core.content.b.d(this, a.ucrop_color_toolbar));
        this.y = intent.getIntExtra(C0201.m82(26131), androidx.core.content.b.d(this, a.ucrop_color_active_controls_color));
        this.z = intent.getIntExtra(C0201.m82(26132), androidx.core.content.b.d(this, a.ucrop_color_toolbar_widget));
        this.B = intent.getIntExtra(C0201.m82(26133), c.ucrop_ic_cross);
        this.C = intent.getIntExtra(C0201.m82(26134), c.ucrop_ic_done);
        String stringExtra = intent.getStringExtra(C0201.m82(26135));
        this.v = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(g.ucrop_label_edit_photo);
        }
        this.v = stringExtra;
        this.D = intent.getIntExtra(C0201.m82(26136), androidx.core.content.b.d(this, a.ucrop_color_default_logo));
        this.E = !intent.getBooleanExtra(C0201.m82(26137), false);
        this.A = intent.getIntExtra(C0201.m82(26138), androidx.core.content.b.d(this, a.ucrop_color_crop_background));
        n0();
        Y();
        if (this.E) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(d.ucrop_photobox)).findViewById(d.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(e.ucrop_controls, viewGroup, true);
            i5 i5Var = new i5();
            this.T = i5Var;
            i5Var.b0(50);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(d.state_aspect_ratio);
            this.J = viewGroup2;
            viewGroup2.setOnClickListener(this.Y);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(d.state_rotate);
            this.K = viewGroup3;
            viewGroup3.setOnClickListener(this.Y);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(d.state_scale);
            this.L = viewGroup4;
            viewGroup4.setOnClickListener(this.Y);
            this.M = (ViewGroup) findViewById(d.layout_aspect_ratio);
            this.N = (ViewGroup) findViewById(d.layout_rotate_wheel);
            this.O = (ViewGroup) findViewById(d.layout_scale_wheel);
            o0(intent);
            p0();
            q0();
            r0();
        }
    }

    public void X() {
        this.S.setClickable(true);
        this.F = true;
        z();
        this.H.u(this.U, this.V, new h());
    }

    public void h0(Throwable th) {
        setResult(96, new Intent().putExtra(C0201.m82(26139), th));
    }

    public void i0(Uri uri, float f2, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra(C0201.m82(26140), uri).putExtra(C0201.m82(26141), f2).putExtra(C0201.m82(26142), i3).putExtra(C0201.m82(26143), i4).putExtra(C0201.m82(26144), i).putExtra(C0201.m82(26145), i2));
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        setContentView(e.ucrop_activity_photobox);
        Intent intent = getIntent();
        s0(intent);
        f0(intent);
        g0();
        V();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(f.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(d.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.z, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e2) {
                Log.i(C0201.m82(26147), String.format(C0201.m82(26146), e2.getMessage(), getString(g.ucrop_mutate_exception_hint)));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(d.menu_crop);
        Drawable f2 = androidx.core.content.b.f(this, this.C);
        if (f2 != null) {
            f2.mutate();
            f2.setColorFilter(this.z, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(f2);
        }
        return true;
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onDestroy() {
        w30.k(this);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        w30.r(menuItem);
        try {
            if (menuItem.getItemId() == d.menu_crop) {
                X();
                return true;
            } else if (menuItem.getItemId() == 16908332) {
                onBackPressed();
                w30.s();
                return true;
            } else {
                boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                w30.s();
                return onOptionsItemSelected;
            }
        } finally {
            w30.s();
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(d.menu_crop).setVisible(!this.F);
        menu.findItem(d.menu_loader).setVisible(this.F);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onStop() {
        w30.D(this);
        super.onStop();
        GestureCropImageView gestureCropImageView = this.H;
        if (gestureCropImageView != null) {
            gestureCropImageView.t();
        }
    }
}
