package defpackage;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.p;
import com.google.android.gms.maps.model.t;
import com.google.android.gms.maps.model.v;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;
import vigqyno.C0201;

/* renamed from: w42  reason: default package */
/* compiled from: GeoJsonFeature */
public class w42 extends n42 implements Observer {
    private final String d;
    private final LatLngBounds e;
    private e52 f;
    private z42 g;
    private g52 h;

    private void g(h52 h52) {
        if (e() && Arrays.asList(h52.a()).contains(a().a())) {
            setChanged();
            notifyObservers();
        }
    }

    public z42 h() {
        return this.g;
    }

    public p i() {
        this.f.g();
        throw null;
    }

    public e52 j() {
        return this.f;
    }

    public t k() {
        this.h.g();
        throw null;
    }

    public g52 l() {
        return this.h;
    }

    public v m() {
        this.g.g();
        throw null;
    }

    public void n(z42 z42) {
        if (z42 != null) {
            z42 z422 = this.g;
            if (z422 != null) {
                z422.deleteObserver(this);
            }
            this.g = z42;
            z42.addObserver(this);
            g(this.g);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(19992));
    }

    public void o(e52 e52) {
        if (e52 != null) {
            e52 e522 = this.f;
            if (e522 != null) {
                e522.deleteObserver(this);
            }
            this.f = e52;
            e52.addObserver(this);
            g(this.f);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(19993));
    }

    public void p(g52 g52) {
        if (g52 != null) {
            g52 g522 = this.h;
            if (g522 != null) {
                g522.deleteObserver(this);
            }
            this.h = g52;
            g52.addObserver(this);
            g(this.h);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(19994));
    }

    public String toString() {
        return C0201.m82(19995) + C0201.m82(19996) + this.e + C0201.m82(19997) + a() + C0201.m82(19998) + this.f + C0201.m82(19999) + this.g + C0201.m82(20000) + this.h + C0201.m82(20001) + this.d + C0201.m82(20002) + c() + C0201.m82(20003);
    }

    public void update(Observable observable, Object obj) {
        if (observable instanceof h52) {
            g((h52) observable);
        }
    }
}
