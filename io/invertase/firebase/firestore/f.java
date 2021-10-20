package io.invertase.firebase.firestore;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Transaction;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import vigqyno.C0201;

/* compiled from: RNFirebaseFirestoreTransactionHandler */
public class f {
    private final ReentrantLock a;
    private final Condition b;
    public boolean c = false;
    private String d;
    private int e;
    private Transaction f;

    public f(String str, int i) {
        this.d = str;
        this.e = i;
        f();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
    }

    private void d() {
        if (this.a.isLocked()) {
            this.a.unlock();
        }
    }

    private void f() {
        System.currentTimeMillis();
    }

    public void a() {
        this.c = true;
        d();
    }

    public WritableMap b(FirebaseFirestoreException firebaseFirestoreException, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(10210), this.e);
        createMap.putString(C0201.m82(10211), this.d);
        String r1 = C0201.m82(10212);
        if (firebaseFirestoreException != null) {
            String r5 = C0201.m82(10213);
            createMap.putString(r1, r5);
            createMap.putMap(r5, RNFirebaseFirestore.getJSError(firebaseFirestoreException));
        } else {
            createMap.putString(r1, str);
        }
        return createMap;
    }

    public void c(DocumentReference documentReference, Promise promise) {
        f();
        try {
            promise.resolve(b.j(this.f.get(documentReference)));
        } catch (FirebaseFirestoreException e2) {
            WritableMap jSError = RNFirebaseFirestore.getJSError(e2);
            promise.reject(jSError.getString(C0201.m82(10214)), jSError.getString(C0201.m82(10215)));
        }
    }

    public void e(ReadableArray readableArray) {
        this.a.lock();
        try {
            this.b.signalAll();
        } finally {
            d();
        }
    }
}
