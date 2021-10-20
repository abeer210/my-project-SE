package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yq2  reason: default package */
/* compiled from: COSInputStream */
public final class yq2 extends FilterInputStream {

    /* renamed from: yq2$a */
    /* compiled from: COSInputStream */
    class a extends gs2 {
        public final /* synthetic */ ds2 c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(is2 is2, ds2 ds2) {
            super(is2);
            this.c = ds2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() throws IOException {
            this.c.close();
        }
    }

    private yq2(InputStream inputStream, List<or2> list) {
        super(inputStream);
    }

    public static yq2 a(List<pr2> list, vq2 vq2, InputStream inputStream, ks2 ks2) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (ks2 != null) {
                    ds2 c = ks2.c();
                    arrayList.add(list.get(i).a(inputStream, new hs2(c), vq2, i));
                    inputStream = new a(c, c);
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    arrayList.add(list.get(i).a(inputStream, byteArrayOutputStream, vq2, i));
                    inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                }
            }
        }
        return new yq2(inputStream, arrayList);
    }
}
