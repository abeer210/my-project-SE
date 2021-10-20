package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import vigqyno.C0201;

public final class e0 extends wy1 {
    private final File a;
    private final File b;
    private final NavigableMap<Long, File> c = new TreeMap();

    public e0(File file, File file2) throws IOException {
        this.a = file;
        this.b = file2;
        List<File> a2 = n2.a(this.a, this.b);
        if (!a2.isEmpty()) {
            int size = a2.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                File file3 = a2.get(i);
                this.c.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new t0(String.format(C0201.m82(25122), this.a, this.b));
    }

    private final InputStream k(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new t0(String.format(C0201.m82(25123), l));
    }

    @Override // defpackage.wy1
    public final long a() {
        Map.Entry<Long, File> lastEntry = this.c.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    @Override // defpackage.wy1
    public final InputStream c(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new t0(String.format(C0201.m82(25125), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= a()) {
            Long floorKey = this.c.floorKey(Long.valueOf(j));
            Long floorKey2 = this.c.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new d0(k(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(k(j, floorKey));
            Collection<File> values = this.c.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new w1(Collections.enumeration(values)));
            }
            arrayList.add(new d0(new FileInputStream((File) this.c.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new t0(String.format(C0201.m82(25124), Long.valueOf(a()), Long.valueOf(j3)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
