package net.alhazmy13.hijridatepicker.time;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Calendar;
import net.alhazmy13.hijridatepicker.time.g;
import vigqyno.C0201;

public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {
    private float A;
    private AccessibilityManager B;
    private Handler C = new Handler();
    private final int a;
    private final int b;
    private g c;
    private e d;
    private c e;
    private g f;
    private boolean g;
    private int h;
    private b i;
    private a j;
    private d k;
    private d l;
    private d m;
    private c n;
    private c o;
    private c p;
    private View q;
    private int[] u;
    private boolean v;
    private int w = -1;
    private boolean x;
    private int y;
    private float z;

    class a implements Runnable {
        public a() {
        }

        public void run() {
            RadialPickerLayout.this.j.setAmOrPmPressed(RadialPickerLayout.this.w);
            RadialPickerLayout.this.j.invalidate();
        }
    }

    class b implements Runnable {
        public final /* synthetic */ Boolean[] a;

        public b(Boolean[] boolArr) {
            this.a = boolArr;
        }

        public void run() {
            RadialPickerLayout.this.x = true;
            RadialPickerLayout radialPickerLayout = RadialPickerLayout.this;
            radialPickerLayout.c = radialPickerLayout.l(radialPickerLayout.y, this.a[0].booleanValue(), false);
            RadialPickerLayout radialPickerLayout2 = RadialPickerLayout.this;
            radialPickerLayout2.c = radialPickerLayout2.p(radialPickerLayout2.c, RadialPickerLayout.this.getCurrentItemShowing());
            RadialPickerLayout radialPickerLayout3 = RadialPickerLayout.this;
            radialPickerLayout3.o(radialPickerLayout3.c, true, RadialPickerLayout.this.getCurrentItemShowing());
            RadialPickerLayout.this.e.c(RadialPickerLayout.this.c);
        }
    }

    public interface c {
        void a();

        void b(int i);

        void c(g gVar);
    }

    public RadialPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnTouchListener(this);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = ViewConfiguration.getTapTimeout();
        this.x = false;
        b bVar = new b(context);
        this.i = bVar;
        addView(bVar);
        a aVar = new a(context);
        this.j = aVar;
        addView(aVar);
        c cVar = new c(context);
        this.n = cVar;
        addView(cVar);
        c cVar2 = new c(context);
        this.o = cVar2;
        addView(cVar2);
        c cVar3 = new c(context);
        this.p = cVar3;
        addView(cVar3);
        d dVar = new d(context);
        this.k = dVar;
        addView(dVar);
        d dVar2 = new d(context);
        this.l = dVar2;
        addView(dVar2);
        d dVar3 = new d(context);
        this.m = dVar3;
        addView(dVar3);
        n();
        this.c = null;
        this.v = true;
        View view = new View(context);
        this.q = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.q.setBackgroundColor(androidx.core.content.b.d(context, net.alhazmy13.hijridatepicker.c.mdtp_transparent_black));
        this.q.setVisibility(4);
        addView(this.q);
        this.B = (AccessibilityManager) context.getSystemService(C0201.m82(34628));
    }

    private int getCurrentlyShowingValue() {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.f.getHour();
        }
        if (currentItemShowing == 1) {
            return this.f.getMinute();
        }
        if (currentItemShowing != 2) {
            return -1;
        }
        return this.f.getSecond();
    }

    private int k(float f2, float f3, boolean z2, Boolean[] boolArr) {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.n.a(f2, f3, z2, boolArr);
        }
        if (currentItemShowing == 1) {
            return this.o.a(f2, f3, z2, boolArr);
        }
        if (currentItemShowing != 2) {
            return -1;
        }
        return this.p.a(f2, f3, z2, boolArr);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        if (r8 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r7 == 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        if (r0 == 2) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007f  */
    private g l(int i2, boolean z2, boolean z3) {
        int i3;
        int i4;
        if (i2 == -1) {
            return null;
        }
        int currentItemShowing = getCurrentItemShowing();
        int i5 = 0;
        if (!z3 && (currentItemShowing == 1 || currentItemShowing == 2)) {
            i3 = s(i2);
        } else {
            i3 = r(i2, 0);
        }
        int i6 = 6;
        if (currentItemShowing == 0) {
            i6 = 30;
        }
        if (currentItemShowing == 0) {
            if (this.g) {
                if (i3 != 0 || !z2) {
                    if (i3 == 360) {
                    }
                    i4 = i3 / i6;
                    if (currentItemShowing == 0 && this.g && !z2 && i3 != 0) {
                        i4 += 12;
                    }
                    if (currentItemShowing != 0) {
                        if (!this.g && getIsCurrentlyAmOrPm() == 1 && i3 != 360) {
                            i4 += 12;
                        }
                        if (!(!this.g && getIsCurrentlyAmOrPm() == 0 && i3 == 360)) {
                            i5 = i4;
                        }
                        return new g(i5, this.f.getMinute(), this.f.getSecond());
                    } else if (currentItemShowing == 1) {
                        return new g(this.f.getHour(), i4, this.f.getSecond());
                    } else {
                        if (currentItemShowing != 2) {
                            return this.f;
                        }
                        return new g(this.f.getHour(), this.f.getMinute(), i4);
                    }
                }
            }
            i3 = 360;
            i4 = i3 / i6;
            i4 += 12;
            if (currentItemShowing != 0) {
            }
        } else {
            if (i3 == 360) {
                if (currentItemShowing != 1) {
                }
            }
            i4 = i3 / i6;
            i4 += 12;
            if (currentItemShowing != 0) {
            }
        }
        i3 = 0;
        i4 = i3 / i6;
        i4 += 12;
        if (currentItemShowing != 0) {
        }
    }

    private boolean m(int i2) {
        return this.g && i2 <= 12 && i2 != 0;
    }

    private void n() {
        this.u = new int[361];
        int i2 = 0;
        int i3 = 8;
        int i4 = 1;
        for (int i5 = 0; i5 < 361; i5++) {
            this.u[i5] = i2;
            if (i4 == i3) {
                i2 += 6;
                if (i2 == 360) {
                    i3 = 7;
                } else {
                    i3 = i2 % 30 == 0 ? 14 : 4;
                }
                i4 = 1;
            } else {
                i4++;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o(g gVar, boolean z2, int i2) {
        if (i2 == 0) {
            int hour = gVar.getHour();
            boolean m2 = m(hour);
            int i3 = hour % 12;
            int i4 = (i3 * 360) / 12;
            if (!this.g) {
                hour = i3;
            }
            if (!this.g && hour == 0) {
                hour += 12;
            }
            this.n.b(i4, m2, z2);
            this.k.setSelection(hour);
            if (gVar.getMinute() != this.f.getMinute()) {
                this.o.b((gVar.getMinute() * 360) / 60, m2, z2);
                this.l.setSelection(gVar.getMinute());
            }
            if (gVar.getSecond() != this.f.getSecond()) {
                this.p.b((gVar.getSecond() * 360) / 60, m2, z2);
                this.m.setSelection(gVar.getSecond());
            }
        } else if (i2 == 1) {
            this.o.b((gVar.getMinute() * 360) / 60, false, z2);
            this.l.setSelection(gVar.getMinute());
            if (gVar.getSecond() != this.f.getSecond()) {
                this.p.b((gVar.getSecond() * 360) / 60, false, z2);
                this.m.setSelection(gVar.getSecond());
            }
        } else if (i2 == 2) {
            this.p.b((gVar.getSecond() * 360) / 60, false, z2);
            this.m.setSelection(gVar.getSecond());
        }
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            this.n.invalidate();
            this.k.invalidate();
        } else if (currentItemShowing == 1) {
            this.o.invalidate();
            this.l.invalidate();
        } else if (currentItemShowing == 2) {
            this.p.invalidate();
            this.m.invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private g p(g gVar, int i2) {
        if (i2 == 0) {
            return this.d.b(gVar, g.b.HOUR);
        }
        if (i2 == 1) {
            return this.d.b(gVar, g.b.MINUTE);
        }
        if (i2 != 2) {
            return this.f;
        }
        return this.d.b(gVar, g.b.SECOND);
    }

    private void q(int i2, g gVar) {
        g p2 = p(gVar, i2);
        this.f = p2;
        o(p2, false, i2);
    }

    private static int r(int i2, int i3) {
        int i4 = (i2 / 30) * 30;
        int i5 = i4 + 30;
        if (i3 != 1) {
            if (i3 == -1) {
                return i2 == i4 ? i4 - 30 : i4;
            }
            if (i2 - i4 < i5 - i2) {
                return i4;
            }
        }
        return i5;
    }

    private int s(int i2) {
        int[] iArr = this.u;
        if (iArr == null) {
            return -1;
        }
        return iArr[i2];
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        Calendar instance = Calendar.getInstance();
        instance.set(10, getHours());
        instance.set(12, getMinutes());
        instance.set(13, getSeconds());
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), instance.getTimeInMillis(), this.g ? 129 : 1));
        return true;
    }

    public int getCurrentItemShowing() {
        int i2 = this.h;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            return this.h;
        }
        Log.e(C0201.m82(34630), C0201.m82(34629) + this.h);
        return -1;
    }

    public int getHours() {
        return this.f.getHour();
    }

    public int getIsCurrentlyAmOrPm() {
        if (this.f.d()) {
            return 0;
        }
        return this.f.e() ? 1 : -1;
    }

    public int getMinutes() {
        return this.f.getMinute();
    }

    public int getSeconds() {
        return this.f.getSecond();
    }

    public g getTime() {
        return this.f;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        } else if (i2 >= 16) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r11 <= ((float) r7)) goto L_0x018b;
     */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int k2;
        g gVar;
        g gVar2;
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        Boolean[] boolArr = {Boolean.FALSE};
        int action = motionEvent.getAction();
        if (action != 0) {
            String r6 = C0201.m82(34631);
            if (action != 1) {
                if (action == 2) {
                    if (!this.v) {
                        Log.e(r6, C0201.m82(34632));
                        return true;
                    }
                    float abs = Math.abs(y2 - this.A);
                    float abs2 = Math.abs(x2 - this.z);
                    if (!this.x) {
                        int i2 = this.a;
                        if (abs2 <= ((float) i2)) {
                        }
                    }
                    int i3 = this.w;
                    if (i3 == 0 || i3 == 1) {
                        this.C.removeCallbacksAndMessages(null);
                        if (this.j.a(x2, y2) != this.w) {
                            this.j.setAmOrPmPressed(-1);
                            this.j.invalidate();
                            this.w = -1;
                        }
                    } else if (this.y != -1) {
                        this.x = true;
                        this.C.removeCallbacksAndMessages(null);
                        int k3 = k(x2, y2, true, boolArr);
                        if (k3 != -1) {
                            int currentItemShowing = getCurrentItemShowing();
                            if (currentItemShowing == 0) {
                                gVar = this.d.b(l(k3, boolArr[0].booleanValue(), false), null);
                            } else if (currentItemShowing != 1) {
                                gVar = this.d.b(l(k3, boolArr[0].booleanValue(), false), g.b.MINUTE);
                            } else {
                                gVar = this.d.b(l(k3, boolArr[0].booleanValue(), false), g.b.HOUR);
                            }
                            o(gVar, true, getCurrentItemShowing());
                            if (gVar != null && ((gVar2 = this.c) == null || !gVar2.equals(gVar))) {
                                this.d.a();
                                this.c = gVar;
                                this.e.c(gVar);
                            }
                        }
                        return true;
                    }
                }
            } else if (!this.v) {
                Log.d(r6, C0201.m82(34633));
                this.e.a();
                return true;
            } else {
                this.C.removeCallbacksAndMessages(null);
                int i4 = this.w;
                if (i4 == 0 || i4 == 1) {
                    int a2 = this.j.a(x2, y2);
                    this.j.setAmOrPmPressed(-1);
                    this.j.invalidate();
                    if (a2 == this.w) {
                        this.j.setAmOrPm(a2);
                        if (getIsCurrentlyAmOrPm() != a2) {
                            g gVar3 = new g(this.f);
                            int i5 = this.w;
                            if (i5 == 0) {
                                gVar3.f();
                            } else if (i5 == 1) {
                                gVar3.g();
                            }
                            g p2 = p(gVar3, 0);
                            o(p2, false, 0);
                            this.f = p2;
                            this.e.c(p2);
                        }
                    }
                    this.w = -1;
                } else {
                    if (!(this.y == -1 || (k2 = k(x2, y2, this.x, boolArr)) == -1)) {
                        g p3 = p(l(k2, boolArr[0].booleanValue(), !this.x), getCurrentItemShowing());
                        o(p3, false, getCurrentItemShowing());
                        this.f = p3;
                        this.e.c(p3);
                        this.e.b(getCurrentItemShowing());
                    }
                    this.x = false;
                    return true;
                }
            }
            return false;
        } else if (!this.v) {
            return true;
        } else {
            this.z = x2;
            this.A = y2;
            this.c = null;
            this.x = false;
            if (this.g || this.d.getVersion() != f.VERSION_1) {
                this.w = -1;
            } else {
                this.w = this.j.a(x2, y2);
            }
            int i6 = this.w;
            if (i6 == 0 || i6 == 1) {
                this.d.a();
                this.y = -1;
                this.C.postDelayed(new a(), (long) this.b);
            } else {
                int k4 = k(x2, y2, this.B.isTouchExplorationEnabled(), boolArr);
                this.y = k4;
                if (this.d.c(l(k4, boolArr[0].booleanValue(), false), getCurrentItemShowing())) {
                    this.y = -1;
                }
                if (this.y != -1) {
                    this.d.a();
                    this.C.postDelayed(new b(boolArr), (long) this.b);
                }
            }
            return true;
        }
    }

    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        int i3;
        g gVar;
        g gVar2;
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 0;
        int i6 = i2 == 4096 ? 1 : i2 == 8192 ? -1 : 0;
        if (i6 == 0) {
            return false;
        }
        int currentlyShowingValue = getCurrentlyShowingValue();
        int currentItemShowing = getCurrentItemShowing();
        int i7 = 6;
        if (currentItemShowing == 0) {
            i7 = 30;
            currentlyShowingValue %= 12;
        } else if (!(currentItemShowing == 1 || currentItemShowing == 2)) {
            i7 = 0;
        }
        int r = r(currentlyShowingValue * i7, i6) / i7;
        if (currentItemShowing != 0) {
            i3 = 55;
        } else if (this.g) {
            i3 = 23;
        } else {
            i3 = 12;
            i5 = 1;
        }
        if (r > i3) {
            r = i5;
        } else if (r < i5) {
            r = i3;
        }
        if (currentItemShowing == 0) {
            gVar2 = new g(r, this.f.getMinute(), this.f.getSecond());
        } else if (currentItemShowing == 1) {
            gVar2 = new g(this.f.getHour(), r, this.f.getSecond());
        } else if (currentItemShowing != 2) {
            gVar = this.f;
            q(currentItemShowing, gVar);
            this.e.c(gVar);
            return true;
        } else {
            gVar2 = new g(this.f.getHour(), this.f.getMinute(), r);
        }
        gVar = gVar2;
        q(currentItemShowing, gVar);
        this.e.c(gVar);
        return true;
    }

    public void setAmOrPm(int i2) {
        this.j.setAmOrPm(i2);
        this.j.invalidate();
        g gVar = new g(this.f);
        if (i2 == 0) {
            gVar.f();
        } else if (i2 == 1) {
            gVar.g();
        }
        g p2 = p(gVar, 0);
        o(p2, false, 0);
        this.f = p2;
        this.e.c(p2);
    }

    public void setOnValueSelectedListener(c cVar) {
        this.e = cVar;
    }

    public void setTime(g gVar) {
        q(0, gVar);
    }
}
