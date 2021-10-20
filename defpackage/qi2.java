package defpackage;

import defpackage.yi2;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: qi2  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class qi2 implements yi2.a {
    public final /* synthetic */ Collection a;
    public final /* synthetic */ yi2.b b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ qi2(Collection collection, yi2.b bVar, ArrayList arrayList) {
        this.a = collection;
        this.b = bVar;
        this.c = arrayList;
    }

    @Override // defpackage.yi2.a
    public final void a(Object obj) {
        yi2.n(this.a, this.b, this.c, obj);
    }
}
