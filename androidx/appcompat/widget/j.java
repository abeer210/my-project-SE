package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;

/* compiled from: AppCompatDrawableManager */
public final class j {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static j c;
    private m0 a;

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatDrawableManager */
    public static class a implements m0.e {
        private final int[] a = {h.abc_textfield_search_default_mtrl_alpha, h.abc_textfield_default_mtrl_alpha, h.abc_ab_share_pack_mtrl_alpha};
        private final int[] b = {h.abc_ic_commit_search_api_mtrl_alpha, h.abc_seekbar_tick_mark_material, h.abc_ic_menu_share_mtrl_alpha, h.abc_ic_menu_copy_mtrl_am_alpha, h.abc_ic_menu_cut_mtrl_alpha, h.abc_ic_menu_selectall_mtrl_alpha, h.abc_ic_menu_paste_mtrl_am_alpha};
        private final int[] c = {h.abc_textfield_activated_mtrl_alpha, h.abc_textfield_search_activated_mtrl_alpha, h.abc_cab_background_top_mtrl_alpha, h.abc_text_cursor_material, h.abc_text_select_handle_left_mtrl_dark, h.abc_text_select_handle_middle_mtrl_dark, h.abc_text_select_handle_right_mtrl_dark, h.abc_text_select_handle_left_mtrl_light, h.abc_text_select_handle_middle_mtrl_light, h.abc_text_select_handle_right_mtrl_light};
        private final int[] d = {h.abc_popup_background_mtrl_mult, h.abc_cab_background_internal_bg, h.abc_menu_hardkey_panel_mtrl_mult};
        private final int[] e = {h.abc_tab_indicator_material, h.abc_textfield_search_material};
        private final int[] f = {h.abc_btn_check_material, h.abc_btn_radio_material, h.abc_btn_check_material_anim, h.abc_btn_radio_material_anim};

        private boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i) {
            int b2 = s0.b(context, d.colorControlHighlight);
            int a2 = s0.a(context, d.colorButtonNormal);
            return new ColorStateList(new int[][]{s0.b, s0.d, s0.c, s0.f}, new int[]{a2, n1.j(b2, i), n1.j(b2, i), i});
        }

        private ColorStateList i(Context context) {
            return h(context, s0.b(context, d.colorAccent));
        }

        private ColorStateList j(Context context) {
            return h(context, s0.b(context, d.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d2 = s0.d(context, d.colorSwitchThumbNormal);
            if (d2 == null || !d2.isStateful()) {
                iArr[0] = s0.b;
                iArr2[0] = s0.a(context, d.colorSwitchThumbNormal);
                iArr[1] = s0.e;
                iArr2[1] = s0.b(context, d.colorControlActivated);
                iArr[2] = s0.f;
                iArr2[2] = s0.b(context, d.colorSwitchThumbNormal);
            } else {
                iArr[0] = s0.b;
                iArr2[0] = d2.getColorForState(iArr[0], 0);
                iArr[1] = s0.e;
                iArr2[1] = s0.b(context, d.colorControlActivated);
                iArr[2] = s0.f;
                iArr2[2] = d2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.b;
            }
            drawable.setColorFilter(j.e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.e
        public boolean a(Context context, int i, Drawable drawable) {
            int i2;
            boolean z;
            PorterDuff.Mode mode = j.b;
            int i3 = 16842801;
            if (f(this.a, i)) {
                i3 = d.colorControlNormal;
            } else if (f(this.c, i)) {
                i3 = d.colorControlActivated;
            } else if (f(this.d, i)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i == h.abc_list_divider_mtrl_alpha) {
                i3 = 16842800;
                i2 = Math.round(40.8f);
                z = true;
                if (!z) {
                    return false;
                }
                if (e0.a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(j.e(s0.b(context, i3), mode));
                if (i2 != -1) {
                    drawable.setAlpha(i2);
                }
                return true;
            } else if (i != h.abc_dialog_material_background) {
                i2 = -1;
                z = false;
                i3 = 0;
                if (!z) {
                }
            }
            i2 = -1;
            z = true;
            if (!z) {
            }
        }

        @Override // androidx.appcompat.widget.m0.e
        public PorterDuff.Mode b(int i) {
            if (i == h.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable c(m0 m0Var, Context context, int i) {
            if (i != h.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{m0Var.j(context, h.abc_cab_background_internal_bg), m0Var.j(context, h.abc_cab_background_top_mtrl_alpha)});
        }

        @Override // androidx.appcompat.widget.m0.e
        public ColorStateList d(Context context, int i) {
            if (i == h.abc_edit_text_material) {
                return n.c(context, f.abc_tint_edittext);
            }
            if (i == h.abc_switch_track_mtrl_alpha) {
                return n.c(context, f.abc_tint_switch_track);
            }
            if (i == h.abc_switch_thumb_material) {
                return k(context);
            }
            if (i == h.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i == h.abc_btn_borderless_material) {
                return g(context);
            }
            if (i == h.abc_btn_colored_material) {
                return i(context);
            }
            if (i == h.abc_spinner_mtrl_am_alpha || i == h.abc_spinner_textfield_background_material) {
                return n.c(context, f.abc_tint_spinner);
            }
            if (f(this.b, i)) {
                return s0.d(context, d.colorControlNormal);
            }
            if (f(this.e, i)) {
                return n.c(context, f.abc_tint_default);
            }
            if (f(this.f, i)) {
                return n.c(context, f.abc_tint_btn_checkable);
            }
            if (i == h.abc_seekbar_thumb_material) {
                return n.c(context, f.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public boolean e(Context context, int i, Drawable drawable) {
            if (i == h.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(16908288), s0.b(context, d.colorControlNormal), j.b);
                l(layerDrawable.findDrawableByLayerId(16908303), s0.b(context, d.colorControlNormal), j.b);
                l(layerDrawable.findDrawableByLayerId(16908301), s0.b(context, d.colorControlActivated), j.b);
                return true;
            } else if (i != h.abc_ratingbar_material && i != h.abc_ratingbar_indicator_material && i != h.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(16908288), s0.a(context, d.colorControlNormal), j.b);
                l(layerDrawable2.findDrawableByLayerId(16908303), s0.b(context, d.colorControlActivated), j.b);
                l(layerDrawable2.findDrawableByLayerId(16908301), s0.b(context, d.colorControlActivated), j.b);
                return true;
            }
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (c == null) {
                h();
            }
            jVar = c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (j.class) {
            l = m0.l(i, mode);
        }
        return l;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (c == null) {
                j jVar = new j();
                c = jVar;
                jVar.a = m0.h();
                c.a.u(new a());
            }
        }
    }

    public static void i(Drawable drawable, v0 v0Var, int[] iArr) {
        m0.w(drawable, v0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.j(context, i);
    }

    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.k(context, i, z);
    }

    public synchronized ColorStateList f(Context context, int i) {
        return this.a.m(context, i);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}
