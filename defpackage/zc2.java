package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.b;
import com.facebook.react.bridge.ReadableMap;
import com.imagepicker.ImagePickerModule;
import java.lang.ref.WeakReference;
import java.util.List;
import vigqyno.C0201;

/* renamed from: zc2  reason: default package */
/* compiled from: UI */
public class zc2 {

    /* renamed from: zc2$a */
    /* compiled from: UI */
    static class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ List a;
        public final /* synthetic */ d b;
        public final /* synthetic */ WeakReference c;

        public a(List list, d dVar, WeakReference weakReference) {
            this.a = list;
            this.b = dVar;
            this.c = weakReference;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
        public void onClick(DialogInterface dialogInterface, int i) {
            char c2;
            String str = (String) this.a.get(i);
            int hashCode = str.hashCode();
            if (hashCode != -1367724422) {
                if (hashCode != 106642994) {
                    if (hashCode == 166208699 && str.equals(C0201.m82(37240))) {
                        c2 = 1;
                        if (c2 != 0) {
                            this.b.d((ImagePickerModule) this.c.get());
                            return;
                        } else if (c2 == 1) {
                            this.b.c((ImagePickerModule) this.c.get());
                            return;
                        } else if (c2 != 2) {
                            this.b.a((ImagePickerModule) this.c.get(), str);
                            return;
                        } else {
                            this.b.b((ImagePickerModule) this.c.get());
                            return;
                        }
                    }
                } else if (str.equals(C0201.m82(37241))) {
                    c2 = 0;
                    if (c2 != 0) {
                    }
                }
            } else if (str.equals(C0201.m82(37242))) {
                c2 = 2;
                if (c2 != 0) {
                }
            }
            c2 = 65535;
            if (c2 != 0) {
            }
        }
    }

    /* renamed from: zc2$b */
    /* compiled from: UI */
    static class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ d a;
        public final /* synthetic */ WeakReference b;

        public b(d dVar, WeakReference weakReference) {
            this.a = dVar;
            this.b = weakReference;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.b((ImagePickerModule) this.b.get());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: zc2$c */
    /* compiled from: UI */
    static class c implements DialogInterface.OnCancelListener {
        public final /* synthetic */ d a;
        public final /* synthetic */ WeakReference b;

        public c(d dVar, WeakReference weakReference) {
            this.a = dVar;
            this.b = weakReference;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.a.b((ImagePickerModule) this.b.get());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: zc2$d */
    /* compiled from: UI */
    public interface d {
        void a(ImagePickerModule imagePickerModule, String str);

        void b(ImagePickerModule imagePickerModule);

        void c(ImagePickerModule imagePickerModule);

        void d(ImagePickerModule imagePickerModule);
    }

    public static androidx.appcompat.app.b a(ImagePickerModule imagePickerModule, ReadableMap readableMap, d dVar) {
        Activity activity = imagePickerModule.getActivity();
        if (activity == null) {
            return null;
        }
        WeakReference weakReference = new WeakReference(imagePickerModule);
        vc2 e = vc2.e(readableMap);
        List<String> d2 = e.d();
        List<String> a2 = e.a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(activity, com.imagepicker.b.list_item, d2);
        b.a aVar = new b.a(activity, imagePickerModule.getDialogThemeId());
        String r7 = C0201.m82(28335);
        if (xc2.b(readableMap, r7)) {
            aVar.l(readableMap.getString(r7));
        }
        aVar.c(arrayAdapter, new a(a2, dVar, weakReference));
        aVar.h(e.c.a, new b(dVar, weakReference));
        androidx.appcompat.app.b a3 = aVar.a();
        a3.setOnCancelListener(new c(dVar, weakReference));
        return a3;
    }
}
