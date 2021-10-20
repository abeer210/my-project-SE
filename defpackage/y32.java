package defpackage;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import vigqyno.C0201;

/* renamed from: y32  reason: default package */
/* compiled from: SqlDateTypeAdapter */
public final class y32 extends x22<Date> {
    public static final y22 b = new a();
    private final DateFormat a = new SimpleDateFormat(C0201.m82(2698));

    /* renamed from: y32$a */
    /* compiled from: SqlDateTypeAdapter */
    static class a implements y22 {
        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            if (g42.c() == Date.class) {
                return new y32();
            }
            return null;
        }
    }

    /* renamed from: d */
    public synchronized void c(h42 h42, Date date) throws IOException {
        h42.P(date == null ? null : this.a.format(date));
    }
}
