package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.measurement.internal.m5;
import com.google.android.gms.measurement.internal.n6;
import com.google.android.gms.measurement.internal.o4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

@Deprecated
public class AppMeasurement {
    private static volatile AppMeasurement d;
    private final o4 a;
    private final n6 b;
    private final boolean c;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final Bundle b() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString(C0201.m82(19907), str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString(C0201.m82(19908), str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(C0201.m82(19909), str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                m5.b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString(C0201.m82(19910), str4);
            }
            bundle.putLong(C0201.m82(19911), this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString(C0201.m82(19912), str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle(C0201.m82(19913), bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString(C0201.m82(19914), str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle(C0201.m82(19915), bundle3);
            }
            bundle.putLong(C0201.m82(19916), this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString(C0201.m82(19917), str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle(C0201.m82(19918), bundle4);
            }
            bundle.putLong(C0201.m82(19919), this.mCreationTimestamp);
            bundle.putBoolean(C0201.m82(19920), this.mActive);
            bundle.putLong(C0201.m82(19921), this.mTriggeredTimestamp);
            return bundle;
        }

        private ConditionalUserProperty(Bundle bundle) {
            u.k(bundle);
            this.mAppId = (String) m5.a(bundle, C0201.m82(19894), String.class, null);
            this.mOrigin = (String) m5.a(bundle, C0201.m82(19895), String.class, null);
            this.mName = (String) m5.a(bundle, C0201.m82(19896), String.class, null);
            this.mValue = m5.a(bundle, C0201.m82(19897), Object.class, null);
            this.mTriggerEventName = (String) m5.a(bundle, C0201.m82(19898), String.class, null);
            this.mTriggerTimeout = ((Long) m5.a(bundle, C0201.m82(19899), Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) m5.a(bundle, C0201.m82(19900), String.class, null);
            this.mTimedOutEventParams = (Bundle) m5.a(bundle, C0201.m82(19901), Bundle.class, null);
            this.mTriggeredEventName = (String) m5.a(bundle, C0201.m82(19902), String.class, null);
            this.mTriggeredEventParams = (Bundle) m5.a(bundle, C0201.m82(19903), Bundle.class, null);
            this.mTimeToLive = ((Long) m5.a(bundle, C0201.m82(19904), Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) m5.a(bundle, C0201.m82(19905), String.class, null);
            this.mExpiredEventParams = (Bundle) m5.a(bundle, C0201.m82(19906), Bundle.class, null);
        }
    }

    private AppMeasurement(o4 o4Var) {
        u.k(o4Var);
        this.a = o4Var;
        this.b = null;
        this.c = false;
    }

    public static AppMeasurement b(Context context, Bundle bundle) {
        if (d == null) {
            synchronized (AppMeasurement.class) {
                if (d == null) {
                    n6 e = e(context, bundle);
                    if (e != null) {
                        d = new AppMeasurement(e);
                    } else {
                        d = new AppMeasurement(o4.h(context, null, null, bundle));
                    }
                }
            }
        }
        return d;
    }

    private static AppMeasurement c(Context context, String str, String str2) {
        if (d == null) {
            synchronized (AppMeasurement.class) {
                if (d == null) {
                    n6 e = e(context, null);
                    if (e != null) {
                        d = new AppMeasurement(e);
                    } else {
                        d = new AppMeasurement(o4.h(context, null, null, null));
                    }
                }
            }
        }
        return d;
    }

    private static n6 e(Context context, Bundle bundle) {
        try {
            Class<?> cls = Class.forName(C0201.m82(25945));
            return (n6) cls.getDeclaredMethod(C0201.m82(25946), Context.class, Bundle.class).invoke(null, context, bundle);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return c(context, null, null);
    }

    public void a(String str, String str2, Object obj) {
        u.g(str);
        if (this.c) {
            this.b.l(str, str2, obj);
        } else {
            this.a.L().k0(str, str2, obj, true);
        }
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.c) {
            this.b.j(str);
        } else {
            this.a.K().v(str, this.a.b().b());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.clearConditionalUserProperty(str, str2, bundle);
        } else {
            this.a.L().B(str, str2, bundle);
        }
    }

    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.c) {
            throw new IllegalStateException(C0201.m82(25947));
        }
        this.a.L().C(str, str2, str3, bundle);
        throw null;
    }

    public final void d(boolean z) {
        if (this.c) {
            this.b.setDataCollectionEnabled(z);
        } else {
            this.a.L().f0(z);
        }
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.c) {
            this.b.k(str);
        } else {
            this.a.K().w(str, this.a.b().b());
        }
    }

    @Keep
    public long generateEventId() {
        if (this.c) {
            return this.b.a();
        }
        return this.a.T().s0();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.c) {
            return this.b.w();
        }
        return this.a.L().s0();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i;
        if (this.c) {
            list = this.b.g(str, str2);
        } else {
            list = this.a.L().B0(str, str2);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle bundle : list) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.c) {
            throw new IllegalStateException(C0201.m82(25948));
        }
        this.a.L().m0(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.c) {
            return this.b.h();
        }
        return this.a.L().D();
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.c) {
            return this.b.b();
        }
        return this.a.L().E();
    }

    @Keep
    public String getGmpAppId() {
        if (this.c) {
            return this.b.f();
        }
        return this.a.L().F();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.c) {
            return this.b.d(str);
        }
        this.a.L();
        u.g(str);
        return 25;
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.c) {
            return this.b.e(str, str2, z);
        }
        return this.a.L().G(str, str2, z);
    }

    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.c) {
            throw new IllegalStateException(C0201.m82(25949));
        }
        this.a.L().H(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.c(str, str2, bundle);
        } else {
            this.a.L().I(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        u.k(conditionalUserProperty);
        if (this.c) {
            this.b.i(conditionalUserProperty.b());
        } else {
            this.a.L().L(conditionalUserProperty.b());
        }
    }

    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        u.k(conditionalUserProperty);
        if (this.c) {
            throw new IllegalStateException(C0201.m82(25950));
        }
        this.a.L().n0(conditionalUserProperty.b());
        throw null;
    }

    private AppMeasurement(n6 n6Var) {
        u.k(n6Var);
        this.b = n6Var;
        this.a = null;
        this.c = true;
    }
}
