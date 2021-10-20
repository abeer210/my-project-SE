package defpackage;

/* renamed from: ni2  reason: default package */
/* compiled from: ComponentType */
public enum ni2 {
    Component("Component"),
    Button("TopBarButton"),
    Title("TopBarTitle"),
    Background("TopBarBackground");
    
    private String a;

    private ni2(String str) {
        this.a = str;
    }

    public String b() {
        return this.a;
    }
}
