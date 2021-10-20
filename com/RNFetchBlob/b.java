package com.RNFetchBlob;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: RNFetchBlobConfig */
public class b {
    public Boolean a;
    public String b;
    public String c;
    public ReadableMap d;
    public Boolean e;
    public String f;
    public Boolean g;
    public Boolean h = Boolean.TRUE;
    public long i = 60000;
    public Boolean j = Boolean.FALSE;
    public Boolean k = Boolean.TRUE;
    public ReadableArray l;

    public b(ReadableMap readableMap) {
        String str = null;
        this.l = null;
        if (readableMap != null) {
            String r1 = C0201.m82(19301);
            boolean z = false;
            this.a = Boolean.valueOf(readableMap.hasKey(r1) ? readableMap.getBoolean(r1) : false);
            String r12 = C0201.m82(19302);
            this.b = readableMap.hasKey(r12) ? readableMap.getString(r12) : null;
            String r13 = C0201.m82(19303);
            this.c = readableMap.hasKey(r13) ? readableMap.getString(r13) : C0201.m82(19304);
            String r14 = C0201.m82(19305);
            this.e = Boolean.valueOf(readableMap.hasKey(r14) ? readableMap.getBoolean(r14) : false);
            String r15 = C0201.m82(19306);
            if (readableMap.hasKey(r15)) {
                this.d = readableMap.getMap(r15);
            }
            String r16 = C0201.m82(19307);
            if (readableMap.hasKey(r16)) {
                this.l = readableMap.getArray(r16);
            }
            String str2 = this.b;
            if (str2 != null && str2.toLowerCase().contains(C0201.m82(19308))) {
                this.h = Boolean.FALSE;
            }
            String r17 = C0201.m82(19309);
            if (readableMap.hasKey(r17)) {
                this.h = Boolean.valueOf(readableMap.getBoolean(r17));
            }
            String r18 = C0201.m82(19310);
            if (readableMap.hasKey(r18)) {
                this.k = Boolean.valueOf(readableMap.getBoolean(r18));
            }
            String r19 = C0201.m82(19311);
            this.f = readableMap.hasKey(r19) ? readableMap.getString(r19) : str;
            String r0 = C0201.m82(19312);
            if (readableMap.hasKey(r0)) {
                readableMap.getString(r0);
            }
            String r02 = C0201.m82(19313);
            this.j = Boolean.valueOf(readableMap.hasKey(r02) ? readableMap.getBoolean(r02) : false);
            String r03 = C0201.m82(19314);
            this.g = Boolean.valueOf(readableMap.hasKey(r03) ? readableMap.getBoolean(r03) : z);
            String r04 = C0201.m82(19315);
            if (readableMap.hasKey(r04)) {
                this.i = (long) readableMap.getInt(r04);
            }
        }
    }
}
