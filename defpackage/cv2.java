package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: cv2  reason: default package */
/* compiled from: RenderScriptBlur */
public final class cv2 implements vu2 {
    private final RenderScript a;
    private final ScriptIntrinsicBlur b;
    private Allocation c;
    private int d = -1;
    private int e = -1;

    public cv2(Context context) {
        RenderScript create = RenderScript.create(context);
        this.a = create;
        this.b = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    private boolean d(Bitmap bitmap) {
        return bitmap.getHeight() == this.e && bitmap.getWidth() == this.d;
    }

    @Override // defpackage.vu2
    public Bitmap.Config a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // defpackage.vu2
    public boolean b() {
        return true;
    }

    @Override // defpackage.vu2
    public final Bitmap c(Bitmap bitmap, float f) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.a, bitmap);
        if (!d(bitmap)) {
            Allocation allocation = this.c;
            if (allocation != null) {
                allocation.destroy();
            }
            this.c = Allocation.createTyped(this.a, createFromBitmap.getType());
            this.d = bitmap.getWidth();
            this.e = bitmap.getHeight();
        }
        this.b.setRadius(f);
        this.b.setInput(createFromBitmap);
        this.b.forEach(this.c);
        this.c.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }

    @Override // defpackage.vu2
    public final void destroy() {
        this.b.destroy();
        this.a.destroy();
        Allocation allocation = this.c;
        if (allocation != null) {
            allocation.destroy();
        }
    }
}
