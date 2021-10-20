package defpackage;

import defpackage.vt0;
import defpackage.wt0;
import vigqyno.C0201;

/* renamed from: wt0  reason: default package */
public abstract class wt0<MessageType extends vt0<MessageType, BuilderType>, BuilderType extends wt0<MessageType, BuilderType>> implements rw0 {
    public abstract BuilderType i(MessageType messagetype);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: wt0<MessageType extends vt0<MessageType, BuilderType>, BuilderType extends wt0<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw0
    public final /* synthetic */ rw0 t0(qw0 qw0) {
        if (g().getClass().isInstance(qw0)) {
            i((vt0) qw0);
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(9878));
    }
}
