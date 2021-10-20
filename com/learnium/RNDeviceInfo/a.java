package com.learnium.RNDeviceInfo;

/* compiled from: DeviceType */
public enum a {
    HANDSET("Handset"),
    TABLET("Tablet"),
    TV("Tv"),
    UNKNOWN("unknown");
    
    private final String a;

    private a(String str) {
        this.a = str;
    }

    public String b() {
        return this.a;
    }
}
