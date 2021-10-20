package com.reactnativenavigation.views;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import vigqyno.C0201;

/* compiled from: FabMenu */
public class j extends an0 implements yd2 {
    private String p0 = C0201.m82(37263);
    private HashSet<i> q0 = new HashSet<>();
    private zd2 r0;

    public j(Context context, String str) {
        super(context);
        this.p0 = str;
        this.r0 = new zd2(this);
        onFinishInflate();
        setOnMenuButtonClickListener(new a(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void M(j jVar, View view) {
        w30.g(view);
        try {
            jVar.O(view);
        } finally {
            w30.h();
        }
    }

    private /* synthetic */ void O(View view) {
        J(true);
    }

    public void K() {
        this.r0.e();
    }

    public void L(fe2 fe2) {
        this.r0.f(fe2);
    }

    @Override // defpackage.yd2
    public void a() {
        G(true);
    }

    @Override // defpackage.yd2
    public void b() {
        t(true);
    }

    public HashSet<i> getActions() {
        return this.q0;
    }

    public String getFabId() {
        return this.p0;
    }
}
