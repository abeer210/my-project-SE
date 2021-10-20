package com.huawei.updatesdk.a.b.d.c;

import android.util.Log;
import com.huawei.updatesdk.a.a.c.f;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public abstract class b {
    private static final char COMMA = ',';
    private static final String END_FLAG = null;
    private static final String TAG = null;

    /* access modifiers changed from: private */
    public static class a implements PrivilegedAction {
        private Field a;

        public a(Field field) {
            this.a = field;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.a.setAccessible(true);
            return null;
        }
    }

    static {
        C0201.m83(b.class, 516);
    }

    private String arrayToJson(Object obj) throws IllegalAccessException, IllegalArgumentException {
        int length = Array.getLength(obj);
        if (length <= 0) {
            return C0201.m82(28479);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(28480));
        for (int i = 0; i < length; i++) {
            String valueToJson = valueToJson(Array.get(obj, i));
            if (valueToJson != null) {
                sb.append(valueToJson);
                sb.append(COMMA);
            }
        }
        formatJsonStr(sb);
        sb.append(C0201.m82(28481));
        return sb.toString();
    }

    private void formatJsonStr(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            int i = length - 1;
            if (sb.charAt(i) == ',') {
                sb.delete(i, length);
            }
        }
    }

    private boolean isPrimitiveObj(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Short);
    }

    private Object jsonBeanFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        b bVar = (b) cls.newInstance();
        bVar.fromJson((JSONObject) obj);
        return bVar;
    }

    private String mapToJson(Map map) throws IllegalAccessException, IllegalArgumentException {
        if (map.size() <= 0) {
            return C0201.m82(28482);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(28483));
        Iterator it = map.entrySet().iterator();
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String valueToJson = valueToJson(entry.getValue());
            if (valueToJson != null) {
                sb.append(C0201.m82(28484));
                sb.append(str);
                sb.append(C0201.m82(28485));
                sb.append(valueToJson);
            }
            if (!it.hasNext()) {
                sb.append(C0201.m82(28486));
                return sb.toString();
            } else if (valueToJson != null) {
                sb.append(COMMA);
            }
        }
    }

    private void processValueError(Field field, Object obj) {
        Object valueOf;
        if (obj != null && (obj instanceof String)) {
            try {
                Class<?> type = field.getType();
                if (type.isPrimitive()) {
                    String name = type.getName();
                    if (C0201.m82(28487).equals(name)) {
                        valueOf = Integer.valueOf(Integer.parseInt((String) obj));
                    } else if (C0201.m82(28488).equals(name)) {
                        valueOf = Float.valueOf(Float.parseFloat((String) obj));
                    } else if (C0201.m82(28489).equals(name)) {
                        valueOf = Long.valueOf(Long.parseLong((String) obj));
                    } else if (C0201.m82(28490).equals(name)) {
                        valueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj));
                    } else if (C0201.m82(28491).equals(name)) {
                        valueOf = Double.valueOf(Double.parseDouble((String) obj));
                    } else if (C0201.m82(28492).equals(name)) {
                        valueOf = Short.valueOf(Short.parseShort((String) obj));
                    } else if (C0201.m82(28493).equals(name)) {
                        valueOf = Byte.valueOf(Byte.parseByte((String) obj));
                    } else if (C0201.m82(28494).equals(name)) {
                        valueOf = Character.valueOf(((String) obj).charAt(0));
                    } else {
                        return;
                    }
                    field.set(this, valueOf);
                }
            } catch (IllegalAccessException e) {
                String str = TAG;
                com.huawei.updatesdk.a.a.b.a.a.a.b(str, C0201.m82(28495) + e.getMessage());
            }
        }
    }

    private Object valueFromJson(Class cls, Class cls2, Object obj) throws IllegalAccessException, IllegalArgumentException, InstantiationException, ClassNotFoundException, JSONException {
        if (cls.isPrimitive() || cls.equals(String.class)) {
            return (!C0201.m82(28498).equals(cls.getName()) || !(obj instanceof Double)) ? obj : Float.valueOf(((Double) obj).floatValue());
        } else if (List.class.isAssignableFrom(cls)) {
            return listFromJson(cls2, obj);
        } else {
            if (b.class.isAssignableFrom(cls)) {
                if (!cls.equals(b.class)) {
                    return jsonBeanFromJson(cls, obj);
                }
                throw new IllegalArgumentException(C0201.m82(28496) + cls);
            } else if (Map.class.isAssignableFrom(cls)) {
                return mapFromJson(cls2, obj);
            } else {
                throw new IllegalArgumentException(C0201.m82(28497) + cls);
            }
        }
    }

    private String valueToJson(Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return JSONObject.quote(obj.toString());
        }
        if (isPrimitiveObj(obj)) {
            return String.valueOf(obj);
        }
        if (obj instanceof b) {
            return ((b) obj).toJson();
        }
        if (obj instanceof List) {
            return listToJson((List) obj);
        }
        if (obj instanceof Map) {
            return mapToJson((Map) obj);
        }
        if (obj.getClass().isArray()) {
            return arrayToJson(obj);
        }
        return null;
    }

    public void fromJson(JSONObject jSONObject) throws IllegalArgumentException, IllegalAccessException, InstantiationException, ClassNotFoundException, JSONException {
        Field[] a2 = f.a(getClass());
        Object obj = null;
        for (int i = 0; i < a2.length; i++) {
            AccessController.doPrivileged(new a(a2[i]));
            String name = a2[i].getName();
            if (name.endsWith(C0201.m82(28499))) {
                String substring = name.substring(0, name.length() - 1);
                if (jSONObject.has(substring)) {
                    Object obj2 = jSONObject.get(substring);
                    if (!JSONObject.NULL.equals(obj2)) {
                        try {
                            obj = valueFromJson(a2[i].getType(), f.a(a2[i]), obj2);
                            a2[i].set(this, obj);
                        } catch (Exception e) {
                            String str = TAG;
                            Log.e(str, getClass().getName() + C0201.m82(28500) + substring + e.toString());
                            processValueError(a2[i], obj);
                        }
                    }
                }
            }
        }
    }

    public Object listFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        if (cls == null) {
            throw new IllegalArgumentException(C0201.m82(28504));
        } else if (obj instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                Object valueFromJson = valueFromJson(cls, null, jSONArray.get(i));
                if (valueFromJson != null) {
                    if (cls.equals(valueFromJson.getClass())) {
                        arrayList.add(valueFromJson);
                    } else {
                        String str = TAG;
                        com.huawei.updatesdk.a.a.b.a.a.a.b(str, C0201.m82(28501) + cls + C0201.m82(28502) + valueFromJson.getClass());
                    }
                }
            }
            return arrayList;
        } else {
            throw new IllegalArgumentException(C0201.m82(28503) + obj);
        }
    }

    public String listToJson(List list) throws IllegalAccessException, IllegalArgumentException {
        if (list.size() <= 0) {
            return C0201.m82(28505);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(28506));
        for (int i = 0; i < list.size(); i++) {
            String valueToJson = valueToJson(list.get(i));
            if (valueToJson != null) {
                sb.append(valueToJson);
                sb.append(COMMA);
            }
        }
        formatJsonStr(sb);
        sb.append(C0201.m82(28507));
        return sb.toString();
    }

    public Object mapFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        if (cls == null) {
            throw new IllegalArgumentException(C0201.m82(28511));
        } else if (obj instanceof JSONObject) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object valueFromJson = valueFromJson(cls, null, jSONObject.get(next));
                if (valueFromJson != null) {
                    if (cls.equals(valueFromJson.getClass())) {
                        linkedHashMap.put(next, valueFromJson);
                    } else {
                        String str = TAG;
                        com.huawei.updatesdk.a.a.b.a.a.a.b(str, C0201.m82(28508) + cls + C0201.m82(28509) + valueFromJson.getClass());
                    }
                }
            }
            return linkedHashMap;
        } else {
            throw new IllegalArgumentException(C0201.m82(28510) + obj);
        }
    }

    public String toJson() throws IllegalAccessException, IllegalArgumentException {
        Field[] a2 = f.a(getClass());
        if (a2.length <= 0) {
            return C0201.m82(28512);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(28513));
        for (int i = 0; i < a2.length; i++) {
            AccessController.doPrivileged(new a(a2[i]));
            String name = a2[i].getName();
            if (name != null && name.endsWith(C0201.m82(28514))) {
                String substring = name.substring(0, name.length() - 1);
                String valueToJson = valueToJson(a2[i].get(this));
                if (valueToJson != null) {
                    sb.append(C0201.m82(28515));
                    sb.append(substring);
                    sb.append(C0201.m82(28516));
                    sb.append(valueToJson);
                    sb.append(COMMA);
                }
            }
        }
        formatJsonStr(sb);
        sb.append(C0201.m82(28517));
        return sb.toString();
    }
}
