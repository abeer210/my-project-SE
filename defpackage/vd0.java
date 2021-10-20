package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import vigqyno.C0201;

/* renamed from: vd0  reason: default package */
/* compiled from: DefaultExecutorSupplier */
public class vd0 implements zd0 {
    private final Executor a = Executors.newFixedThreadPool(2, new fe0(10, C0201.m82(20213), true));
    private final Executor b;
    private final Executor c;
    private final Executor d;

    public vd0(int i) {
        this.b = Executors.newFixedThreadPool(i, new fe0(10, C0201.m82(20214), true));
        this.c = Executors.newFixedThreadPool(i, new fe0(10, C0201.m82(20215), true));
        this.d = Executors.newFixedThreadPool(1, new fe0(10, C0201.m82(20216), true));
    }

    @Override // defpackage.zd0
    public Executor a() {
        return this.b;
    }

    @Override // defpackage.zd0
    public Executor b() {
        return this.d;
    }

    @Override // defpackage.zd0
    public Executor c() {
        return this.c;
    }

    @Override // defpackage.zd0
    public Executor d() {
        return this.a;
    }

    @Override // defpackage.zd0
    public Executor e() {
        return this.a;
    }
}
