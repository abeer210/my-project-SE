package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: zk0  reason: default package */
/* compiled from: AndroidSwipeRefreshLayoutManagerInterface */
public interface zk0<T extends View> {
    void setColors(T t, ReadableArray readableArray);

    void setEnabled(T t, boolean z);

    void setProgressBackgroundColor(T t, Integer num);

    void setProgressViewOffset(T t, float f);

    void setRefreshing(T t, boolean z);

    void setSize(T t, int i);
}
