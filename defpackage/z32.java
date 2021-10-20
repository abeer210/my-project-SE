package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import vigqyno.C0201;

/* renamed from: z32  reason: default package */
/* compiled from: TimeTypeAdapter */
public final class z32 extends x22<Time> {
    public static final y22 b = new a();
    private final DateFormat a = new SimpleDateFormat(C0201.m82(30683));

    /* renamed from: z32$a */
    /* compiled from: TimeTypeAdapter */
    static class a implements y22 {
        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            if (g42.c() == Time.class) {
                return new z32();
            }
            return null;
        }
    }

    /* renamed from: d */
    public synchronized void c(h42 h42, Time time) throws IOException {
        h42.P(time == null ? null : this.a.format(time));
    }
}
