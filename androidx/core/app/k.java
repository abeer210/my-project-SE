package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: NotificationCompatJellybean */
public class k {
    private static final Object a = new Object();
    private static Field b;
    private static boolean c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle b(i.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(C0201.m82(20340), aVar.e());
        bundle2.putCharSequence(C0201.m82(20341), aVar.i());
        bundle2.putParcelable(C0201.m82(20342), aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(C0201.m82(20343), aVar.b());
        bundle2.putBundle(C0201.m82(20344), bundle);
        bundle2.putParcelableArray(C0201.m82(20345), e(aVar.f()));
        bundle2.putBoolean(C0201.m82(20346), aVar.h());
        bundle2.putInt(C0201.m82(20347), aVar.g());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    Field declaredField = Notification.class.getDeclaredField(C0201.m82(20348));
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(C0201.m82(20349), C0201.m82(20350));
                        c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    b = declaredField;
                }
                Bundle bundle = (Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(C0201.m82(20353), C0201.m82(20354), e);
                c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(C0201.m82(20351), C0201.m82(20352), e2);
                c = true;
                return null;
            }
        }
    }

    private static Bundle d(m mVar) {
        Bundle bundle = new Bundle();
        bundle.putString(C0201.m82(20355), mVar.i());
        bundle.putCharSequence(C0201.m82(20356), mVar.h());
        bundle.putCharSequenceArray(C0201.m82(20357), mVar.e());
        bundle.putBoolean(C0201.m82(20358), mVar.c());
        bundle.putBundle(C0201.m82(20359), mVar.g());
        Set<String> d = mVar.d();
        if (d != null && !d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d.size());
            for (String str : d) {
                arrayList.add(str);
            }
            bundle.putStringArrayList(C0201.m82(20360), arrayList);
        }
        return bundle;
    }

    private static Bundle[] e(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[mVarArr.length];
        for (int i = 0; i < mVarArr.length; i++) {
            bundleArr[i] = d(mVarArr[i]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, i.a aVar) {
        builder.addAction(aVar.e(), aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray(C0201.m82(20361), e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray(C0201.m82(20362), e(aVar.c()));
        }
        bundle.putBoolean(C0201.m82(20363), aVar.b());
        return bundle;
    }
}
