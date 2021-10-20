package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import vigqyno.C0201;

/* renamed from: e4  reason: default package */
/* compiled from: ResourceCursorAdapter */
public abstract class e4 extends c4 {
    private int i;
    private int j;
    private LayoutInflater k;

    @Deprecated
    public e4(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.j = i2;
        this.i = i2;
        this.k = (LayoutInflater) context.getSystemService(C0201.m82(8517));
    }

    @Override // defpackage.c4
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.j, viewGroup, false);
    }

    @Override // defpackage.c4
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.i, viewGroup, false);
    }
}
