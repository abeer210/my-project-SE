package com.huawei.hms.rn.map.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.util.ArrayMap;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.e;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.Projection;
import com.huawei.hms.maps.UiSettings;
import com.huawei.hms.maps.model.BitmapDescriptor;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.ButtCap;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.Cap;
import com.huawei.hms.maps.model.Circle;
import com.huawei.hms.maps.model.CircleOptions;
import com.huawei.hms.maps.model.CustomCap;
import com.huawei.hms.maps.model.Dash;
import com.huawei.hms.maps.model.Dot;
import com.huawei.hms.maps.model.Gap;
import com.huawei.hms.maps.model.GroundOverlay;
import com.huawei.hms.maps.model.GroundOverlayOptions;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.PatternItem;
import com.huawei.hms.maps.model.PointOfInterest;
import com.huawei.hms.maps.model.Polygon;
import com.huawei.hms.maps.model.PolygonOptions;
import com.huawei.hms.maps.model.Polyline;
import com.huawei.hms.maps.model.PolylineOptions;
import com.huawei.hms.maps.model.RoundCap;
import com.huawei.hms.maps.model.SquareCap;
import com.huawei.hms.maps.model.Tile;
import com.huawei.hms.maps.model.TileOverlay;
import com.huawei.hms.maps.model.TileOverlayOptions;
import com.huawei.hms.maps.model.TileProvider;
import com.huawei.hms.maps.model.UrlTileProvider;
import com.huawei.hms.maps.model.VisibleRegion;
import com.huawei.hms.maps.model.animation.AlphaAnimation;
import com.huawei.hms.maps.model.animation.Animation;
import com.huawei.hms.maps.model.animation.RotateAnimation;
import com.huawei.hms.maps.model.animation.ScaleAnimation;
import com.huawei.hms.maps.model.animation.TranslateAnimation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public class ReactUtils {
    private static final String TAG = null;

    public interface Mapper<T, R> {
        R map(T t);
    }

    public interface NamedCommand {
        String getName();
    }

    public interface NamedEvent {
        String getName();
    }

    static {
        C0201.m83(ReactUtils.class, 636);
    }

    public static /* synthetic */ Tile a(HashMap hashMap, Context context, int i, int i2, int i3) {
        List asList = Arrays.asList(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (hashMap.containsKey(asList)) {
            String str = (String) ((List) hashMap.get(asList)).get(0);
            int intValue = ((Integer) ((List) hashMap.get(asList)).get(1)).intValue();
            int intValue2 = ((Integer) ((List) hashMap.get(asList)).get(2)).intValue();
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(str));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeStream.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                return new Tile(intValue, intValue2, byteArrayOutputStream.toByteArray());
            } catch (IOException | OutOfMemoryError e) {
                Log.d(TAG, e.getLocalizedMessage());
            }
        }
        return new Tile(256, 256, null);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ea  */
    public static Animation getAnimationFromCommandArgs(ReadableMap readableMap, ReadableMap readableMap2, String str) {
        char c;
        TranslateAnimation translateAnimation;
        Animation animation;
        switch (str.hashCode()) {
            case -925180581:
                if (str.equals(C0201.m82(9177))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals(C0201.m82(9176))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 109250890:
                if (str.equals(C0201.m82(9175))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1052832078:
                if (str.equals(C0201.m82(9174))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            animation = new AlphaAnimation((float) readableMap.getDouble(C0201.m82(9186)), (float) readableMap.getDouble(C0201.m82(9187)));
        } else if (c != 1) {
            if (c == 2) {
                translateAnimation = new ScaleAnimation((float) readableMap.getDouble(C0201.m82(9180)), (float) readableMap.getDouble(C0201.m82(9182)), (float) readableMap.getDouble(C0201.m82(9181)), (float) readableMap.getDouble(C0201.m82(9183)));
            } else if (c != 3) {
                translateAnimation = null;
            } else {
                translateAnimation = new TranslateAnimation(new LatLng(readableMap.getDouble(C0201.m82(9178)), readableMap.getDouble(C0201.m82(9179))));
            }
            if (translateAnimation != null) {
                String r0 = C0201.m82(9188);
                if (readableMap.hasKey(r0)) {
                    translateAnimation.setDuration((long) readableMap.getInt(r0));
                } else if (readableMap2 != null && readableMap2.hasKey(r0)) {
                    translateAnimation.setDuration((long) readableMap2.getInt(r0));
                }
                String r02 = C0201.m82(9189);
                if (readableMap.hasKey(r02)) {
                    translateAnimation.setFillMode(readableMap.getInt(r02));
                } else if (readableMap2 != null && readableMap2.hasKey(r02)) {
                    translateAnimation.setFillMode(readableMap2.getInt(r02));
                }
                String r03 = C0201.m82(9190);
                if (readableMap.hasKey(r03)) {
                    translateAnimation.setRepeatCount(readableMap.getInt(r03));
                } else if (readableMap2 != null && readableMap2.hasKey(r03)) {
                    translateAnimation.setRepeatCount(readableMap2.getInt(r03));
                }
                String r04 = C0201.m82(9191);
                if (readableMap.hasKey(r04)) {
                    translateAnimation.setRepeatMode(readableMap.getInt(r04));
                } else if (readableMap2 != null && readableMap2.hasKey(r04)) {
                    translateAnimation.setRepeatMode(readableMap2.getInt(r04));
                }
                String r05 = C0201.m82(9192);
                if (readableMap.hasKey(r05)) {
                    translateAnimation.setInterpolator(getInterpolatorFromInt(readableMap.getInt(r05)));
                } else if (readableMap2 != null && readableMap2.hasKey(r05)) {
                    translateAnimation.setInterpolator(getInterpolatorFromInt(readableMap2.getInt(r05)));
                }
            }
            return translateAnimation;
        } else {
            animation = new RotateAnimation((float) readableMap.getDouble(C0201.m82(9184)), (float) readableMap.getDouble(C0201.m82(9185)));
        }
        translateAnimation = animation;
        if (translateAnimation != null) {
        }
        return translateAnimation;
    }

    public static BitmapDescriptor getBitmapDescriptorFromReadableMap(ReadableMap readableMap) {
        if (readableMap != null) {
            ReadableType readableType = ReadableType.Number;
            String r1 = C0201.m82(9193);
            if (hasValidKey(readableMap, r1, readableType)) {
                return BitmapDescriptorFactory.defaultMarker((float) readableMap.getDouble(r1));
            }
            ReadableType readableType2 = ReadableType.String;
            String r12 = C0201.m82(9194);
            if (hasValidKey(readableMap, r12, readableType2)) {
                return BitmapDescriptorFactory.fromAsset(readableMap.getString(r12));
            }
            ReadableType readableType3 = ReadableType.String;
            String r13 = C0201.m82(9195);
            if (hasValidKey(readableMap, r13, readableType3)) {
                return BitmapDescriptorFactory.fromFile(readableMap.getString(r13));
            }
            ReadableType readableType4 = ReadableType.String;
            String r14 = C0201.m82(9196);
            if (hasValidKey(readableMap, r14, readableType4)) {
                return BitmapDescriptorFactory.fromPath(readableMap.getString(r14));
            }
        }
        return BitmapDescriptorFactory.defaultMarker();
    }

    public static CameraPosition getCameraPositionFromReadableMap(ReadableMap readableMap) {
        CameraPosition.Builder builder = new CameraPosition.Builder();
        if (readableMap != null) {
            ReadableType readableType = ReadableType.Map;
            String r2 = C0201.m82(9197);
            if (hasValidKey(readableMap, r2, readableType)) {
                builder.target(getLatLngFromReadableMap(readableMap.getMap(r2)));
                ReadableType readableType2 = ReadableType.Number;
                String r22 = C0201.m82(9198);
                if (hasValidKey(readableMap, r22, readableType2)) {
                    builder.zoom((float) readableMap.getDouble(r22));
                }
                ReadableType readableType3 = ReadableType.Number;
                String r23 = C0201.m82(9199);
                if (hasValidKey(readableMap, r23, readableType3)) {
                    builder.bearing((float) readableMap.getDouble(r23));
                }
                ReadableType readableType4 = ReadableType.Number;
                String r24 = C0201.m82(9200);
                if (hasValidKey(readableMap, r24, readableType4)) {
                    builder.tilt((float) readableMap.getDouble(r24));
                }
            }
        }
        return builder.build();
    }

    public static Cap getCapFromReadableMap(ReadableMap readableMap) {
        ButtCap buttCap = new ButtCap();
        if (readableMap == null) {
            return buttCap;
        }
        int i = -1;
        ReadableType readableType = ReadableType.Number;
        String r3 = C0201.m82(9201);
        if (hasValidKey(readableMap, r3, readableType)) {
            i = readableMap.getInt(r3);
        }
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            return buttCap;
        }
        BitmapDescriptor bitmapDescriptorFromReadableMap = getBitmapDescriptorFromReadableMap(readableMap);
        ReadableType readableType2 = ReadableType.Number;
        String r2 = C0201.m82(9202);
        if (hasValidKey(readableMap, r2, readableType2)) {
            return new CustomCap(bitmapDescriptorFromReadableMap, (float) readableMap.getDouble(r2));
        }
        return new CustomCap(bitmapDescriptorFromReadableMap);
    }

    public static NamedCommand getCommand(String str, NamedCommand[] namedCommandArr) {
        for (NamedCommand namedCommand : namedCommandArr) {
            if (namedCommand.getName().equals(str)) {
                return namedCommand;
            }
        }
        return null;
    }

    public static Map<String, Integer> getCommandsMap(NamedCommand[] namedCommandArr) {
        ArrayMap arrayMap = new ArrayMap();
        for (int i = 0; i < namedCommandArr.length; i++) {
            arrayMap.put(namedCommandArr[i].getName(), Integer.valueOf(i));
        }
        return arrayMap;
    }

    public static Map<String, Object> getExportedCustomDirectEventTypeConstantsFromEvents(NamedEvent[] namedEventArr) {
        ArrayMap arrayMap = new ArrayMap();
        for (NamedEvent namedEvent : namedEventArr) {
            arrayMap.put(namedEvent.getName(), e.d(C0201.m82(9203), namedEvent.getName()));
        }
        return arrayMap;
    }

    private static Interpolator getInterpolatorFromInt(int i) {
        switch (i) {
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new AnticipateInterpolator();
            case 3:
                return new BounceInterpolator();
            case 4:
                return new DecelerateInterpolator();
            case 5:
                return new OvershootInterpolator();
            case 6:
                return new AccelerateDecelerateInterpolator();
            case 7:
                return new l4();
            case 8:
                return new m4();
            case 9:
                return new n4();
            default:
                return new LinearInterpolator();
        }
    }

    public static LatLngBounds getLatLngBoundsFromReadableArray(ReadableArray readableArray) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        if (readableArray != null) {
            for (LatLng latLng : getLatLngListFromReadableArray(readableArray)) {
                builder.include(latLng);
            }
        }
        return builder.build();
    }

    public static LatLng getLatLngFromReadableMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableType readableType = ReadableType.Number;
        String r1 = C0201.m82(9204);
        if (!hasValidKey(readableMap, r1, readableType)) {
            return null;
        }
        ReadableType readableType2 = ReadableType.Number;
        String r2 = C0201.m82(9205);
        if (hasValidKey(readableMap, r2, readableType2)) {
            return new LatLng(readableMap.getDouble(r1), readableMap.getDouble(r2));
        }
        return null;
    }

    public static List<LatLng> getLatLngListFromReadableArray(ReadableArray readableArray) {
        return mapReadableArray(readableArray, e.a);
    }

    public static List<List<LatLng>> getListOfLatLngListFromReadableArray(ReadableArray readableArray) {
        return mapDoubleReadableArray(readableArray, c.a);
    }

    public static PatternItem getPatternItemFromReadableMap(ReadableMap readableMap) {
        Dot dot = new Dot();
        if (readableMap == null) {
            return dot;
        }
        int i = -1;
        float f = 0.0f;
        ReadableType readableType = ReadableType.Number;
        String r4 = C0201.m82(9206);
        if (hasValidKey(readableMap, r4, readableType)) {
            i = readableMap.getInt(r4);
            ReadableType readableType2 = ReadableType.Number;
            String r42 = C0201.m82(9207);
            if (hasValidKey(readableMap, r42, readableType2)) {
                f = (float) readableMap.getDouble(r42);
            }
        }
        if (i == 0) {
            return new Dash(f);
        }
        if (i == 1) {
            return new Dot();
        }
        if (i != 2) {
            return dot;
        }
        return new Gap(f);
    }

    public static List<PatternItem> getPatternItemListFromReadableArray(ReadableArray readableArray) {
        return mapReadableArray(readableArray, b.a);
    }

    public static Point getPointFromReadableMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableType readableType = ReadableType.Number;
        String r1 = C0201.m82(9208);
        if (!hasValidKey(readableMap, r1, readableType)) {
            return null;
        }
        ReadableType readableType2 = ReadableType.Number;
        String r2 = C0201.m82(9209);
        if (hasValidKey(readableMap, r2, readableType2)) {
            return new Point(readableMap.getInt(r1), readableMap.getInt(r2));
        }
        return null;
    }

    public static TileProvider getTileProviderFromReadableArray(ReadableArray readableArray, Context context) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            List asList = Arrays.asList(Integer.valueOf(map.getInt(C0201.m82(9210))), Integer.valueOf(map.getInt(C0201.m82(9211))), Integer.valueOf(map.getInt(C0201.m82(9212))));
            Object[] objArr = new Object[3];
            objArr[0] = map.getString(C0201.m82(9213));
            ReadableType readableType = ReadableType.Number;
            String r9 = C0201.m82(9214);
            int i2 = 256;
            objArr[1] = Integer.valueOf(hasValidKey(map, r9, readableType) ? map.getInt(r9) : 256);
            ReadableType readableType2 = ReadableType.Number;
            String r7 = C0201.m82(9215);
            if (hasValidKey(map, r7, readableType2)) {
                i2 = map.getInt(r7);
            }
            objArr[2] = Integer.valueOf(i2);
            hashMap.put(asList, Arrays.asList(objArr));
        }
        return new a(hashMap, context);
    }

    public static TileProvider getTileProviderFromReadableMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableType readableType = ReadableType.String;
        String r1 = C0201.m82(9216);
        if (!hasValidKey(readableMap, r1, readableType)) {
            return null;
        }
        final String string = readableMap.getString(r1);
        ReadableType readableType2 = ReadableType.Number;
        String r12 = C0201.m82(9217);
        int i = hasValidKey(readableMap, r12, readableType2) ? readableMap.getInt(r12) : 256;
        ReadableType readableType3 = ReadableType.Number;
        String r13 = C0201.m82(9218);
        int i2 = hasValidKey(readableMap, r13, readableType3) ? readableMap.getInt(r13) : 256;
        if (string == null) {
            return null;
        }
        ReadableType readableType4 = ReadableType.Array;
        String r14 = C0201.m82(9219);
        final boolean z = hasValidKey(readableMap, r14, readableType4) && readableMap.getArray(r14).size() > 0;
        final ArrayList<Object> arrayList = z ? readableMap.getArray(r14).toArrayList() : new ArrayList<>();
        return new UrlTileProvider(i, i2) {
            /* class com.huawei.hms.rn.map.utils.ReactUtils.AnonymousClass1 */

            @Override // com.huawei.hms.maps.model.UrlTileProvider
            public URL getTileUrl(int i, int i2, int i3) {
                if (z && !arrayList.contains(Double.valueOf((double) i3))) {
                    return null;
                }
                try {
                    return new URL(string.replace(C0201.m82(38293), String.valueOf(i)).replace(C0201.m82(38294), String.valueOf(i2)).replace(C0201.m82(38295), String.valueOf(i3)));
                } catch (MalformedURLException e) {
                    Log.w(ReactUtils.TAG, e.getMessage());
                    return null;
                }
            }
        };
    }

    private static WritableArray getWritableArrayFromLatLngList(List<LatLng> list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list == null) {
            return writableNativeArray;
        }
        for (LatLng latLng : list) {
            writableNativeArray.pushMap(getWritableMapFromLatLng(latLng));
        }
        return writableNativeArray;
    }

    private static WritableArray getWritableArrayFromListOfLatLngList(List<List<LatLng>> list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list == null) {
            return writableNativeArray;
        }
        for (List<LatLng> list2 : list) {
            writableNativeArray.pushArray(getWritableArrayFromLatLngList(list2));
        }
        return writableNativeArray;
    }

    public static WritableMap getWritableMapFromAnimation(Animation animation) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(C0201.m82(9220), (int) animation.getDuration());
        writableNativeMap.putInt(C0201.m82(9221), animation.getFillMode());
        writableNativeMap.putInt(C0201.m82(9222), animation.getRepeatCount());
        writableNativeMap.putInt(C0201.m82(9223), animation.getRepeatMode());
        int i = 0;
        if (!(animation.getInterpolator() instanceof LinearInterpolator)) {
            if (animation.getInterpolator() instanceof AccelerateInterpolator) {
                i = 1;
            } else if (animation.getInterpolator() instanceof AnticipateInterpolator) {
                i = 2;
            } else if (animation.getInterpolator() instanceof BounceInterpolator) {
                i = 3;
            } else if (animation.getInterpolator() instanceof DecelerateInterpolator) {
                i = 4;
            } else if (animation.getInterpolator() instanceof OvershootInterpolator) {
                i = 5;
            } else if (animation.getInterpolator() instanceof AccelerateDecelerateInterpolator) {
                i = 6;
            }
        }
        writableNativeMap.putInt(C0201.m82(9224), i);
        if (animation instanceof AlphaAnimation) {
            AlphaAnimation alphaAnimation = (AlphaAnimation) animation;
            writableNativeMap.putDouble(C0201.m82(9225), (double) alphaAnimation.getFromAlpha());
            writableNativeMap.putDouble(C0201.m82(9226), (double) alphaAnimation.getToAlpha());
        } else if (animation instanceof RotateAnimation) {
            RotateAnimation rotateAnimation = (RotateAnimation) animation;
            writableNativeMap.putDouble(C0201.m82(9227), (double) rotateAnimation.getFromDegree());
            writableNativeMap.putDouble(C0201.m82(9228), (double) rotateAnimation.getToDegree());
        } else if (animation instanceof ScaleAnimation) {
            ScaleAnimation scaleAnimation = (ScaleAnimation) animation;
            writableNativeMap.putDouble(C0201.m82(9229), (double) scaleAnimation.getFromX());
            writableNativeMap.putDouble(C0201.m82(9230), (double) scaleAnimation.getFromY());
            writableNativeMap.putDouble(C0201.m82(9231), (double) scaleAnimation.getToX());
            writableNativeMap.putDouble(C0201.m82(9232), (double) scaleAnimation.getToY());
        } else if (animation instanceof TranslateAnimation) {
            writableNativeMap.putMap(C0201.m82(9233), getWritableMapFromLatLng(((TranslateAnimation) animation).getTarget()));
        }
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromCameraPosition(CameraPosition cameraPosition) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (cameraPosition == null) {
            return writableNativeMap;
        }
        writableNativeMap.putMap(C0201.m82(9234), getWritableMapFromLatLng(cameraPosition.target));
        writableNativeMap.putDouble(C0201.m82(9235), (double) cameraPosition.zoom);
        writableNativeMap.putDouble(C0201.m82(9236), (double) cameraPosition.tilt);
        writableNativeMap.putDouble(C0201.m82(9237), (double) cameraPosition.bearing);
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromCircle(Circle circle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (circle == null) {
            return writableNativeMap;
        }
        writableNativeMap.putMap(C0201.m82(9238), getWritableMapFromLatLng(circle.getCenter()));
        writableNativeMap.putInt(C0201.m82(9239), circle.getFillColor());
        writableNativeMap.putString(C0201.m82(9240), circle.getId());
        writableNativeMap.putDouble(C0201.m82(9241), circle.getRadius());
        writableNativeMap.putInt(C0201.m82(9242), circle.getStrokeColor());
        writableNativeMap.putArray(C0201.m82(9243), mapList(circle.getStrokePattern(), d.a));
        writableNativeMap.putDouble(C0201.m82(9244), (double) circle.getStrokeWidth());
        writableNativeMap.putDouble(C0201.m82(9245), (double) circle.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9246), circle.isClickable());
        writableNativeMap.putBoolean(C0201.m82(9247), circle.isVisible());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromCircleOptions(CircleOptions circleOptions) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (circleOptions == null) {
            return writableNativeMap;
        }
        writableNativeMap.putMap(C0201.m82(9248), getWritableMapFromLatLng(circleOptions.getCenter()));
        writableNativeMap.putInt(C0201.m82(9249), circleOptions.getFillColor());
        writableNativeMap.putDouble(C0201.m82(9250), circleOptions.getRadius());
        writableNativeMap.putInt(C0201.m82(9251), circleOptions.getStrokeColor());
        writableNativeMap.putArray(C0201.m82(9252), mapList(circleOptions.getStrokePattern(), d.a));
        writableNativeMap.putDouble(C0201.m82(9253), (double) circleOptions.getStrokeWidth());
        writableNativeMap.putDouble(C0201.m82(9254), (double) circleOptions.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9255), circleOptions.isClickable());
        writableNativeMap.putBoolean(C0201.m82(9256), circleOptions.isVisible());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromGroundOverlay(GroundOverlay groundOverlay) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (groundOverlay == null) {
            return writableNativeMap;
        }
        writableNativeMap.putDouble(C0201.m82(9257), (double) groundOverlay.getBearing());
        writableNativeMap.putMap(C0201.m82(9258), getWritableMapFromLatLngBounds(groundOverlay.getBounds()));
        writableNativeMap.putDouble(C0201.m82(9259), (double) groundOverlay.getHeight());
        writableNativeMap.putString(C0201.m82(9260), groundOverlay.getId());
        writableNativeMap.putMap(C0201.m82(9261), getWritableMapFromLatLng(groundOverlay.getPosition()));
        writableNativeMap.putDouble(C0201.m82(9262), (double) groundOverlay.getTransparency());
        writableNativeMap.putDouble(C0201.m82(9263), (double) groundOverlay.getWidth());
        writableNativeMap.putDouble(C0201.m82(9264), (double) groundOverlay.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9265), groundOverlay.isClickable());
        writableNativeMap.putBoolean(C0201.m82(9266), groundOverlay.isVisible());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromGroundOverlayOptions(GroundOverlayOptions groundOverlayOptions) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (groundOverlayOptions == null) {
            return writableNativeMap;
        }
        writableNativeMap.putDouble(C0201.m82(9267), (double) groundOverlayOptions.getAnchorU());
        writableNativeMap.putDouble(C0201.m82(9268), (double) groundOverlayOptions.getAnchorV());
        writableNativeMap.putDouble(C0201.m82(9269), (double) groundOverlayOptions.getBearing());
        writableNativeMap.putMap(C0201.m82(9270), getWritableMapFromLatLngBounds(groundOverlayOptions.getBounds()));
        writableNativeMap.putDouble(C0201.m82(9271), (double) groundOverlayOptions.getHeight());
        writableNativeMap.putMap(C0201.m82(9272), getWritableMapFromLatLng(groundOverlayOptions.getLocation()));
        writableNativeMap.putDouble(C0201.m82(9273), (double) groundOverlayOptions.getTransparency());
        writableNativeMap.putDouble(C0201.m82(9274), (double) groundOverlayOptions.getWidth());
        writableNativeMap.putDouble(C0201.m82(9275), (double) groundOverlayOptions.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9276), groundOverlayOptions.isClickable());
        writableNativeMap.putBoolean(C0201.m82(9277), groundOverlayOptions.isVisible());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromHuaweiMap(HuaweiMap huaweiMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (huaweiMap == null) {
            return writableNativeMap;
        }
        writableNativeMap.putMap(C0201.m82(9278), getWritableMapFromCameraPosition(huaweiMap.getCameraPosition()));
        writableNativeMap.putInt(C0201.m82(9279), huaweiMap.getMapType());
        writableNativeMap.putDouble(C0201.m82(9280), (double) huaweiMap.getMaxZoomLevel());
        writableNativeMap.putDouble(C0201.m82(9281), (double) huaweiMap.getMinZoomLevel());
        writableNativeMap.putMap(C0201.m82(9282), getWritableMapFromVisibleRegion(huaweiMap.getProjection().getVisibleRegion()));
        writableNativeMap.putMap(C0201.m82(9283), getWritableMapFromUiSettings(huaweiMap.getUiSettings()));
        writableNativeMap.putBoolean(C0201.m82(9284), huaweiMap.isBuildingsEnabled());
        writableNativeMap.putBoolean(C0201.m82(9285), huaweiMap.isMyLocationEnabled());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromLatLng(LatLng latLng) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (latLng == null) {
            return writableNativeMap;
        }
        writableNativeMap.putDouble(C0201.m82(9286), latLng.latitude);
        writableNativeMap.putDouble(C0201.m82(9287), latLng.longitude);
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromLatLngBounds(LatLngBounds latLngBounds) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (latLngBounds == null) {
            return writableNativeMap;
        }
        writableNativeMap.putMap(C0201.m82(9288), getWritableMapFromLatLng(latLngBounds.northeast));
        writableNativeMap.putMap(C0201.m82(9289), getWritableMapFromLatLng(latLngBounds.southwest));
        writableNativeMap.putMap(C0201.m82(9290), getWritableMapFromLatLng(latLngBounds.getCenter()));
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromMarker(Marker marker) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (marker == null) {
            return writableNativeMap;
        }
        writableNativeMap.putDouble(C0201.m82(9291), (double) marker.getAlpha());
        writableNativeMap.putString(C0201.m82(9292), marker.getId());
        writableNativeMap.putMap(C0201.m82(9293), getWritableMapFromLatLng(marker.getPosition()));
        writableNativeMap.putDouble(C0201.m82(9294), (double) marker.getRotation());
        writableNativeMap.putString(C0201.m82(9295), marker.getSnippet());
        writableNativeMap.putString(C0201.m82(9296), marker.getTitle());
        writableNativeMap.putDouble(C0201.m82(9297), (double) marker.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9298), marker.isClusterable());
        writableNativeMap.putBoolean(C0201.m82(9299), marker.isDraggable());
        writableNativeMap.putBoolean(C0201.m82(9300), marker.isFlat());
        writableNativeMap.putBoolean(C0201.m82(9301), marker.isInfoWindowShown());
        writableNativeMap.putBoolean(C0201.m82(9302), marker.isVisible());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromMarkerOptions(MarkerOptions markerOptions) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (markerOptions == null) {
            return writableNativeMap;
        }
        writableNativeMap.putDouble(C0201.m82(9303), (double) markerOptions.getAlpha());
        writableNativeMap.putDouble(C0201.m82(9304), (double) markerOptions.getMarkerAnchorU());
        writableNativeMap.putDouble(C0201.m82(9305), (double) markerOptions.getMarkerAnchorV());
        writableNativeMap.putDouble(C0201.m82(9306), (double) markerOptions.getInfoWindowAnchorU());
        writableNativeMap.putDouble(C0201.m82(9307), (double) markerOptions.getInfoWindowAnchorV());
        writableNativeMap.putMap(C0201.m82(9308), getWritableMapFromLatLng(markerOptions.getPosition()));
        writableNativeMap.putDouble(C0201.m82(9309), (double) markerOptions.getRotation());
        writableNativeMap.putString(C0201.m82(9310), markerOptions.getSnippet());
        writableNativeMap.putString(C0201.m82(9311), markerOptions.getTitle());
        writableNativeMap.putDouble(C0201.m82(9312), (double) markerOptions.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9313), markerOptions.ismClusterable());
        writableNativeMap.putBoolean(C0201.m82(9314), markerOptions.isDraggable());
        writableNativeMap.putBoolean(C0201.m82(9315), markerOptions.isFlat());
        writableNativeMap.putBoolean(C0201.m82(9316), markerOptions.isVisible());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromPoint(Point point) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (point == null) {
            return writableNativeMap;
        }
        writableNativeMap.putInt(C0201.m82(9317), point.x);
        writableNativeMap.putInt(C0201.m82(9318), point.y);
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromPolygon(Polygon polygon) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (polygon == null) {
            return writableNativeMap;
        }
        writableNativeMap.putArray(C0201.m82(9319), getWritableArrayFromLatLngList(polygon.getPoints()));
        writableNativeMap.putArray(C0201.m82(9320), getWritableArrayFromListOfLatLngList(polygon.getHoles()));
        writableNativeMap.putInt(C0201.m82(9321), polygon.getFillColor());
        writableNativeMap.putString(C0201.m82(9322), polygon.getId());
        writableNativeMap.putInt(C0201.m82(9323), polygon.getStrokeColor());
        writableNativeMap.putArray(C0201.m82(9324), mapList(polygon.getStrokePattern(), d.a));
        writableNativeMap.putDouble(C0201.m82(9325), (double) polygon.getStrokeWidth());
        writableNativeMap.putDouble(C0201.m82(9326), (double) polygon.getZIndex());
        writableNativeMap.putInt(C0201.m82(9327), polygon.getStrokeJointType());
        writableNativeMap.putBoolean(C0201.m82(9328), polygon.isClickable());
        writableNativeMap.putBoolean(C0201.m82(9329), polygon.isVisible());
        writableNativeMap.putBoolean(C0201.m82(9330), polygon.isGeodesic());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromPolygonOptions(PolygonOptions polygonOptions) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (polygonOptions == null) {
            return writableNativeMap;
        }
        writableNativeMap.putArray(C0201.m82(9331), getWritableArrayFromLatLngList(polygonOptions.getPoints()));
        writableNativeMap.putArray(C0201.m82(9332), getWritableArrayFromListOfLatLngList(polygonOptions.getHoles()));
        writableNativeMap.putInt(C0201.m82(9333), polygonOptions.getFillColor());
        writableNativeMap.putInt(C0201.m82(9334), polygonOptions.getStrokeColor());
        writableNativeMap.putArray(C0201.m82(9335), mapList(polygonOptions.getStrokePattern(), d.a));
        writableNativeMap.putDouble(C0201.m82(9336), (double) polygonOptions.getStrokeWidth());
        writableNativeMap.putDouble(C0201.m82(9337), (double) polygonOptions.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9338), polygonOptions.isClickable());
        writableNativeMap.putBoolean(C0201.m82(9339), polygonOptions.isVisible());
        writableNativeMap.putBoolean(C0201.m82(9340), polygonOptions.isGeodesic());
        writableNativeMap.putInt(C0201.m82(9341), polygonOptions.getStrokeJointType());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromPolyline(Polyline polyline) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (polyline == null) {
            return writableNativeMap;
        }
        writableNativeMap.putArray(C0201.m82(9342), getWritableArrayFromLatLngList(polyline.getPoints()));
        writableNativeMap.putInt(C0201.m82(9343), polyline.getColor());
        writableNativeMap.putString(C0201.m82(9344), polyline.getId());
        writableNativeMap.putArray(C0201.m82(9345), mapList(polyline.getPattern(), d.a));
        writableNativeMap.putDouble(C0201.m82(9346), (double) polyline.getWidth());
        writableNativeMap.putDouble(C0201.m82(9347), (double) polyline.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9348), polyline.isClickable());
        writableNativeMap.putBoolean(C0201.m82(9349), polyline.isVisible());
        writableNativeMap.putBoolean(C0201.m82(9350), polyline.isGeodesic());
        writableNativeMap.putInt(C0201.m82(9351), polyline.getJointType());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromPolylineOptions(PolylineOptions polylineOptions) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (polylineOptions == null) {
            return writableNativeMap;
        }
        writableNativeMap.putArray(C0201.m82(9352), getWritableArrayFromLatLngList(polylineOptions.getPoints()));
        writableNativeMap.putInt(C0201.m82(9353), polylineOptions.getColor());
        writableNativeMap.putArray(C0201.m82(9354), mapList(polylineOptions.getPattern(), d.a));
        writableNativeMap.putDouble(C0201.m82(9355), (double) polylineOptions.getWidth());
        writableNativeMap.putDouble(C0201.m82(9356), (double) polylineOptions.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9357), polylineOptions.isClickable());
        writableNativeMap.putBoolean(C0201.m82(9358), polylineOptions.isVisible());
        writableNativeMap.putBoolean(C0201.m82(9359), polylineOptions.isGeodesic());
        writableNativeMap.putInt(C0201.m82(9360), polylineOptions.getJointType());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromProjectionOnLatLng(Projection projection, LatLng latLng) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (!(projection == null || latLng == null)) {
            writableNativeMap.putMap(C0201.m82(9361), getWritableMapFromPoint(projection.toScreenLocation(latLng)));
            writableNativeMap.putMap(C0201.m82(9362), getWritableMapFromLatLng(latLng));
            writableNativeMap.putMap(C0201.m82(9363), getWritableMapFromVisibleRegion(projection.getVisibleRegion()));
        }
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromTileOverlay(TileOverlay tileOverlay) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (tileOverlay == null) {
            return writableNativeMap;
        }
        writableNativeMap.putBoolean(C0201.m82(9364), tileOverlay.getFadeIn());
        writableNativeMap.putDouble(C0201.m82(9365), (double) tileOverlay.getTransparency());
        writableNativeMap.putString(C0201.m82(9366), tileOverlay.getId());
        writableNativeMap.putDouble(C0201.m82(9367), (double) tileOverlay.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9368), tileOverlay.isVisible());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromTileOverlayOptions(TileOverlayOptions tileOverlayOptions) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (tileOverlayOptions == null) {
            return writableNativeMap;
        }
        writableNativeMap.putBoolean(C0201.m82(9369), tileOverlayOptions.getFadeIn());
        writableNativeMap.putDouble(C0201.m82(9370), (double) tileOverlayOptions.getTransparency());
        writableNativeMap.putDouble(C0201.m82(9371), (double) tileOverlayOptions.getZIndex());
        writableNativeMap.putBoolean(C0201.m82(9372), tileOverlayOptions.isVisible());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromUiSettings(UiSettings uiSettings) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (uiSettings == null) {
            return writableNativeMap;
        }
        writableNativeMap.putBoolean(C0201.m82(9373), uiSettings.isCompassEnabled());
        writableNativeMap.putBoolean(C0201.m82(9374), uiSettings.isMyLocationButtonEnabled());
        writableNativeMap.putBoolean(C0201.m82(9375), uiSettings.isRotateGesturesEnabled());
        writableNativeMap.putBoolean(C0201.m82(9376), uiSettings.isScrollGesturesEnabled());
        writableNativeMap.putBoolean(C0201.m82(9377), uiSettings.isScrollGesturesEnabledDuringRotateOrZoom());
        writableNativeMap.putBoolean(C0201.m82(9378), uiSettings.isTiltGesturesEnabled());
        writableNativeMap.putBoolean(C0201.m82(9379), uiSettings.isZoomControlsEnabled());
        writableNativeMap.putBoolean(C0201.m82(9380), uiSettings.isZoomGesturesEnabled());
        return writableNativeMap;
    }

    public static WritableMap getWritableMapFromVisibleRegion(VisibleRegion visibleRegion) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (visibleRegion == null) {
            return writableNativeMap;
        }
        writableNativeMap.putMap(C0201.m82(9381), getWritableMapFromLatLng(visibleRegion.farLeft));
        writableNativeMap.putMap(C0201.m82(9382), getWritableMapFromLatLng(visibleRegion.farRight));
        writableNativeMap.putMap(C0201.m82(9383), getWritableMapFromLatLng(visibleRegion.nearLeft));
        writableNativeMap.putMap(C0201.m82(9384), getWritableMapFromLatLng(visibleRegion.nearRight));
        writableNativeMap.putMap(C0201.m82(9385), getWritableMapFromLatLngBounds(visibleRegion.latLngBounds));
        return writableNativeMap;
    }

    public static WritableMap getWritableMapPatternItem(PatternItem patternItem) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (patternItem == null) {
            return writableNativeMap;
        }
        writableNativeMap.putInt(C0201.m82(9386), patternItem.type);
        writableNativeMap.putDouble(C0201.m82(9387), (double) patternItem.length);
        return writableNativeMap;
    }

    public static WritableMap getWritableMapPointOfInterest(PointOfInterest pointOfInterest) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (pointOfInterest == null) {
            return writableNativeMap;
        }
        writableNativeMap.putMap(C0201.m82(9388), getWritableMapFromLatLng(pointOfInterest.latLng));
        writableNativeMap.putString(C0201.m82(9389), pointOfInterest.name);
        writableNativeMap.putString(C0201.m82(9390), pointOfInterest.placeId);
        return writableNativeMap;
    }

    public static boolean hasValidElement(ReadableArray readableArray, int i, ReadableType readableType) {
        return !readableArray.isNull(i) && readableArray.getType(i) == readableType;
    }

    public static boolean hasValidKey(ReadableMap readableMap, String str, ReadableType readableType) {
        return readableMap.hasKey(str) && readableMap.getType(str) == readableType;
    }

    public static <R> List<R> mapDoubleReadableArray(ReadableArray readableArray, Mapper<ReadableArray, R> mapper) {
        ArrayList arrayList = new ArrayList();
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(mapper.map(readableArray.getArray(i)));
            }
        }
        return arrayList;
    }

    public static <T> WritableArray mapList(List<T> list, Mapper<T, WritableMap> mapper) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list != null) {
            for (T t : list) {
                writableNativeArray.pushMap(mapper.map(t));
            }
        }
        return writableNativeArray;
    }

    public static <R> List<R> mapReadableArray(ReadableArray readableArray, Mapper<ReadableMap, R> mapper) {
        ArrayList arrayList = new ArrayList();
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(mapper.map(readableArray.getMap(i)));
            }
        }
        return arrayList;
    }
}
