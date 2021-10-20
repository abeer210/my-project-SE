package defpackage;

/* renamed from: gg2  reason: default package */
/* compiled from: Orientation */
public enum gg2 {
    Portrait("portrait", 1),
    Landscape("landscape", 0),
    Default("default", -1),
    PortraitLandscape("sensor", 2),
    SensorLandscape("sensorLandscape", 6);
    
    public String a;
    public int b;

    private gg2(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static gg2 b(String str) {
        gg2[] values = values();
        for (gg2 gg2 : values) {
            if (gg2.a.equals(str)) {
                return gg2;
            }
        }
        return null;
    }
}
