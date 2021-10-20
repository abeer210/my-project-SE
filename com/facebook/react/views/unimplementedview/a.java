package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.z;
import vigqyno.C0201;

/* compiled from: ReactUnimplementedView */
public class a extends LinearLayout {
    private z a;

    public a(Context context) {
        super(context);
        z zVar = new z(context);
        this.a = zVar;
        zVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.a.setGravity(17);
        this.a.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(this.a);
    }

    public void setName(String str) {
        z zVar = this.a;
        zVar.setText(C0201.m82(32708) + str + C0201.m82(32709));
    }
}
