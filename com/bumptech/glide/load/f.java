package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils */
public final class f {

    /* access modifiers changed from: package-private */
    /* compiled from: ImageHeaderParserUtils */
    public class a implements g {
        public final /* synthetic */ InputStream a;

        public a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ImageHeaderParserUtils */
    public class b implements g {
        public final /* synthetic */ ByteBuffer a;

        public b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.a(this.a);
        }
    }

    /* compiled from: ImageHeaderParserUtils */
    class c implements g {
        public final /* synthetic */ eh a;
        public final /* synthetic */ ni b;

        public c(eh ehVar, ni niVar) {
            this.a = ehVar;
            this.b = niVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            Throwable th;
            pl plVar = null;
            try {
                pl plVar2 = new pl(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
                try {
                    ImageHeaderParser.ImageType b2 = imageHeaderParser.b(plVar2);
                    try {
                        plVar2.close();
                    } catch (IOException unused) {
                    }
                    this.a.a();
                    return b2;
                } catch (Throwable th2) {
                    th = th2;
                    plVar = plVar2;
                    if (plVar != null) {
                        try {
                            plVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (plVar != null) {
                }
                this.a.a();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils */
    class d implements AbstractC0033f {
        public final /* synthetic */ InputStream a;
        public final /* synthetic */ ni b;

        public d(InputStream inputStream, ni niVar) {
            this.a = inputStream;
            this.b = niVar;
        }

        @Override // com.bumptech.glide.load.f.AbstractC0033f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils */
    class e implements AbstractC0033f {
        public final /* synthetic */ eh a;
        public final /* synthetic */ ni b;

        public e(eh ehVar, ni niVar) {
            this.a = ehVar;
            this.b = niVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        @Override // com.bumptech.glide.load.f.AbstractC0033f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            Throwable th;
            pl plVar = null;
            try {
                pl plVar2 = new pl(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
                try {
                    int c = imageHeaderParser.c(plVar2, this.b);
                    try {
                        plVar2.close();
                    } catch (IOException unused) {
                    }
                    this.a.a();
                    return c;
                } catch (Throwable th2) {
                    th = th2;
                    plVar = plVar2;
                    if (plVar != null) {
                        try {
                            plVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (plVar != null) {
                }
                this.a.a();
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.f$f  reason: collision with other inner class name */
    /* compiled from: ImageHeaderParserUtils */
    public interface AbstractC0033f {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* access modifiers changed from: private */
    /* compiled from: ImageHeaderParserUtils */
    public interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static int a(List<ImageHeaderParser> list, eh ehVar, ni niVar) throws IOException {
        return c(list, new e(ehVar, niVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, ni niVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new pl(inputStream, niVar);
        }
        inputStream.mark(5242880);
        return c(list, new d(inputStream, niVar));
    }

    private static int c(List<ImageHeaderParser> list, AbstractC0033f fVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a2 = fVar.a(list.get(i));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, eh ehVar, ni niVar) throws IOException {
        return g(list, new c(ehVar, niVar));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, InputStream inputStream, ni niVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new pl(inputStream, niVar);
        }
        inputStream.mark(5242880);
        return g(list, new a(inputStream));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return g(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a2 = gVar.a(list.get(i));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
