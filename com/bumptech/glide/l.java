package com.bumptech.glide;

import com.bumptech.glide.l;

/* compiled from: TransitionOptions */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private ro<? super TranscodeType> a = po.b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) ((l) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final ro<? super TranscodeType> b() {
        return this.a;
    }
}
