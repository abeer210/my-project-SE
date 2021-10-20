package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.q0;
import com.facebook.react.views.scroll.h;
import com.facebook.react.views.text.b0;
import com.facebook.react.views.text.c0;
import com.facebook.react.views.text.s;
import com.facebook.react.views.text.x;
import com.facebook.react.views.text.z;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "AndroidTextInput")
public class ReactTextInputManager extends BaseViewManager<c, i> {
    private static final int AUTOCAPITALIZE_FLAGS = 0;
    private static final int BLUR_TEXT_INPUT = 0;
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final int FOCUS_TEXT_INPUT = 0;
    private static final int IME_ACTION_ID = 0;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 0;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 0;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 0;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = null;
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = null;
    private static final String KEYBOARD_TYPE_NUMBER_PAD = null;
    private static final String KEYBOARD_TYPE_NUMERIC = null;
    private static final String KEYBOARD_TYPE_PHONE_PAD = null;
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = null;
    private static final int PASSWORD_VISIBILITY_FLAG = 0;
    public static final String REACT_CLASS = null;
    private static final int SET_MOST_RECENT_EVENT_COUNT = 0;
    private static final int SET_TEXT_AND_SELECTION = 0;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static final String TAG = null;
    private static final int UNSET = 0;
    public s mReactTextViewManagerCallback;

    class a implements View.OnLongClickListener {
        public final /* synthetic */ boolean a;

        public a(ReactTextInputManager reactTextInputManager, boolean z) {
            this.a = z;
        }

        public boolean onLongClick(View view) {
            return this.a;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnFocusChangeListener {
        public final /* synthetic */ k0 a;
        public final /* synthetic */ c b;

        public b(ReactTextInputManager reactTextInputManager, k0 k0Var, c cVar) {
            this.a = k0Var;
            this.b = cVar;
        }

        public void onFocusChange(View view, boolean z) {
            com.facebook.react.uimanager.events.d eventDispatcher = ReactTextInputManager.getEventDispatcher(this.a, this.b);
            if (z) {
                eventDispatcher.v(new i(this.b.getId()));
                return;
            }
            eventDispatcher.v(new f(this.b.getId()));
            eventDispatcher.v(new g(this.b.getId(), this.b.getText().toString()));
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements TextView.OnEditorActionListener {
        public final /* synthetic */ c a;
        public final /* synthetic */ k0 b;

        public c(ReactTextInputManager reactTextInputManager, c cVar, k0 k0Var) {
            this.a = cVar;
            this.b = k0Var;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((i & 255) == 0 && i != 0) {
                return true;
            }
            boolean blurOnSubmit = this.a.getBlurOnSubmit();
            boolean k = this.a.k();
            ReactTextInputManager.getEventDispatcher(this.b, this.a).v(new n(this.a.getId(), this.a.getText().toString()));
            if (blurOnSubmit) {
                this.a.clearFocus();
            }
            if (blurOnSubmit || !k || i == 5 || i == 7) {
                return true;
            }
            return false;
        }
    }

    private class d implements a {
        private c a;
        private com.facebook.react.uimanager.events.d b;
        private int c = 0;
        private int d = 0;

        public d(ReactTextInputManager reactTextInputManager, c cVar) {
            this.a = cVar;
            this.b = ((UIManagerModule) q0.c(cVar).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.a
        public void a() {
            int width = this.a.getWidth();
            int height = this.a.getHeight();
            if (this.a.getLayout() != null) {
                width = this.a.getCompoundPaddingLeft() + this.a.getLayout().getWidth() + this.a.getCompoundPaddingRight();
                height = this.a.getCompoundPaddingTop() + this.a.getLayout().getHeight() + this.a.getCompoundPaddingBottom();
            }
            if (width != this.c || height != this.d) {
                this.d = height;
                this.c = width;
                this.b.v(new b(this.a.getId(), q.a((float) width), q.a((float) height)));
            }
        }
    }

    private class e implements o {
        private c a;
        private com.facebook.react.uimanager.events.d b;
        private int c;
        private int d;

        public e(ReactTextInputManager reactTextInputManager, c cVar) {
            this.a = cVar;
            this.b = ReactTextInputManager.getEventDispatcher(q0.c(cVar), cVar);
        }

        @Override // com.facebook.react.views.textinput.o
        public void a(int i, int i2, int i3, int i4) {
            if (this.c != i || this.d != i2) {
                this.b.v(h.n(this.a.getId(), com.facebook.react.views.scroll.i.SCROLL, i, i2, 0.0f, 0.0f, 0, 0, this.a.getWidth(), this.a.getHeight()));
                this.c = i;
                this.d = i2;
            }
        }
    }

    private class f implements p {
        private c a;
        private com.facebook.react.uimanager.events.d b;
        private int c;
        private int d;

        public f(ReactTextInputManager reactTextInputManager, c cVar) {
            this.a = cVar;
            this.b = ReactTextInputManager.getEventDispatcher(q0.c(cVar), cVar);
        }

        @Override // com.facebook.react.views.textinput.p
        public void a(int i, int i2) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            if (this.c != min || this.d != max) {
                this.b.v(new l(this.a.getId(), min, max));
                this.c = min;
                this.d = max;
            }
        }
    }

    /* access modifiers changed from: private */
    public class g implements TextWatcher {
        private com.facebook.react.uimanager.events.d a;
        private c b;
        private String c = null;

        public g(ReactTextInputManager reactTextInputManager, ReactContext reactContext, c cVar) {
            this.a = ReactTextInputManager.getEventDispatcher(reactContext, cVar);
            this.b = cVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.c = charSequence.toString();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            String str;
            String str2;
            int i5 = i;
            int i6 = i2;
            if (!this.b.I) {
                if (!(i3 == 0 && i6 == 0)) {
                    yh0.c(this.c);
                    int i7 = i5 + i3;
                    String substring = charSequence.toString().substring(i5, i7);
                    int i8 = i5 + i6;
                    String substring2 = this.c.substring(i5, i8);
                    if (i3 != i6 || !substring.equals(substring2)) {
                        JavaOnlyMap javaOnlyMap = this.b.G;
                        String r4 = C0201.m82(28790);
                        String r10 = C0201.m82(28791);
                        if (javaOnlyMap != null && javaOnlyMap.hasKey(r4)) {
                            String charSequence2 = charSequence.subSequence(i5, i7).toString();
                            String string = javaOnlyMap.getString(r10);
                            StringBuilder sb = new StringBuilder();
                            sb.append(string.substring(0, i5));
                            sb.append(charSequence2);
                            int length = string.length();
                            String r15 = C0201.m82(28792);
                            sb.append(length > i8 ? string.substring(i8) : r15);
                            javaOnlyMap.putString(r10, sb.toString());
                            JavaOnlyArray javaOnlyArray = (JavaOnlyArray) javaOnlyMap.getArray(r4);
                            int i9 = 0;
                            boolean z = false;
                            int i10 = 0;
                            while (i9 < javaOnlyArray.size() && !z) {
                                JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) javaOnlyArray.getMap(i9);
                                String string2 = javaOnlyMap2.getString(r10);
                                int length2 = i10 + string2.length();
                                if (length2 < i5) {
                                    str = substring2;
                                    i4 = length2;
                                    str2 = r15;
                                } else {
                                    int i11 = i5 - i10;
                                    int length3 = string2.length() - i11;
                                    i4 = length2;
                                    StringBuilder sb2 = new StringBuilder();
                                    str = substring2;
                                    str2 = r15;
                                    sb2.append(string2.substring(0, i11));
                                    sb2.append(charSequence2);
                                    sb2.append(string2.substring(i11 + Math.min(i6, length3)));
                                    javaOnlyMap2.putString(r10, sb2.toString());
                                    if (length3 < i6) {
                                        i5 += length3;
                                        i6 -= length3;
                                        charSequence2 = str2;
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                }
                                i9++;
                                i10 = i4;
                                javaOnlyArray = javaOnlyArray;
                                r15 = str2;
                                substring2 = str;
                            }
                        }
                        if (!(this.b.H == null || javaOnlyMap == null)) {
                            WritableMap writableNativeMap = new WritableNativeMap();
                            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                            WritableNativeArray writableNativeArray = new WritableNativeArray();
                            for (int i12 = 0; i12 < javaOnlyMap.getArray(r4).size(); i12++) {
                                ReadableMap map = javaOnlyMap.getArray(r4).getMap(i12);
                                WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                                String r12 = C0201.m82(28793);
                                writableNativeMap3.putDouble(r12, (double) map.getInt(r12));
                                writableNativeMap3.putString(r10, map.getString(r10));
                                writableNativeArray.pushMap(writableNativeMap3);
                            }
                            writableNativeMap2.putString(r10, javaOnlyMap.getString(r10));
                            writableNativeMap2.putArray(r4, writableNativeArray);
                            writableNativeMap.putInt(C0201.m82(28794), this.b.j());
                            writableNativeMap.putMap(C0201.m82(28795), writableNativeMap2);
                            this.b.H.a(writableNativeMap);
                        }
                        this.a.v(new e(this.b.getId(), charSequence.toString(), this.b.j()));
                        this.a.v(new h(this.b.getId(), substring, substring2, i5, i5 + i6));
                    }
                }
            }
        }
    }

    static {
        C0201.m83(ReactTextInputManager.class, 167);
    }

    private static void checkPasswordType(c cVar) {
        if ((cVar.getStagedInputType() & 12290) != 0 && (cVar.getStagedInputType() & 128) != 0) {
            updateStagedInputTypeFlag(cVar, 128, 16);
        }
    }

    /* access modifiers changed from: private */
    public static com.facebook.react.uimanager.events.d getEventDispatcher(ReactContext reactContext, c cVar) {
        return q0.b(reactContext, cVar.getId());
    }

    private com.facebook.react.views.text.q getReactTextUpdate(String str, int i, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) c0.b(str, c0.UNSET));
        return new com.facebook.react.views.text.q(spannableStringBuilder, i, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, i2, i3);
    }

    private void setAutofillHints(c cVar, String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            cVar.setAutofillHints(strArr);
        }
    }

    private static void updateStagedInputTypeFlag(c cVar, int i, int i2) {
        cVar.setStagedInputType(((i ^ -1) & cVar.getStagedInputType()) | i2);
    }

    public EditText createInternalEditText(k0 k0Var) {
        return new EditText(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.e.e(C0201.m82(5026), 1, C0201.m82(5027), 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        e.b a2 = com.facebook.react.common.e.a();
        String r1 = C0201.m82(5028);
        String r2 = C0201.m82(5029);
        String r3 = C0201.m82(5030);
        Map e2 = com.facebook.react.common.e.e(r1, r2, r3, C0201.m82(5031));
        String r4 = C0201.m82(5032);
        a2.b(C0201.m82(5033), com.facebook.react.common.e.d(r4, e2));
        a2.b(C0201.m82(5036), com.facebook.react.common.e.d(r4, com.facebook.react.common.e.e(r1, C0201.m82(5034), r3, C0201.m82(5035))));
        a2.b(C0201.m82(5039), com.facebook.react.common.e.d(r4, com.facebook.react.common.e.e(r1, C0201.m82(5037), r3, C0201.m82(5038))));
        a2.b(C0201.m82(5042), com.facebook.react.common.e.d(r4, com.facebook.react.common.e.e(r1, C0201.m82(5040), r3, C0201.m82(5041))));
        a2.b(C0201.m82(5045), com.facebook.react.common.e.d(r4, com.facebook.react.common.e.e(r1, C0201.m82(5043), r3, C0201.m82(5044))));
        a2.b(C0201.m82(5048), com.facebook.react.common.e.d(r4, com.facebook.react.common.e.e(r1, C0201.m82(5046), r3, C0201.m82(5047))));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e.b a2 = com.facebook.react.common.e.a();
        a2.b(com.facebook.react.views.scroll.i.b(com.facebook.react.views.scroll.i.SCROLL), com.facebook.react.common.e.d(C0201.m82(5049), C0201.m82(5050)));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return com.facebook.react.common.e.d(C0201.m82(5055), com.facebook.react.common.e.g(C0201.m82(5051), 0, C0201.m82(5052), 4096, C0201.m82(5053), 8192, C0201.m82(5054), 16384));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(5056);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends i> getShadowNodeClass() {
        return m.class;
    }

    @xj0(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(c cVar, boolean z) {
        cVar.setAllowFontScaling(z);
    }

    @xj0(name = "autoCapitalize")
    public void setAutoCapitalize(c cVar, Dynamic dynamic) {
        int i = 16384;
        if (dynamic.getType() == ReadableType.Number) {
            i = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.equals(C0201.m82(5065))) {
                i = 0;
            } else if (asString.equals(C0201.m82(5066))) {
                i = 4096;
            } else if (asString.equals(C0201.m82(5067))) {
                i = 8192;
            } else {
                asString.equals(C0201.m82(5068));
            }
        }
        updateStagedInputTypeFlag(cVar, 28672, i);
    }

    @xj0(name = "autoCorrect")
    public void setAutoCorrect(c cVar, Boolean bool) {
        updateStagedInputTypeFlag(cVar, 557056, bool != null ? bool.booleanValue() ? 32768 : 524288 : 0);
    }

    @xj0(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(c cVar, boolean z) {
        cVar.setAutoFocus(z);
    }

    @xj0(name = "blurOnSubmit")
    public void setBlurOnSubmit(c cVar, Boolean bool) {
        cVar.setBlurOnSubmit(bool);
    }

    @yj0(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(c cVar, int i, Integer num) {
        float f2 = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f2 = (float) (num.intValue() >>> 24);
        }
        cVar.w(SPACING_TYPES[i], intValue, f2);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(c cVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.c(f2);
        }
        if (i == 0) {
            cVar.setBorderRadius(f2);
        } else {
            cVar.x(f2, i - 1);
        }
    }

    @xj0(name = "borderStyle")
    public void setBorderStyle(c cVar, String str) {
        cVar.setBorderStyle(str);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(c cVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.c(f2);
        }
        cVar.y(SPACING_TYPES[i], f2);
    }

    @xj0(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(c cVar, boolean z) {
        cVar.setCursorVisible(!z);
    }

    @xj0(customType = "Color", name = "color")
    public void setColor(c cVar, Integer num) {
        if (num == null) {
            ColorStateList b2 = com.facebook.react.views.text.d.b(cVar.getContext());
            if (b2 != null) {
                cVar.setTextColor(b2);
                return;
            }
            Context context = cVar.getContext();
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(5069));
            sb.append(context != null ? context.getClass().getCanonicalName() : C0201.m82(5070));
            ReactSoftException.logSoftException(str, new IllegalStateException(sb.toString()));
            return;
        }
        cVar.setTextColor(num.intValue());
    }

    @xj0(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(c cVar, boolean z) {
        cVar.setOnLongClickListener(new a(this, z));
    }

    @xj0(customType = "Color", name = "cursorColor")
    public void setCursorColor(c cVar, Integer num) {
        if (num != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                Drawable textCursorDrawable = cVar.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setColorFilter(new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN));
                    cVar.setTextCursorDrawable(textCursorDrawable);
                }
            } else if (i != 28) {
                try {
                    Field declaredField = TextView.class.getDeclaredField(C0201.m82(5071));
                    declaredField.setAccessible(true);
                    int i2 = declaredField.getInt(cVar);
                    if (i2 != 0) {
                        Drawable f2 = androidx.core.content.b.f(cVar.getContext(), i2);
                        f2.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                        Drawable[] drawableArr = {f2, f2};
                        Field declaredField2 = TextView.class.getDeclaredField(C0201.m82(5072));
                        declaredField2.setAccessible(true);
                        Object obj = declaredField2.get(cVar);
                        Field declaredField3 = obj.getClass().getDeclaredField(C0201.m82(5073));
                        declaredField3.setAccessible(true);
                        declaredField3.set(obj, drawableArr);
                    }
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                }
            }
        }
    }

    @xj0(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(c cVar, boolean z) {
        cVar.setDisableFullscreenUI(z);
    }

    @xj0(defaultBoolean = true, name = "editable")
    public void setEditable(c cVar, boolean z) {
        cVar.setEnabled(z);
    }

    @xj0(name = "fontFamily")
    public void setFontFamily(c cVar, String str) {
        cVar.setFontFamily(str);
    }

    @xj0(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(c cVar, float f2) {
        cVar.setFontSize(f2);
    }

    @xj0(name = "fontStyle")
    public void setFontStyle(c cVar, String str) {
        cVar.setFontStyle(str);
    }

    @xj0(name = "fontWeight")
    public void setFontWeight(c cVar, String str) {
        cVar.setFontWeight(str);
    }

    @xj0(name = "importantForAutofill")
    public void setImportantForAutofill(c cVar, String str) {
        int i;
        if (C0201.m82(5074).equals(str)) {
            i = 2;
        } else if (C0201.m82(5075).equals(str)) {
            i = 8;
        } else if (C0201.m82(5076).equals(str)) {
            i = 1;
        } else {
            i = C0201.m82(5077).equals(str) ? 4 : 0;
        }
        setImportantForAutofill(cVar, i);
    }

    @xj0(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(c cVar, boolean z) {
        cVar.setIncludeFontPadding(z);
    }

    @xj0(name = "inlineImageLeft")
    public void setInlineImageLeft(c cVar, String str) {
        cVar.setCompoundDrawablesWithIntrinsicBounds(pl0.a().c(cVar.getContext(), str), 0, 0, 0);
    }

    @xj0(name = "inlineImagePadding")
    public void setInlineImagePadding(c cVar, int i) {
        cVar.setCompoundDrawablePadding(i);
    }

    @xj0(name = "keyboardType")
    public void setKeyboardType(c cVar, String str) {
        int i;
        if (C0201.m82(5078).equalsIgnoreCase(str)) {
            i = 12290;
        } else if (C0201.m82(5079).equalsIgnoreCase(str)) {
            i = 2;
        } else if (C0201.m82(5080).equalsIgnoreCase(str)) {
            i = 8194;
        } else if (C0201.m82(5081).equalsIgnoreCase(str)) {
            i = 33;
        } else if (C0201.m82(5082).equalsIgnoreCase(str)) {
            i = 3;
        } else {
            i = C0201.m82(5083).equalsIgnoreCase(str) ? 144 : 1;
        }
        updateStagedInputTypeFlag(cVar, 15, i);
        checkPasswordType(cVar);
    }

    @xj0(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(c cVar, float f2) {
        cVar.setLetterSpacingPt(f2);
    }

    @xj0(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(c cVar, float f2) {
        cVar.setMaxFontSizeMultiplier(f2);
    }

    @xj0(name = "maxLength")
    public void setMaxLength(c cVar, Integer num) {
        InputFilter[] filters = cVar.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < filters.length; i++) {
                    if (!(filters[i] instanceof InputFilter.LengthFilter)) {
                        linkedList.add(filters[i]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i2 = 0; i2 < filters.length; i2++) {
                if (filters[i2] instanceof InputFilter.LengthFilter) {
                    filters[i2] = new InputFilter.LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (!z) {
                InputFilter[] inputFilterArr2 = new InputFilter[(filters.length + 1)];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        cVar.setFilters(inputFilterArr);
    }

    @xj0(defaultBoolean = false, name = "multiline")
    public void setMultiline(c cVar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 131072;
        if (z) {
            i = 131072;
        }
        updateStagedInputTypeFlag(cVar, i2, i);
    }

    @xj0(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(c cVar, int i) {
        cVar.setLines(i);
    }

    @xj0(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(c cVar, boolean z) {
        if (z) {
            cVar.setContentSizeWatcher(new d(this, cVar));
        } else {
            cVar.setContentSizeWatcher(null);
        }
    }

    @xj0(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(c cVar, boolean z) {
        cVar.setOnKeyPress(z);
    }

    @xj0(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(c cVar, boolean z) {
        if (z) {
            cVar.setScrollWatcher(new e(this, cVar));
        } else {
            cVar.setScrollWatcher(null);
        }
    }

    @xj0(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(c cVar, boolean z) {
        if (z) {
            cVar.setSelectionWatcher(new f(this, cVar));
        } else {
            cVar.setSelectionWatcher(null);
        }
    }

    @xj0(name = "placeholder")
    public void setPlaceholder(c cVar, String str) {
        cVar.setHint(str);
    }

    @xj0(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(c cVar, Integer num) {
        if (num == null) {
            cVar.setHintTextColor(com.facebook.react.views.text.d.d(cVar.getContext()));
        } else {
            cVar.setHintTextColor(num.intValue());
        }
    }

    @xj0(name = "returnKeyLabel")
    public void setReturnKeyLabel(c cVar, String str) {
        cVar.setImeActionLabel(str, 1648);
    }

    @xj0(name = "returnKeyType")
    public void setReturnKeyType(c cVar, String str) {
        cVar.setReturnKeyType(str);
    }

    @xj0(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(c cVar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 144;
        if (z) {
            i = 128;
        }
        updateStagedInputTypeFlag(cVar, i2, i);
        checkPasswordType(cVar);
    }

    @xj0(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(c cVar, boolean z) {
        cVar.setSelectAllOnFocus(z);
    }

    @xj0(customType = "Color", name = "selectionColor")
    public void setSelectionColor(c cVar, Integer num) {
        if (num == null) {
            cVar.setHighlightColor(com.facebook.react.views.text.d.c(cVar.getContext()));
        } else {
            cVar.setHighlightColor(num.intValue());
        }
        setCursorColor(cVar, num);
    }

    @xj0(name = "textAlign")
    public void setTextAlign(c cVar, String str) {
        if (C0201.m82(5084).equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                cVar.setJustificationMode(1);
            }
            cVar.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            cVar.setJustificationMode(0);
        }
        if (str == null || C0201.m82(5085).equals(str)) {
            cVar.setGravityHorizontal(0);
        } else if (C0201.m82(5086).equals(str)) {
            cVar.setGravityHorizontal(3);
        } else if (C0201.m82(5087).equals(str)) {
            cVar.setGravityHorizontal(5);
        } else if (C0201.m82(5088).equals(str)) {
            cVar.setGravityHorizontal(1);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(5089) + str);
        }
    }

    @xj0(name = "textAlignVertical")
    public void setTextAlignVertical(c cVar, String str) {
        if (str == null || C0201.m82(5090).equals(str)) {
            cVar.setGravityVertical(0);
        } else if (C0201.m82(5091).equals(str)) {
            cVar.setGravityVertical(48);
        } else if (C0201.m82(5092).equals(str)) {
            cVar.setGravityVertical(80);
        } else if (C0201.m82(5093).equals(str)) {
            cVar.setGravityVertical(16);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(5094) + str);
        }
    }

    @xj0(name = "autoCompleteType")
    public void setTextContentType(c cVar, String str) {
        if (str == null) {
            setImportantForAutofill(cVar, 2);
            return;
        }
        String r1 = C0201.m82(5095);
        if (r1.equals(str)) {
            setAutofillHints(cVar, r1);
            return;
        }
        String r12 = C0201.m82(5096);
        if (r12.equals(str)) {
            setAutofillHints(cVar, r12);
        } else if (C0201.m82(5097).equals(str)) {
            setAutofillHints(cVar, C0201.m82(5098));
        } else {
            String r13 = C0201.m82(5099);
            if (r13.equals(str)) {
                setAutofillHints(cVar, r13);
            } else if (C0201.m82(5100).equals(str)) {
                setAutofillHints(cVar, C0201.m82(5101));
            } else if (C0201.m82(5102).equals(str)) {
                setAutofillHints(cVar, C0201.m82(5103));
            } else if (C0201.m82(5104).equals(str)) {
                setAutofillHints(cVar, C0201.m82(5105));
            } else if (C0201.m82(5106).equals(str)) {
                setAutofillHints(cVar, C0201.m82(5107));
            } else if (C0201.m82(5108).equals(str)) {
                setAutofillHints(cVar, C0201.m82(5109));
            } else if (C0201.m82(5110).equals(str)) {
                setAutofillHints(cVar, C0201.m82(5111));
            } else if (C0201.m82(5112).equals(str)) {
                setAutofillHints(cVar, C0201.m82(5113));
            } else if (C0201.m82(5114).equals(str)) {
                setAutofillHints(cVar, C0201.m82(5115));
            } else if (C0201.m82(5116).equals(str)) {
                setImportantForAutofill(cVar, 2);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(5117) + str);
            }
        }
    }

    @xj0(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(c cVar, Integer num) {
        Drawable background = cVar.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e2) {
                f60.j(TAG, C0201.m82(5118), e2);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @xj0(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(c cVar, boolean z) {
        cVar.setShowSoftInputOnFocus(z);
    }

    public void addEventEmitters(k0 k0Var, c cVar) {
        cVar.addTextChangedListener(new g(this, k0Var, cVar));
        cVar.setOnFocusChangeListener(new b(this, k0Var, cVar));
        cVar.setOnEditorActionListener(new c(this, cVar, k0Var));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.h createShadowNodeInstance() {
        return new m();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(k0 k0Var) {
        c cVar = new c(k0Var);
        cVar.setInputType(cVar.getInputType() & -131073);
        cVar.setReturnKeyType(C0201.m82(5025));
        return cVar;
    }

    public void onAfterUpdateTransaction(c cVar) {
        super.onAfterUpdateTransaction((View) cVar);
        cVar.r();
        cVar.h();
    }

    public void setPadding(c cVar, int i, int i2, int i3, int i4) {
        cVar.setPadding(i, i2, i3, i4);
    }

    public void updateExtraData(c cVar, Object obj) {
        if (obj instanceof com.facebook.react.views.text.q) {
            com.facebook.react.views.text.q qVar = (com.facebook.react.views.text.q) obj;
            int f2 = (int) qVar.f();
            int h = (int) qVar.h();
            int g2 = (int) qVar.g();
            int e2 = (int) qVar.e();
            if (!(f2 == -1 && h == -1 && g2 == -1 && e2 == -1)) {
                if (f2 == -1) {
                    f2 = cVar.getPaddingLeft();
                }
                if (h == -1) {
                    h = cVar.getPaddingTop();
                }
                if (g2 == -1) {
                    g2 = cVar.getPaddingRight();
                }
                if (e2 == -1) {
                    e2 = cVar.getPaddingBottom();
                }
                cVar.setPadding(f2, h, g2, e2);
            }
            if (qVar.b()) {
                z.g(qVar.k(), cVar);
            }
            cVar.q(qVar);
            cVar.n(qVar.c(), qVar.j(), qVar.i());
        }
    }

    public Object updateState(c cVar, com.facebook.react.uimanager.c0 c0Var, j0 j0Var) {
        ReadableNativeMap state = j0Var.getState();
        if (!state.getBoolean(C0201.m82(5119))) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ReactContext c2 = q0.c(cVar);
            if (c2 instanceof k0) {
                EditText createInternalEditText = createInternalEditText((k0) c2);
                writableNativeMap.putNull(C0201.m82(5120));
                writableNativeMap.putDouble(C0201.m82(5121), (double) q.a((float) k3.B(createInternalEditText)));
                writableNativeMap.putDouble(C0201.m82(5122), (double) q.a((float) k3.A(createInternalEditText)));
                writableNativeMap.putDouble(C0201.m82(5123), (double) q.a((float) createInternalEditText.getPaddingTop()));
                writableNativeMap.putDouble(C0201.m82(5124), (double) q.a((float) createInternalEditText.getPaddingBottom()));
                j0Var.a(writableNativeMap);
            } else {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append(C0201.m82(5125));
                sb.append(c2 != null ? c2.getClass().getName() : C0201.m82(5126));
                ReactSoftException.logSoftException(str, new IllegalStateException(sb.toString()));
            }
        }
        ReadableNativeMap map = state.getMap(C0201.m82(5127));
        ReadableNativeMap map2 = state.getMap(C0201.m82(5128));
        Spannable c3 = b0.c(cVar.getContext(), map, this.mReactTextViewManagerCallback);
        int j = x.j(map2.getString(C0201.m82(5129)));
        cVar.H = j0Var;
        return com.facebook.react.views.text.q.a(c3, state.getInt(C0201.m82(5130)), false, x.i(c0Var), j, x.f(c0Var), map);
    }

    public com.facebook.react.views.text.h createShadowNodeInstance(s sVar) {
        return new m(sVar);
    }

    public void receiveCommand(c cVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            receiveCommand(cVar, C0201.m82(5059), readableArray);
        } else if (i == 2) {
            receiveCommand(cVar, C0201.m82(5058), readableArray);
        } else if (i == 4) {
            receiveCommand(cVar, C0201.m82(5057), readableArray);
        }
    }

    private void setImportantForAutofill(c cVar, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            cVar.setImportantForAutofill(i);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public void receiveCommand(c cVar, String str, ReadableArray readableArray) {
        char c2;
        int i;
        switch (str.hashCode()) {
            case -1699362314:
                if (str.equals(C0201.m82(5064))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3027047:
                if (str.equals(C0201.m82(5063))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 97604824:
                if (str.equals(C0201.m82(5062))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1427010500:
                if (str.equals(C0201.m82(5061))) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1690703013:
                if (str.equals(C0201.m82(5060))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            cVar.t();
        } else if (c2 == 2 || c2 == 3) {
            cVar.g();
        } else if (c2 == 4 && (i = readableArray.getInt(0)) != -1) {
            String string = readableArray.getString(1);
            int i2 = readableArray.getInt(2);
            int i3 = readableArray.getInt(3);
            if (i3 == -1) {
                i3 = i2;
            }
            cVar.p(getReactTextUpdate(string, i, i2, i3));
            cVar.n(i, i2, i3);
        }
    }
}
