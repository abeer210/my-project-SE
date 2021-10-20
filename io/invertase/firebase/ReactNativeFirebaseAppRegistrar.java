package io.invertase.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

@Keep
public class ReactNativeFirebaseAppRegistrar implements h {
    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        return Collections.singletonList(e22.a(C0201.m82(7821), C0201.m82(7822)));
    }
}
