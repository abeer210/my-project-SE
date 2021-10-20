package defpackage;

/* renamed from: be  reason: default package */
/* compiled from: FileExtension */
public enum be {
    JSON(".json"),
    ZIP(".zip");
    
    public final String a;

    private be(String str) {
        this.a = str;
    }

    public String b() {
        return ".temp" + this.a;
    }

    public String toString() {
        return this.a;
    }
}
