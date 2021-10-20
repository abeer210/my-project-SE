package com.huawei.updatesdk.fileprovider;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class b implements a {
    private final String a;
    private final HashMap<String, File> b = new HashMap<>();

    public b(String str) {
        this.a = str;
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public Uri a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.b.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = entry.getValue().getPath();
                String r2 = C0201.m82(3732);
                boolean endsWith = path2.endsWith(r2);
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                String substring = canonicalPath.substring(length);
                return new Uri.Builder().scheme(C0201.m82(3733)).authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, r2)).build();
            }
            throw new IllegalArgumentException(C0201.m82(3734));
        } catch (Exception unused) {
            throw new IllegalArgumentException(C0201.m82(3735));
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public File a(Uri uri) {
        try {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException(C0201.m82(3744));
            } else if (TextUtils.isEmpty(decode2) || decode2.contains(C0201.m82(3736)) || decode2.contains(C0201.m82(3737)) || decode2.contains(C0201.m82(3738)) || decode2.contains(C0201.m82(3739)) || decode2.contains(C0201.m82(3740))) {
                throw new IllegalArgumentException(C0201.m82(3743));
            } else {
                try {
                    File canonicalFile = new File(file, decode2).getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException(C0201.m82(3741));
                } catch (IOException unused) {
                    throw new IllegalArgumentException(C0201.m82(3742));
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(C0201.m82(3745) + e.toString());
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.a
    public void a(String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.b.put(str, file.getCanonicalFile());
            } catch (Exception unused) {
                throw new IllegalArgumentException(C0201.m82(3746));
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(3747));
        }
    }
}
