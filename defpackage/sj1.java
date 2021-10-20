package defpackage;

import defpackage.rj1;
import defpackage.sj1;
import vigqyno.C0201;

/* renamed from: sj1  reason: default package */
public abstract class sj1<MessageType extends rj1<MessageType, BuilderType>, BuilderType extends sj1<MessageType, BuilderType>> implements um1 {
    public abstract BuilderType i(MessageType messagetype);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: sj1<MessageType extends rj1<MessageType, BuilderType>, BuilderType extends sj1<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.um1
    public final /* synthetic */ um1 r(tm1 tm1) {
        if (e().getClass().isInstance(tm1)) {
            i((rj1) tm1);
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(10665));
    }
}
