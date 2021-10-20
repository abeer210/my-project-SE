package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import vigqyno.C0201;

/* renamed from: ky2  reason: default package */
/* compiled from: Options */
public final class ky2 extends AbstractList<dy2> implements RandomAccess {
    public final dy2[] a;
    public final int[] b;

    private ky2(dy2[] dy2Arr, int[] iArr) {
        this.a = dy2Arr;
        this.b = iArr;
    }

    private static void a(long j, ay2 ay2, int i, List<dy2> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        ay2 ay22;
        int i6;
        int i7 = i2;
        if (i7 < i3) {
            for (int i8 = i7; i8 < i3; i8++) {
                if (list.get(i8).A() < i) {
                    throw new AssertionError();
                }
            }
            dy2 dy2 = list.get(i2);
            dy2 dy22 = list.get(i3 - 1);
            int i9 = -1;
            if (i == dy2.A()) {
                i9 = list2.get(i7).intValue();
                i7++;
                dy2 = list.get(i7);
            }
            if (dy2.l(i) != dy22.l(i)) {
                int i10 = 1;
                for (int i11 = i7 + 1; i11 < i3; i11++) {
                    if (list.get(i11 - 1).l(i) != list.get(i11).l(i)) {
                        i10++;
                    }
                }
                long c = j + ((long) c(ay2)) + 2 + ((long) (i10 * 2));
                ay2.f0(i10);
                ay2.f0(i9);
                for (int i12 = i7; i12 < i3; i12++) {
                    byte l = list.get(i12).l(i);
                    if (i12 == i7 || l != list.get(i12 - 1).l(i)) {
                        ay2.f0(l & 255);
                    }
                }
                ay2 ay23 = new ay2();
                int i13 = i7;
                while (i13 < i3) {
                    byte l2 = list.get(i13).l(i);
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        if (i15 >= i3) {
                            i5 = i3;
                            break;
                        } else if (l2 != list.get(i15).l(i)) {
                            i5 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i14 == i5 && i + 1 == list.get(i13).A()) {
                        ay2.f0(list2.get(i13).intValue());
                        i6 = i5;
                        ay22 = ay23;
                    } else {
                        ay2.f0((int) ((((long) c(ay23)) + c) * -1));
                        i6 = i5;
                        ay22 = ay23;
                        a(c, ay23, i + 1, list, i13, i5, list2);
                    }
                    ay23 = ay22;
                    i13 = i6;
                }
                ay2.write(ay23, ay23.Q());
                return;
            }
            int i16 = 0;
            int min = Math.min(dy2.A(), dy22.A());
            int i17 = i;
            while (i17 < min && dy2.l(i17) == dy22.l(i17)) {
                i16++;
                i17++;
            }
            long c2 = 1 + j + ((long) c(ay2)) + 2 + ((long) i16);
            ay2.f0(-i16);
            ay2.f0(i9);
            int i18 = i;
            while (true) {
                i4 = i + i16;
                if (i18 >= i4) {
                    break;
                }
                ay2.f0(dy2.l(i18) & 255);
                i18++;
            }
            if (i7 + 1 != i3) {
                ay2 ay24 = new ay2();
                ay2.f0((int) ((((long) c(ay24)) + c2) * -1));
                a(c2, ay24, i4, list, i7, i3, list2);
                ay2.write(ay24, ay24.Q());
            } else if (i4 == list.get(i7).A()) {
                ay2.f0(list2.get(i7).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    private static int c(ay2 ay2) {
        return (int) (ay2.Q() / 4);
    }

    public static ky2 d(dy2... dy2Arr) {
        if (dy2Arr.length == 0) {
            return new ky2(new dy2[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(dy2Arr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, dy2Arr[i2]), Integer.valueOf(i2));
        }
        if (((dy2) arrayList.get(0)).A() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                dy2 dy2 = (dy2) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    dy2 dy22 = (dy2) arrayList.get(i5);
                    if (!dy22.C(dy2)) {
                        continue;
                        break;
                    } else if (dy22.A() == dy2.A()) {
                        throw new IllegalArgumentException(C0201.m82(29278) + dy22);
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            ay2 ay2 = new ay2();
            a(0, ay2, 0, arrayList, 0, arrayList.size(), arrayList2);
            int c = c(ay2);
            int[] iArr = new int[c];
            for (int i6 = 0; i6 < c; i6++) {
                iArr[i6] = ay2.readInt();
            }
            if (ay2.M()) {
                return new ky2((dy2[]) dy2Arr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException(C0201.m82(29279));
    }

    /* renamed from: b */
    public dy2 get(int i) {
        return this.a[i];
    }

    public final int size() {
        return this.a.length;
    }
}
