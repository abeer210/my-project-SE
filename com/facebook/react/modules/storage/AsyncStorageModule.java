package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.fbreact.specs.NativeAsyncStorageSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import vigqyno.C0201;

@pj0(name = "AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends NativeAsyncStorageSpec {
    private static final int MAX_SQL_KEYS = 0;
    public static final String NAME = null;
    private final g executor;
    private c mReactDatabaseSupplier;
    private boolean mShuttingDown;

    class a extends GuardedAsyncTask<Void, Void> {
        public static final String d = null;
        public static final String e = null;
        public static final String f = null;
        public static final String g = null;
        public final /* synthetic */ Callback a;
        public final /* synthetic */ ReadableArray b;

        static {
            C0201.m83(a.class, 66);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.a = callback;
            this.b = readableArray;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.a.invoke(b.a(null), null);
                return;
            }
            String[] strArr = {e, g};
            HashSet hashSet = new HashSet();
            WritableArray createArray = Arguments.createArray();
            for (int i = 0; i < this.b.size(); i += 999) {
                int min = Math.min(this.b.size() - i, 999);
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.n().query(d, strArr, a.a(min), a.b(this.b, i, min), null, null, null);
                hashSet.clear();
                try {
                    if (query.getCount() != this.b.size()) {
                        for (int i2 = i; i2 < i + min; i2++) {
                            hashSet.add(this.b.getString(i2));
                        }
                    }
                    if (query.moveToFirst()) {
                        do {
                            WritableArray createArray2 = Arguments.createArray();
                            createArray2.pushString(query.getString(0));
                            createArray2.pushString(query.getString(1));
                            createArray.pushArray(createArray2);
                            hashSet.remove(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        WritableArray createArray3 = Arguments.createArray();
                        createArray3.pushString((String) it.next());
                        createArray3.pushNull();
                        createArray.pushArray(createArray3);
                    }
                    hashSet.clear();
                } catch (Exception e2) {
                    f60.B(f, e2.getMessage(), e2);
                    this.a.invoke(b.b(null, e2.getMessage()), null);
                    query.close();
                    return;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            this.a.invoke(null, createArray);
        }
    }

    class b extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;
        public final /* synthetic */ ReadableArray b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.a = callback;
            this.b = readableArray;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            String r9 = C0201.m82(21305);
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.a.invoke(b.a(null));
                return;
            }
            SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.n().compileStatement(C0201.m82(21306));
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.n().beginTransaction();
                for (int i = 0; i < this.b.size(); i++) {
                    if (this.b.getArray(i).size() != 2) {
                        WritableMap d = b.d(null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                            return;
                        } catch (Exception e) {
                            f60.B(r9, e.getMessage(), e);
                            if (d == null) {
                                b.b(null, e.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.b.getArray(i).getString(0) == null) {
                        WritableMap c2 = b.c(null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                            return;
                        } catch (Exception e2) {
                            f60.B(r9, e2.getMessage(), e2);
                            if (c2 == null) {
                                b.b(null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.b.getArray(i).getString(1) == null) {
                        WritableMap d2 = b.d(null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                            return;
                        } catch (Exception e3) {
                            f60.B(r9, e3.getMessage(), e3);
                            if (d2 == null) {
                                b.b(null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } else {
                        compileStatement.clearBindings();
                        compileStatement.bindString(1, this.b.getArray(i).getString(0));
                        compileStatement.bindString(2, this.b.getArray(i).getString(1));
                        compileStatement.execute();
                    }
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.n().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e4) {
                    f60.B(r9, e4.getMessage(), e4);
                    writableMap = b.b(null, e4.getMessage());
                }
            } catch (Exception e5) {
                f60.B(r9, e5.getMessage(), e5);
                WritableMap b2 = b.b(null, e5.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e6) {
                    f60.B(r9, e6.getMessage(), e6);
                    if (b2 == null) {
                        writableMap = b.b(null, e6.getMessage());
                    }
                }
                writableMap = b2;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e7) {
                    f60.B(r9, e7.getMessage(), e7);
                    b.b(null, e7.getMessage());
                }
                throw th;
            }
            if (writableMap != null) {
                this.a.invoke(writableMap);
                return;
            }
            this.a.invoke(new Object[0]);
        }
    }

    class c extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;
        public final /* synthetic */ ReadableArray b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.a = callback;
            this.b = readableArray;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            String r11 = C0201.m82(21413);
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.a.invoke(b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.n().beginTransaction();
                for (int i = 0; i < this.b.size(); i += 999) {
                    int min = Math.min(this.b.size() - i, 999);
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().delete(C0201.m82(21414), a.a(min), a.b(this.b, i, min));
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.n().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e) {
                    f60.B(r11, e.getMessage(), e);
                    writableMap = b.b(null, e.getMessage());
                }
            } catch (Exception e2) {
                f60.B(r11, e2.getMessage(), e2);
                WritableMap b2 = b.b(null, e2.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e3) {
                    f60.B(r11, e3.getMessage(), e3);
                    if (b2 == null) {
                        writableMap = b.b(null, e3.getMessage());
                    }
                }
                writableMap = b2;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e4) {
                    f60.B(r11, e4.getMessage(), e4);
                    b.b(null, e4.getMessage());
                }
                throw th;
            }
            if (writableMap != null) {
                this.a.invoke(writableMap);
                return;
            }
            this.a.invoke(new Object[0]);
        }
    }

    class d extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;
        public final /* synthetic */ ReadableArray b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.a = callback;
            this.b = readableArray;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            String r9 = C0201.m82(21390);
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.a.invoke(b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.n().beginTransaction();
                for (int i = 0; i < this.b.size(); i++) {
                    if (this.b.getArray(i).size() != 2) {
                        WritableMap d = b.d(null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                            return;
                        } catch (Exception e) {
                            f60.B(r9, e.getMessage(), e);
                            if (d == null) {
                                b.b(null, e.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.b.getArray(i).getString(0) == null) {
                        WritableMap c2 = b.c(null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                            return;
                        } catch (Exception e2) {
                            f60.B(r9, e2.getMessage(), e2);
                            if (c2 == null) {
                                b.b(null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.b.getArray(i).getString(1) == null) {
                        WritableMap d2 = b.d(null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                            return;
                        } catch (Exception e3) {
                            f60.B(r9, e3.getMessage(), e3);
                            if (d2 == null) {
                                b.b(null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (!a.e(AsyncStorageModule.this.mReactDatabaseSupplier.n(), this.b.getArray(i).getString(0), this.b.getArray(i).getString(1))) {
                        WritableMap a2 = b.a(null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                            return;
                        } catch (Exception e4) {
                            f60.B(r9, e4.getMessage(), e4);
                            if (a2 == null) {
                                b.b(null, e4.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.n().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e5) {
                    f60.B(r9, e5.getMessage(), e5);
                    writableMap = b.b(null, e5.getMessage());
                }
            } catch (Exception e6) {
                f60.B(r9, e6.getMessage(), e6);
                WritableMap b2 = b.b(null, e6.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e7) {
                    f60.B(r9, e7.getMessage(), e7);
                    if (b2 == null) {
                        writableMap = b.b(null, e7.getMessage());
                    }
                }
                writableMap = b2;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.n().endTransaction();
                } catch (Exception e8) {
                    f60.B(r9, e8.getMessage(), e8);
                    b.b(null, e8.getMessage());
                }
                throw th;
            }
            if (writableMap != null) {
                this.a.invoke(writableMap);
                return;
            }
            this.a.invoke(new Object[0]);
        }
    }

    class e extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.a = callback;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.m()) {
                this.a.invoke(b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                this.a.invoke(new Object[0]);
            } catch (Exception e) {
                f60.B(C0201.m82(21090), e.getMessage(), e);
                this.a.invoke(b.b(null, e.getMessage()));
            }
        }
    }

    class f extends GuardedAsyncTask<Void, Void> {
        public static final String c = null;
        public static final String d = null;
        public static final String e = null;
        public final /* synthetic */ Callback a;

        static {
            C0201.m83(f.class, 65);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.a = callback;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.a.invoke(b.a(null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.n().query(c, new String[]{e}, null, null, null, null, null);
            try {
                if (query.moveToFirst()) {
                    do {
                        createArray.pushString(query.getString(0));
                    } while (query.moveToNext());
                }
                query.close();
                this.a.invoke(null, createArray);
            } catch (Exception e2) {
                f60.B(d, e2.getMessage(), e2);
                this.a.invoke(b.b(null, e2.getMessage()), null);
                query.close();
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    private class g implements Executor {
        private final ArrayDeque<Runnable> a = new ArrayDeque<>();
        private Runnable b;
        private final Executor c;

        class a implements Runnable {
            public final /* synthetic */ Runnable a;

            public a(Runnable runnable) {
                this.a = runnable;
            }

            public void run() {
                try {
                    this.a.run();
                } finally {
                    g.this.a();
                }
            }
        }

        public g(AsyncStorageModule asyncStorageModule, Executor executor) {
            this.c = executor;
        }

        public synchronized void a() {
            Runnable poll = this.a.poll();
            this.b = poll;
            if (poll != null) {
                this.c.execute(poll);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.a.offer(new a(runnable));
            if (this.b == null) {
                a();
            }
        }
    }

    static {
        C0201.m83(AsyncStorageModule.class, 523);
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.m();
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncStorageSpec
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.c();
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncStorageSpec
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(13741);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncStorageSpec
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(b.c(null), null);
            return;
        }
        new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncStorageSpec
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncStorageSpec
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(b.c(null));
            return;
        }
        new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncStorageSpec
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(b.c(null));
            return;
        }
        new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor2) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new g(this, executor2);
        this.mReactDatabaseSupplier = c.o(reactApplicationContext);
    }
}
