package defpackage;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: s32  reason: default package */
/* compiled from: DateTypeAdapter */
public final class s32 extends x22<Date> {
    public static final y22 b = new a();
    private final List<DateFormat> a;

    /* renamed from: s32$a */
    /* compiled from: DateTypeAdapter */
    static class a implements y22 {
        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            if (g42.c() == Date.class) {
                return new s32();
            }
            return null;
        }
    }

    public s32() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (i32.e()) {
            this.a.add(m32.c(2, 2));
        }
    }

    /* renamed from: d */
    public synchronized void c(h42 h42, Date date) throws IOException {
        if (date == null) {
            h42.x();
        } else {
            h42.P(this.a.get(0).format(date));
        }
    }
}
