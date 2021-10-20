package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class i3 extends Fragment implements j {
    private static WeakHashMap<d, WeakReference<i3>> d = new WeakHashMap<>();
    private Map<String, LifecycleCallback> a = new r0();
    private int b = 0;
    private Bundle c;

    public static i3 u(d dVar) {
        i3 i3Var;
        String r0 = C0201.m82(4656);
        WeakReference<i3> weakReference = d.get(dVar);
        if (weakReference != null && (i3Var = weakReference.get()) != null) {
            return i3Var;
        }
        try {
            i3 i3Var2 = (i3) dVar.p().c(r0);
            if (i3Var2 == null || i3Var2.isRemoving()) {
                i3Var2 = new i3();
                n a2 = dVar.p().a();
                a2.b(i3Var2, r0);
                a2.e();
            }
            d.put(dVar, new WeakReference<>(i3Var2));
            return i3Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException(C0201.m82(4657), e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.a.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void e(String str, LifecycleCallback lifecycleCallback) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, lifecycleCallback);
            if (this.b > 0) {
                new k01(Looper.getMainLooper()).post(new h3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append(C0201.m82(4658));
        sb.append(str);
        sb.append(C0201.m82(4659));
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final <T extends LifecycleCallback> T g(String str, Class<T> cls) {
        return cls.cast(this.a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final /* synthetic */ Activity h() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.a.values()) {
            lifecycleCallback.e(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = 1;
        this.c = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.a.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.b = 5;
        for (LifecycleCallback lifecycleCallback : this.a.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.b = 3;
        for (LifecycleCallback lifecycleCallback : this.a.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.a.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().i(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.b = 2;
        for (LifecycleCallback lifecycleCallback : this.a.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.b = 4;
        for (LifecycleCallback lifecycleCallback : this.a.values()) {
            lifecycleCallback.k();
        }
    }
}
