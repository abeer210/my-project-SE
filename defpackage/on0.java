package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.util.Size;
import defpackage.qn0;

@TargetApi(23)
/* renamed from: on0  reason: default package */
/* compiled from: Camera2Api23 */
public class on0 extends nn0 {
    public on0(qn0.a aVar, tn0 tn0, Context context, Handler handler) {
        super(aVar, tn0, context, handler);
    }

    @Override // defpackage.nn0
    public void d0(vn0 vn0, StreamConfigurationMap streamConfigurationMap) {
        if (streamConfigurationMap.getHighResolutionOutputSizes(256) != null) {
            Size[] highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(256);
            for (Size size : highResolutionOutputSizes) {
                vn0.a(new un0(size.getWidth(), size.getHeight()));
            }
        }
        if (vn0.c()) {
            super.d0(vn0, streamConfigurationMap);
        }
    }
}
