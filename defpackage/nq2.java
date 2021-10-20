package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
import vigqyno.C0201;

/* renamed from: nq2  reason: default package */
/* compiled from: TransitionModule */
public class nq2 {
    private final UIManagerModule a;

    /* renamed from: nq2$a */
    /* compiled from: TransitionModule */
    class a implements n0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ ReadableMap b;

        public a(nq2 nq2, int i, ReadableMap readableMap) {
            this.a = i;
            this.b = readableMap;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            try {
                View w = mVar.w(this.a);
                if (w instanceof ViewGroup) {
                    ReadableArray array = this.b.getArray(C0201.m82(29412));
                    int size = array.size();
                    for (int i = 0; i < size; i++) {
                        g6.a((ViewGroup) w, oq2.c(array.getMap(i)));
                    }
                }
            } catch (g unused) {
            }
        }
    }

    public nq2(UIManagerModule uIManagerModule) {
        this.a = uIManagerModule;
    }

    public void a(int i, ReadableMap readableMap) {
        this.a.prependUIBlock(new a(this, i, readableMap));
    }
}
