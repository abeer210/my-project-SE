package com.facebook.react.util;

import android.util.JsonWriter;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;
import vigqyno.C0201;

/* compiled from: ExceptionDataHelper */
public class a {
    public static String a(ReadableMap readableMap) {
        if (readableMap != null) {
            String r1 = C0201.m82(15408);
            if (readableMap.getType(r1) != ReadableType.Null) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    JsonWriter jsonWriter = new JsonWriter(stringWriter);
                    JsonWriterHelper.value(jsonWriter, readableMap.getDynamic(r1));
                    jsonWriter.close();
                    stringWriter.close();
                    return stringWriter.toString();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
