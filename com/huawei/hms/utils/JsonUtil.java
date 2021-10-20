package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class JsonUtil {
    private static final String BYTE_BYTE = null;
    private static final String LIST_FIELD_VALUE = null;
    private static final String LIST_ITEM_VALUE = null;
    private static final String LIST_SIZE = null;
    private static final String MAP_MAP = null;
    private static final String NEXT_ITEM = null;
    private static final String PRE_PKG = null;
    private static final String TAG = null;
    public static final int VAL_BYTE = 0;
    public static final int VAL_ENTITY = 0;
    public static final int VAL_LIST = 0;
    public static final int VAL_MAP = 0;
    public static final int VAL_NULL = 0;
    public static final String VAL_TYPE = null;

    static {
        C0201.m83(JsonUtil.class, 373);
    }

    private static String createInnerJsonString(IMessageEntity iMessageEntity) throws IllegalAccessException, JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(Packed.class)) {
                    boolean isAccessible = field.isAccessible();
                    setAccessible(field, true);
                    String name = field.getName();
                    Object obj = field.get(iMessageEntity);
                    setAccessible(field, isAccessible);
                    disposeType(name, obj, jSONObject);
                }
            }
        }
        return jSONObject.toString();
    }

    public static String createJsonString(IMessageEntity iMessageEntity) {
        String r0 = C0201.m82(6104);
        String r1 = C0201.m82(6105);
        if (iMessageEntity == null) {
            HMSLog.e(r1, C0201.m82(6106));
            return r0;
        }
        try {
            return createInnerJsonString(iMessageEntity);
        } catch (IllegalAccessException e) {
            HMSLog.e(r1, C0201.m82(6108) + e.getMessage());
            return r0;
        } catch (JSONException e2) {
            HMSLog.e(r1, C0201.m82(6107) + e2.getMessage());
            return r0;
        }
    }

    private static boolean disposeType(String str, Object obj, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        if (obj instanceof String) {
            jSONObject.put(str, (String) obj);
            return true;
        } else if (obj instanceof Integer) {
            jSONObject.put(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Short) {
            jSONObject.put(str, (Short) obj);
            return true;
        } else if (obj instanceof Long) {
            jSONObject.put(str, (Long) obj);
            return true;
        } else if (obj instanceof Float) {
            jSONObject.put(str, (Float) obj);
            return true;
        } else if (obj instanceof Double) {
            jSONObject.put(str, (Double) obj);
            return true;
        } else if (obj instanceof Boolean) {
            jSONObject.put(str, (Boolean) obj);
            return true;
        } else if (obj instanceof JSONObject) {
            jSONObject.put(str, (JSONObject) obj);
            return true;
        } else if (obj instanceof byte[]) {
            writeByte(str, (byte[]) obj, jSONObject);
            return true;
        } else if (obj instanceof List) {
            writeList(str, (List) obj, jSONObject);
            return true;
        } else if (obj instanceof Map) {
            writeMap(str, (Map) obj, jSONObject);
            return true;
        } else {
            if (obj instanceof IMessageEntity) {
                try {
                    jSONObject.put(str, createInnerJsonString((IMessageEntity) obj));
                    return true;
                } catch (IllegalAccessException e) {
                    HMSLog.e(C0201.m82(6110), C0201.m82(6109) + e);
                }
            }
            return false;
        }
    }

    public static Object getInfoFromJsonobject(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has(str2)) {
                    return null;
                }
                Object obj = jSONObject.get(str2);
                if (obj instanceof String) {
                    return obj;
                }
            } catch (JSONException unused) {
                HMSLog.e(C0201.m82(6112), C0201.m82(6111) + str2);
            }
        }
        return null;
    }

    public static int getIntValue(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return -1;
        }
        return jSONObject.getInt(str);
    }

    private static Object getObjectValue(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.get(str);
        }
        String r0 = C0201.m82(6113);
        if (jSONObject.has(r0) && jSONObject.getJSONObject(r0).has(str)) {
            return jSONObject.getJSONObject(r0).get(str);
        }
        String r02 = C0201.m82(6114);
        if (!jSONObject.has(r02) || !jSONObject.getJSONObject(r02).has(str)) {
            return null;
        }
        return jSONObject.getJSONObject(r02).get(str);
    }

    public static String getStringValue(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static IMessageEntity jsonToEntity(String str, IMessageEntity iMessageEntity) {
        String r0 = C0201.m82(6115);
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
                Field[] declaredFields = cls.getDeclaredFields();
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(Packed.class)) {
                        try {
                            readFiled(iMessageEntity, field, jSONObject);
                        } catch (IllegalAccessException unused) {
                            HMSLog.e(r0, C0201.m82(6116) + field.getName());
                        }
                    }
                }
            }
        } catch (JSONException e) {
            HMSLog.e(r0, C0201.m82(6117) + e.getMessage());
        }
        return iMessageEntity;
    }

    private static byte[] readByte(JSONObject jSONObject) throws JSONException {
        try {
            return Base64.decode(jSONObject.getString(C0201.m82(6118)));
        } catch (IllegalArgumentException e) {
            HMSLog.e(C0201.m82(6120), C0201.m82(6119) + e.getMessage());
            return null;
        }
    }

    private static void readFiled(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        Object readJson = readJson(iMessageEntity, field, jSONObject);
        if (readJson != null) {
            boolean isAccessible = field.isAccessible();
            setAccessible(field, true);
            field.set(iMessageEntity, readJson);
            setAccessible(field, isAccessible);
        }
    }

    private static Object readJson(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        String r5 = C0201.m82(6121);
        String r0 = C0201.m82(6122);
        Object objectValue = getObjectValue(field.getName(), jSONObject);
        if (objectValue != null) {
            try {
                if (field.getType().getName().startsWith(C0201.m82(6123)) && (field.getType().newInstance() instanceof IMessageEntity)) {
                    return jsonToEntity((String) objectValue, (IMessageEntity) field.getType().newInstance());
                }
                if (!(objectValue instanceof JSONObject) || !((JSONObject) objectValue).has(r5)) {
                    return objectValue;
                }
                int i = ((JSONObject) objectValue).getInt(r5);
                if (i != 1) {
                    if (i != 0) {
                        if (i == 2) {
                            return readByte((JSONObject) objectValue);
                        }
                        if (i == 3) {
                            return readMap(field.getGenericType(), (JSONObject) objectValue);
                        }
                        HMSLog.e(r0, C0201.m82(6124) + i);
                    }
                }
                return readList(field.getGenericType(), (JSONObject) objectValue);
            } catch (InstantiationException unused) {
                HMSLog.e(r0, C0201.m82(6125));
            }
        }
        return null;
    }

    private static List<Object> readList(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
        int i = jSONObject.getInt(C0201.m82(6126));
        int i2 = jSONObject.getInt(C0201.m82(6127));
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = jSONObject.get(C0201.m82(6128) + i3);
            if (i2 == 0) {
                arrayList.add(jsonToEntity((String) obj, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else if (i2 == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static Map readMap(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
        Class cls = (Class) ((ParameterizedType) type).getActualTypeArguments()[1];
        JSONArray jSONArray = new JSONArray(jSONObject.getString(C0201.m82(6129)));
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i += 2) {
            if (cls.newInstance() instanceof IMessageEntity) {
                hashMap.put(jSONArray.get(i), jsonToEntity(jSONArray.getString(i + 1), (IMessageEntity) cls.newInstance()));
            } else {
                hashMap.put(jSONArray.get(i), jSONArray.get(i + 1));
            }
        }
        return hashMap;
    }

    private static void setAccessible(final Field field, final boolean z) {
        AccessController.doPrivileged(new PrivilegedAction() {
            /* class com.huawei.hms.utils.JsonUtil.AnonymousClass1 */

            @Override // java.security.PrivilegedAction
            public Object run() {
                field.setAccessible(z);
                return null;
            }
        });
    }

    private static void writeByte(String str, byte[] bArr, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C0201.m82(6130), 2);
        try {
            jSONObject2.put(C0201.m82(6131), Base64.encode(bArr));
        } catch (IllegalArgumentException e) {
            HMSLog.e(C0201.m82(6133), C0201.m82(6132) + e.getMessage());
        }
        jSONObject.put(str, jSONObject2);
    }

    private static void writeList(String str, List<?> list, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        JSONObject jSONObject2 = new JSONObject();
        String r1 = C0201.m82(6134);
        jSONObject2.put(r1, 1);
        jSONObject2.put(C0201.m82(6135), list.size());
        for (int i = 0; i < list.size(); i++) {
            disposeType(C0201.m82(6136) + i, list.get(i), jSONObject2);
            if (list.get(i) instanceof IMessageEntity) {
                jSONObject2.put(r1, 0);
            }
        }
        jSONObject.put(str, jSONObject2);
    }

    private static void writeMap(String str, Map map, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof IMessageEntity) {
                jSONArray.put(createInnerJsonString((IMessageEntity) key));
            } else {
                jSONArray.put(key);
            }
            if (value instanceof IMessageEntity) {
                jSONArray.put(createInnerJsonString((IMessageEntity) value));
            } else {
                jSONArray.put(value);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C0201.m82(6137), 3);
        jSONObject2.put(C0201.m82(6138), jSONArray.toString());
        jSONObject.put(str, jSONObject2);
    }
}
