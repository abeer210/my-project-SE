package defpackage;

import com.dynatrace.android.agent.u;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import vigqyno.C0201;

/* renamed from: c40  reason: default package */
/* compiled from: OkCallback */
public class c40 {
    public static void a(Call call, Callback callback) {
        if (call != null) {
            e40 e40 = new e40(call.request(), y30.enqueue, z30.PRE_EXEC, 0);
            h(e40);
            try {
                call.enqueue(callback);
            } catch (RuntimeException e) {
                i(e40, 0, e.toString(), z30.POST_EXEC_ERR);
                throw e;
            }
        }
    }

    public static Response b(Call call) throws Exception {
        if (call == null) {
            return null;
        }
        e40 e40 = new e40(call.request(), y30.execute, z30.PRE_EXEC, 0);
        try {
            h(e40);
            Response execute = call.execute();
            e40.g(execute);
            i(e40, execute.code(), execute.message(), z30.POST_EXEC_OK);
            return execute;
        } catch (Exception e) {
            i(e40, 0, e.toString(), z30.POST_EXEC_ERR);
            throw e;
        }
    }

    public static void c(OkHttpClient.Builder builder) {
        try {
            List<Interceptor> interceptors = builder.interceptors();
            interceptors.remove(d40.a);
            interceptors.add(0, d40.a);
        } catch (Exception e) {
            s30.u(C0201.m82(27), e.getMessage(), e);
        }
    }

    public static void d(Call call, IOException iOException) {
        a40 a40;
        if (call != null && (a40 = d40.b.get(call.request())) != null) {
            i(a40.d, 0, iOException.toString(), z30.POST_EXEC_ERR);
        }
    }

    public static void e() {
    }

    public static void f(Call call, Response response) {
        a40 a40;
        if (call != null && (a40 = d40.b.get(call.request())) != null) {
            ((e40) a40.d).g(response);
            i(a40.d, response.code(), response.message(), z30.POST_EXEC_OK);
        }
    }

    public static void g() {
    }

    private static void h(e40 e40) {
        Request request = e40.i;
        if (request != null && x30.c.m) {
            if (u.c) {
                s30.r(C0201.m82(28), String.format(C0201.m82(29), e40.c, e40.b, request.getClass().getName(), e40.c(), Integer.valueOf(e40.i.hashCode())));
            }
            a40 a40 = d40.b.get(e40.i);
            if (a40 == null && z30.PRE_EXEC == e40.c) {
                a40 = d40.a.a(e40.i, e40);
            }
            if (a40 != null) {
                a40.b(e40);
                if (a40.c) {
                    synchronized (d40.b) {
                        d40.b.remove(e40.i);
                    }
                    a40.c(e40);
                }
            }
        }
    }

    private static void i(f40 f40, int i, String str, z30 z30) {
        if (f40 != null) {
            f40.d = i;
            f40.e = str;
            f40.c = z30;
            h((e40) f40);
        }
    }
}
