package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.b;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.imagepicker.ImagePickerModule;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* renamed from: uc2  reason: default package */
/* compiled from: PermissionUtils */
public class uc2 {

    /* renamed from: uc2$a */
    /* compiled from: PermissionUtils */
    static class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ c a;
        public final /* synthetic */ WeakReference b;

        public a(c cVar, WeakReference weakReference) {
            this.a = cVar;
            this.b = weakReference;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.b(this.b, dialogInterface);
        }
    }

    /* renamed from: uc2$b */
    /* compiled from: PermissionUtils */
    static class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ c a;
        public final /* synthetic */ WeakReference b;

        public b(c cVar, WeakReference weakReference) {
            this.a = cVar;
            this.b = weakReference;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.a(this.b, dialogInterface);
        }
    }

    /* renamed from: uc2$c */
    /* compiled from: PermissionUtils */
    public interface c {
        void a(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface);

        void b(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface);
    }

    public static androidx.appcompat.app.b a(ImagePickerModule imagePickerModule, ReadableMap readableMap, c cVar) {
        if (imagePickerModule.getContext() == null) {
            return null;
        }
        String r0 = C0201.m82(25008);
        if (!readableMap.hasKey(r0)) {
            return null;
        }
        ReadableMap map = readableMap.getMap(r0);
        if (((ReadableNativeMap) map).toHashMap().size() == 0) {
            return null;
        }
        String string = map.getString(C0201.m82(25009));
        String string2 = map.getString(C0201.m82(25010));
        String string3 = map.getString(C0201.m82(25011));
        String string4 = map.getString(C0201.m82(25012));
        WeakReference weakReference = new WeakReference(imagePickerModule);
        Activity activity = imagePickerModule.getActivity();
        if (activity == null) {
            return null;
        }
        b.a aVar = new b.a(activity, imagePickerModule.getDialogThemeId());
        aVar.l(string);
        aVar.g(string2);
        aVar.d(false);
        aVar.h(string4, new b(cVar, weakReference));
        aVar.j(string3, new a(cVar, weakReference));
        return aVar.a();
    }
}
