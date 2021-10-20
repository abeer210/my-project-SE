package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: mx0  reason: default package */
public final class mx0 extends lx0<FieldDescriptorType, Object> {
    public mx0(int i) {
        super(i, null);
    }

    @Override // defpackage.lx0
    public final void q() {
        if (!a()) {
            for (int i = 0; i < l(); i++) {
                Map.Entry g = g(i);
                if (((ev0) g.getKey()).r0()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : m()) {
                if (((ev0) entry.getKey()).r0()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.q();
    }
}
