package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: cf2  reason: default package */
/* compiled from: OrientationOptions */
public class cf2 {
    public List<gg2> a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: cf2$a */
    /* compiled from: OrientationOptions */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[gg2.values().length];
            a = iArr;
            iArr[gg2.Landscape.ordinal()] = 1;
            a[gg2.Portrait.ordinal()] = 2;
            a[gg2.SensorLandscape.ordinal()] = 3;
            try {
                a[gg2.Default.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static cf2 e(JSONObject jSONObject) {
        cf2 cf2 = new cf2();
        if (jSONObject == null) {
            return cf2;
        }
        String r1 = C0201.m82(2584);
        JSONArray optJSONArray = jSONObject.optJSONArray(r1);
        if (optJSONArray == null) {
            cf2.a.add(gg2.b(jSONObject.optString(r1, gg2.Default.a)));
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                gg2 b = gg2.b(optJSONArray.optString(i, C0201.m82(2585)));
                if (b != null) {
                    arrayList.add(b);
                }
            }
            cf2.a = arrayList;
        }
        return cf2;
    }

    public cf2 a() {
        cf2 cf2 = new cf2();
        cf2.a = new ArrayList(this.a);
        return cf2;
    }

    public int b() {
        if (!c()) {
            return gg2.Default.b;
        }
        int i = a.a[this.a.get(0).ordinal()];
        if (i == 1) {
            return (this.a.contains(gg2.Portrait) ? gg2.PortraitLandscape : gg2.Landscape).b;
        } else if (i == 2) {
            return (this.a.contains(gg2.Landscape) ? gg2.PortraitLandscape : gg2.Portrait).b;
        } else if (i != 3) {
            return gg2.Default.b;
        } else {
            return gg2.SensorLandscape.b;
        }
    }

    public boolean c() {
        return !this.a.isEmpty() && !(this.a.size() == 1 && this.a.get(0) == gg2.Default);
    }

    public cf2 d(cf2 cf2) {
        if (!c()) {
            this.a = cf2.a;
        }
        return this;
    }

    public String toString() {
        return c() ? Arrays.toString(this.a.toArray(new gg2[0])) : gg2.Default.toString();
    }
}
