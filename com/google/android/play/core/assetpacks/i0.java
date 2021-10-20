package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import vigqyno.C0201;

public final class i0 {
    private final fz1<i3> a;

    public i0(fz1<i3> fz1) {
        this.a = fz1;
    }

    public final InputStream a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) u02.e(this.a.a().c(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new t0(String.format(C0201.m82(14054), Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
        } catch (ExecutionException e) {
            throw new t0(String.format(C0201.m82(14056), Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e, i);
        } catch (InterruptedException e2) {
            throw new t0(C0201.m82(14055), e2, i);
        }
    }
}
