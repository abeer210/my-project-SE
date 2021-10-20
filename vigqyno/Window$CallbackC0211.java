package vigqyno;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: vigqyno.▮  reason: contains not printable characters */
public class Window$CallbackC0211 implements Window.Callback {

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private final Window.Callback f34;

    public Window$CallbackC0211(Window.Callback callback) {
        this.f34 = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return m121(motionEvent, this.f34);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m117(keyEvent, this.f34);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return m109(keyEvent, this.f34);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return m113(accessibilityEvent, this.f34);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m118(motionEvent, this.f34);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return m110(motionEvent, this.f34);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        m104(actionMode, this.f34);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        m114(actionMode, this.f34);
    }

    public void onAttachedToWindow() {
        m115(this.f34);
    }

    public void onContentChanged() {
        m119(this.f34);
    }

    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        return m116(i, menu, this.f34);
    }

    @Nullable
    public View onCreatePanelView(int i) {
        return m102(i, this.f34);
    }

    public void onDetachedFromWindow() {
        m122(this.f34);
    }

    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        return m107(i, menuItem, this.f34);
    }

    public boolean onMenuOpened(int i, @NonNull Menu menu) {
        return m120(i, menu, this.f34);
    }

    public void onPanelClosed(int i, @NonNull Menu menu) {
        m103(i, menu, this.f34);
    }

    public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        return m108(i, view, menu, this.f34);
    }

    public boolean onSearchRequested() {
        return m112(this.f34);
    }

    @RequiresApi(api = 23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return m111(searchEvent, this.f34);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        m105(layoutParams, this.f34);
    }

    public void onWindowFocusChanged(boolean z) {
        m106(z, this.f34);
    }

    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return m101(callback, this.f34);
    }

    @RequiresApi(api = 23)
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return m100(callback, i, this.f34);
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native ActionMode m100(ActionMode.Callback callback, int i, Window.Callback callback2);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native ActionMode m101(ActionMode.Callback callback, Window.Callback callback2);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native View m102(int i, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native void m103(int i, @NonNull Menu menu, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native void m104(ActionMode actionMode, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native void m105(WindowManager.LayoutParams layoutParams, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native void m106(boolean z, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native boolean m107(int i, @NonNull MenuItem menuItem, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native boolean m108(int i, @Nullable View view, @NonNull Menu menu, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native boolean m109(KeyEvent keyEvent, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native boolean m110(MotionEvent motionEvent, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native boolean m111(SearchEvent searchEvent, Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native boolean m112(Window.Callback callback);

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public native boolean m113(AccessibilityEvent accessibilityEvent, Window.Callback callback);

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public native void m114(ActionMode actionMode, Window.Callback callback);

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public native void m115(Window.Callback callback);

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public native boolean m116(int i, @NonNull Menu menu, Window.Callback callback);

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public native boolean m117(KeyEvent keyEvent, Window.Callback callback);

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public native boolean m118(MotionEvent motionEvent, Window.Callback callback);

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public native void m119(Window.Callback callback);

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public native boolean m120(int i, @NonNull Menu menu, Window.Callback callback);

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public native boolean m121(MotionEvent motionEvent, Window.Callback callback);

    /* renamed from: ┃  reason: not valid java name and contains not printable characters */
    public native void m122(Window.Callback callback);
}
