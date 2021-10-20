package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements h {
    @Override // com.google.firebase.components.h
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<d<?>> getComponents() {
        d.b a = d.a(o12.class);
        a.b(n.e(l12.class));
        a.b(n.e(Context.class));
        a.b(n.e(v12.class));
        a.f(a.a);
        a.e();
        return Arrays.asList(a.d(), e22.a("fire-analytics", "16.5.0"));
    }
}
