package com.merryjs.PhotoViewer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import vigqyno.C0201;

/* compiled from: MerryPhotoOverlay */
public class c extends RelativeLayout {
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private ImageButton e;
    private com.stfalcon.frescoimageviewer.b f;
    private String g;

    /* access modifiers changed from: package-private */
    /* compiled from: MerryPhotoOverlay */
    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                c.this.d();
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: MerryPhotoOverlay */
    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                c.this.f.onDismiss();
            } finally {
                w30.h();
            }
        }
    }

    public c(Context context) {
        super(context);
        c();
    }

    private void c() {
        View inflate = RelativeLayout.inflate(getContext(), g.photo_viewer_overlay, this);
        this.b = (TextView) inflate.findViewById(f.tvTitlePager);
        this.a = (TextView) inflate.findViewById(f.tvTitle);
        this.c = (TextView) inflate.findViewById(f.tvDescription);
        TextView textView = (TextView) inflate.findViewById(f.btnShare);
        this.d = textView;
        textView.setOnClickListener(new a());
        ImageButton imageButton = (ImageButton) inflate.findViewById(f.btnClose);
        this.e = imageButton;
        imageButton.setColorFilter(Color.parseColor(C0201.m82(24780)));
        this.e.setOnClickListener(new b());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d() {
        Intent intent = new Intent();
        intent.setAction(C0201.m82(24781));
        intent.putExtra(C0201.m82(24782), this.g);
        intent.setType(C0201.m82(24783));
        getContext().startActivity(intent);
    }

    public void setDescription(String str) {
        this.c.setText(str);
    }

    public void setDescriptionTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setHideCloseButton(Boolean bool) {
        this.e.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    public void setHideShareButton(Boolean bool) {
        this.d.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    public void setHideTitle(Boolean bool) {
        this.b.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    public void setImageViewer(com.stfalcon.frescoimageviewer.b bVar) {
        this.f = bVar;
    }

    public void setPagerText(String str) {
        this.b.setText(str);
    }

    public void setPagerTextColor(String str) {
        this.b.setTextColor(Color.parseColor(str));
    }

    public void setShareContext(String str) {
        this.g = str;
    }

    public void setShareText(String str) {
        this.d.setText(str);
    }

    public void setShareTextColor(String str) {
        this.d.setTextColor(Color.parseColor(str));
    }

    public void setTitleText(String str) {
        this.a.setText(str);
    }

    public void setTitleTextColor(int i) {
        this.a.setTextColor(i);
    }
}
