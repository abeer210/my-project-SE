package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: qb1  reason: default package */
public final class qb1 extends rb1<FieldDescriptorType, Object> {
    public qb1(int i) {
        super(i, null);
    }

    @Override // defpackage.rb1
    public final void l() {
        if (!a()) {
            for (int i = 0; i < m(); i++) {
                Map.Entry i2 = i(i);
                if (((d91) i2.getKey()).w()) {
                    i2.setValue(Collections.unmodifiableList((List) i2.getValue()));
                }
            }
            for (Map.Entry entry : n()) {
                if (((d91) entry.getKey()).w()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.l();
    }
}
