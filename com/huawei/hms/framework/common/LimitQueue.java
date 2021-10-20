package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.LinkedList;
import vigqyno.C0201;

public class LimitQueue<E> extends LinkedList<E> {
    private static final long serialVersionUID = 0;
    private boolean deduplication;
    private int limit;
    private final Object lock;

    static {
        C0201.m83(LimitQueue.class, 685);
    }

    public LimitQueue(int i) {
        this.lock = new Object();
        this.deduplication = false;
        this.limit = i;
    }

    public LimitQueue(int i, boolean z) {
        this.lock = new Object();
        this.deduplication = false;
        this.limit = i;
        this.deduplication = z;
    }

    public LimitQueue(Collection<? extends E> collection, boolean z) {
        this(collection.size(), z);
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.util.Queue, java.util.LinkedList, java.util.Deque
    public boolean add(E e) {
        boolean add;
        synchronized (this.lock) {
            if (this.deduplication) {
                super.remove(e);
            }
            if (super.size() >= this.limit) {
                super.poll();
            }
            add = super.add(e);
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.LinkedList
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.size() > this.limit) {
            return false;
        }
        if (this.deduplication) {
            super.removeAll(collection);
        }
        for (int size = (collection.size() + super.size()) - this.limit; size > 0; size--) {
            super.poll();
        }
        return super.addAll(collection);
    }

    public void clear() {
        synchronized (this.lock) {
            super.clear();
        }
    }

    public int getLimit() {
        return this.limit;
    }

    @Override // java.util.Queue, java.util.LinkedList, java.util.Deque
    public boolean offer(E e) {
        boolean offer;
        synchronized (this.lock) {
            if (this.deduplication) {
                super.remove(e);
            }
            if (super.size() >= this.limit) {
                super.poll();
            }
            offer = super.offer(e);
        }
        return offer;
    }

    @Override // java.util.LinkedList, java.util.Deque
    public E peekLast() {
        E e;
        synchronized (this.lock) {
            e = (E) super.peekLast();
        }
        return e;
    }

    @Override // java.util.Queue, java.util.LinkedList, java.util.Deque
    public E poll() {
        E e;
        synchronized (this.lock) {
            e = (E) super.poll();
        }
        return e;
    }

    @Override // java.util.Queue, java.util.LinkedList, java.util.Deque
    public E remove() {
        E e;
        synchronized (this.lock) {
            e = (E) super.remove();
        }
        return e;
    }

    @Override // java.util.List, java.util.AbstractList, java.util.LinkedList, java.util.AbstractSequentialList
    public E remove(int i) {
        E e;
        synchronized (this.lock) {
            e = (E) super.remove(i);
        }
        return e;
    }

    @Override // java.util.List, java.util.LinkedList
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.lock) {
            remove = super.remove(obj);
        }
        return remove;
    }
}
