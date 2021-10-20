package io.invertase.firebase.admob;

import android.app.Activity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* compiled from: RNFirebaseAdmobInterstitial */
public class c {
    private InterstitialAd a;
    private RNFirebaseAdMob b;
    private String c;

    /* compiled from: RNFirebaseAdmobInterstitial */
    class a extends AdListener {
        public a(c cVar) {
        }
    }

    /* compiled from: RNFirebaseAdmobInterstitial */
    class b implements Runnable {
        public final /* synthetic */ AdRequest a;

        public b(AdRequest adRequest) {
            this.a = adRequest;
        }

        public void run() {
            c.this.a.loadAd(this.a);
        }
    }

    /* renamed from: io.invertase.firebase.admob.c$c  reason: collision with other inner class name */
    /* compiled from: RNFirebaseAdmobInterstitial */
    class RunnableC0143c implements Runnable {
        public RunnableC0143c() {
        }

        public void run() {
            if (c.this.a.isLoaded()) {
                c.this.a.show();
            }
        }
    }

    public c(String str, RNFirebaseAdMob rNFirebaseAdMob) {
        this.c = str;
        this.b = rNFirebaseAdMob;
        Activity activity = rNFirebaseAdMob.getActivity();
        if (activity == null) {
            this.a = new InterstitialAd(this.b.getContext());
        } else {
            this.a = new InterstitialAd(activity);
        }
        this.a.setAdUnitId(this.c);
        this.a.setAdListener(new a(this));
    }

    public void b(AdRequest adRequest) {
        Activity activity = this.b.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new b(adRequest));
        }
    }

    public void c() {
        Activity activity = this.b.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC0143c());
        }
    }
}
