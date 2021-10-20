package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.c;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: MessagingSerializer */
public class b {
    public static WritableMap a(c cVar) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (cVar.o() != null) {
            createMap.putString(C0201.m82(10201), cVar.o());
        }
        if (cVar.p() != null) {
            for (Map.Entry<String, String> entry : cVar.p().entrySet()) {
                createMap2.putString(entry.getKey(), entry.getValue());
            }
        }
        createMap.putMap(C0201.m82(10202), createMap2);
        if (cVar.r() != null) {
            createMap.putString(C0201.m82(10203), cVar.r());
        }
        if (cVar.s() != null) {
            createMap.putString(C0201.m82(10204), cVar.s());
        }
        if (cVar.u() != null) {
            createMap.putString(C0201.m82(10205), cVar.u());
        }
        createMap.putDouble(C0201.m82(10206), (double) cVar.y());
        if (cVar.z() != null) {
            createMap.putString(C0201.m82(10207), cVar.z());
        }
        createMap.putDouble(C0201.m82(10208), (double) cVar.A());
        return createMap;
    }
}
