package io.invertase.firebase.notifications;

import android.content.Intent;
import vigqyno.C0201;

/* compiled from: RNFirebaseBackgroundNotificationActionsService */
public class c extends di0 {
    @Override // defpackage.di0
    public kj0 getTaskConfig(Intent intent) {
        if (!b.a(intent)) {
            return null;
        }
        return new kj0(C0201.m82(28696), b.b(intent), 60000, true);
    }
}
