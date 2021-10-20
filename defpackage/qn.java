package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qn  reason: default package */
/* compiled from: ImageHeaderParserRegistry */
public final class qn {
    private final List<ImageHeaderParser> a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.a;
    }
}
