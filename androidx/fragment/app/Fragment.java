package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.n;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.g, s, androidx.savedstate.b {
    public static final int ACTIVITY_CREATED = 0;
    public static final int CREATED = 0;
    public static final int INITIALIZING = 0;
    public static final int RESUMED = 0;
    public static final int STARTED = 0;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public boolean mAdded;
    public d mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    public j mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public j mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public h mHost;
    public boolean mInLayout;
    public View mInnerView;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public h mLifecycleRegistry;
    public d.b mMaxState;
    public boolean mMenuVisible;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public androidx.savedstate.a mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public r mViewLifecycleOwner;
    public l<androidx.lifecycle.g> mViewLifecycleOwnerLiveData;
    public String mWho;

    class a implements Runnable {
        public a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener();
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends e {
        public c() {
        }

        @Override // androidx.fragment.app.e
        public View c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException(C0201.m82(25275) + this + C0201.m82(25276));
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return Fragment.this.mView != null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {
        public View a;
        public Animator b;
        public int c;
        public int d;
        public int e;
        public int f;
        public Object g = null;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Boolean m;
        public Boolean n;
        public n o;
        public n p;
        public boolean q;
        public f r;
        public boolean s;

        public d() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* access modifiers changed from: package-private */
    public interface f {
        void a();

        void b();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public final Bundle a;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    static {
        C0201.m83(Fragment.class, 348);
    }

    public Fragment() {
        this.mState = 0;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new j();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = d.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new l<>();
        initLifecycle();
    }

    private d ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new d();
        }
        return this.mAnimationInfo;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new h(this);
        this.mSavedStateRegistryController = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.a(new androidx.lifecycle.e() {
                /* class androidx.fragment.app.Fragment.AnonymousClass2 */

                @Override // androidx.lifecycle.e
                public void c(androidx.lifecycle.g gVar, d.a aVar) {
                    View view;
                    if (aVar == d.a.ON_STOP && (view = Fragment.this.mView) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void callStartTransitionListener() {
        d dVar = this.mAnimationInfo;
        f fVar = null;
        if (dVar != null) {
            dVar.q = false;
            f fVar2 = dVar.r;
            dVar.r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print(C0201.m82(30937));
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(C0201.m82(30938));
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(C0201.m82(30939));
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print(C0201.m82(30940));
        printWriter.print(this.mState);
        printWriter.print(C0201.m82(30941));
        printWriter.print(this.mWho);
        printWriter.print(C0201.m82(30942));
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print(C0201.m82(30943));
        printWriter.print(this.mAdded);
        printWriter.print(C0201.m82(30944));
        printWriter.print(this.mRemoving);
        printWriter.print(C0201.m82(30945));
        printWriter.print(this.mFromLayout);
        printWriter.print(C0201.m82(30946));
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print(C0201.m82(30947));
        printWriter.print(this.mHidden);
        printWriter.print(C0201.m82(30948));
        printWriter.print(this.mDetached);
        printWriter.print(C0201.m82(30949));
        printWriter.print(this.mMenuVisible);
        printWriter.print(C0201.m82(30950));
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print(C0201.m82(30951));
        printWriter.print(this.mRetainInstance);
        printWriter.print(C0201.m82(30952));
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30953));
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30954));
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30955));
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30956));
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30957));
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30958));
            printWriter.println(this.mSavedViewState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30959));
            printWriter.print(targetFragment);
            printWriter.print(C0201.m82(30960));
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30961));
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30962));
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30963));
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30964));
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(30965));
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print(C0201.m82(30966));
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            q4.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println(C0201.m82(30967) + this.mChildFragmentManager + C0201.m82(30968));
        j jVar = this.mChildFragmentManager;
        jVar.b(str + C0201.m82(30969), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.q0(str);
    }

    public final d getActivity() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return (d) hVar.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        d dVar = this.mAnimationInfo;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        d dVar = this.mAnimationInfo;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.a;
    }

    public Animator getAnimator() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final i getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C0201.m82(30970) + this + C0201.m82(30971));
    }

    public Context getContext() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.f();
    }

    public Object getEnterTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.g;
    }

    public n getEnterTransitionCallback() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    public Object getExitTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    public n getExitTransitionCallback() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.p;
    }

    public final i getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public q4 getLoaderManager() {
        return q4.b(this);
    }

    public int getNextAnim() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.d;
    }

    public int getNextTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.e;
    }

    public int getNextTransitionStyle() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public Object getReenterTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.h;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    public Object getSharedElementReturnTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public int getStateAfterAnimating() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.c;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.mFragmentManager;
        if (jVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return jVar.g.get(str);
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.g getViewLifecycleOwner() {
        r rVar = this.mViewLifecycleOwner;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException(C0201.m82(30973));
    }

    public LiveData<androidx.lifecycle.g> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.s
    public r getViewModelStore() {
        j jVar = this.mFragmentManager;
        if (jVar != null) {
            return jVar.A0(this);
        }
        throw new IllegalStateException(C0201.m82(30974));
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new j();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public boolean isPostponed() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    public final boolean isStateSaved() {
        j jVar = this.mFragmentManager;
        if (jVar == null) {
            return false;
        }
        return jVar.f();
    }

    public final boolean isVisible() {
        View view;
        return isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.R0();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        h hVar = this.mHost;
        Activity e2 = hVar == null ? null : hVar.e();
        if (e2 != null) {
            this.mCalled = false;
            onAttach(e2);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.G0(1)) {
            this.mChildFragmentManager.B();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        h hVar = this.mHost;
        Activity e2 = hVar == null ? null : hVar.e();
        if (e2 != null) {
            this.mCalled = false;
            onInflate(e2, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.R0();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.y();
            return;
        }
        throw new s(C0201.m82(30975) + this + C0201.m82(30976));
    }

    public void performAttach() {
        this.mChildFragmentManager.p(this.mHost, new c(), this);
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (!this.mCalled) {
            throw new s(C0201.m82(30977) + this + C0201.m82(30978));
        }
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.z(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!onContextItemSelected(menuItem) && !this.mChildFragmentManager.A(menuItem)) {
            return false;
        }
        return true;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.R0();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.i(d.a.ON_CREATE);
            return;
        }
        throw new s(C0201.m82(30979) + this + C0201.m82(30980));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.C(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.R0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new r();
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.c();
            this.mViewLifecycleOwnerLiveData.l(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.d()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException(C0201.m82(30981));
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.D();
        this.mLifecycleRegistry.i(d.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new s(C0201.m82(30982) + this + C0201.m82(30983));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.E();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(d.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            q4.b(this).d();
            this.mPerformedCreateView = false;
            return;
        }
        throw new s(C0201.m82(30984) + this + C0201.m82(30985));
    }

    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new s(C0201.m82(30986) + this + C0201.m82(30987));
        } else if (!this.mChildFragmentManager.D0()) {
            this.mChildFragmentManager.D();
            this.mChildFragmentManager = new j();
        }
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.F();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.G(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if ((!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) && !this.mChildFragmentManager.V(menuItem)) {
            return false;
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.W(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.Y();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(d.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.i(d.a.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new s(C0201.m82(30988) + this + C0201.m82(30989));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.Z(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.a0(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean F0 = this.mFragmentManager.F0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != F0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(F0);
            onPrimaryNavigationFragmentChanged(F0);
            this.mChildFragmentManager.b0();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.R0();
        this.mChildFragmentManager.l0();
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.i(d.a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(d.a.ON_RESUME);
            }
            this.mChildFragmentManager.c0();
            this.mChildFragmentManager.l0();
            return;
        }
        throw new s(C0201.m82(30990) + this + C0201.m82(30991));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
        Parcelable d1 = this.mChildFragmentManager.d1();
        if (d1 != null) {
            bundle.putParcelable(C0201.m82(30992), d1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.R0();
        this.mChildFragmentManager.l0();
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.i(d.a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(d.a.ON_START);
            }
            this.mChildFragmentManager.d0();
            return;
        }
        throw new s(C0201.m82(30993) + this + C0201.m82(30994));
    }

    public void performStop() {
        this.mChildFragmentManager.f0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(d.a.ON_STOP);
        }
        this.mLifecycleRegistry.i(d.a.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new s(C0201.m82(30995) + this + C0201.m82(30996));
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().q = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] strArr, int i) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.n(this, strArr, i);
            return;
        }
        throw new IllegalStateException(C0201.m82(30997) + this + C0201.m82(30998));
    }

    public final d requireActivity() {
        d activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0201.m82(30999) + this + C0201.m82(31000));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C0201.m82(31001) + this + C0201.m82(31002));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C0201.m82(31003) + this + C0201.m82(31004));
    }

    public final i requireFragmentManager() {
        i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(C0201.m82(31005) + this + C0201.m82(31006));
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C0201.m82(31007) + this + C0201.m82(31008));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        Context context = getContext();
        String r1 = C0201.m82(31009);
        if (context == null) {
            throw new IllegalStateException(r1 + this + C0201.m82(31010));
        }
        throw new IllegalStateException(r1 + this + C0201.m82(31011) + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0201.m82(31012) + this + C0201.m82(31013));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable(C0201.m82(31014))) != null) {
            this.mChildFragmentManager.b1(parcelable);
            this.mChildFragmentManager.B();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new s(C0201.m82(31015) + this + C0201.m82(31016));
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.a(d.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().m = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().a = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException(C0201.m82(31017));
    }

    public void setEnterSharedElementCallback(n nVar) {
        ensureAnimationInfo().o = nVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().g = obj;
    }

    public void setExitSharedElementCallback(n nVar) {
        ensureAnimationInfo().p = nVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.s();
            }
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().s = z;
    }

    public void setInitialSavedState(g gVar) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (gVar == null || (bundle = gVar.a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException(C0201.m82(31018));
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.s();
            }
        }
    }

    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().d = i;
        }
    }

    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            d dVar = this.mAnimationInfo;
            dVar.e = i;
            dVar.f = i2;
        }
    }

    public void setOnStartEnterTransitionListener(f fVar) {
        ensureAnimationInfo();
        f fVar2 = this.mAnimationInfo.r;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                d dVar = this.mAnimationInfo;
                if (dVar.q) {
                    dVar.r = fVar;
                }
                if (fVar != null) {
                    fVar.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException(C0201.m82(31019) + this);
        }
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        j jVar = this.mFragmentManager;
        if (jVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            jVar.m(this);
        } else {
            jVar.Z0(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().c = i;
    }

    public void setTargetFragment(Fragment fragment, int i) {
        i fragmentManager = getFragmentManager();
        i fragmentManager2 = fragment != null ? fragment.getFragmentManager() : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
                if (fragment2 == this) {
                    throw new IllegalArgumentException(C0201.m82(31022) + fragment + C0201.m82(31023) + this + C0201.m82(31024));
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(31020) + fragment + C0201.m82(31021));
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.S0(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        h hVar = this.mHost;
        if (hVar != null) {
            return hVar.p(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.r(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException(C0201.m82(31029) + this + C0201.m82(31030));
    }

    public void startPostponedEnterTransition() {
        j jVar = this.mFragmentManager;
        if (jVar == null || jVar.q == null) {
            ensureAnimationInfo().q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.q.g().getLooper()) {
            this.mFragmentManager.q.g().postAtFrontOfQueue(new b());
        } else {
            callStartTransitionListener();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        androidx.core.util.a.a(this, sb);
        sb.append(C0201.m82(31031));
        sb.append(this.mWho);
        sb.append(C0201.m82(31032));
        if (this.mFragmentId != 0) {
            sb.append(C0201.m82(31033));
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(C0201.m82(31034));
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        String r0 = C0201.m82(30933);
        String r1 = C0201.m82(30934);
        try {
            Fragment fragment = (Fragment) g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new e(r1 + str + r0, e2);
        } catch (IllegalAccessException e3) {
            throw new e(r1 + str + r0, e3);
        } catch (NoSuchMethodException e4) {
            throw new e(r1 + str + C0201.m82(30936), e4);
        } catch (InvocationTargetException e5) {
            throw new e(r1 + str + C0201.m82(30935), e5);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().q = true;
        j jVar = this.mFragmentManager;
        if (jVar != null) {
            handler = jVar.q.g();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.q(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException(C0201.m82(31025) + this + C0201.m82(31026));
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.q(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException(C0201.m82(31027) + this + C0201.m82(31028));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        h hVar = this.mHost;
        if (hVar != null) {
            LayoutInflater k = hVar.k();
            j jVar = this.mChildFragmentManager;
            jVar.y0();
            w2.b(k, jVar);
            return k;
        }
        throw new IllegalStateException(C0201.m82(30972));
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
