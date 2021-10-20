package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.b;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

/* compiled from: TaskStackBuilder */
public final class o implements Iterable<Intent> {
    private final ArrayList<Intent> a = new ArrayList<>();
    private final Context b;

    /* compiled from: TaskStackBuilder */
    public interface a {
        Intent g();
    }

    private o(Context context) {
        this.b = context;
    }

    public static o d(Context context) {
        return new o(context);
    }

    public o a(Intent intent) {
        this.a.add(intent);
        return this;
    }

    public o b(Activity activity) {
        Intent g = activity instanceof a ? ((a) activity).g() : null;
        if (g == null) {
            g = g.a(activity);
        }
        if (g != null) {
            ComponentName component = g.getComponent();
            if (component == null) {
                component = g.resolveActivity(this.b.getPackageManager());
            }
            c(component);
            a(g);
        }
        return this;
    }

    public o c(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent b2 = g.b(this.b, componentName);
            while (b2 != null) {
                this.a.add(size, b2);
                b2 = g.b(this.b, b2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(C0201.m82(20769), C0201.m82(20770));
            throw new IllegalArgumentException(e);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (!this.a.isEmpty()) {
            ArrayList<Intent> arrayList = this.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!b.k(this.b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException(C0201.m82(20771));
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.a.iterator();
    }
}
