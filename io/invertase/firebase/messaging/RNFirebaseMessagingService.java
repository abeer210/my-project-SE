package io.invertase.firebase.messaging;

import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.c;
import vigqyno.C0201;

public class RNFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void g(c cVar) {
        String r0 = C0201.m82(2554);
        Log.d(r0, C0201.m82(2555));
        if (cVar.w() != null) {
            Intent intent = new Intent(C0201.m82(2556));
            intent.putExtra(C0201.m82(2557), cVar);
            w4.b(this).d(intent);
            return;
        }
        boolean c = io.invertase.firebase.c.c(getApplicationContext());
        String r2 = C0201.m82(2558);
        if (c) {
            Intent intent2 = new Intent(C0201.m82(2559));
            intent2.putExtra(r2, cVar);
            w4.b(this).d(intent2);
            return;
        }
        try {
            Intent intent3 = new Intent(getApplicationContext(), RNFirebaseBackgroundMessagingService.class);
            intent3.putExtra(r2, cVar);
            if (getApplicationContext().startService(intent3) != null) {
                di0.acquireWakeLockNow(getApplicationContext());
            }
        } catch (IllegalStateException e) {
            Log.e(r0, C0201.m82(2560), e);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void i(String str) {
        Log.d(C0201.m82(2561), C0201.m82(2562));
        w4.b(this).d(new Intent(C0201.m82(2563)));
    }
}
