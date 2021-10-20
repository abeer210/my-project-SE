package com.huawei.hianalytics.ab.bc.cd.ab;

import android.content.Context;
import android.text.TextUtils;

public class de {
    private String a;
    private String ab;
    private Context b;
    private String bc;
    private String cd;
    private String de;
    private String ef;
    private String fg;
    private String gh;
    private int hi = 5;
    private String ij;
    private String ik;
    private String kl;
    private String lm;

    public String a() {
        return this.de;
    }

    public void a(String str) {
        this.ik = str;
    }

    public String ab() {
        return this.ef;
    }

    public void ab(Context context) {
        this.b = context;
    }

    public void ab(String str) {
        this.ef = str;
    }

    public String b() {
        return this.cd;
    }

    public String bc() {
        return this.ij;
    }

    public void bc(String str) {
        this.ij = str;
    }

    public String c() {
        return this.ik;
    }

    public int cd() {
        return this.hi;
    }

    public void cd(String str) {
        this.a = str;
    }

    public String de() {
        return this.a;
    }

    public void de(String str) {
        this.ab = str;
    }

    public Context ef() {
        return this.b;
    }

    public void ef(String str) {
        this.gh = str;
    }

    public String fg() {
        return this.ab;
    }

    public void fg(String str) {
        this.fg = str;
    }

    public int gh() {
        return this.hi * 2;
    }

    public void gh(String str) {
        this.bc = str;
    }

    public String hi() {
        return TextUtils.isEmpty(this.gh) ? this.fg : this.gh;
    }

    public void hi(String str) {
        this.kl = str;
    }

    public String ij() {
        return this.fg;
    }

    public void ij(String str) {
        this.lm = str;
    }

    public String ik() {
        return this.bc;
    }

    public void ik(String str) {
    }

    public String kl() {
        return this.kl;
    }

    public void kl(String str) {
        this.de = str;
    }

    public String lm() {
        return this.lm;
    }

    public void lm(String str) {
        this.cd = str;
    }
}
