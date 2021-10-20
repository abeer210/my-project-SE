package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.m;

public class CheckableImageButton extends m implements Checkable {
    private static final int[] f = {16842912};
    private boolean c;
    private boolean d;
    private boolean e;

    class a extends r2 {
        public a() {
        }

        @Override // defpackage.r2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            w3Var.X(CheckableImageButton.this.a());
            w3Var.Y(CheckableImageButton.this.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends f4 {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public boolean c;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.c = z;
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.imageButtonStyle);
    }

    public boolean a() {
        return this.d;
    }

    public boolean isChecked() {
        return this.c;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.c) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f.length), f);
        }
        return super.onCreateDrawableState(i);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.c);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.c = this.c;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.d != z) {
            this.d = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.d && this.c != z) {
            this.c = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.e = z;
    }

    public void setPressed(boolean z) {
        if (this.e) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.c);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.e = true;
        k3.h0(this, new a());
    }
}
