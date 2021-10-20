package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.zk0;
import vigqyno.C0201;

/* renamed from: yk0  reason: default package */
/* compiled from: AndroidSwipeRefreshLayoutManagerDelegate */
public class yk0<T extends View, U extends b<T> & zk0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & zk0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public yk0(U u) {
        super(u);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        boolean z = false;
        boolean z2 = true;
        int i = 1;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals(C0201.m82(13988))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1354842768:
                if (str.equals(C0201.m82(13987))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -885150488:
                if (str.equals(C0201.m82(13986))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -416037467:
                if (str.equals(C0201.m82(13985))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -321826009:
                if (str.equals(C0201.m82(13984))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3530753:
                if (str.equals(C0201.m82(13983))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            zk0 zk0 = (zk0) this.a;
            if (obj != null) {
                z2 = ((Boolean) obj).booleanValue();
            }
            zk0.setEnabled(t, z2);
        } else if (c == 1) {
            ((zk0) this.a).setColors(t, (ReadableArray) obj);
        } else if (c == 2) {
            ((zk0) this.a).setProgressBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
        } else if (c == 3) {
            zk0 zk02 = (zk0) this.a;
            if (obj != null) {
                i = ((Double) obj).intValue();
            }
            zk02.setSize(t, i);
        } else if (c == 4) {
            ((zk0) this.a).setProgressViewOffset(t, obj == null ? 0.0f : ((Double) obj).floatValue());
        } else if (c != 5) {
            super.a(t, str, obj);
        } else {
            zk0 zk03 = (zk0) this.a;
            if (obj != null) {
                z = ((Boolean) obj).booleanValue();
            }
            zk03.setRefreshing(t, z);
        }
    }
}
