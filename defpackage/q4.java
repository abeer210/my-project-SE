package defpackage;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: q4  reason: default package */
/* compiled from: LoaderManager */
public abstract class q4 {

    /* renamed from: q4$a */
    /* compiled from: LoaderManager */
    public interface a<D> {
        void a(u4<D> u4Var, D d);

        u4<D> b(int i, Bundle bundle);

        void c(u4<D> u4Var);
    }

    public static <T extends g & s> q4 b(T t) {
        return new r4(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> u4<D> c(int i, Bundle bundle, a<D> aVar);

    public abstract void d();
}
