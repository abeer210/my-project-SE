package defpackage;

import android.view.View;

/* renamed from: bl0  reason: default package */
/* compiled from: AndroidSwitchManagerInterface */
public interface bl0<T extends View> {
    void setDisabled(T t, boolean z);

    void setEnabled(T t, boolean z);

    void setOn(T t, boolean z);

    void setThumbColor(T t, Integer num);

    void setThumbTintColor(T t, Integer num);

    void setTrackColorForFalse(T t, Integer num);

    void setTrackColorForTrue(T t, Integer num);

    void setTrackTintColor(T t, Integer num);

    void setValue(T t, boolean z);
}
