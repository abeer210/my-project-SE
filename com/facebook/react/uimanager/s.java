package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.w3;
import java.util.HashMap;
import vigqyno.C0201;

/* compiled from: ReactAccessibilityDelegate */
public class s extends r2 {
    private static int f;
    public static final HashMap<String, Integer> g;
    private Handler d = new a(this);
    private final HashMap<Integer, String> e = new HashMap<>();

    /* compiled from: ReactAccessibilityDelegate */
    class a extends Handler {
        public a(s sVar) {
        }

        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ReactAccessibilityDelegate */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|(3:53|54|56)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            iArr[c.BUTTON.ordinal()] = 1;
            a[c.SEARCH.ordinal()] = 2;
            a[c.IMAGE.ordinal()] = 3;
            a[c.IMAGEBUTTON.ordinal()] = 4;
            a[c.KEYBOARDKEY.ordinal()] = 5;
            a[c.TEXT.ordinal()] = 6;
            a[c.ADJUSTABLE.ordinal()] = 7;
            a[c.CHECKBOX.ordinal()] = 8;
            a[c.RADIO.ordinal()] = 9;
            a[c.SPINBUTTON.ordinal()] = 10;
            a[c.SWITCH.ordinal()] = 11;
            a[c.NONE.ordinal()] = 12;
            a[c.LINK.ordinal()] = 13;
            a[c.SUMMARY.ordinal()] = 14;
            a[c.HEADER.ordinal()] = 15;
            a[c.ALERT.ordinal()] = 16;
            a[c.COMBOBOX.ordinal()] = 17;
            a[c.MENU.ordinal()] = 18;
            a[c.MENUBAR.ordinal()] = 19;
            a[c.MENUITEM.ordinal()] = 20;
            a[c.PROGRESSBAR.ordinal()] = 21;
            a[c.RADIOGROUP.ordinal()] = 22;
            a[c.SCROLLBAR.ordinal()] = 23;
            a[c.TAB.ordinal()] = 24;
            a[c.TABLIST.ordinal()] = 25;
            a[c.TIMER.ordinal()] = 26;
            try {
                a[c.TOOLBAR.ordinal()] = 27;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: ReactAccessibilityDelegate */
    public enum c {
        NONE,
        BUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        TOOLBAR;

        public static c b(String str) {
            c[] values = values();
            for (c cVar : values) {
                if (cVar.name().equalsIgnoreCase(str)) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static String d(c cVar) {
            switch (b.a[cVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.EditText";
                case 3:
                    return "android.widget.ImageView";
                case 4:
                    return "android.widget.ImageButon";
                case 5:
                    return "android.inputmethodservice.Keyboard$Key";
                case 6:
                    return "android.widget.TextView";
                case 7:
                    return "android.widget.SeekBar";
                case 8:
                    return "android.widget.CheckBox";
                case 9:
                    return "android.widget.RadioButton";
                case 10:
                    return "android.widget.SpinButton";
                case 11:
                    return "android.widget.Switch";
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + cVar);
            }
        }
    }

    static {
        C0201.m83(s.class, 702);
        HashMap<String, Integer> hashMap = new HashMap<>();
        g = hashMap;
        hashMap.put(C0201.m82(21965), Integer.valueOf(w3.a.g.b()));
        g.put(C0201.m82(21966), Integer.valueOf(w3.a.h.b()));
        g.put(C0201.m82(21967), Integer.valueOf(w3.a.i.b()));
        g.put(C0201.m82(21968), Integer.valueOf(w3.a.j.b()));
    }

    private void n(View view) {
        if (this.d.hasMessages(1, view)) {
            this.d.removeMessages(1, view);
        }
        this.d.sendMessageDelayed(this.d.obtainMessage(1, view), 200);
    }

    public static void o(View view) {
        if (k3.H(view)) {
            return;
        }
        if (view.getTag(ii0.accessibility_role) != null || view.getTag(ii0.accessibility_state) != null || view.getTag(ii0.accessibility_actions) != null) {
            k3.h0(view, new s());
        }
    }

    public static void p(w3 w3Var, c cVar, Context context) {
        if (cVar == null) {
            cVar = c.NONE;
        }
        w3Var.Z(c.d(cVar));
        if (cVar.equals(c.LINK)) {
            w3Var.r0(context.getString(ki0.link_description));
            CharSequence q = w3Var.q();
            String r5 = C0201.m82(21969);
            if (q != null) {
                SpannableString spannableString = new SpannableString(w3Var.q());
                spannableString.setSpan(new URLSpan(r5), 0, spannableString.length(), 0);
                w3Var.d0(spannableString);
            }
            if (w3Var.v() != null) {
                SpannableString spannableString2 = new SpannableString(w3Var.v());
                spannableString2.setSpan(new URLSpan(r5), 0, spannableString2.length(), 0);
                w3Var.y0(spannableString2);
            }
        } else if (cVar.equals(c.SEARCH)) {
            w3Var.r0(context.getString(ki0.search_description));
        } else if (cVar.equals(c.IMAGE)) {
            w3Var.r0(context.getString(ki0.image_description));
        } else if (cVar.equals(c.IMAGEBUTTON)) {
            w3Var.r0(context.getString(ki0.imagebutton_description));
            w3Var.a0(true);
        } else if (cVar.equals(c.BUTTON)) {
            w3Var.r0(context.getString(ki0.button_description));
            w3Var.a0(true);
        } else if (cVar.equals(c.SUMMARY)) {
            w3Var.r0(context.getString(ki0.summary_description));
        } else if (cVar.equals(c.HEADER)) {
            w3Var.c0(w3.c.a(0, 1, 0, 1, true));
        } else if (cVar.equals(c.ALERT)) {
            w3Var.r0(context.getString(ki0.alert_description));
        } else if (cVar.equals(c.COMBOBOX)) {
            w3Var.r0(context.getString(ki0.combobox_description));
        } else if (cVar.equals(c.MENU)) {
            w3Var.r0(context.getString(ki0.menu_description));
        } else if (cVar.equals(c.MENUBAR)) {
            w3Var.r0(context.getString(ki0.menubar_description));
        } else if (cVar.equals(c.MENUITEM)) {
            w3Var.r0(context.getString(ki0.menuitem_description));
        } else if (cVar.equals(c.PROGRESSBAR)) {
            w3Var.r0(context.getString(ki0.progressbar_description));
        } else if (cVar.equals(c.RADIOGROUP)) {
            w3Var.r0(context.getString(ki0.radiogroup_description));
        } else if (cVar.equals(c.SCROLLBAR)) {
            w3Var.r0(context.getString(ki0.scrollbar_description));
        } else if (cVar.equals(c.SPINBUTTON)) {
            w3Var.r0(context.getString(ki0.spinbutton_description));
        } else if (cVar.equals(c.TAB)) {
            w3Var.r0(context.getString(ki0.rn_tab_description));
        } else if (cVar.equals(c.TABLIST)) {
            w3Var.r0(context.getString(ki0.tablist_description));
        } else if (cVar.equals(c.TIMER)) {
            w3Var.r0(context.getString(ki0.timer_description));
        } else if (cVar.equals(c.TOOLBAR)) {
            w3Var.r0(context.getString(ki0.toolbar_description));
        }
    }

    private static void q(w3 w3Var, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals(C0201.m82(21970)) && dynamic.getType() == ReadableType.Boolean) {
                w3Var.u0(dynamic.asBoolean());
            } else if (nextKey.equals(C0201.m82(21971)) && dynamic.getType() == ReadableType.Boolean) {
                w3Var.e0(!dynamic.asBoolean());
            } else if (nextKey.equals(C0201.m82(21972)) && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                w3Var.X(true);
                w3Var.Y(asBoolean);
                if (w3Var.o().equals(c.d(c.SWITCH))) {
                    w3Var.y0(context.getString(asBoolean ? ki0.state_on_description : ki0.state_off_description));
                }
            }
        }
    }

    @Override // defpackage.r2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(ii0.accessibility_value);
        if (readableMap != null) {
            String r0 = C0201.m82(21973);
            if (readableMap.hasKey(r0)) {
                String r1 = C0201.m82(21974);
                if (readableMap.hasKey(r1)) {
                    String r2 = C0201.m82(21975);
                    if (readableMap.hasKey(r2)) {
                        Dynamic dynamic = readableMap.getDynamic(r0);
                        Dynamic dynamic2 = readableMap.getDynamic(r1);
                        Dynamic dynamic3 = readableMap.getDynamic(r2);
                        if (dynamic != null && dynamic.getType() == ReadableType.Number && dynamic2 != null && dynamic2.getType() == ReadableType.Number && dynamic3 != null && dynamic3.getType() == ReadableType.Number) {
                            int asInt = dynamic.asInt();
                            int asInt2 = dynamic2.asInt();
                            int asInt3 = dynamic3.asInt();
                            if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                                accessibilityEvent.setItemCount(asInt3 - asInt);
                                accessibilityEvent.setCurrentItemIndex(asInt2);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.r2
    public void g(View view, w3 w3Var) {
        super.g(view, w3Var);
        c cVar = (c) view.getTag(ii0.accessibility_role);
        if (cVar != null) {
            p(w3Var, cVar, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(ii0.accessibility_state);
        if (readableMap != null) {
            q(w3Var, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(ii0.accessibility_actions);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                String r4 = C0201.m82(21976);
                if (map.hasKey(r4)) {
                    int i2 = f;
                    String r6 = C0201.m82(21977);
                    String string = map.hasKey(r6) ? map.getString(r6) : null;
                    if (g.containsKey(map.getString(r4))) {
                        i2 = g.get(map.getString(r4)).intValue();
                    } else {
                        f++;
                    }
                    this.e.put(Integer.valueOf(i2), map.getString(r4));
                    w3Var.b(new w3.a(i2, string));
                } else {
                    throw new IllegalArgumentException(C0201.m82(21978));
                }
            }
        }
        ReadableMap readableMap2 = (ReadableMap) view.getTag(ii0.accessibility_value);
        if (readableMap2 != null) {
            String r0 = C0201.m82(21979);
            if (readableMap2.hasKey(r0)) {
                String r2 = C0201.m82(21980);
                if (readableMap2.hasKey(r2)) {
                    String r3 = C0201.m82(21981);
                    if (readableMap2.hasKey(r3)) {
                        Dynamic dynamic = readableMap2.getDynamic(r0);
                        Dynamic dynamic2 = readableMap2.getDynamic(r2);
                        Dynamic dynamic3 = readableMap2.getDynamic(r3);
                        if (dynamic != null && dynamic.getType() == ReadableType.Number && dynamic2 != null && dynamic2.getType() == ReadableType.Number && dynamic3 != null && dynamic3.getType() == ReadableType.Number) {
                            int asInt = dynamic.asInt();
                            int asInt2 = dynamic2.asInt();
                            int asInt3 = dynamic3.asInt();
                            if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                                w3Var.q0(w3.d.a(0, (float) asInt, (float) asInt3, (float) asInt2));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.r2
    public boolean j(View view, int i, Bundle bundle) {
        if (!this.e.containsKey(Integer.valueOf(i))) {
            return super.j(view, i, bundle);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(21982), this.e.get(Integer.valueOf(i)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveCatalystInstance()) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), C0201.m82(21983), createMap);
        } else {
            ReactSoftException.logSoftException(C0201.m82(21985), new ReactNoCrashSoftException(C0201.m82(21984)));
        }
        c cVar = (c) view.getTag(ii0.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(ii0.accessibility_value);
        if (cVar != c.ADJUSTABLE) {
            return true;
        }
        if (i != w3.a.i.b() && i != w3.a.j.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey(C0201.m82(21986))) {
            n(view);
        }
        return super.j(view, i, bundle);
    }
}
