package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.FileDescriptor;

/* renamed from: j70  reason: default package */
/* compiled from: WebpBitmapFactory */
public interface j70 {

    /* renamed from: j70$a */
    /* compiled from: WebpBitmapFactory */
    public interface a {
    }

    void a(i70 i70);

    void b(a aVar);

    Bitmap c(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);
}
