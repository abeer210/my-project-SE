package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* compiled from: OpReorderer */
public class i {
    public final a a;

    /* access modifiers changed from: package-private */
    /* compiled from: OpReorderer */
    public interface a {
        void a(a.b bVar);

        a.b b(int i, int i2, int i3, Object obj);
    }

    public i(a aVar) {
        this.a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i, a.b bVar, int i2, a.b bVar2) {
        int i3 = bVar.d < bVar2.b ? -1 : 0;
        if (bVar.b < bVar2.b) {
            i3++;
        }
        int i4 = bVar2.b;
        int i5 = bVar.b;
        if (i4 <= i5) {
            bVar.b = i5 + bVar2.d;
        }
        int i6 = bVar2.b;
        int i7 = bVar.d;
        if (i6 <= i7) {
            bVar.d = i7 + bVar2.d;
        }
        bVar2.b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    private void d(List<a.b> list, int i, int i2) {
        a.b bVar = list.get(i);
        a.b bVar2 = list.get(i2);
        int i3 = bVar2.a;
        if (i3 == 1) {
            c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            f(list, i, bVar, i2, bVar2);
        }
    }

    public void b(List<a.b> list) {
        while (true) {
            int a2 = a(list);
            if (a2 != -1) {
                d(list, a2, a2 + 1);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    public void e(List<a.b> list, int i, a.b bVar, int i2, a.b bVar2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = bVar.b;
        int i8 = bVar.d;
        boolean z2 = false;
        if (i7 < i8) {
            if (bVar2.b == i7 && bVar2.d == i8 - i7) {
                z = false;
            } else {
                z = false;
                i3 = bVar.d;
                i4 = bVar2.b;
                if (i3 < i4) {
                    bVar2.b = i4 - 1;
                } else {
                    int i9 = bVar2.d;
                    if (i3 < i4 + i9) {
                        bVar2.d = i9 - 1;
                        bVar.a = 2;
                        bVar.d = 1;
                        if (bVar2.d == 0) {
                            list.remove(i2);
                            this.a.a(bVar2);
                            return;
                        }
                        return;
                    }
                }
                i5 = bVar.b;
                i6 = bVar2.b;
                a.b bVar3 = null;
                if (i5 <= i6) {
                    bVar2.b = i6 + 1;
                } else {
                    int i10 = bVar2.d;
                    if (i5 < i6 + i10) {
                        bVar3 = this.a.b(2, i5 + 1, (i6 + i10) - i5, null);
                        bVar2.d = bVar.b - bVar2.b;
                    }
                }
                if (z2) {
                    list.set(i, bVar2);
                    list.remove(i2);
                    this.a.a(bVar);
                    return;
                }
                if (z) {
                    if (bVar3 != null) {
                        int i11 = bVar.b;
                        if (i11 > bVar3.b) {
                            bVar.b = i11 - bVar3.d;
                        }
                        int i12 = bVar.d;
                        if (i12 > bVar3.b) {
                            bVar.d = i12 - bVar3.d;
                        }
                    }
                    int i13 = bVar.b;
                    if (i13 > bVar2.b) {
                        bVar.b = i13 - bVar2.d;
                    }
                    int i14 = bVar.d;
                    if (i14 > bVar2.b) {
                        bVar.d = i14 - bVar2.d;
                    }
                } else {
                    if (bVar3 != null) {
                        int i15 = bVar.b;
                        if (i15 >= bVar3.b) {
                            bVar.b = i15 - bVar3.d;
                        }
                        int i16 = bVar.d;
                        if (i16 >= bVar3.b) {
                            bVar.d = i16 - bVar3.d;
                        }
                    }
                    int i17 = bVar.b;
                    if (i17 >= bVar2.b) {
                        bVar.b = i17 - bVar2.d;
                    }
                    int i18 = bVar.d;
                    if (i18 >= bVar2.b) {
                        bVar.d = i18 - bVar2.d;
                    }
                }
                list.set(i, bVar2);
                if (bVar.b != bVar.d) {
                    list.set(i2, bVar);
                } else {
                    list.remove(i2);
                }
                if (bVar3 != null) {
                    list.add(i, bVar3);
                    return;
                }
                return;
            }
        } else if (bVar2.b == i8 + 1 && bVar2.d == i7 - i8) {
            z = true;
        } else {
            z = true;
            i3 = bVar.d;
            i4 = bVar2.b;
            if (i3 < i4) {
            }
            i5 = bVar.b;
            i6 = bVar2.b;
            a.b bVar32 = null;
            if (i5 <= i6) {
            }
            if (z2) {
            }
        }
        z2 = true;
        i3 = bVar.d;
        i4 = bVar2.b;
        if (i3 < i4) {
        }
        i5 = bVar.b;
        i6 = bVar2.b;
        a.b bVar322 = null;
        if (i5 <= i6) {
        }
        if (z2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    public void f(List<a.b> list, int i, a.b bVar, int i2, a.b bVar2) {
        a.b bVar3;
        int i3;
        int i4;
        int i5 = bVar.d;
        int i6 = bVar2.b;
        a.b bVar4 = null;
        if (i5 < i6) {
            bVar2.b = i6 - 1;
        } else {
            int i7 = bVar2.d;
            if (i5 < i6 + i7) {
                bVar2.d = i7 - 1;
                bVar3 = this.a.b(4, bVar.b, 1, bVar2.c);
                i3 = bVar.b;
                i4 = bVar2.b;
                if (i3 > i4) {
                    bVar2.b = i4 + 1;
                } else {
                    int i8 = bVar2.d;
                    if (i3 < i4 + i8) {
                        int i9 = (i4 + i8) - i3;
                        bVar4 = this.a.b(4, i3 + 1, i9, bVar2.c);
                        bVar2.d -= i9;
                    }
                }
                list.set(i2, bVar);
                if (bVar2.d <= 0) {
                    list.set(i, bVar2);
                } else {
                    list.remove(i);
                    this.a.a(bVar2);
                }
                if (bVar3 != null) {
                    list.add(i, bVar3);
                }
                if (bVar4 == null) {
                    list.add(i, bVar4);
                    return;
                }
                return;
            }
        }
        bVar3 = null;
        i3 = bVar.b;
        i4 = bVar2.b;
        if (i3 > i4) {
        }
        list.set(i2, bVar);
        if (bVar2.d <= 0) {
        }
        if (bVar3 != null) {
        }
        if (bVar4 == null) {
        }
    }
}
