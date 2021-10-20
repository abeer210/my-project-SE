package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.f;
import com.google.firebase.iid.f0;
import com.google.firebase.iid.z;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseMessagingService extends f0 {
    private static final Queue<String> f = new ArrayDeque(10);

    @Override // com.google.firebase.iid.f0
    public final Intent c(Intent intent) {
        return z.a().b();
    }

    @Override // com.google.firebase.iid.f0
    public final boolean d(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!b.e(intent)) {
            return true;
        }
        b.c(intent);
        return true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        if (r1.equals("gcm") != false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    @Override // com.google.firebase.iid.f0
    public final void e(Intent intent) {
        zs1<Void> zs1;
        boolean z;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            String stringExtra = intent.getStringExtra("google.message_id");
            if (TextUtils.isEmpty(stringExtra)) {
                zs1 = ct1.d(null);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("google.message_id", stringExtra);
                zs1 = f.f(this).b(2, bundle);
            }
            char c = 0;
            if (!TextUtils.isEmpty(stringExtra)) {
                if (f.contains(stringExtra)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        String valueOf = String.valueOf(stringExtra);
                        Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
                    }
                    z = true;
                    if (!z) {
                        String stringExtra2 = intent.getStringExtra("message_type");
                        if (stringExtra2 == null) {
                            stringExtra2 = "gcm";
                        }
                        switch (stringExtra2.hashCode()) {
                            case -2062414158:
                                if (stringExtra2.equals("deleted_messages")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 102161:
                                break;
                            case 814694033:
                                if (stringExtra2.equals("send_error")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 814800675:
                                if (stringExtra2.equals("send_event")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            if (b.e(intent)) {
                                b.d(intent);
                            }
                            Bundle extras = intent.getExtras();
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            extras.remove("androidx.contentpager.content.wakelockid");
                            if (f.m(extras)) {
                                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                try {
                                    if (!new g(this, extras, newSingleThreadExecutor).a()) {
                                        newSingleThreadExecutor.shutdown();
                                        if (b.e(intent)) {
                                            b.b(intent);
                                        }
                                    }
                                } finally {
                                    newSingleThreadExecutor.shutdown();
                                }
                            }
                            g(new c(extras));
                        } else if (c == 1) {
                            f();
                        } else if (c == 2) {
                            h(intent.getStringExtra("google.message_id"));
                        } else if (c != 3) {
                            String valueOf2 = String.valueOf(stringExtra2);
                            Log.w("FirebaseMessaging", valueOf2.length() != 0 ? "Received message with unknown type: ".concat(valueOf2) : new String("Received message with unknown type: "));
                        } else {
                            String stringExtra3 = intent.getStringExtra("google.message_id");
                            if (stringExtra3 == null) {
                                stringExtra3 = intent.getStringExtra("message_id");
                            }
                            j(stringExtra3, new d(intent.getStringExtra("error")));
                        }
                    }
                    ct1.b(zs1, 1, TimeUnit.SECONDS);
                }
                if (f.size() >= 10) {
                    f.remove();
                }
                f.add(stringExtra);
            }
            z = false;
            if (!z) {
            }
            try {
                ct1.b(zs1, 1, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String valueOf3 = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 20);
                sb.append("Message ack failed: ");
                sb.append(valueOf3);
                Log.w("FirebaseMessaging", sb.toString());
            }
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (b.e(intent)) {
                b.a(intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            i(intent.getStringExtra("token"));
        } else {
            String valueOf4 = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", valueOf4.length() != 0 ? "Unknown intent action: ".concat(valueOf4) : new String("Unknown intent action: "));
        }
    }

    public void f() {
    }

    public void g(c cVar) {
    }

    public void h(String str) {
    }

    public void i(String str) {
    }

    public void j(String str, Exception exc) {
    }
}
