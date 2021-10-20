package io.invertase.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.GithubAuthProvider;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.OAuthProvider;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.TwitterAuthProvider;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vigqyno.C0201;

public class RNFirebaseAuth extends ReactContextBaseJavaModule {
    private static final String TAG = null;
    private static HashMap<String, FirebaseAuth.AuthStateListener> mAuthListeners = new HashMap<>();
    private static HashMap<String, FirebaseAuth.IdTokenListener> mIdTokenListeners = new HashMap<>();
    private PhoneAuthCredential mCredential;
    private PhoneAuthProvider.ForceResendingToken mForceResendingToken;
    private String mLastPhoneNumber;
    private ReactContext mReactContext;
    private String mVerificationId;

    class a implements ws1<AuthResult> {
        public final /* synthetic */ Promise a;

        public a(Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(AuthResult authResult) {
            Log.d(C0201.m82(31102), C0201.m82(31103));
            RNFirebaseAuth.this.promiseWithAuthResult(authResult, this.a);
        }
    }

    class a0 implements us1<SignInMethodQueryResult> {
        public final /* synthetic */ Promise a;

        public a0(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<SignInMethodQueryResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(9763);
            if (p) {
                Log.d(r1, C0201.m82(9764));
                List<String> signInMethods = zs1.l().getSignInMethods();
                WritableArray createArray = Arguments.createArray();
                if (signInMethods != null) {
                    for (String str : signInMethods) {
                        createArray.pushString(str);
                    }
                }
                this.a.resolve(createArray);
                return;
            }
            Exception k = zs1.k();
            Log.d(r1, C0201.m82(9765), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class b implements vs1 {
        public final /* synthetic */ Promise a;

        public b(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.e(C0201.m82(31369), C0201.m82(31370), exc);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, exc);
        }
    }

    class b0 implements us1<String> {
        public final /* synthetic */ Promise a;

        public b0(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<String> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(7252);
            if (p) {
                Log.d(r1, C0201.m82(7253));
                this.a.resolve(zs1.l());
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(7254), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class c implements ws1<AuthResult> {
        public final /* synthetic */ Promise a;

        public c(Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(AuthResult authResult) {
            Log.d(C0201.m82(31293), C0201.m82(31294));
            RNFirebaseAuth.this.promiseWithAuthResult(authResult, this.a);
        }
    }

    class c0 implements vs1 {
        public final /* synthetic */ Promise a;

        public c0(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.e(C0201.m82(4322), C0201.m82(4323), exc);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, exc);
        }
    }

    class d implements us1<Void> {
        public final /* synthetic */ Promise a;

        public d(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31560);
            if (p) {
                Log.d(r1, C0201.m82(31561));
                RNFirebaseAuth.this.promiseNoUser(this.a, Boolean.FALSE);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(31562), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class d0 implements ws1<AuthResult> {
        public final /* synthetic */ Promise a;

        public d0(Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(AuthResult authResult) {
            Log.d(C0201.m82(1557), C0201.m82(1558));
            RNFirebaseAuth.this.promiseWithAuthResult(authResult, this.a);
        }
    }

    class e implements us1<Void> {
        public final /* synthetic */ Promise a;

        public e(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31423);
            if (p) {
                Log.d(r1, C0201.m82(31424));
                RNFirebaseAuth.this.promiseNoUser(this.a, Boolean.FALSE);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(31425), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class e0 implements vs1 {
        public final /* synthetic */ Promise a;

        public e0(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.e(C0201.m82(19280), C0201.m82(19281), exc);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, exc);
        }
    }

    class f implements us1<Void> {
        public final /* synthetic */ Promise a;

        public f(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31745);
            if (p) {
                Log.d(r1, C0201.m82(31746));
                RNFirebaseAuth.this.promiseNoUser(this.a, Boolean.FALSE);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(31747), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class f0 implements ws1<AuthResult> {
        public final /* synthetic */ Promise a;

        public f0(Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(AuthResult authResult) {
            Log.d(C0201.m82(15822), C0201.m82(15823));
            RNFirebaseAuth.this.promiseWithAuthResult(authResult, this.a);
        }
    }

    class g implements us1<Void> {
        public final /* synthetic */ FirebaseAuth a;
        public final /* synthetic */ Promise b;

        public g(FirebaseAuth firebaseAuth, Promise promise) {
            this.a = firebaseAuth;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31731);
            if (p) {
                Log.d(r1, C0201.m82(31732));
                RNFirebaseAuth.this.promiseWithUser(this.a.getCurrentUser(), this.b);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(31733), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.b, k);
        }
    }

    class g0 implements vs1 {
        public final /* synthetic */ Promise a;

        public g0(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.e(C0201.m82(13608), C0201.m82(13609), exc);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, exc);
        }
    }

    class h implements us1<Void> {
        public final /* synthetic */ FirebaseAuth a;
        public final /* synthetic */ Promise b;

        public h(FirebaseAuth firebaseAuth, Promise promise) {
            this.a = firebaseAuth;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31680);
            if (p) {
                Log.d(r1, C0201.m82(31681));
                RNFirebaseAuth.this.promiseWithUser(this.a.getCurrentUser(), this.b);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(31682), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.b, k);
        }
    }

    class h0 implements ws1<AuthResult> {
        public final /* synthetic */ Promise a;

        public h0(Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(AuthResult authResult) {
            Log.d(C0201.m82(10458), C0201.m82(10459));
            RNFirebaseAuth.this.promiseWithAuthResult(authResult, this.a);
        }
    }

    class i implements us1<Void> {
        public final /* synthetic */ FirebaseAuth a;
        public final /* synthetic */ Promise b;

        public i(FirebaseAuth firebaseAuth, Promise promise) {
            this.a = firebaseAuth;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31780);
            if (p) {
                Log.d(r1, C0201.m82(31781));
                RNFirebaseAuth.this.promiseWithUser(this.a.getCurrentUser(), this.b);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(31782), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.b, k);
        }
    }

    class i0 implements vs1 {
        public final /* synthetic */ Promise a;

        public i0(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.e(C0201.m82(28600), C0201.m82(28601), exc);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, exc);
        }
    }

    class j implements us1<Void> {
        public final /* synthetic */ FirebaseAuth a;
        public final /* synthetic */ Promise b;

        public j(FirebaseAuth firebaseAuth, Promise promise) {
            this.a = firebaseAuth;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31761);
            if (p) {
                Log.d(r1, C0201.m82(31762));
                RNFirebaseAuth.this.promiseWithUser(this.a.getCurrentUser(), this.b);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(31763), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.b, k);
        }
    }

    class k implements FirebaseAuth.AuthStateListener {
        public k(RNFirebaseAuth rNFirebaseAuth, String str) {
        }
    }

    class l implements us1<Void> {
        public final /* synthetic */ FirebaseAuth a;
        public final /* synthetic */ Promise b;

        public l(FirebaseAuth firebaseAuth, Promise promise) {
            this.a = firebaseAuth;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31853);
            if (p) {
                Log.d(r1, C0201.m82(31854));
                RNFirebaseAuth.this.promiseWithUser(this.a.getCurrentUser(), this.b);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(31855), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.b, k);
        }
    }

    class m implements us1<Void> {
        public final /* synthetic */ FirebaseAuth a;
        public final /* synthetic */ Promise b;

        public m(FirebaseAuth firebaseAuth, Promise promise) {
            this.a = firebaseAuth;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(32134);
            if (p) {
                Log.d(r1, C0201.m82(32135));
                RNFirebaseAuth.this.promiseWithUser(this.a.getCurrentUser(), this.b);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(32136), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.b, k);
        }
    }

    class n implements us1<AuthResult> {
        public final /* synthetic */ Promise a;

        public n(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<AuthResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(32086);
            if (p) {
                Log.d(r1, C0201.m82(32087));
                RNFirebaseAuth.this.promiseWithAuthResult(zs1.l(), this.a);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(32088), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class o extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {
        public o(RNFirebaseAuth rNFirebaseAuth, FirebaseAuth firebaseAuth, Promise promise) {
        }
    }

    class p implements us1<AuthResult> {
        public final /* synthetic */ Promise a;

        public p(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<AuthResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(29749);
            if (p) {
                Log.d(r1, C0201.m82(29750));
                RNFirebaseAuth.this.promiseWithUser(zs1.l().getUser(), this.a);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(29751), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class q extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {
        public q(RNFirebaseAuth rNFirebaseAuth, String str, String str2) {
        }
    }

    class r implements us1<Void> {
        public final /* synthetic */ Promise a;

        public r(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(30189);
            if (p) {
                Log.d(r1, C0201.m82(30190));
                RNFirebaseAuth.this.promiseNoUser(this.a, Boolean.FALSE);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(30191), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class s implements us1<Void> {
        public final /* synthetic */ FirebaseAuth a;
        public final /* synthetic */ Promise b;

        public s(FirebaseAuth firebaseAuth, Promise promise) {
            this.a = firebaseAuth;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(30426);
            if (p) {
                Log.d(r1, C0201.m82(30427));
                RNFirebaseAuth.this.promiseWithUser(this.a.getCurrentUser(), this.b);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(30428), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.b, k);
        }
    }

    class t implements us1<ActionCodeResult> {
        public final /* synthetic */ Promise a;

        public t(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<ActionCodeResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(30399);
            if (p) {
                Log.d(r1, C0201.m82(30400));
                ActionCodeResult l = zs1.l();
                WritableMap createMap = Arguments.createMap();
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString(C0201.m82(30401), l.getData(0));
                createMap2.putString(C0201.m82(30402), l.getData(1));
                createMap.putMap(C0201.m82(30403), createMap2);
                int operation = l.getOperation();
                createMap.putString(C0201.m82(30410), operation != 0 ? operation != 1 ? operation != 2 ? operation != 3 ? operation != 4 ? C0201.m82(30404) : C0201.m82(30405) : C0201.m82(30406) : C0201.m82(30407) : C0201.m82(30408) : C0201.m82(30409));
                this.a.resolve(createMap);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(30411), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class u implements us1<AuthResult> {
        public final /* synthetic */ Promise a;

        public u(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<AuthResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(30527);
            if (p) {
                Log.d(r1, C0201.m82(30528));
                RNFirebaseAuth.this.promiseWithAuthResult(zs1.l(), this.a);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(30529), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class v implements FirebaseAuth.IdTokenListener {
        public v(RNFirebaseAuth rNFirebaseAuth, String str) {
        }
    }

    class w implements us1<AuthResult> {
        public final /* synthetic */ Promise a;

        public w(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<AuthResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(30718);
            if (p) {
                Log.d(r1, C0201.m82(30719));
                RNFirebaseAuth.this.promiseWithUser(zs1.l().getUser(), this.a);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(30720), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class x implements us1<AuthResult> {
        public final /* synthetic */ Promise a;

        public x(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<AuthResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(30645);
            if (p) {
                Log.d(r1, C0201.m82(30646));
                RNFirebaseAuth.this.promiseWithAuthResult(zs1.l(), this.a);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(30647), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class y implements us1<GetTokenResult> {
        public final /* synthetic */ Promise a;

        public y(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<GetTokenResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(30803);
            if (p) {
                Log.d(r1, C0201.m82(30804));
                this.a.resolve(zs1.l().getToken());
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(30805), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    class z implements us1<GetTokenResult> {
        public final /* synthetic */ Promise a;

        public z(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<GetTokenResult> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(30763);
            if (p) {
                Log.d(r1, C0201.m82(30764));
                GetTokenResult l = zs1.l();
                WritableMap createMap = Arguments.createMap();
                io.invertase.firebase.c.g(C0201.m82(30765), io.invertase.firebase.c.l(l.getAuthTimestamp()), createMap);
                io.invertase.firebase.c.g(C0201.m82(30766), io.invertase.firebase.c.l(l.getExpirationTimestamp()), createMap);
                io.invertase.firebase.c.g(C0201.m82(30767), io.invertase.firebase.c.l(l.getIssuedAtTimestamp()), createMap);
                io.invertase.firebase.c.g(C0201.m82(30768), l.getClaims(), createMap);
                io.invertase.firebase.c.g(C0201.m82(30769), l.getSignInProvider(), createMap);
                io.invertase.firebase.c.g(C0201.m82(30770), l.getToken(), createMap);
                this.a.resolve(createMap);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(30771), k);
            RNFirebaseAuth.this.promiseRejectAuthException(this.a, k);
        }
    }

    static {
        C0201.m83(RNFirebaseAuth.class, 267);
    }

    public RNFirebaseAuth(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
        Log.d(C0201.m82(34638), C0201.m82(34639));
    }

    private ActionCodeSettings buildActionCodeSettings(ReadableMap readableMap) {
        ActionCodeSettings.Builder newBuilder = ActionCodeSettings.newBuilder();
        ReadableMap map = readableMap.getMap(C0201.m82(34640));
        ReadableMap map2 = readableMap.getMap(C0201.m82(34641));
        String string = readableMap.getString(C0201.m82(34642));
        if (map != null) {
            String r4 = C0201.m82(34643);
            boolean z2 = map.hasKey(r4) && map.getBoolean(r4);
            String r5 = C0201.m82(34644);
            newBuilder = newBuilder.setAndroidPackageName(map.getString(C0201.m82(34645)), z2, map.hasKey(r5) ? map.getString(r5) : null);
        }
        String r1 = C0201.m82(34646);
        if (readableMap.hasKey(r1)) {
            newBuilder = newBuilder.setHandleCodeInApp(readableMap.getBoolean(r1));
        }
        if (map2 != null) {
            String r8 = C0201.m82(34647);
            if (map2.hasKey(r8)) {
                newBuilder = newBuilder.setIOSBundleId(map2.getString(r8));
            }
        }
        if (string != null) {
            newBuilder = newBuilder.setUrl(string);
        }
        return newBuilder.build();
    }

    private WritableArray convertProviderData(List<? extends UserInfo> list, FirebaseUser firebaseUser) {
        WritableArray createArray = Arguments.createArray();
        for (UserInfo userInfo : list) {
            if (!C0201.m82(34648).equals(userInfo.getProviderId())) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString(C0201.m82(34649), userInfo.getProviderId());
                createMap.putString(C0201.m82(34650), userInfo.getUid());
                createMap.putString(C0201.m82(34651), userInfo.getDisplayName());
                Uri photoUrl = userInfo.getPhotoUrl();
                String r4 = C0201.m82(34652);
                String r5 = C0201.m82(34653);
                if (photoUrl == null || r5.equals(photoUrl.toString())) {
                    createMap.putNull(r4);
                } else {
                    createMap.putString(r4, photoUrl.toString());
                }
                String phoneNumber = userInfo.getPhoneNumber();
                boolean equals = C0201.m82(34654).equals(userInfo.getProviderId());
                String r6 = C0201.m82(34655);
                if (equals && (userInfo.getPhoneNumber() == null || r5.equals(userInfo.getPhoneNumber()))) {
                    createMap.putString(r6, firebaseUser.getPhoneNumber());
                } else if (phoneNumber == null || r5.equals(phoneNumber)) {
                    createMap.putNull(r6);
                } else {
                    createMap.putString(r6, phoneNumber);
                }
                boolean equals2 = C0201.m82(34656).equals(userInfo.getProviderId());
                String r42 = C0201.m82(34657);
                if (equals2 && (userInfo.getEmail() == null || r5.equals(userInfo.getEmail()))) {
                    createMap.putString(r42, userInfo.getUid());
                } else if (userInfo.getEmail() == null || r5.equals(userInfo.getEmail())) {
                    createMap.putNull(r42);
                } else {
                    createMap.putString(r42, userInfo.getEmail());
                }
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    @ReactMethod
    private void createUserWithEmailAndPassword(String str, String str2, String str3, Promise promise) {
        Log.d(C0201.m82(34658), C0201.m82(34659));
        zs1 createUserWithEmailAndPassword = FirebaseAuth.getInstance(l12.l(str)).createUserWithEmailAndPassword(str2, str3);
        createUserWithEmailAndPassword.f(new f0(promise));
        createUserWithEmailAndPassword.d(new e0(promise));
    }

    /* access modifiers changed from: private */
    public WritableMap firebaseUserToMap(FirebaseUser firebaseUser) {
        WritableMap createMap = Arguments.createMap();
        String uid = firebaseUser.getUid();
        String email = firebaseUser.getEmail();
        Uri photoUrl = firebaseUser.getPhotoUrl();
        String displayName = firebaseUser.getDisplayName();
        String providerId = firebaseUser.getProviderId();
        Boolean valueOf = Boolean.valueOf(firebaseUser.isEmailVerified());
        String phoneNumber = firebaseUser.getPhoneNumber();
        createMap.putString(C0201.m82(34660), uid);
        createMap.putString(C0201.m82(34661), providerId);
        createMap.putBoolean(C0201.m82(34662), valueOf.booleanValue());
        createMap.putBoolean(C0201.m82(34663), firebaseUser.isAnonymous());
        String r1 = C0201.m82(34664);
        String r5 = C0201.m82(34665);
        if (email == null || r5.equals(email)) {
            createMap.putNull(r1);
        } else {
            createMap.putString(r1, email);
        }
        String r12 = C0201.m82(34666);
        if (displayName == null || r5.equals(displayName)) {
            createMap.putNull(r12);
        } else {
            createMap.putString(r12, displayName);
        }
        String r13 = C0201.m82(34667);
        if (photoUrl == null || r5.equals(photoUrl.toString())) {
            createMap.putNull(r13);
        } else {
            createMap.putString(r13, photoUrl.toString());
        }
        String r14 = C0201.m82(34668);
        if (phoneNumber == null || r5.equals(phoneNumber)) {
            createMap.putNull(r14);
        } else {
            createMap.putString(r14, phoneNumber);
        }
        createMap.putArray(C0201.m82(34669), convertProviderData(firebaseUser.getProviderData(), firebaseUser));
        WritableMap createMap2 = Arguments.createMap();
        FirebaseUserMetadata metadata = firebaseUser.getMetadata();
        if (metadata != null) {
            createMap2.putDouble(C0201.m82(34670), (double) metadata.getCreationTimestamp());
            createMap2.putDouble(C0201.m82(34671), (double) metadata.getLastSignInTimestamp());
        }
        createMap.putMap(C0201.m82(34672), createMap2);
        return createMap;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private AuthCredential getCredentialForProvider(String str, String str2, String str3) {
        char c2;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals(C0201.m82(34680))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1536293812:
                if (str.equals(C0201.m82(34679))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -364826023:
                if (str.equals(C0201.m82(34678))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 105516695:
                if (str.equals(C0201.m82(34677))) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 106642798:
                if (str.equals(C0201.m82(34676))) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1216985755:
                if (str.equals(C0201.m82(34675))) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1985010934:
                if (str.equals(C0201.m82(34674))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 2120171958:
                if (str.equals(C0201.m82(34673))) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return FacebookAuthProvider.getCredential(str2);
            case 1:
                return GoogleAuthProvider.getCredential(str2, str3);
            case 2:
                return TwitterAuthProvider.getCredential(str2, str3);
            case 3:
                return GithubAuthProvider.getCredential(str2);
            case 4:
                return OAuthProvider.getCredential(str, str2, str3);
            case 5:
                return getPhoneAuthCredential(str2, str3);
            case 6:
                return EmailAuthProvider.getCredential(str2, str3);
            case 7:
                return EmailAuthProvider.getCredentialWithLink(str2, str3);
            default:
                return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0124, code lost:
        if (r6.equals(vigqyno.C0201.m82(34698)) != false) goto L_0x016f;
     */
    public WritableMap getJSError(Exception exc) {
        String str;
        String r0 = C0201.m82(34681);
        String r1 = C0201.m82(34682);
        String r2 = C0201.m82(34683);
        WritableMap createMap = Arguments.createMap();
        String message = exc.getMessage();
        String r5 = C0201.m82(34684);
        try {
            FirebaseAuthException firebaseAuthException = (FirebaseAuthException) exc;
            str = firebaseAuthException.getErrorCode();
            try {
                createMap.putString(C0201.m82(34685), str);
                r0 = firebaseAuthException.getMessage();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = r1;
            Matcher matcher = Pattern.compile(C0201.m82(34686)).matcher(message);
            if (matcher.find()) {
                char c2 = 1;
                String trim = matcher.group(1).trim();
                switch (trim.hashCode()) {
                    case -2127468245:
                        if (trim.equals(C0201.m82(34702))) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1971163201:
                        if (trim.equals(C0201.m82(34701))) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1112393964:
                        if (trim.equals(r2)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1035666916:
                        if (trim.equals(C0201.m82(34700))) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -333672188:
                        if (trim.equals(C0201.m82(34699))) {
                            c2 = 15;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -324930558:
                        break;
                    case -311841705:
                        if (trim.equals(C0201.m82(34697))) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -75433118:
                        if (trim.equals(C0201.m82(34696))) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -49749054:
                        if (trim.equals(C0201.m82(34695))) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -40686718:
                        if (trim.equals(C0201.m82(34694))) {
                            c2 = 14;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 583750925:
                        if (trim.equals(C0201.m82(34693))) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 748182870:
                        if (trim.equals(C0201.m82(34692))) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 864281573:
                        if (trim.equals(C0201.m82(34691))) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1072360691:
                        if (trim.equals(C0201.m82(34690))) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1388786705:
                        if (trim.equals(C0201.m82(34689))) {
                            c2 = 16;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1433767024:
                        if (trim.equals(C0201.m82(34688))) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1563975629:
                        if (trim.equals(C0201.m82(34687))) {
                            c2 = '\r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        r0 = C0201.m82(34715);
                        str = trim;
                        break;
                    case 1:
                        r0 = C0201.m82(34714);
                        str = trim;
                        break;
                    case 2:
                        r0 = C0201.m82(34713);
                        str = trim;
                        break;
                    case 3:
                        r0 = r5;
                        str = trim;
                        break;
                    case 4:
                        r0 = C0201.m82(34712);
                        str = trim;
                        break;
                    case 5:
                        r0 = C0201.m82(34711);
                        str = trim;
                        break;
                    case 6:
                        r0 = C0201.m82(34710);
                        str = trim;
                        break;
                    case 7:
                        r0 = C0201.m82(34709);
                        str = trim;
                        break;
                    case '\b':
                        r0 = C0201.m82(34708);
                        str = trim;
                        break;
                    case '\t':
                        r0 = C0201.m82(34707);
                        str = trim;
                        break;
                    case '\n':
                        r0 = C0201.m82(34706);
                        str = trim;
                        break;
                    case 11:
                    case '\r':
                        str = trim;
                        break;
                    case '\f':
                        r0 = C0201.m82(34705);
                        str = trim;
                        break;
                    case 14:
                        r0 = C0201.m82(34704);
                        str = trim;
                        break;
                    case 15:
                        r0 = C0201.m82(34703);
                        str = trim;
                        break;
                    case 16:
                        str = r2;
                        r0 = r5;
                        break;
                    default:
                        r0 = message;
                        str = trim;
                        break;
                }
            } else {
                r0 = message;
            }
            r5 = r0;
            r2 = str;
            createMap.putString(C0201.m82(34719), C0201.m82(34716) + r2.toLowerCase().replace(C0201.m82(34717), C0201.m82(34718)).replace('_', '-'));
            createMap.putString(C0201.m82(34720), r5);
            createMap.putString(C0201.m82(34721), exc.getMessage());
            return createMap;
        }
        if (!str.equals(r1) || !(exc instanceof FirebaseAuthInvalidCredentialsException)) {
            r5 = r0;
            r2 = str;
        }
        createMap.putString(C0201.m82(34719), C0201.m82(34716) + r2.toLowerCase().replace(C0201.m82(34717), C0201.m82(34718)).replace('_', '-'));
        createMap.putString(C0201.m82(34720), r5);
        createMap.putString(C0201.m82(34721), exc.getMessage());
        return createMap;
    }

    private PhoneAuthCredential getPhoneAuthCredential(String str, String str2) {
        PhoneAuthCredential phoneAuthCredential;
        if (str == null && (phoneAuthCredential = this.mCredential) != null) {
            this.mCredential = null;
            return phoneAuthCredential;
        } else if (str != null) {
            return PhoneAuthProvider.getCredential(str, str2);
        } else {
            return null;
        }
    }

    @ReactMethod
    private void linkWithCredential(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            promise.reject(C0201.m82(34722), C0201.m82(34723));
            return;
        }
        FirebaseUser currentUser = instance.getCurrentUser();
        Log.d(C0201.m82(34724), C0201.m82(34725));
        if (currentUser != null) {
            currentUser.linkWithCredential(credentialForProvider).b(new u(promise));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void promiseNoUser(Promise promise, Boolean bool) {
        if (bool.booleanValue()) {
            promise.reject(C0201.m82(34726), C0201.m82(34727));
        } else {
            promise.resolve(null);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void promiseRejectAuthException(Promise promise, Exception exc) {
        WritableMap jSError = getJSError(exc);
        promise.reject(jSError.getString(C0201.m82(34728)), jSError.getString(C0201.m82(34729)), exc);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void promiseWithAuthResult(AuthResult authResult, Promise promise) {
        if (authResult == null || authResult.getUser() == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        WritableMap createMap = Arguments.createMap();
        WritableMap firebaseUserToMap = firebaseUserToMap(authResult.getUser());
        if (authResult.getAdditionalUserInfo() != null) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean(C0201.m82(34730), authResult.getAdditionalUserInfo().isNewUser());
            if (authResult.getAdditionalUserInfo().getProfile() != null) {
                io.invertase.firebase.c.g(C0201.m82(34731), authResult.getAdditionalUserInfo().getProfile(), createMap2);
            }
            if (authResult.getAdditionalUserInfo().getProviderId() != null) {
                createMap2.putString(C0201.m82(34732), authResult.getAdditionalUserInfo().getProviderId());
            }
            if (authResult.getAdditionalUserInfo().getUsername() != null) {
                createMap2.putString(C0201.m82(34733), authResult.getAdditionalUserInfo().getUsername());
            }
            createMap.putMap(C0201.m82(34734), createMap2);
        }
        createMap.putMap(C0201.m82(34735), firebaseUserToMap);
        promise.resolve(createMap);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void promiseWithUser(FirebaseUser firebaseUser, Promise promise) {
        if (firebaseUser != null) {
            promise.resolve(firebaseUserToMap(firebaseUser));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    private void reauthenticateWithCredential(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            promise.reject(C0201.m82(34736), C0201.m82(34737));
            return;
        }
        FirebaseUser currentUser = instance.getCurrentUser();
        Log.d(C0201.m82(34738), C0201.m82(34739));
        if (currentUser != null) {
            currentUser.reauthenticateAndRetrieveData(credentialForProvider).b(new x(promise));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    public void sendPhoneStateEvent(String str, String str2, String str3, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(34740), str);
        createMap.putString(C0201.m82(34741), str2);
        createMap.putString(C0201.m82(34742), str3);
        createMap.putMap(C0201.m82(34743), writableMap);
        io.invertase.firebase.c.k(this.mReactContext, C0201.m82(34744), createMap);
    }

    @ReactMethod
    private void signInAnonymously(String str, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        Log.d(C0201.m82(34745), C0201.m82(34746));
        zs1 signInAnonymously = instance.signInAnonymously();
        signInAnonymously.f(new d0(promise));
        signInAnonymously.d(new c0(promise));
    }

    @ReactMethod
    private void signInWithCredential(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            promise.reject(C0201.m82(34747), C0201.m82(34748));
            return;
        }
        Log.d(C0201.m82(34749), C0201.m82(34750));
        instance.signInWithCredential(credentialForProvider).b(new n(promise));
    }

    @ReactMethod
    private void signInWithCustomToken(String str, String str2, Promise promise) {
        Log.d(C0201.m82(34751), C0201.m82(34752));
        zs1 signInWithCustomToken = FirebaseAuth.getInstance(l12.l(str)).signInWithCustomToken(str2);
        signInWithCustomToken.f(new c(promise));
        signInWithCustomToken.d(new b(promise));
    }

    @ReactMethod
    private void signInWithEmailAndPassword(String str, String str2, String str3, Promise promise) {
        Log.d(C0201.m82(34753), C0201.m82(34754));
        zs1 signInWithEmailAndPassword = FirebaseAuth.getInstance(l12.l(str)).signInWithEmailAndPassword(str2, str3);
        signInWithEmailAndPassword.f(new h0(promise));
        signInWithEmailAndPassword.d(new g0(promise));
    }

    @ReactMethod
    private void signInWithEmailLink(String str, String str2, String str3, Promise promise) {
        Log.d(C0201.m82(34755), C0201.m82(34756));
        zs1 signInWithEmailLink = FirebaseAuth.getInstance(l12.l(str)).signInWithEmailLink(str2, str3);
        signInWithEmailLink.f(new a(promise));
        signInWithEmailLink.d(new i0(promise));
    }

    @ReactMethod
    private void updatePhoneNumber(String str, String str2, String str3, String str4, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        FirebaseUser currentUser = instance.getCurrentUser();
        boolean equals = str2.equals(C0201.m82(34757));
        String r1 = C0201.m82(34758);
        if (!equals) {
            promise.reject(r1, C0201.m82(34759));
        }
        PhoneAuthCredential phoneAuthCredential = getPhoneAuthCredential(str3, str4);
        if (phoneAuthCredential == null) {
            promise.reject(r1, C0201.m82(34760));
            return;
        }
        String r5 = C0201.m82(34761);
        if (currentUser == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(r5, C0201.m82(34762));
            return;
        }
        Log.d(r5, C0201.m82(34763));
        currentUser.updatePhoneNumber(phoneAuthCredential).b(new l(instance, promise));
    }

    @ReactMethod
    public void _confirmVerificationCode(String str, String str2, Promise promise) {
        FirebaseAuth.getInstance(l12.l(str)).signInWithCredential(PhoneAuthProvider.getCredential(this.mVerificationId, str2)).b(new p(promise));
    }

    @ReactMethod
    public void addAuthStateListener(String str) {
        Log.d(C0201.m82(34764), C0201.m82(34765));
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        if (mAuthListeners.get(str) == null) {
            FirebaseAuth.AuthStateListener kVar = new k(this, str);
            instance.addAuthStateListener(kVar);
            mAuthListeners.put(str, kVar);
        }
    }

    @ReactMethod
    public void addIdTokenListener(String str) {
        Log.d(C0201.m82(34766), C0201.m82(34767));
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        if (!mIdTokenListeners.containsKey(str)) {
            FirebaseAuth.IdTokenListener vVar = new v(this, str);
            instance.addIdTokenListener(vVar);
            mIdTokenListeners.put(str, vVar);
        }
    }

    @ReactMethod
    public void applyActionCode(String str, String str2, Promise promise) {
        Log.d(C0201.m82(34768), C0201.m82(34769));
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        instance.applyActionCode(str2).b(new s(instance, promise));
    }

    @ReactMethod
    public void checkActionCode(String str, String str2, Promise promise) {
        Log.d(C0201.m82(34770), C0201.m82(34771));
        FirebaseAuth.getInstance(l12.l(str)).checkActionCode(str2).b(new t(promise));
    }

    @ReactMethod
    public void confirmPasswordReset(String str, String str2, String str3, Promise promise) {
        Log.d(C0201.m82(34772), C0201.m82(34773));
        FirebaseAuth.getInstance(l12.l(str)).confirmPasswordReset(str2, str3).b(new r(promise));
    }

    @ReactMethod
    public void delete(String str, Promise promise) {
        FirebaseUser currentUser = FirebaseAuth.getInstance(l12.l(str)).getCurrentUser();
        String r0 = C0201.m82(34774);
        Log.d(r0, C0201.m82(34775));
        if (currentUser != null) {
            currentUser.delete().b(new f(promise));
            return;
        }
        Log.e(r0, C0201.m82(34776));
        promiseNoUser(promise, Boolean.TRUE);
    }

    @ReactMethod
    public void fetchSignInMethodsForEmail(String str, String str2, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        Log.d(C0201.m82(34777), C0201.m82(34778));
        instance.fetchSignInMethodsForEmail(str2).b(new a0(promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        List<l12> j2 = l12.j(getReactApplicationContext());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (l12 l12 : j2) {
            String m2 = l12.m();
            FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(m2));
            FirebaseUser currentUser = instance.getCurrentUser();
            hashMap2.put(m2, instance.getLanguageCode());
            if (currentUser != null) {
                hashMap3.put(m2, firebaseUserToMap(currentUser));
            }
        }
        hashMap.put(C0201.m82(34779), hashMap2);
        hashMap.put(C0201.m82(34780), hashMap3);
        return hashMap;
    }

    @ReactMethod
    public void getIdToken(String str, Boolean bool, Promise promise) {
        Log.d(C0201.m82(34781), C0201.m82(34782));
        FirebaseUser currentUser = FirebaseAuth.getInstance(l12.l(str)).getCurrentUser();
        if (currentUser == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            currentUser.getIdToken(bool.booleanValue()).b(new y(promise));
        }
    }

    @ReactMethod
    public void getIdTokenResult(String str, Boolean bool, Promise promise) {
        Log.d(C0201.m82(34783), C0201.m82(34784));
        FirebaseUser currentUser = FirebaseAuth.getInstance(l12.l(str)).getCurrentUser();
        if (currentUser == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            currentUser.getIdToken(bool.booleanValue()).b(new z(promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(34785);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        Log.d(C0201.m82(34786), C0201.m82(34787));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Log.d(C0201.m82(34788), C0201.m82(34789));
        Iterator<Map.Entry<String, FirebaseAuth.AuthStateListener>> it = mAuthListeners.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, FirebaseAuth.AuthStateListener> next = it.next();
            FirebaseAuth.getInstance(l12.l(next.getKey())).removeAuthStateListener(next.getValue());
            it.remove();
        }
        Iterator<Map.Entry<String, FirebaseAuth.IdTokenListener>> it2 = mIdTokenListeners.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, FirebaseAuth.IdTokenListener> next2 = it2.next();
            FirebaseAuth.getInstance(l12.l(next2.getKey())).removeIdTokenListener(next2.getValue());
            it2.remove();
        }
    }

    @ReactMethod
    public void reload(String str, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        FirebaseUser currentUser = instance.getCurrentUser();
        String r1 = C0201.m82(34790);
        Log.d(r1, C0201.m82(34791));
        if (currentUser == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(r1, C0201.m82(34792));
            return;
        }
        currentUser.reload().b(new g(instance, promise));
    }

    @ReactMethod
    public void removeAuthStateListener(String str) {
        Log.d(C0201.m82(34793), C0201.m82(34794));
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        FirebaseAuth.AuthStateListener authStateListener = mAuthListeners.get(str);
        if (authStateListener != null) {
            instance.removeAuthStateListener(authStateListener);
            mAuthListeners.remove(str);
        }
    }

    @ReactMethod
    public void removeIdTokenListener(String str) {
        Log.d(C0201.m82(34795), C0201.m82(34796));
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        FirebaseAuth.IdTokenListener idTokenListener = mIdTokenListeners.get(str);
        if (idTokenListener != null) {
            instance.removeIdTokenListener(idTokenListener);
            mIdTokenListeners.remove(str);
        }
    }

    @ReactMethod
    public void sendEmailVerification(String str, ReadableMap readableMap, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        FirebaseUser currentUser = instance.getCurrentUser();
        String r1 = C0201.m82(34797);
        Log.d(r1, C0201.m82(34798));
        if (currentUser == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(r1, C0201.m82(34799));
            return;
        }
        h hVar = new h(instance, promise);
        if (readableMap == null) {
            currentUser.sendEmailVerification().b(hVar);
        } else {
            currentUser.sendEmailVerification(buildActionCodeSettings(readableMap)).b(hVar);
        }
    }

    @ReactMethod
    public void sendPasswordResetEmail(String str, String str2, ReadableMap readableMap, Promise promise) {
        Log.d(C0201.m82(34800), C0201.m82(34801));
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        d dVar = new d(promise);
        if (readableMap == null) {
            instance.sendPasswordResetEmail(str2).b(dVar);
        } else {
            instance.sendPasswordResetEmail(str2, buildActionCodeSettings(readableMap)).b(dVar);
        }
    }

    @ReactMethod
    public void sendSignInLinkToEmail(String str, String str2, ReadableMap readableMap, Promise promise) {
        Log.d(C0201.m82(34802), C0201.m82(34803));
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        instance.sendSignInLinkToEmail(str2, buildActionCodeSettings(readableMap)).b(new e(promise));
    }

    @ReactMethod
    public void setAutoRetrievedSmsCodeForPhoneNumber(String str, String str2, String str3, Promise promise) {
        Log.d(C0201.m82(34804), C0201.m82(34805));
        FirebaseAuth.getInstance(l12.l(str)).getFirebaseAuthSettings().setAutoRetrievedSmsCodeForPhoneNumber(str2, str3);
        promise.resolve(null);
    }

    @ReactMethod
    public void setLanguageCode(String str, String str2) {
        FirebaseAuth.getInstance(l12.l(str)).setLanguageCode(str2);
    }

    @ReactMethod
    public void signInWithPhoneNumber(String str, String str2, boolean z2, Promise promise) {
        Log.d(C0201.m82(34806), C0201.m82(34807));
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mVerificationId = null;
        o oVar = new o(this, instance, promise);
        if (currentActivity == null) {
            return;
        }
        if (!z2 || this.mForceResendingToken == null) {
            PhoneAuthProvider.getInstance(instance).verifyPhoneNumber(str2, 60, TimeUnit.SECONDS, currentActivity, oVar);
        } else {
            PhoneAuthProvider.getInstance(instance).verifyPhoneNumber(str2, 60, TimeUnit.SECONDS, currentActivity, oVar, this.mForceResendingToken);
        }
    }

    @ReactMethod
    public void signOut(String str, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        Log.d(C0201.m82(34808), C0201.m82(34809));
        if (instance == null || instance.getCurrentUser() == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        instance.signOut();
        promiseNoUser(promise, Boolean.FALSE);
    }

    @ReactMethod
    public void unlink(String str, String str2, Promise promise) {
        FirebaseUser currentUser = FirebaseAuth.getInstance(l12.l(str)).getCurrentUser();
        Log.d(C0201.m82(34810), C0201.m82(34811));
        if (currentUser != null) {
            currentUser.unlink(str2).b(new w(promise));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    public void updateEmail(String str, String str2, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        FirebaseUser currentUser = instance.getCurrentUser();
        String r1 = C0201.m82(34812);
        Log.d(r1, C0201.m82(34813));
        if (currentUser == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(r1, C0201.m82(34814));
            return;
        }
        currentUser.updateEmail(str2).b(new i(instance, promise));
    }

    @ReactMethod
    public void updatePassword(String str, String str2, Promise promise) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        FirebaseUser currentUser = instance.getCurrentUser();
        String r1 = C0201.m82(34815);
        Log.d(r1, C0201.m82(34816));
        if (currentUser == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(r1, C0201.m82(34817));
            return;
        }
        currentUser.updatePassword(str2).b(new j(instance, promise));
    }

    @ReactMethod
    public void updateProfile(String str, ReadableMap readableMap, Promise promise) {
        Uri uri;
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        FirebaseUser currentUser = instance.getCurrentUser();
        String r1 = C0201.m82(34818);
        Log.d(r1, C0201.m82(34819));
        if (currentUser == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(r1, C0201.m82(34820));
            return;
        }
        UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
        String r2 = C0201.m82(34821);
        if (readableMap.hasKey(r2)) {
            builder.setDisplayName(readableMap.getString(r2));
        }
        String r22 = C0201.m82(34822);
        if (readableMap.hasKey(r22)) {
            String string = readableMap.getString(r22);
            if (string == null) {
                uri = null;
            } else {
                uri = Uri.parse(string);
            }
            builder.setPhotoUri(uri);
        }
        currentUser.updateProfile(builder.build()).b(new m(instance, promise));
    }

    @ReactMethod
    public void useDeviceLanguage(String str) {
        FirebaseAuth.getInstance(l12.l(str)).useAppLanguage();
    }

    @ReactMethod
    public void verifyPasswordResetCode(String str, String str2, Promise promise) {
        Log.d(C0201.m82(34823), C0201.m82(34824));
        FirebaseAuth.getInstance(l12.l(str)).verifyPasswordResetCode(str2).b(new b0(promise));
    }

    @ReactMethod
    public void verifyPhoneNumber(String str, String str2, String str3, int i2, boolean z2) {
        FirebaseAuth instance = FirebaseAuth.getInstance(l12.l(str));
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        Log.d(C0201.m82(34826), C0201.m82(34825) + str2);
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mCredential = null;
        q qVar = new q(this, str, str3);
        if (currentActivity == null) {
            return;
        }
        if (!z2 || this.mForceResendingToken == null) {
            PhoneAuthProvider.getInstance(instance).verifyPhoneNumber(str2, (long) i2, TimeUnit.SECONDS, currentActivity, qVar);
        } else {
            PhoneAuthProvider.getInstance(instance).verifyPhoneNumber(str2, (long) i2, TimeUnit.SECONDS, currentActivity, qVar, this.mForceResendingToken);
        }
    }
}
