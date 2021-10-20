package io.invertase.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.c;
import vigqyno.C0201;

public class RNFirebaseBackgroundMessagingService extends di0 {
    @Override // defpackage.di0
    public kj0 getTaskConfig(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        return new kj0(C0201.m82(3996), b.a((c) intent.getParcelableExtra(C0201.m82(3995))), 60000, true);
    }
}
