package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import vigqyno.C0201;

@DoNotStrip
public class UnknownCppException extends CppException {
    @DoNotStrip
    public UnknownCppException() {
        super(C0201.m82(12965));
    }

    @DoNotStrip
    public UnknownCppException(String str) {
        super(str);
    }
}
