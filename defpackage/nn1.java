package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: nn1  reason: default package */
public final class nn1 extends ln1<FieldDescriptorType, Object> {
    public nn1(int i) {
        super(i, null);
    }

    @Override // defpackage.ln1
    public final void k() {
        if (!a()) {
            for (int i = 0; i < m(); i++) {
                Map.Entry h = h(i);
                if (((dl1) h.getKey()).F()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : n()) {
                if (((dl1) entry.getKey()).F()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.k();
    }
}
