package io.invertase.firebase.firestore;

import android.os.AsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.firestore.QuerySnapshot;
import java.lang.ref.WeakReference;

/* compiled from: QuerySnapshotSerializeAsyncTask */
public class c extends AsyncTask<Object, Void, WritableMap> {
    private WeakReference<ReactContext> a;
    private WeakReference<d> b;

    public c(ReactContext reactContext, d dVar) {
        this.b = new WeakReference<>(dVar);
        this.a = new WeakReference<>(reactContext);
    }

    private Boolean b() {
        return Boolean.valueOf((this.a.get() == null || this.b.get() == null) ? false : true);
    }

    /* renamed from: a */
    public final WritableMap doInBackground(Object... objArr) {
        try {
            return b.k((QuerySnapshot) objArr[0]);
        } catch (RuntimeException e) {
            if (b().booleanValue()) {
                this.a.get().handleException(e);
                return null;
            }
            throw e;
        }
    }
}
