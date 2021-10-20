package com.agontuk.RNFusedLocation;

/* compiled from: LocationError */
public enum a {
    PERMISSION_DENIED(1),
    POSITION_UNAVAILABLE(2),
    TIMEOUT(3),
    PLAY_SERVICE_NOT_AVAILABLE(4),
    SETTINGS_NOT_SATISFIED(5),
    INTERNAL_ERROR(-1);
    
    private int a;

    private a(int i) {
        this.a = i;
    }

    public int b() {
        return this.a;
    }
}
