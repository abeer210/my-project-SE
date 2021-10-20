package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeCameraRollManagerSpec;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import vigqyno.C0188;
import vigqyno.C0201;

@pj0(name = "CameraRollManager")
public class CameraRollManager extends NativeCameraRollManagerSpec {
    private static final String ASSET_TYPE_ALL = null;
    private static final String ASSET_TYPE_PHOTOS = null;
    private static final String ASSET_TYPE_VIDEOS = null;
    private static final String ERROR_UNABLE_TO_FILTER = null;
    private static final String ERROR_UNABLE_TO_LOAD = null;
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = null;
    private static final String ERROR_UNABLE_TO_SAVE = null;
    public static final String NAME = null;
    private static final String[] PROJECTION = {C0201.m82(37438), C0201.m82(37439), C0201.m82(37440), C0201.m82(37441), C0201.m82(37442), C0201.m82(37443), C0201.m82(37444), C0201.m82(37445), C0201.m82(37446)};
    private static final String SELECTION_BUCKET = null;
    private static final String SELECTION_DATE_TAKEN = null;
    private static final String SELECTION_MEDIA_SIZE = null;
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;

    private static class b extends GuardedAsyncTask<Void, Void> {
        private final Context a;
        private final int b;
        private final String c;
        private final String d;
        private final ReadableArray e;
        private final Promise f;
        private final String g;
        private final Integer h;

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            StringBuilder sb = new StringBuilder(C0201.m82(34600));
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.c)) {
                sb.append(C0201.m82(34601));
                arrayList.add(this.c);
            }
            if (!TextUtils.isEmpty(this.d)) {
                sb.append(C0201.m82(34602));
                arrayList.add(this.d);
            }
            if (this.h != null) {
                sb.append(C0201.m82(34603));
                arrayList.add(this.h.toString());
            }
            String str = this.g;
            char c2 = 65535;
            int hashCode = str.hashCode();
            String r6 = C0201.m82(34604);
            String r7 = C0201.m82(34605);
            String r8 = C0201.m82(34606);
            if (hashCode != -1905167199) {
                if (hashCode != -1732810888) {
                    if (hashCode == 65921 && str.equals(r6)) {
                        c2 = 2;
                    }
                } else if (str.equals(r7)) {
                    c2 = 1;
                }
            } else if (str.equals(r8)) {
                c2 = 0;
            }
            if (c2 == 0) {
                sb.append(C0201.m82(34615));
            } else if (c2 == 1) {
                sb.append(C0201.m82(34614));
            } else if (c2 != 2) {
                Promise promise = this.f;
                promise.reject(C0201.m82(34612), C0201.m82(34607) + this.g + C0201.m82(34608) + r8 + C0201.m82(34609) + r7 + C0201.m82(34610) + r6 + C0201.m82(34611));
                return;
            } else {
                sb.append(C0201.m82(34613));
            }
            ReadableArray readableArray = this.e;
            if (readableArray != null && readableArray.size() > 0) {
                sb.append(C0201.m82(34616));
                for (int i = 0; i < this.e.size(); i++) {
                    sb.append(C0201.m82(34617));
                    arrayList.add(this.e.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), C0201.m82(34618));
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.a.getContentResolver();
            try {
                Uri contentUri = MediaStore.Files.getContentUri(C0201.m82(34619));
                String[] strArr = CameraRollManager.PROJECTION;
                String sb2 = sb.toString();
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                Cursor query = contentResolver.query(contentUri, strArr, sb2, strArr2, C0201.m82(34620) + (this.b + 1));
                if (query == null) {
                    this.f.reject(C0201.m82(34621), C0201.m82(34622));
                    return;
                }
                try {
                    CameraRollManager.putEdges(contentResolver, query, writableNativeMap, this.b);
                    CameraRollManager.putPageInfo(query, writableNativeMap, this.b);
                } finally {
                    query.close();
                    this.f.resolve(writableNativeMap);
                }
            } catch (SecurityException e2) {
                this.f.reject(C0201.m82(34623), C0201.m82(34624), e2);
            }
        }

        private b(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, Integer num, Promise promise) {
            super(reactContext);
            this.a = reactContext;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = readableArray;
            this.f = promise;
            this.g = str3;
            this.h = num;
        }
    }

    private static class c extends GuardedAsyncTask<Void, Void> {
        public static final String d = null;
        public static final String e = null;
        public static final String f = null;
        public static final String g = null;
        public static final String h = null;
        public static final String i = null;
        public static final String j = null;
        public static final String k = null;
        public static final String l = null;
        private final Context a;
        private final Uri b;
        private final Promise c;

        /* access modifiers changed from: package-private */
        public class a implements MediaScannerConnection.OnScanCompletedListener {
            public a() {
            }

            public void onScanCompleted(String str, Uri uri) {
                if (uri != null) {
                    c.this.c.resolve(uri.toString());
                } else {
                    c.this.c.reject(C0201.m82(338), C0201.m82(339));
                }
            }
        }

        static {
            C0201.m83(c.class, 105);
        }

        public c(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.a = reactContext;
            this.b = uri;
            this.c = promise;
        }

        /* JADX WARNING: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0055 A[Catch:{ IOException -> 0x0131, all -> 0x012c }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0152  */
        /* renamed from: b */
        public void doInBackgroundGuarded(Void... voidArr) {
            FileChannel fileChannel;
            Throwable th;
            IOException e2;
            ReadableByteChannel readableByteChannel;
            ReadableByteChannel readableByteChannel2;
            ReadableByteChannel readableByteChannel3;
            File externalStoragePublicDirectory;
            String str;
            String str2 = d;
            String str3 = i;
            String str4 = k;
            File file = new File(this.b.getPath());
            ReadableByteChannel readableByteChannel4 = null;
            try {
                String scheme = this.b.getScheme();
                if (!scheme.equals(h)) {
                    if (!scheme.equals(l)) {
                        readableByteChannel = new FileInputStream(file).getChannel();
                        externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                        externalStoragePublicDirectory.mkdirs();
                        if (externalStoragePublicDirectory.isDirectory()) {
                            this.c.reject(g, j);
                            if (readableByteChannel != null && readableByteChannel.isOpen()) {
                                try {
                                    readableByteChannel.close();
                                    return;
                                } catch (IOException e3) {
                                    f60.j(str4, str3, e3);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            File file2 = new File(externalStoragePublicDirectory, file.getName());
                            String name = file.getName();
                            if (name.indexOf(46) >= 0) {
                                String substring = name.substring(0, name.lastIndexOf(46));
                                str = name.substring(name.lastIndexOf(46));
                                name = substring;
                            } else {
                                str = f;
                            }
                            int i2 = 0;
                            while (!file2.createNewFile()) {
                                file2 = new File(externalStoragePublicDirectory, name + e + i2 + str);
                                i2++;
                            }
                            FileChannel channel = new FileOutputStream(file2).getChannel();
                            try {
                                ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                while (readableByteChannel.read(allocate) > 0) {
                                    allocate.flip();
                                    channel.write(allocate);
                                    allocate.compact();
                                }
                                allocate.flip();
                                while (allocate.hasRemaining()) {
                                    channel.write(allocate);
                                }
                                readableByteChannel.close();
                                channel.close();
                                MediaScannerConnection.scanFile(this.a, new String[]{file2.getAbsolutePath()}, null, new a());
                                if (readableByteChannel != null && readableByteChannel.isOpen()) {
                                    try {
                                        readableByteChannel.close();
                                    } catch (IOException e4) {
                                        f60.j(str4, str3, e4);
                                    }
                                }
                                if (channel != null && channel.isOpen()) {
                                    try {
                                        channel.close();
                                        return;
                                    } catch (IOException e5) {
                                        f60.j(str4, str2, e5);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (IOException e6) {
                                readableByteChannel2 = readableByteChannel;
                                fileChannel = channel;
                                e2 = e6;
                                readableByteChannel4 = readableByteChannel2;
                                try {
                                    this.c.reject(e2);
                                    try {
                                        readableByteChannel4.close();
                                    } catch (IOException e7) {
                                        f60.j(str4, str3, e7);
                                    }
                                    if (fileChannel == null) {
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (readableByteChannel4 != null && readableByteChannel4.isOpen()) {
                                        try {
                                            readableByteChannel4.close();
                                        } catch (IOException e8) {
                                            f60.j(str4, str3, e8);
                                        }
                                    }
                                    if (fileChannel != null && fileChannel.isOpen()) {
                                        try {
                                            fileChannel.close();
                                        } catch (IOException e9) {
                                            f60.j(str4, str2, e9);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                readableByteChannel3 = readableByteChannel;
                                fileChannel = channel;
                                th = th3;
                                readableByteChannel4 = readableByteChannel3;
                                readableByteChannel4.close();
                                fileChannel.close();
                                throw th;
                            }
                        }
                    }
                }
                readableByteChannel = Channels.newChannel(new URL(this.b.toString()).openStream());
                try {
                    externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                    externalStoragePublicDirectory.mkdirs();
                    if (externalStoragePublicDirectory.isDirectory()) {
                    }
                } catch (IOException e10) {
                    e2 = e10;
                    readableByteChannel2 = readableByteChannel;
                    fileChannel = null;
                    readableByteChannel4 = readableByteChannel2;
                    this.c.reject(e2);
                    if (readableByteChannel4 != null && readableByteChannel4.isOpen()) {
                        readableByteChannel4.close();
                    }
                    if (fileChannel == null && fileChannel.isOpen()) {
                        fileChannel.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    readableByteChannel3 = readableByteChannel;
                    fileChannel = null;
                    readableByteChannel4 = readableByteChannel3;
                    readableByteChannel4.close();
                    fileChannel.close();
                    throw th;
                }
            } catch (IOException e11) {
                e2 = e11;
                fileChannel = null;
                this.c.reject(e2);
                readableByteChannel4.close();
                if (fileChannel == null) {
                }
            } catch (Throwable th5) {
                th = th5;
                fileChannel = null;
                readableByteChannel4.close();
                fileChannel.close();
                throw th;
            }
        }
    }

    static {
        C0201.m83(CameraRollManager.class, 116);
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i2, int i3, int i4) {
        writableMap.putString(C0201.m82(37447), cursor.getString(i2));
        writableMap.putString(C0201.m82(37448), cursor.getString(i3));
        double d2 = (double) cursor.getLong(i4);
        Double.isNaN(d2);
        writableMap.putDouble(C0201.m82(37449), d2 / 1000.0d);
    }

    /* access modifiers changed from: private */
    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i2) {
        int i3;
        WritableNativeArray writableNativeArray;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex(C0201.m82(37450));
        int columnIndex2 = cursor.getColumnIndex(C0201.m82(37451));
        int columnIndex3 = cursor.getColumnIndex(C0201.m82(37452));
        int columnIndex4 = cursor.getColumnIndex(C0201.m82(37453));
        int columnIndex5 = cursor.getColumnIndex(C0201.m82(37454));
        int columnIndex6 = cursor.getColumnIndex(C0201.m82(37455));
        int columnIndex7 = cursor.getColumnIndex(C0201.m82(37456));
        int columnIndex8 = cursor.getColumnIndex(C0201.m82(37457));
        int columnIndex9 = cursor.getColumnIndex(C0201.m82(37458));
        int i4 = i2;
        int i5 = 0;
        while (i5 < i4 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, columnIndex, columnIndex5, columnIndex6, columnIndex9, columnIndex2)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, columnIndex7, columnIndex8);
                writableNativeMap.putMap(C0201.m82(37459), writableNativeMap2);
                writableNativeArray = writableNativeArray2;
                writableNativeArray.pushMap(writableNativeMap);
                i3 = i5;
            } else {
                writableNativeArray = writableNativeArray2;
                i3 = i5 - 1;
            }
            cursor.moveToNext();
            i5 = i3 + 1;
            i4 = i2;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = columnIndex8;
            columnIndex7 = columnIndex7;
            columnIndex = columnIndex;
            columnIndex5 = columnIndex5;
        }
        writableMap.putArray(C0201.m82(37460), writableNativeArray2);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i2, int i3, int i4, int i5, int i6) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse(j + cursor.getString(i5));
        writableNativeMap.putString(a, parse.toString());
        float f2 = (float) cursor.getInt(i3);
        float f3 = (float) cursor.getInt(i4);
        String string = cursor.getString(i6);
        String str = g;
        String str2 = e;
        if (string != null && string.startsWith(i)) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, str);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f2 <= 0.0f || f3 <= 0.0f) {
                    try {
                        f2 = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f3 = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e2) {
                        f60.j(str2, l + parse.toString(), e2);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        throw th;
                    }
                }
                writableNativeMap.putInt(c, Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / C0188.f18);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (Exception e3) {
                f60.j(str2, b + parse.toString(), e3);
                return false;
            }
        }
        if (f2 <= 0.0f || f3 <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                float f4 = (float) options.outWidth;
                float f5 = (float) options.outHeight;
                openAssetFileDescriptor2.close();
                f3 = f5;
                f2 = f4;
            } catch (IOException e4) {
                f60.j(str2, k + parse.toString(), e4);
                return false;
            }
        }
        writableNativeMap.putDouble(h, (double) f2);
        writableNativeMap.putDouble(d, (double) f3);
        writableMap.putMap(f, writableNativeMap);
        return true;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i2, int i3) {
        double d2 = cursor.getDouble(i2);
        double d3 = cursor.getDouble(i3);
        if (d2 > 0.0d || d3 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(C0201.m82(37461), d2);
            writableNativeMap.putDouble(C0201.m82(37462), d3);
            writableMap.putMap(C0201.m82(37463), writableNativeMap);
        }
    }

    /* access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean(C0201.m82(37464), i2 < cursor.getCount());
        if (i2 < cursor.getCount()) {
            cursor.moveToPosition(i2 - 1);
            writableNativeMap.putString(C0201.m82(37466), cursor.getString(cursor.getColumnIndex(C0201.m82(37465))));
        }
        writableMap.putMap(C0201.m82(37467), writableNativeMap);
    }

    @Override // com.facebook.fbreact.specs.NativeCameraRollManagerSpec
    public void deletePhotos(ReadableArray readableArray, Promise promise) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(37468);
    }

    @Override // com.facebook.fbreact.specs.NativeCameraRollManagerSpec
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        int i2 = readableMap.getInt(C0201.m82(37469));
        String r0 = C0201.m82(37470);
        String string = readableMap.hasKey(r0) ? readableMap.getString(r0) : null;
        String r02 = C0201.m82(37471);
        String string2 = readableMap.hasKey(r02) ? readableMap.getString(r02) : null;
        String r03 = C0201.m82(37472);
        String string3 = readableMap.hasKey(r03) ? readableMap.getString(r03) : C0201.m82(37473);
        String r04 = C0201.m82(37474);
        Integer valueOf = readableMap.hasKey(r04) ? Integer.valueOf(readableMap.getInt(r04)) : null;
        String r05 = C0201.m82(37475);
        ReadableArray array = readableMap.hasKey(r05) ? readableMap.getArray(r05) : null;
        if (!readableMap.hasKey(C0201.m82(37476))) {
            new b(getReactApplicationContext(), i2, string, string2, array, string3, valueOf, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(37477));
    }

    @Override // com.facebook.fbreact.specs.NativeCameraRollManagerSpec
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        new c(getReactApplicationContext(), Uri.parse(str), promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
