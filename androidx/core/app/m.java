package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: RemoteInput */
public final class m {
    private final String a;
    private final CharSequence b;
    private final CharSequence[] c;
    private final boolean d;
    private final Bundle e;
    private final Set<String> f;

    /* compiled from: RemoteInput */
    public static final class a {
        private final String a;
        private final Set<String> b = new HashSet();
        private final Bundle c = new Bundle();
        private CharSequence d;
        private CharSequence[] e;
        private boolean f = true;

        public a(String str) {
            if (str != null) {
                this.a = str;
                return;
            }
            throw new IllegalArgumentException(C0201.m82(37095));
        }

        public m a() {
            return new m(this.a, this.d, this.e, this.f, this.c, this.b);
        }

        public a b(String str, boolean z) {
            if (z) {
                this.b.add(str);
            } else {
                this.b.remove(str);
            }
            return this;
        }

        public a c(boolean z) {
            this.f = z;
            return this;
        }

        public a d(CharSequence[] charSequenceArr) {
            this.e = charSequenceArr;
            return this;
        }

        public a e(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }
    }

    public m(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = bundle;
        this.f = set;
    }

    public static RemoteInput a(m mVar) {
        return new RemoteInput.Builder(mVar.i()).setLabel(mVar.h()).setChoices(mVar.e()).setAllowFreeFormInput(mVar.c()).addExtras(mVar.g()).build();
    }

    public static RemoteInput[] b(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[mVarArr.length];
        for (int i = 0; i < mVarArr.length; i++) {
            remoteInputArr[i] = a(mVarArr[i]);
        }
        return remoteInputArr;
    }

    private static Intent f(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType(C0201.m82(20632)) && description.getLabel().equals(C0201.m82(20633))) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Bundle j(Intent intent) {
        Intent f2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return RemoteInput.getResultsFromIntent(intent);
        }
        if (i < 16 || (f2 = f(intent)) == null) {
            return null;
        }
        return (Bundle) f2.getExtras().getParcelable(C0201.m82(20634));
    }

    public boolean c() {
        return this.d;
    }

    public Set<String> d() {
        return this.f;
    }

    public CharSequence[] e() {
        return this.c;
    }

    public Bundle g() {
        return this.e;
    }

    public CharSequence h() {
        return this.b;
    }

    public String i() {
        return this.a;
    }

    public boolean k() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
