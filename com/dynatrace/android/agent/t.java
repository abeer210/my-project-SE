package com.dynatrace.android.agent;

/* compiled from: EventType */
public enum t {
    ACTION_MANUAL(1, f20.PERFORMANCE),
    ACTION_AUTO(6, f20.PERFORMANCE),
    ACTION_AUTO_LOADING_APP(6, f20.OFF),
    NAMED_EVENT(10, f20.USER_BEHAVIOR),
    VALUE_STRING(11, f20.USER_BEHAVIOR),
    VALUE_INT64(12, f20.USER_BEHAVIOR),
    VALUE_DOUBLE(13, f20.USER_BEHAVIOR),
    VISIT_END(19, f20.PERFORMANCE),
    APP_START(20, f20.PERFORMANCE),
    DISPLAY(21, f20.PERFORMANCE),
    REDISPLAY(22, f20.PERFORMANCE),
    WEB_REQUEST(30, f20.PERFORMANCE),
    ERROR_INT(40, f20.PERFORMANCE),
    ERROR_EXCEPTION(42, f20.PERFORMANCE),
    CRASH(50, f20.OFF),
    IDENTIFY_USER(60, f20.USER_BEHAVIOR),
    SELF_MONITORING_EVENT(90, f20.PERFORMANCE),
    PLACEHOLDER(-1, f20.USER_BEHAVIOR);
    
    private int a;
    private f20 b;

    private t(int i, f20 f20) {
        this.a = i;
        this.b = f20;
    }

    public f20 b() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
