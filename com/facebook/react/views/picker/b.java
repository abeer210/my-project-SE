package com.facebook.react.views.picker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import vigqyno.C0201;

/* compiled from: ReactPickerAdapter */
public class b extends ArrayAdapter<c> {
    private final LayoutInflater a;
    private Integer b;
    private Integer c;

    public b(Context context, List<c> list) {
        super(context, 0, list);
        Object systemService = context.getSystemService(C0201.m82(9737));
        yh0.c(systemService);
        this.a = (LayoutInflater) systemService;
    }

    private View c(int i, View view, ViewGroup viewGroup, boolean z) {
        Integer num;
        c cVar = (c) getItem(i);
        boolean z2 = false;
        if (view == null) {
            view = this.a.inflate(z ? 17367049 : 17367048, viewGroup, false);
            view.setTag(((TextView) view).getTextColors());
            z2 = true;
        }
        TextView textView = (TextView) view;
        textView.setText(cVar.a);
        if (z || (num = this.b) == null) {
            Integer num2 = cVar.b;
            if (num2 != null) {
                textView.setTextColor(num2.intValue());
            } else if (textView.getTag() != null && !z2) {
                textView.setTextColor((ColorStateList) textView.getTag());
            }
        } else {
            textView.setTextColor(num.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            textView.setBackgroundColor(num3.intValue());
        }
        return textView;
    }

    public Integer a() {
        return this.c;
    }

    public Integer b() {
        return this.b;
    }

    public void d(Integer num) {
        this.c = num;
        notifyDataSetChanged();
    }

    public void e(Integer num) {
        this.b = num;
        notifyDataSetChanged();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return c(i, view, viewGroup, true);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return c(i, view, viewGroup, false);
    }
}
