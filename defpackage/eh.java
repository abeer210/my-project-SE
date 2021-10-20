package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import defpackage.wg;
import java.io.IOException;

/* renamed from: eh  reason: default package */
/* compiled from: ParcelFileDescriptorRewinder */
public final class eh implements wg<ParcelFileDescriptor> {
    private final b a;

    /* renamed from: eh$a */
    /* compiled from: ParcelFileDescriptorRewinder */
    public static final class a implements wg.a<ParcelFileDescriptor> {
        @Override // defpackage.wg.a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public wg<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new eh(parcelFileDescriptor);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: eh$b */
    /* compiled from: ParcelFileDescriptorRewinder */
    public static final class b {
        private final ParcelFileDescriptor a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor a() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public eh(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new b(parcelFileDescriptor);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // defpackage.wg
    public void b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor a() throws IOException {
        return this.a.a();
    }
}
