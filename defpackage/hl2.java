package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: hl2  reason: default package */
/* compiled from: IdStack */
public class hl2<E> implements Iterable<String> {
    private final ArrayList<String> a = new ArrayList<>();
    private final Map<String, E> b = new HashMap();

    public boolean a(String str) {
        return this.a.contains(str);
    }

    public E b(String str) {
        return this.b.get(str);
    }

    public boolean c(String str) {
        return tj2.b(str, d());
    }

    public String d() {
        return (String) yi2.p(this.a);
    }

    public void e(String str, E e) {
        this.a.add(str);
        this.b.put(str, e);
    }

    public E f(String str) {
        if (!a(str)) {
            return null;
        }
        this.a.remove(str);
        return this.b.remove(str);
    }

    public void g(Iterator<String> it, String str) {
        it.remove();
        this.b.remove(str);
    }

    public E get(int i) {
        return this.b.get(this.a.get(i));
    }

    public void i(String str, E e, int i) {
        this.a.add(i, str);
        this.b.put(str, e);
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.a.iterator();
    }

    public Collection<E> j() {
        return this.b.values();
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.b.get(yi2.p(this.a));
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return this.b.remove(yi2.t(this.a));
    }

    public int size() {
        return this.a.size();
    }
}
