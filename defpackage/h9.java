package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: h9  reason: default package */
public class h9 implements s8 {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private TimeZone g = null;
    private int h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;

    public h9() {
    }

    public h9(Calendar calendar) {
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.a = gregorianCalendar.get(1);
        this.b = gregorianCalendar.get(2) + 1;
        this.c = gregorianCalendar.get(5);
        this.d = gregorianCalendar.get(11);
        this.e = gregorianCalendar.get(12);
        this.f = gregorianCalendar.get(13);
        this.h = gregorianCalendar.get(14) * 1000000;
        this.g = gregorianCalendar.getTimeZone();
        this.k = true;
        this.j = true;
        this.i = true;
    }

    @Override // defpackage.s8
    public void D(int i2) {
        this.e = Math.min(Math.abs(i2), 59);
        this.j = true;
    }

    @Override // defpackage.s8
    public int G() {
        return this.h;
    }

    @Override // defpackage.s8
    public boolean P() {
        return this.k;
    }

    @Override // defpackage.s8
    public Calendar Q() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        if (this.k) {
            gregorianCalendar.setTimeZone(this.g);
        }
        gregorianCalendar.set(1, this.a);
        gregorianCalendar.set(2, this.b - 1);
        gregorianCalendar.set(5, this.c);
        gregorianCalendar.set(11, this.d);
        gregorianCalendar.set(12, this.e);
        gregorianCalendar.set(13, this.f);
        gregorianCalendar.set(14, this.h / 1000000);
        return gregorianCalendar;
    }

    @Override // defpackage.s8
    public boolean T() {
        return this.j;
    }

    @Override // defpackage.s8
    public void U0(int i2) {
        this.f = Math.min(Math.abs(i2), 59);
        this.j = true;
    }

    @Override // defpackage.s8
    public void V(int i2) {
        if (i2 < 1) {
            this.c = 1;
        } else if (i2 > 31) {
            this.c = 31;
        } else {
            this.c = i2;
        }
        this.i = true;
    }

    public String b() {
        return b9.c(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        s8 s8Var = (s8) obj;
        long timeInMillis = Q().getTimeInMillis() - s8Var.Q().getTimeInMillis();
        if (timeInMillis == 0) {
            timeInMillis = (long) (this.h - s8Var.G());
        }
        return (int) Math.signum((float) timeInMillis);
    }

    @Override // defpackage.s8
    public void d0(int i2) {
        this.h = i2;
        this.j = true;
    }

    @Override // defpackage.s8
    public int getDay() {
        return this.c;
    }

    @Override // defpackage.s8
    public int getHour() {
        return this.d;
    }

    @Override // defpackage.s8
    public int getMinute() {
        return this.e;
    }

    @Override // defpackage.s8
    public int getMonth() {
        return this.b;
    }

    @Override // defpackage.s8
    public int getSecond() {
        return this.f;
    }

    @Override // defpackage.s8
    public TimeZone getTimeZone() {
        return this.g;
    }

    @Override // defpackage.s8
    public int getYear() {
        return this.a;
    }

    @Override // defpackage.s8
    public boolean h1() {
        return this.i;
    }

    @Override // defpackage.s8
    public void setMonth(int i2) {
        if (i2 < 1) {
            this.b = 1;
        } else if (i2 > 12) {
            this.b = 12;
        } else {
            this.b = i2;
        }
        this.i = true;
    }

    @Override // defpackage.s8
    public void setTimeZone(TimeZone timeZone) {
        this.g = timeZone;
        this.j = true;
        this.k = true;
    }

    @Override // defpackage.s8
    public void setYear(int i2) {
        this.a = Math.min(Math.abs(i2), 9999);
        this.i = true;
    }

    public String toString() {
        return b();
    }

    @Override // defpackage.s8
    public void z(int i2) {
        this.d = Math.min(Math.abs(i2), 23);
        this.j = true;
    }
}
