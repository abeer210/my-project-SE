package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: fi0  reason: default package */
/* compiled from: MemoryPressureRouter */
public class fi0 implements ComponentCallbacks2 {
    private final Set<MemoryPressureListener> a = Collections.synchronizedSet(new LinkedHashSet());

    public fi0(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private void b(int i) {
        Set<MemoryPressureListener> set = this.a;
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            memoryPressureListener.handleMemoryPressure(i);
        }
    }

    public void a(MemoryPressureListener memoryPressureListener) {
        this.a.add(memoryPressureListener);
    }

    public void c(MemoryPressureListener memoryPressureListener) {
        this.a.remove(memoryPressureListener);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        b(i);
    }
}
