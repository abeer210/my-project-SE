package defpackage;

/* renamed from: qd0  reason: default package */
/* compiled from: Priority */
public enum qd0 {
    LOW,
    MEDIUM,
    HIGH;

    public static qd0 b(qd0 qd0, qd0 qd02) {
        if (qd0 == null) {
            return qd02;
        }
        return (qd02 != null && qd0.ordinal() <= qd02.ordinal()) ? qd02 : qd0;
    }
}
