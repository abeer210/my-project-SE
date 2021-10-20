package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* compiled from: NotificationCompatBuilder */
public class j implements h {
    private final Notification.Builder a;
    private final i.d b;
    private RemoteViews c;
    private RemoteViews d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    public j(i.d dVar) {
        ArrayList<String> arrayList;
        this.b = dVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new Notification.Builder(dVar.a, dVar.I);
        } else {
            this.a = new Notification.Builder(dVar.a);
        }
        Notification notification = dVar.N;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.d).setContentText(dVar.e).setContentInfo(dVar.j).setContentIntent(dVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.g, (notification.flags & 128) != 0).setLargeIcon(dVar.i).setNumber(dVar.k).setProgress(dVar.r, dVar.s, dVar.t);
        if (Build.VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSubText(dVar.p).setUsesChronometer(dVar.n).setPriority(dVar.l);
            Iterator<i.a> it = dVar.b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = dVar.B;
            if (bundle != null) {
                this.f.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.x) {
                    this.f.putBoolean(C0201.m82(20485), true);
                }
                String str = dVar.u;
                if (str != null) {
                    this.f.putString(C0201.m82(20486), str);
                    if (dVar.v) {
                        this.f.putBoolean(C0201.m82(20487), true);
                    } else {
                        this.f.putBoolean(C0201.m82(20488), true);
                    }
                }
                String str2 = dVar.w;
                if (str2 != null) {
                    this.f.putString(C0201.m82(20489), str2);
                }
            }
            this.c = dVar.F;
            this.d = dVar.G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(dVar.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = dVar.O) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.f;
                ArrayList<String> arrayList2 = dVar.O;
                bundle2.putStringArray(C0201.m82(20490), (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(dVar.x).setGroup(dVar.u).setGroupSummary(dVar.v).setSortKey(dVar.w);
            this.g = dVar.M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setCategory(dVar.A).setColor(dVar.C).setVisibility(dVar.D).setPublicVersion(dVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.O.iterator();
            while (it2.hasNext()) {
                this.a.addPerson(it2.next());
            }
            this.h = dVar.H;
            if (dVar.c.size() > 0) {
                Bundle e2 = dVar.e();
                String r2 = C0201.m82(20491);
                Bundle bundle3 = e2.getBundle(r2);
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle();
                for (int i = 0; i < dVar.c.size(); i++) {
                    bundle4.putBundle(Integer.toString(i), k.b(dVar.c.get(i)));
                }
                bundle3.putBundle(C0201.m82(20492), bundle4);
                dVar.e().putBundle(r2, bundle3);
                this.f.putBundle(r2, bundle3);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(dVar.B).setRemoteInputHistory(dVar.q);
            RemoteViews remoteViews = dVar.F;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.G;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.H;
            if (remoteViews3 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(dVar.J).setShortcutId(dVar.K).setTimeoutAfter(dVar.L).setGroupAlertBehavior(dVar.M);
            if (dVar.z) {
                this.a.setColorized(dVar.y);
            }
            if (!TextUtils.isEmpty(dVar.I)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    private void b(i.a aVar) {
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.e(), aVar.i(), aVar.a());
            if (aVar.f() != null) {
                for (RemoteInput remoteInput : m.b(aVar.f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (aVar.d() != null) {
                bundle = new Bundle(aVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean(C0201.m82(20493), aVar.b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt(C0201.m82(20494), aVar.g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.g());
            }
            bundle.putBoolean(C0201.m82(20495), aVar.h());
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
        } else if (i >= 16) {
            this.e.add(k.f(this.a, aVar));
        }
    }

    private void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    @Override // androidx.core.app.h
    public Notification.Builder a() {
        return this.a;
    }

    public Notification c() {
        Bundle a2;
        RemoteViews e2;
        RemoteViews c2;
        i.e eVar = this.b.o;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews d2 = eVar != null ? eVar.d(this) : null;
        Notification d3 = d();
        if (d2 != null) {
            d3.contentView = d2;
        } else {
            RemoteViews remoteViews = this.b.F;
            if (remoteViews != null) {
                d3.contentView = remoteViews;
            }
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (c2 = eVar.c(this)) == null)) {
            d3.bigContentView = c2;
        }
        if (!(Build.VERSION.SDK_INT < 21 || eVar == null || (e2 = this.b.o.e(this)) == null)) {
            d3.headsUpContentView = e2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (a2 = i.a(d3)) == null)) {
            eVar.a(a2);
        }
        return d3;
    }

    public Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.a.build();
        }
        if (i >= 24) {
            Notification build = this.a.build();
            if (this.g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.g != 2)) {
                    e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.g == 1) {
                    e(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.a.setExtras(this.f);
            Notification build2 = this.a.build();
            RemoteViews remoteViews = this.c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.g != 2)) {
                    e(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.g == 1) {
                    e(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.a.setExtras(this.f);
            Notification build3 = this.a.build();
            RemoteViews remoteViews4 = this.c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.g != 2)) {
                    e(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.g == 1) {
                    e(build3);
                }
            }
            return build3;
        } else {
            String r2 = C0201.m82(20496);
            if (i >= 19) {
                SparseArray<Bundle> a2 = k.a(this.e);
                if (a2 != null) {
                    this.f.putSparseParcelableArray(r2, a2);
                }
                this.a.setExtras(this.f);
                Notification build4 = this.a.build();
                RemoteViews remoteViews6 = this.c;
                if (remoteViews6 != null) {
                    build4.contentView = remoteViews6;
                }
                RemoteViews remoteViews7 = this.d;
                if (remoteViews7 != null) {
                    build4.bigContentView = remoteViews7;
                }
                return build4;
            } else if (i < 16) {
                return this.a.getNotification();
            } else {
                Notification build5 = this.a.build();
                Bundle a3 = i.a(build5);
                Bundle bundle = new Bundle(this.f);
                for (String str : this.f.keySet()) {
                    if (a3.containsKey(str)) {
                        bundle.remove(str);
                    }
                }
                a3.putAll(bundle);
                SparseArray<Bundle> a4 = k.a(this.e);
                if (a4 != null) {
                    i.a(build5).putSparseParcelableArray(r2, a4);
                }
                RemoteViews remoteViews8 = this.c;
                if (remoteViews8 != null) {
                    build5.contentView = remoteViews8;
                }
                RemoteViews remoteViews9 = this.d;
                if (remoteViews9 != null) {
                    build5.bigContentView = remoteViews9;
                }
                return build5;
            }
        }
    }
}
