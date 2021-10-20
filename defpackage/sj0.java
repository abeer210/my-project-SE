package defpackage;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.art.ARTRenderableViewManager;
import com.facebook.react.views.art.ARTSurfaceViewManager;
import com.facebook.react.views.checkbox.ReactCheckBoxManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactDropdownPickerManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: sj0  reason: default package */
/* compiled from: MainReactPackage */
public class sj0 extends aj0 {
    public static final String b = null;
    public static final String c = null;
    private rj0 a;

    /* renamed from: sj0$a */
    /* compiled from: MainReactPackage */
    class a implements com.facebook.react.module.model.a {
        public final /* synthetic */ Map a;

        public a(sj0 sj0, Map map) {
            this.a = map;
        }

        @Override // com.facebook.react.module.model.a
        public Map<String, ReactModuleInfo> a() {
            return this.a;
        }
    }

    static {
        C0201.m83(sj0.class, 30);
    }

    public sj0(rj0 rj0) {
        this.a = rj0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aj0
    public NativeModule c(String str, ReactApplicationContext reactApplicationContext) {
        char c2;
        switch (str.hashCode()) {
            case -2115067288:
                if (str.equals(C0201.m82(10326))) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case -2033388651:
                if (str.equals(C0201.m82(10325))) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1962922905:
                if (str.equals(C0201.m82(10324))) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -1850625090:
                if (str.equals(C0201.m82(10323))) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case -1654566518:
                if (str.equals(C0201.m82(10322))) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1505215509:
                if (str.equals(C0201.m82(10321))) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1399423980:
                if (str.equals(C0201.m82(10320))) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case -1344126773:
                if (str.equals(C0201.m82(10319))) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1062061717:
                if (str.equals(C0201.m82(10318))) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -657277650:
                if (str.equals(C0201.m82(10317))) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -570370161:
                if (str.equals(C0201.m82(10316))) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -504784764:
                if (str.equals(C0201.m82(10315))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -457866500:
                if (str.equals(C0201.m82(10314))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -382654004:
                if (str.equals(C0201.m82(10313))) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case -254310125:
                if (str.equals(C0201.m82(10312))) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 163245714:
                if (str.equals(C0201.m82(10311))) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 174691539:
                if (str.equals(C0201.m82(10310))) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 283572496:
                if (str.equals(C0201.m82(10309))) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 403570038:
                if (str.equals(C0201.m82(10308))) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 563961875:
                if (str.equals(C0201.m82(10307))) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 1221389072:
                if (str.equals(C0201.m82(10306))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1515242260:
                if (str.equals(C0201.m82(10305))) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 1547941001:
                if (str.equals(C0201.m82(10304))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1555425035:
                if (str.equals(C0201.m82(10303))) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 1721274886:
                if (str.equals(C0201.m82(10302))) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 1922110066:
                if (str.equals(C0201.m82(10301))) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new AccessibilityInfoModule(reactApplicationContext);
            case 1:
                return new AppearanceModule(reactApplicationContext);
            case 2:
                return new AppStateModule(reactApplicationContext);
            case 3:
                return new BlobModule(reactApplicationContext);
            case 4:
                return new FileReaderModule(reactApplicationContext);
            case 5:
                return new AsyncStorageModule(reactApplicationContext);
            case 6:
                return new CameraRollManager(reactApplicationContext);
            case 7:
                return new ClipboardModule(reactApplicationContext);
            case '\b':
                return new DatePickerDialogModule(reactApplicationContext);
            case '\t':
                return new DialogModule(reactApplicationContext);
            case '\n':
                rj0 rj0 = this.a;
                if (rj0 == null) {
                    return new FrescoModule(reactApplicationContext, true, null);
                }
                rj0.a();
                throw null;
            case 11:
                return new I18nManagerModule(reactApplicationContext);
            case '\f':
                return new ImageEditingManager(reactApplicationContext);
            case '\r':
                return new ImageLoaderModule(reactApplicationContext);
            case 14:
                return new ImageStoreManager(reactApplicationContext);
            case 15:
                return new IntentModule(reactApplicationContext);
            case 16:
                return new NativeAnimatedModule(reactApplicationContext);
            case 17:
                return new NetworkingModule(reactApplicationContext);
            case 18:
                return new PermissionsModule(reactApplicationContext);
            case 19:
                return new ShareModule(reactApplicationContext);
            case 20:
                return new StatusBarModule(reactApplicationContext);
            case 21:
                return new SoundManagerModule(reactApplicationContext);
            case 22:
                return new TimePickerDialogModule(reactApplicationContext);
            case 23:
                return new ToastModule(reactApplicationContext);
            case 24:
                return new VibrationModule(reactApplicationContext);
            case 25:
                return new WebSocketModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // defpackage.aj0, defpackage.wi0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ARTRenderableViewManager.createARTGroupViewManager());
        arrayList.add(ARTRenderableViewManager.createARTShapeViewManager());
        arrayList.add(ARTRenderableViewManager.createARTTextViewManager());
        arrayList.add(new ReactCheckBoxManager());
        arrayList.add(new ReactDialogPickerManager());
        arrayList.add(new ReactDrawerLayoutManager());
        arrayList.add(new ReactDropdownPickerManager());
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSliderManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        arrayList.add(new ARTSurfaceViewManager());
        arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
        arrayList.add(new ReactImageManager());
        arrayList.add(new ReactModalHostManager());
        arrayList.add(new ReactRawTextManager());
        arrayList.add(new ReactTextInputManager());
        arrayList.add(new ReactTextViewManager());
        arrayList.add(new ReactViewManager());
        arrayList.add(new ReactViewPagerManager());
        arrayList.add(new ReactVirtualTextViewManager());
        return arrayList;
    }

    @Override // defpackage.aj0
    public com.facebook.react.module.model.a e() {
        String str = b;
        try {
            return (com.facebook.react.module.model.a) Class.forName(c).newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, FileReaderModule.class, AsyncStorageModule.class, CameraRollManager.class, ClipboardModule.class, DatePickerDialogModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageEditingManager.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, TimePickerDialogModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
            HashMap hashMap = new HashMap();
            for (int i = 0; i < 26; i++) {
                Class cls = clsArr[i];
                pj0 pj0 = (pj0) cls.getAnnotation(pj0.class);
                hashMap.put(pj0.name(), new ReactModuleInfo(pj0.name(), cls.getName(), pj0.canOverrideExistingModule(), pj0.needsEagerInit(), pj0.hasConstants(), pj0.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(cls)));
            }
            return new a(this, hashMap);
        } catch (InstantiationException e) {
            throw new RuntimeException(str, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(str, e2);
        }
    }
}
