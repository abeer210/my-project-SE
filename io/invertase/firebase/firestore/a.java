package io.invertase.firebase.firestore;

import android.os.AsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.firestore.DocumentSnapshot;
import java.lang.ref.WeakReference;

/* compiled from: DocumentSnapshotSerializeAsyncTask */
public class a extends AsyncTask<Object, Void, WritableMap> {
    private WeakReference<ReactContext> a;
    private WeakReference<e> b;

    public a(ReactContext reactContext, e eVar) {
        this.b = new WeakReference<>(eVar);
        this.a = new WeakReference<>(reactContext);
    }

    private Boolean b() {
        return Boolean.valueOf((this.a.get() == null || this.b.get() == null) ? false : true);
    }

    /* renamed from: a */
    public final WritableMap doInBackground(Object... objArr) {
        try {
            return b.j((DocumentSnapshot) objArr[0]);
        } catch (RuntimeException e) {
            if (b().booleanValue()) {
                this.a.get().handleException(e);
                return null;
            }
            throw e;
        }
    }
}
