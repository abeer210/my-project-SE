package defpackage;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: qk  reason: default package */
/* compiled from: ImageDecoderResourceDecoder */
public abstract class qk<T> implements k<ImageDecoder.Source, T> {
    public final kl a = kl.a();

    /* access modifiers changed from: package-private */
    /* renamed from: qk$a */
    /* compiled from: ImageDecoderResourceDecoder */
    public class a implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ b d;
        public final /* synthetic */ el e;
        public final /* synthetic */ j f;

        /* renamed from: qk$a$a  reason: collision with other inner class name */
        /* compiled from: ImageDecoderResourceDecoder */
        class C0168a implements ImageDecoder.OnPartialImageListener {
            public C0168a(a aVar) {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public a(int i, int i2, boolean z, b bVar, el elVar, j jVar) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = bVar;
            this.e = elVar;
            this.f = jVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (qk.this.a.c(this.a, this.b, this.c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0168a(this));
            Size size = imageInfo.getSize();
            int i = this.a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b2 = this.e.b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b2);
            int round2 = Math.round(((float) size.getHeight()) * b2);
            String r6 = C0201.m82(28923);
            if (Log.isLoggable(r6, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0201.m82(28924));
                sb.append(size.getWidth());
                String r7 = C0201.m82(28925);
                sb.append(r7);
                sb.append(size.getHeight());
                sb.append(C0201.m82(28926));
                sb.append(round);
                sb.append(r7);
                sb.append(round2);
                sb.append(C0201.m82(28927));
                sb.append(b2);
                Log.v(r6, sb.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f == j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    public abstract hi<T> c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.bumptech.glide.load.i */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final hi<T> b(ImageDecoder.Source source, int i, int i2, i iVar) throws IOException {
        return c(source, i, i2, new a(i, i2, iVar.c(fl.i) != null && ((Boolean) iVar.c(fl.i)).booleanValue(), (b) iVar.c(fl.f), (el) iVar.c(el.f), (j) iVar.c(fl.g)));
    }

    /* renamed from: e */
    public final boolean a(ImageDecoder.Source source, i iVar) {
        return true;
    }
}
