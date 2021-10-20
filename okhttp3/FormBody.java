package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;
import vigqyno.C0201;

public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get(C0201.m82(4731));
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null);
        }

        public Builder add(String str, String str2) {
            if (str == null) {
                throw new NullPointerException(C0201.m82(9752));
            } else if (str2 != null) {
                this.names.add(HttpUrl.canonicalize(str, C0201.m82(9749), false, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, C0201.m82(9750), false, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException(C0201.m82(9751));
            }
        }

        public Builder addEncoded(String str, String str2) {
            if (str == null) {
                throw new NullPointerException(C0201.m82(9756));
            } else if (str2 != null) {
                this.names.add(HttpUrl.canonicalize(str, C0201.m82(9753), true, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, C0201.m82(9754), true, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException(C0201.m82(9755));
            }
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset2) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset2;
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(by2 by2, boolean z) {
        ay2 ay2;
        if (z) {
            ay2 = new ay2();
        } else {
            ay2 = by2.d();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                ay2.c0(38);
            }
            ay2.r0(this.encodedNames.get(i));
            ay2.c0(61);
            ay2.r0(this.encodedValues.get(i));
        }
        if (!z) {
            return 0;
        }
        long Q = ay2.Q();
        ay2.a();
        return Q;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public int size() {
        return this.encodedNames.size();
    }

    public String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(by2 by2) throws IOException {
        writeOrCountBytes(by2, false);
    }
}
