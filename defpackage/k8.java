package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import cl.json.d;
import cl.json.e;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: k8  reason: default package */
/* compiled from: ShareIntent */
public abstract class k8 {
    public final ReactApplicationContext a;
    public Intent b;
    public String c = C0201.m82(23430);
    public d d;
    public ReadableMap e;
    public d f;
    public d g;

    /* access modifiers changed from: package-private */
    /* renamed from: k8$a */
    /* compiled from: ShareIntent */
    public class a implements Comparator<HashMap<String, String>> {
        public a(k8 k8Var) {
        }

        /* renamed from: a */
        public int compare(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
            String r0 = C0201.m82(28739);
            return hashMap.get(r0).compareTo(hashMap2.get(r0));
        }
    }

    public k8(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
        o(new Intent(C0201.m82(23431)));
        g().setType(C0201.m82(23432));
    }

    private ComponentName[] d(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(g().getAction());
        intent.setType(g().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public static boolean k(String str, ReadableMap readableMap) {
        return readableMap != null && readableMap.hasKey(str) && !readableMap.isNull(str);
    }

    public static boolean l(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String p(String str) {
        try {
            return URLEncoder.encode(str, C0201.m82(23433));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException(C0201.m82(23434) + str);
        }
    }

    public Intent a(Intent intent, ReadableMap readableMap) {
        String r5;
        String r6;
        ArrayList arrayList = new ArrayList();
        ArrayList<HashMap> arrayList2 = new ArrayList();
        Intent intent2 = new Intent(intent.getAction());
        intent2.setType(intent.getType());
        List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent2, 0);
        if (!queryIntentActivities.isEmpty()) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                r5 = C0201.m82(23435);
                r6 = C0201.m82(23436);
                if (!hasNext) {
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo != null && !readableMap.getArray(C0201.m82(23437)).toString().contains(next.activityInfo.packageName)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(r6, next.activityInfo.packageName);
                    hashMap.put(r5, next.activityInfo.name);
                    hashMap.put(C0201.m82(23438), String.valueOf(next.activityInfo.loadLabel(this.a.getPackageManager())));
                    arrayList2.add(hashMap);
                }
            }
            if (!arrayList2.isEmpty()) {
                Collections.sort(arrayList2, new a(this));
                for (HashMap hashMap2 : arrayList2) {
                    Intent intent3 = (Intent) intent.clone();
                    intent3.setPackage((String) hashMap2.get(r6));
                    intent3.setClassName((String) hashMap2.get(r6), (String) hashMap2.get(r5));
                    arrayList.add(intent3);
                }
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), C0201.m82(23439));
                createChooser.putExtra(C0201.m82(23440), (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                return createChooser;
            }
        }
        return Intent.createChooser(intent, C0201.m82(23441));
    }

    public String b() {
        return null;
    }

    public abstract String c();

    public d e(ReadableMap readableMap) {
        String r0 = C0201.m82(23442);
        String string = k(r0, readableMap) ? readableMap.getString(r0) : null;
        String r1 = C0201.m82(23443);
        boolean k = k(r1, readableMap);
        String r3 = C0201.m82(23444);
        if (k) {
            return new d(readableMap.getString(r3), readableMap.getString(r1), string, this.a);
        }
        return new d(readableMap.getString(r3), string, this.a);
    }

    public e f(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        String r1 = C0201.m82(23445);
        if (k(r1, readableMap)) {
            ReadableArray array = readableMap.getArray(r1);
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
        }
        String r12 = C0201.m82(23446);
        boolean k = k(r12, readableMap);
        String r3 = C0201.m82(23447);
        if (k) {
            return new e(readableMap.getArray(r3), arrayList, readableMap.getString(r12), this.a);
        }
        return new e(readableMap.getArray(r3), arrayList, this.a);
    }

    public Intent g() {
        return this.b;
    }

    public Intent[] h(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[queryIntentActivities.size()];
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction(C0201.m82(23448));
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i] = new Intent(intent2);
        }
        return intentArr;
    }

    public abstract String i();

    public abstract String j();

    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        this.e = readableMap;
        String r0 = C0201.m82(23449);
        if (k(r0, readableMap)) {
            g().putExtra(C0201.m82(23450), readableMap.getString(r0));
        }
        String r02 = C0201.m82(23451);
        if (k(r02, readableMap)) {
            g().putExtra(C0201.m82(23452), new String[]{readableMap.getString(r02)});
        }
        String r03 = C0201.m82(23453);
        if (k(r03, readableMap)) {
            this.c = readableMap.getString(r03);
        }
        String r04 = C0201.m82(23454);
        boolean k = k(r04, readableMap);
        String r4 = C0201.m82(23455);
        String string = k ? readableMap.getString(r04) : r4;
        String r1 = C0201.m82(23456);
        if (k(r1, readableMap)) {
            r4 = readableMap.getString(r1);
        }
        if (r4.equals(C0201.m82(23457))) {
            String string2 = readableMap.getString(C0201.m82(23458));
            if (!string2.isEmpty()) {
                g().putExtra(C0201.m82(23459), string2);
            }
        }
        if (r4.equals(C0201.m82(23460))) {
            String r12 = C0201.m82(23461);
            if (readableMap.hasKey(r12)) {
                String string3 = readableMap.getString(r12);
                g().putExtra(C0201.m82(23463), string3 + C0201.m82(23462));
            }
        }
        if (r4.equals(C0201.m82(23464))) {
            String r13 = C0201.m82(23465);
            if (k(r13, readableMap)) {
                String string4 = readableMap.getString(r13);
                char c2 = 65535;
                switch (string4.hashCode()) {
                    case -1408980120:
                        if (string4.equals(C0201.m82(23469))) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 302071534:
                        if (string4.equals(C0201.m82(23468))) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 313960974:
                        if (string4.equals(C0201.m82(23467))) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 699186077:
                        if (string4.equals(C0201.m82(23466))) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                String r5 = C0201.m82(23470);
                String r8 = C0201.m82(23471);
                String r9 = C0201.m82(23472);
                if (c2 != 0) {
                    String r10 = C0201.m82(23473);
                    if (c2 != 1) {
                        String r11 = C0201.m82(23474);
                        String r122 = C0201.m82(23475);
                        if (c2 != 2) {
                            if (c2 != 3) {
                                throw new IllegalStateException(C0201.m82(23481) + string4);
                            } else if (!k(r10, readableMap) || !k(r122, readableMap)) {
                                throw new IllegalArgumentException(C0201.m82(23480));
                            } else {
                                this.g = new d(readableMap.getString(r10), r11, r5, this.a);
                                this.f = new d(readableMap.getString(r122), r11, C0201.m82(23476), this.a);
                                g().setDataAndType(this.g.d(), this.g.c());
                                g().addFlags(1);
                                g().putExtra(C0201.m82(23477), this.f.d());
                                Activity currentActivity = this.a.getCurrentActivity();
                                if (currentActivity == null) {
                                    n8.d(false, C0201.m82(23478));
                                    return;
                                }
                                currentActivity.grantUriPermission(C0201.m82(23479), this.f.d(), 1);
                                if (k(r9, readableMap)) {
                                    g().putExtra(r8, readableMap.getString(r9));
                                }
                            }
                        } else if (k(r122, readableMap)) {
                            g().setType(r11);
                            this.f = new d(readableMap.getString(r122), C0201.m82(23482), this.a);
                            g().putExtra(C0201.m82(23483), this.f.d());
                            Activity currentActivity2 = this.a.getCurrentActivity();
                            if (currentActivity2 == null) {
                                n8.d(false, C0201.m82(23484));
                                return;
                            }
                            currentActivity2.grantUriPermission(C0201.m82(23485), this.f.d(), 1);
                            if (k(r9, readableMap)) {
                                g().putExtra(r8, readableMap.getString(r9));
                            }
                            if (k(C0201.m82(23486), readableMap)) {
                                g().putExtra(C0201.m82(23488), readableMap.getString(C0201.m82(23487)));
                            }
                            if (k(C0201.m82(23489), readableMap)) {
                                g().putExtra(C0201.m82(23491), readableMap.getString(C0201.m82(23490)));
                            }
                        } else {
                            throw new IllegalArgumentException(C0201.m82(23492));
                        }
                    } else if (k(r10, readableMap)) {
                        this.g = new d(readableMap.getString(r10), r5, this.a);
                        g().setDataAndType(this.g.d(), this.g.c());
                        g().addFlags(1);
                        if (k(r9, readableMap)) {
                            g().putExtra(r8, readableMap.getString(r9));
                        }
                    } else {
                        throw new IllegalArgumentException(C0201.m82(23493));
                    }
                } else if (k(C0201.m82(23494), readableMap)) {
                    this.g = new d(readableMap.getString(C0201.m82(23495)), r5, this.a);
                    g().setDataAndType(this.g.d(), this.g.c());
                    g().addFlags(1);
                    if (k(r9, readableMap)) {
                        g().putExtra(r8, readableMap.getString(r9));
                    }
                } else {
                    throw new IllegalArgumentException(C0201.m82(23496));
                }
            }
        }
        String r14 = C0201.m82(23497);
        boolean k2 = k(r14, readableMap);
        String r52 = C0201.m82(23498);
        String r6 = C0201.m82(23499);
        if (k2) {
            e f2 = f(readableMap);
            if (f2.f()) {
                ArrayList<Uri> d2 = f2.d();
                g().setAction(C0201.m82(23500));
                g().setType(f2.c());
                g().putParcelableArrayListExtra(r52, d2);
                g().addFlags(1);
                if (!TextUtils.isEmpty(string)) {
                    g().putExtra(r6, string);
                }
            } else if (!TextUtils.isEmpty(string)) {
                Intent g2 = g();
                g2.putExtra(r6, string + C0201.m82(23501) + readableMap.getArray(r14).getString(0));
            } else {
                g().putExtra(r6, readableMap.getArray(r14).getString(0));
            }
        } else {
            String r15 = C0201.m82(23502);
            if (k(r15, readableMap)) {
                d e2 = e(readableMap);
                this.d = e2;
                if (e2.f()) {
                    Uri d3 = this.d.d();
                    g().setType(this.d.c());
                    g().putExtra(r52, d3);
                    g().addFlags(1);
                    if (!TextUtils.isEmpty(string)) {
                        g().putExtra(r6, string);
                    }
                } else if (!TextUtils.isEmpty(string)) {
                    Intent g3 = g();
                    g3.putExtra(r6, string + C0201.m82(23503) + readableMap.getString(r15));
                } else {
                    g().putExtra(r6, readableMap.getString(r15));
                }
            } else if (!TextUtils.isEmpty(string)) {
                g().putExtra(r6, string);
            }
        }
    }

    public void n() throws ActivityNotFoundException {
        Intent intent;
        Activity currentActivity = this.a.getCurrentActivity();
        if (currentActivity == null) {
            n8.d(false, C0201.m82(23504));
            return;
        }
        IntentSender intentSender = null;
        if (n8.b()) {
            intentSender = n8.a(this.a);
            intent = Intent.createChooser(g(), this.c, intentSender);
        } else {
            intent = Intent.createChooser(g(), this.c);
        }
        intent.setFlags(1073741824);
        if (k(C0201.m82(23505), this.e)) {
            if (k(C0201.m82(23506), this.e)) {
                Intent intent2 = new Intent(C0201.m82(23507));
                intent2.setType(this.d.c());
                intent.putExtra(C0201.m82(23508), h(intent2, this.d.d()));
            }
        }
        ReadableMap readableMap = this.e;
        String r6 = C0201.m82(23509);
        if (!k(r6, readableMap)) {
            currentActivity.startActivityForResult(intent, 16845);
        } else if (Build.VERSION.SDK_INT >= 24) {
            intent.putExtra(C0201.m82(23510), d(this.e.getArray(r6)));
            currentActivity.startActivityForResult(intent, 16845);
        } else {
            currentActivity.startActivityForResult(a(g(), this.e), 16845);
        }
        if (intentSender == null) {
            n8.d(true, Boolean.TRUE, C0201.m82(23511));
        }
    }

    public void o(Intent intent) {
        this.b = intent;
    }
}
