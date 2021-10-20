package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements e {
    private final b a;

    public Recreator(b bVar) {
        this.a = bVar;
    }

    private void h(String str) {
        Class cls;
        try {
            try {
                Constructor<? extends U> declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).a(this.a);
                } catch (Exception e) {
                    throw new RuntimeException(C0201.m82(5777) + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException(C0201.m82(5778) + cls.getSimpleName() + C0201.m82(5779), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(C0201.m82(5780) + str + C0201.m82(5781), e3);
        }
    }

    @Override // androidx.lifecycle.e
    public void c(g gVar, d.a aVar) {
        if (aVar == d.a.ON_CREATE) {
            gVar.getLifecycle().c(this);
            Bundle a2 = this.a.getSavedStateRegistry().a(C0201.m82(5782));
            if (a2 != null) {
                ArrayList<String> stringArrayList = a2.getStringArrayList(C0201.m82(5783));
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        h(it.next());
                    }
                    return;
                }
                throw new IllegalStateException(C0201.m82(5784));
            }
            return;
        }
        throw new AssertionError(C0201.m82(5785));
    }
}
