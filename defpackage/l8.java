package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* renamed from: l8  reason: default package */
/* compiled from: SingleShareIntent */
public abstract class l8 extends k8 {
    public l8(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // defpackage.k8
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        String str;
        System.out.println(i());
        if (!(i() == null && c() == null && j() == null)) {
            if (k8.l(i(), this.a)) {
                System.out.println(C0201.m82(25449));
                if (b() != null) {
                    g().setComponent(new ComponentName(i(), b()));
                } else {
                    g().setPackage(i());
                }
                super.m(readableMap);
                return;
            }
            System.out.println(C0201.m82(25450));
            if (c() != null) {
                str = c().replace(C0201.m82(25452), k8.p(readableMap.getString(C0201.m82(25451)))).replace(C0201.m82(25454), k8.p(readableMap.getString(C0201.m82(25453))));
            } else {
                str = j() != null ? j() : C0201.m82(25455);
            }
            o(new Intent(new Intent(C0201.m82(25456), Uri.parse(str))));
        }
        super.m(readableMap);
    }

    @Override // defpackage.k8
    public void n() throws ActivityNotFoundException {
        q(null);
    }

    public void q(ReadableMap readableMap) throws ActivityNotFoundException {
        ReadableMap readableMap2 = this.e;
        String r1 = C0201.m82(25457);
        if (!readableMap2.hasKey(r1) || !this.e.getBoolean(r1)) {
            g().addFlags(268435456);
            this.a.startActivity(g());
            n8.d(true, Boolean.TRUE, g().getPackage());
            return;
        }
        Activity currentActivity = this.a.getCurrentActivity();
        if (currentActivity == null) {
            n8.d(false, C0201.m82(25458));
        } else if (readableMap != null && !k8.k(C0201.m82(25459), readableMap)) {
            throw new IllegalArgumentException(C0201.m82(25460));
        } else if (n8.b()) {
            Intent createChooser = Intent.createChooser(g(), this.c, n8.a(this.a));
            createChooser.setFlags(1073741824);
            currentActivity.startActivityForResult(createChooser, 16845);
        } else {
            Intent createChooser2 = Intent.createChooser(g(), this.c);
            createChooser2.setFlags(1073741824);
            currentActivity.startActivityForResult(createChooser2, 16845);
            n8.d(true, Boolean.TRUE, C0201.m82(25461));
        }
    }
}
