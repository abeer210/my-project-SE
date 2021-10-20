package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.core.content.b;
import com.aurelhubert.ahbottomnavigation.s;

/* compiled from: lambda */
public final /* synthetic */ class g implements s.a {
    public final /* synthetic */ TypedArray a;
    public final /* synthetic */ Context b;

    public /* synthetic */ g(TypedArray typedArray, Context context) {
        this.a = typedArray;
        this.b = context;
    }

    @Override // com.aurelhubert.ahbottomnavigation.s.a
    public final Object map(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.a.getColor(y.AHBottomNavigationBehavior_Params_coloredActive, b.d(this.b, t.colorBottomNavigationActiveColored)));
    }
}
