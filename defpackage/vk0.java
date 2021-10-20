package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: vk0  reason: default package */
/* compiled from: AndroidDropdownPickerManagerInterface */
public interface vk0<T extends View> {
    void setColor(T t, Integer num);

    void setEnabled(T t, boolean z);

    void setItems(T t, ReadableArray readableArray);

    void setPrompt(T t, String str);

    void setSelected(T t, int i);
}
