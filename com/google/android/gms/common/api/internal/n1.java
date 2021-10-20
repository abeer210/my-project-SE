package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public interface n1 {
    void a();

    void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean c(p pVar);

    void d();

    void disconnect();

    void e();

    vo0 f();

    boolean isConnected();

    <A extends a.b, T extends d<? extends m, A>> T j(T t);

    <A extends a.b, R extends m, T extends d<R, A>> T k(T t);
}
