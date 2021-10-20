package defpackage;

import defpackage.s71;
import defpackage.u71;
import vigqyno.C0201;

/* renamed from: u71  reason: default package */
public abstract class u71<MessageType extends s71<MessageType, BuilderType>, BuilderType extends u71<MessageType, BuilderType>> implements va1 {
    public abstract BuilderType i(MessageType messagetype);

    public abstract BuilderType j(byte[] bArr, int i, int i2, y81 y81) throws v91;

    public final BuilderType l(byte[] bArr, y81 y81) throws v91 {
        j(bArr, 0, bArr.length, y81);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: u71<MessageType extends s71<MessageType, BuilderType>, BuilderType extends u71<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.va1
    public final /* synthetic */ va1 q0(wa1 wa1) {
        if (e().getClass().isInstance(wa1)) {
            i((s71) wa1);
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(35493));
    }
}
