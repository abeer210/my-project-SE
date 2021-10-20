package defpackage;

import java.util.ArrayList;

/* renamed from: yp  reason: default package */
/* compiled from: JpegSegmentType */
public enum yp {
    APP0((byte) -32, true),
    APP1((byte) -31, true),
    APP2((byte) -30, true),
    APP3((byte) -29, true),
    APP4((byte) -28, true),
    APP5((byte) -27, true),
    APP6((byte) -26, true),
    APP7((byte) -25, true),
    APP8((byte) -24, true),
    APP9((byte) -23, true),
    APPA((byte) -22, true),
    APPB((byte) -21, true),
    APPC((byte) -20, true),
    APPD((byte) -19, true),
    APPE((byte) -18, true),
    APPF((byte) -17, true),
    SOI((byte) -40, false),
    DQT((byte) -37, false),
    DNL((byte) -36, false),
    DRI((byte) -35, false),
    DHP((byte) -34, false),
    EXP((byte) -33, false),
    DHT((byte) -60, false),
    DAC((byte) -52, false),
    SOF0((byte) -64, true),
    SOF1((byte) -63, true),
    SOF2((byte) -62, true),
    SOF3((byte) -61, true),
    SOF5((byte) -59, true),
    SOF6((byte) -58, true),
    SOF7((byte) -57, true),
    JPG((byte) -56, true),
    SOF9((byte) -55, true),
    SOF10((byte) -54, true),
    SOF11((byte) -53, true),
    SOF13((byte) -51, true),
    SOF14((byte) -50, true),
    SOF15((byte) -49, true),
    COM((byte) -2, true);
    
    public final byte a;
    public final boolean b;

    /* access modifiers changed from: public */
    static {
        ArrayList arrayList = new ArrayList();
        yp[] ypVarArr = (yp[]) yp.class.getEnumConstants();
        for (yp ypVar : ypVarArr) {
            if (ypVar.b) {
                arrayList.add(ypVar);
            }
        }
    }

    private yp(byte b2, boolean z) {
        this.a = b2;
        this.b = z;
    }

    public static yp b(byte b2) {
        yp[] ypVarArr = (yp[]) yp.class.getEnumConstants();
        for (yp ypVar : ypVarArr) {
            if (ypVar.a == b2) {
                return ypVar;
            }
        }
        return null;
    }
}
