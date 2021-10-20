package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q9  reason: default package */
public class q9 {
    private List a = new ArrayList(5);

    public void a(s9 s9Var) {
        this.a.add(s9Var);
    }

    public s9 b(int i) {
        return (s9) this.a.get(i);
    }

    public int c() {
        return this.a.size();
    }

    public String toString() {
        int b;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < c(); i++) {
            stringBuffer.append(b(i));
            if (i < c() - 1 && ((b = b(i + 1).b()) == 1 || b == 2)) {
                stringBuffer.append('/');
            }
        }
        return stringBuffer.toString();
    }
}
