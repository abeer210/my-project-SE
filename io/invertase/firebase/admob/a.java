package io.invertase.firebase.admob;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: RNFirebaseAdMobRewardedVideo */
public class a implements RewardedVideoAdListener {
    private String a;
    private RNFirebaseAdMob b;
    private RewardedVideoAd c;

    /* renamed from: io.invertase.firebase.admob.a$a  reason: collision with other inner class name */
    /* compiled from: RNFirebaseAdMobRewardedVideo */
    class RunnableC0142a implements Runnable {
        public final /* synthetic */ a a;

        public RunnableC0142a(a aVar) {
            this.a = aVar;
        }

        public void run() {
            a.this.c.setRewardedVideoAdListener(this.a);
        }
    }

    /* compiled from: RNFirebaseAdMobRewardedVideo */
    class b implements Runnable {
        public final /* synthetic */ AdRequest a;

        public b(AdRequest adRequest) {
            this.a = adRequest;
        }

        public void run() {
            a.this.c.loadAd(a.this.a, this.a);
        }
    }

    /* compiled from: RNFirebaseAdMobRewardedVideo */
    class c implements Runnable {
        public c() {
        }

        public void run() {
            if (a.this.c.isLoaded()) {
                a.this.c.show();
            }
        }
    }

    /* compiled from: RNFirebaseAdMobRewardedVideo */
    class d implements Runnable {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        public void run() {
            a.this.c.setCustomData(this.a);
        }
    }

    public a(String str, RNFirebaseAdMob rNFirebaseAdMob) {
        this.a = str;
        this.b = rNFirebaseAdMob;
        Activity activity = rNFirebaseAdMob.getActivity();
        if (activity == null) {
            this.c = MobileAds.getRewardedVideoAdInstance(this.b.getContext());
        } else {
            this.c = MobileAds.getRewardedVideoAdInstance(activity);
        }
        if (activity != null) {
            activity.runOnUiThread(new RunnableC0142a(this));
        }
    }

    public void c(AdRequest adRequest) {
        Activity activity = this.b.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new b(adRequest));
        }
    }

    public void d(String str) {
        Activity activity = this.b.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new d(str));
        }
    }

    public void e() {
        Activity activity = this.b.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new c());
        }
    }
}
