package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.p0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class x {
    private static int g;
    private static PendingIntent h;
    private final x0<String, at1<Bundle>> a = new x0<>();
    private final Context b;
    private final q c;
    private Messenger d;
    private Messenger e;
    private p0 f;

    public x(Context context, q qVar) {
        this.b = context;
        this.c = qVar;
        this.d = new Messenger(new w(this, Looper.getMainLooper()));
    }

    private final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            at1<Bundle> remove = this.a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.c(bundle);
        }
    }

    private static synchronized String c() {
        String num;
        synchronized (x.class) {
            int i = g;
            g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void d(Context context, Intent intent) {
        synchronized (x.class) {
            if (h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", h);
        }
    }

    /* access modifiers changed from: private */
    public final void e(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new p0.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof p0) {
                        this.f = (p0) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("FirebaseInstanceId", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf2 = String.valueOf(stringExtra2);
                            Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                String valueOf3 = String.valueOf(stringExtra2);
                                Log.w("FirebaseInstanceId", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            b(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (this.a) {
                            for (int i = 0; i < this.a.size(); i++) {
                                b(this.a.i(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        b(group, extras);
                        return;
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf4 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf5 = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? "Unexpected response action: ".concat(valueOf5) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private final Bundle g(Bundle bundle) throws IOException {
        Bundle h2 = h(bundle);
        if (h2 == null || !h2.containsKey("google.messenger")) {
            return h2;
        }
        Bundle h3 = h(bundle);
        if (h3 == null || !h3.containsKey("google.messenger")) {
            return h3;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef A[SYNTHETIC] */
    private final Bundle h(Bundle bundle) throws IOException {
        String c2 = c();
        at1<Bundle> at1 = new at1<>();
        synchronized (this.a) {
            this.a.put(c2, at1);
        }
        if (this.c.c() != 0) {
            Intent intent = new Intent();
            intent.setPackage("com.google.android.gms");
            if (this.c.c() == 2) {
                intent.setAction("com.google.iid.TOKEN_REQUEST");
            } else {
                intent.setAction("com.google.android.c2dm.intent.REGISTER");
            }
            intent.putExtras(bundle);
            d(this.b, intent);
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 5);
            sb.append("|ID|");
            sb.append(c2);
            sb.append("|");
            intent.putExtra("kid", sb.toString());
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
                sb2.append("Sending ");
                sb2.append(valueOf);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            intent.putExtra("google.messenger", this.d);
            if (!(this.e == null && this.f == null)) {
                Message obtain = Message.obtain();
                obtain.obj = intent;
                try {
                    if (this.e != null) {
                        this.e.send(obtain);
                    } else {
                        this.f.b(obtain);
                    }
                } catch (RemoteException unused) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                    }
                }
                Bundle bundle2 = (Bundle) ct1.b(at1.a(), 30000, TimeUnit.MILLISECONDS);
                synchronized (this.a) {
                    this.a.remove(c2);
                }
                return bundle2;
            }
            if (this.c.c() == 2) {
                this.b.sendBroadcast(intent);
            } else {
                this.b.startService(intent);
            }
            try {
                Bundle bundle22 = (Bundle) ct1.b(at1.a(), 30000, TimeUnit.MILLISECONDS);
                synchronized (this.a) {
                }
            } catch (InterruptedException | TimeoutException unused2) {
                Log.w("FirebaseInstanceId", "No response");
                throw new IOException("TIMEOUT");
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                synchronized (this.a) {
                    this.a.remove(c2);
                    throw th;
                }
            }
        } else {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
    }

    public final Bundle f(Bundle bundle) throws IOException {
        if (this.c.f() < 12000000) {
            return g(bundle);
        }
        try {
            return (Bundle) ct1.a(f.f(this.b).d(1, bundle));
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e2.getCause() instanceof p) || ((p) e2.getCause()).a() != 4) {
                return null;
            }
            return g(bundle);
        }
    }
}
