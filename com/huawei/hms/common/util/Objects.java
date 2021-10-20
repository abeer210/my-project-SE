package com.huawei.hms.common.util;

import com.huawei.hms.common.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

public final class Objects {

    public static final class ToStringHelper {
        private final List<String> a;
        private final Object b;

        private ToStringHelper(Object obj) {
            this.b = Preconditions.checkNotNull(obj);
            this.a = new ArrayList();
        }

        public /* synthetic */ ToStringHelper(Object obj, byte b2) {
            this(obj);
        }

        public final ToStringHelper add(String str, Object obj) {
            String valueOf = String.valueOf(obj);
            List<String> list = this.a;
            list.add(((String) Preconditions.checkNotNull(str)) + C0201.m82(23013) + valueOf);
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.a.get(i));
                if (i < size - 1) {
                    sb.append(C0201.m82(23014));
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError(C0201.m82(36003));
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj, (byte) 0);
    }
}
