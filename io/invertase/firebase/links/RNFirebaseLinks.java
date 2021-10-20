package io.invertase.firebase.links;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.appinvite.FirebaseAppInvite;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import vigqyno.C0201;

public class RNFirebaseLinks extends ReactContextBaseJavaModule implements ActivityEventListener, LifecycleEventListener {
    private static final String TAG = null;
    private String mInitialLink = null;
    private boolean mInitialLinkInitialized = false;

    class a implements us1<ShortDynamicLink> {
        public final /* synthetic */ Promise a;

        public a(RNFirebaseLinks rNFirebaseLinks, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<ShortDynamicLink> zs1) {
            if (zs1.p()) {
                String uri = zs1.l().getShortLink().toString();
                String str = RNFirebaseLinks.TAG;
                Log.d(str, C0201.m82(28002) + uri);
                this.a.resolve(uri);
                return;
            }
            String str2 = RNFirebaseLinks.TAG;
            Log.e(str2, C0201.m82(28003) + zs1.k().getMessage());
            this.a.reject(C0201.m82(28004), zs1.k().getMessage(), zs1.k());
        }
    }

    class b implements vs1 {
        public final /* synthetic */ Promise a;

        public b(RNFirebaseLinks rNFirebaseLinks, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.e(RNFirebaseLinks.TAG, C0201.m82(28071), exc);
            this.a.reject(C0201.m82(28072), exc.getMessage(), exc);
        }
    }

    class c implements ws1<PendingDynamicLinkData> {
        public final /* synthetic */ Promise a;

        public c(Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(PendingDynamicLinkData pendingDynamicLinkData) {
            if (pendingDynamicLinkData != null && !RNFirebaseLinks.this.isInvitation(pendingDynamicLinkData)) {
                RNFirebaseLinks.this.mInitialLink = pendingDynamicLinkData.getLink().toString();
            }
            String str = RNFirebaseLinks.TAG;
            Log.d(str, C0201.m82(27928) + RNFirebaseLinks.this.mInitialLink);
            RNFirebaseLinks.this.mInitialLinkInitialized = true;
            this.a.resolve(RNFirebaseLinks.this.mInitialLink);
        }
    }

    class d implements ws1<PendingDynamicLinkData> {
        public d() {
        }

        /* renamed from: a */
        public void onSuccess(PendingDynamicLinkData pendingDynamicLinkData) {
            if (pendingDynamicLinkData != null && !RNFirebaseLinks.this.isInvitation(pendingDynamicLinkData)) {
                io.invertase.firebase.c.k(RNFirebaseLinks.this.getReactApplicationContext(), C0201.m82(27951), pendingDynamicLinkData.getLink().toString());
            }
        }
    }

    static {
        C0201.m83(RNFirebaseLinks.class, 510);
    }

    public RNFirebaseLinks(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        getReactApplicationContext().addActivityEventListener(this);
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    private DynamicLink.Builder getDynamicLinkBuilder(ReadableMap readableMap) {
        DynamicLink.Builder createDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        try {
            createDynamicLink.setLink(Uri.parse(readableMap.getString(C0201.m82(31574))));
            createDynamicLink.setDomainUriPrefix(readableMap.getString(C0201.m82(31575)));
            setAnalyticsParameters(readableMap.getMap(C0201.m82(31576)), createDynamicLink);
            setAndroidParameters(readableMap.getMap(C0201.m82(31577)), createDynamicLink);
            setIosParameters(readableMap.getMap(C0201.m82(31578)), createDynamicLink);
            setITunesParameters(readableMap.getMap(C0201.m82(31579)), createDynamicLink);
            setNavigationParameters(readableMap.getMap(C0201.m82(31580)), createDynamicLink);
            setSocialParameters(readableMap.getMap(C0201.m82(31581)), createDynamicLink);
            return createDynamicLink;
        } catch (Exception e) {
            String str = TAG;
            Log.e(str, C0201.m82(31582) + e.getMessage());
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean isInvitation(PendingDynamicLinkData pendingDynamicLinkData) {
        FirebaseAppInvite invitation = FirebaseAppInvite.getInvitation(pendingDynamicLinkData);
        return (invitation == null || invitation.getInvitationId() == null || invitation.getInvitationId().isEmpty()) ? false : true;
    }

    private void setAnalyticsParameters(ReadableMap readableMap, DynamicLink.Builder builder) {
        DynamicLink.GoogleAnalyticsParameters.Builder builder2 = new DynamicLink.GoogleAnalyticsParameters.Builder();
        String r1 = C0201.m82(31583);
        if (readableMap.hasKey(r1)) {
            builder2.setCampaign(readableMap.getString(r1));
        }
        String r12 = C0201.m82(31584);
        if (readableMap.hasKey(r12)) {
            builder2.setContent(readableMap.getString(r12));
        }
        String r13 = C0201.m82(31585);
        if (readableMap.hasKey(r13)) {
            builder2.setMedium(readableMap.getString(r13));
        }
        String r14 = C0201.m82(31586);
        if (readableMap.hasKey(r14)) {
            builder2.setSource(readableMap.getString(r14));
        }
        String r15 = C0201.m82(31587);
        if (readableMap.hasKey(r15)) {
            builder2.setTerm(readableMap.getString(r15));
        }
        builder.setGoogleAnalyticsParameters(builder2.build());
    }

    private void setAndroidParameters(ReadableMap readableMap, DynamicLink.Builder builder) {
        String r0 = C0201.m82(31588);
        if (readableMap.hasKey(r0)) {
            DynamicLink.AndroidParameters.Builder builder2 = new DynamicLink.AndroidParameters.Builder(readableMap.getString(r0));
            String r02 = C0201.m82(31589);
            if (readableMap.hasKey(r02)) {
                builder2.setFallbackUrl(Uri.parse(readableMap.getString(r02)));
            }
            String r03 = C0201.m82(31590);
            if (readableMap.hasKey(r03)) {
                builder2.setMinimumVersion(Integer.parseInt(readableMap.getString(r03)));
            }
            builder.setAndroidParameters(builder2.build());
        }
    }

    private void setITunesParameters(ReadableMap readableMap, DynamicLink.Builder builder) {
        DynamicLink.ItunesConnectAnalyticsParameters.Builder builder2 = new DynamicLink.ItunesConnectAnalyticsParameters.Builder();
        String r1 = C0201.m82(31591);
        if (readableMap.hasKey(r1)) {
            builder2.setAffiliateToken(readableMap.getString(r1));
        }
        String r12 = C0201.m82(31592);
        if (readableMap.hasKey(r12)) {
            builder2.setCampaignToken(readableMap.getString(r12));
        }
        String r13 = C0201.m82(31593);
        if (readableMap.hasKey(r13)) {
            builder2.setProviderToken(readableMap.getString(r13));
        }
        builder.setItunesConnectAnalyticsParameters(builder2.build());
    }

    private void setIosParameters(ReadableMap readableMap, DynamicLink.Builder builder) {
        String r0 = C0201.m82(31594);
        if (readableMap.hasKey(r0)) {
            DynamicLink.IosParameters.Builder builder2 = new DynamicLink.IosParameters.Builder(readableMap.getString(r0));
            String r02 = C0201.m82(31595);
            if (readableMap.hasKey(r02)) {
                builder2.setAppStoreId(readableMap.getString(r02));
            }
            String r03 = C0201.m82(31596);
            if (readableMap.hasKey(r03)) {
                builder2.setCustomScheme(readableMap.getString(r03));
            }
            String r04 = C0201.m82(31597);
            if (readableMap.hasKey(r04)) {
                builder2.setFallbackUrl(Uri.parse(readableMap.getString(r04)));
            }
            String r05 = C0201.m82(31598);
            if (readableMap.hasKey(r05)) {
                builder2.setIpadBundleId(readableMap.getString(r05));
            }
            String r06 = C0201.m82(31599);
            if (readableMap.hasKey(r06)) {
                builder2.setIpadFallbackUrl(Uri.parse(readableMap.getString(r06)));
            }
            String r07 = C0201.m82(31600);
            if (readableMap.hasKey(r07)) {
                builder2.setMinimumVersion(readableMap.getString(r07));
            }
            builder.setIosParameters(builder2.build());
        }
    }

    private void setNavigationParameters(ReadableMap readableMap, DynamicLink.Builder builder) {
        DynamicLink.NavigationInfoParameters.Builder builder2 = new DynamicLink.NavigationInfoParameters.Builder();
        String r1 = C0201.m82(31601);
        if (readableMap.hasKey(r1)) {
            builder2.setForcedRedirectEnabled(readableMap.getBoolean(r1));
        }
        builder.setNavigationInfoParameters(builder2.build());
    }

    private void setSocialParameters(ReadableMap readableMap, DynamicLink.Builder builder) {
        DynamicLink.SocialMetaTagParameters.Builder builder2 = new DynamicLink.SocialMetaTagParameters.Builder();
        String r1 = C0201.m82(31602);
        if (readableMap.hasKey(r1)) {
            builder2.setDescription(readableMap.getString(r1));
        }
        String r12 = C0201.m82(31603);
        if (readableMap.hasKey(r12)) {
            builder2.setImageUrl(Uri.parse(readableMap.getString(r12)));
        }
        String r13 = C0201.m82(31604);
        if (readableMap.hasKey(r13)) {
            builder2.setTitle(readableMap.getString(r13));
        }
        builder.setSocialMetaTagParameters(builder2.build());
    }

    @ReactMethod
    public void createDynamicLink(ReadableMap readableMap, Promise promise) {
        try {
            String uri = getDynamicLinkBuilder(readableMap).buildDynamicLink().getUri().toString();
            String str = TAG;
            Log.d(str, C0201.m82(31605) + uri);
            promise.resolve(uri);
        } catch (Exception e) {
            String str2 = TAG;
            Log.e(str2, C0201.m82(31606) + e.getMessage());
            promise.reject(C0201.m82(31607), e.getMessage(), e);
        }
    }

    @ReactMethod
    public void createShortDynamicLink(ReadableMap readableMap, String str, Promise promise) {
        zs1 zs1;
        try {
            DynamicLink.Builder dynamicLinkBuilder = getDynamicLinkBuilder(readableMap);
            if (C0201.m82(31608).equals(str)) {
                zs1 = dynamicLinkBuilder.buildShortDynamicLink(2);
            } else if (C0201.m82(31609).equals(str)) {
                zs1 = dynamicLinkBuilder.buildShortDynamicLink(1);
            } else {
                zs1 = dynamicLinkBuilder.buildShortDynamicLink();
            }
            zs1.b(new a(this, promise));
        } catch (Exception e) {
            String str2 = TAG;
            Log.e(str2, C0201.m82(31610) + e.getMessage());
            promise.reject(C0201.m82(31611), e.getMessage(), e);
        }
    }

    @ReactMethod
    public void getInitialLink(Promise promise) {
        if (this.mInitialLinkInitialized) {
            promise.resolve(this.mInitialLink);
        } else if (getCurrentActivity() != null) {
            zs1 dynamicLink = FirebaseDynamicLinks.getInstance().getDynamicLink(getCurrentActivity().getIntent());
            dynamicLink.f(new c(promise));
            dynamicLink.d(new b(this, promise));
        } else {
            Log.d(TAG, C0201.m82(31612));
            promise.resolve(null);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(31613);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mInitialLink = null;
        this.mInitialLinkInitialized = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        FirebaseDynamicLinks.getInstance().getDynamicLink(intent).f(new d());
    }
}
