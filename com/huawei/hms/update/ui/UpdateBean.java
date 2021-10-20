package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

public class UpdateBean implements Serializable {
    private boolean a;
    private String b;
    private int c;
    private String d;
    private String e;
    private ArrayList f;
    private boolean g = true;

    private static <T> T a(T t) {
        return t;
    }

    public boolean a() {
        return ((Boolean) a(Boolean.valueOf(this.a))).booleanValue();
    }

    public String b() {
        return (String) a(this.b);
    }

    public int c() {
        return ((Integer) a(Integer.valueOf(this.c))).intValue();
    }

    public String d() {
        return (String) a(this.d);
    }

    public String getClientAppName() {
        return (String) a(this.e);
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f);
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.g))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.d = str;
    }

    public void setClientAppName(String str) {
        this.e = str;
    }

    public void setClientPackageName(String str) {
        this.b = str;
    }

    public void setClientVersionCode(int i) {
        this.c = i;
    }

    public void setHmsOrApkUpgrade(boolean z) {
        this.a = z;
    }

    public void setNeedConfirm(boolean z) {
        this.g = z;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f = arrayList;
    }
}
