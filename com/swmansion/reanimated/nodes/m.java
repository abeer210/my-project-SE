package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import vigqyno.C0201;

/* compiled from: Node */
public abstract class m {
    public static final Double ONE = Double.valueOf(1.0d);
    public static final Double ZERO = Double.valueOf(0.0d);
    private List<m> mChildren;
    private final Map<String, Long> mLastLoopID = new HashMap();
    private final Map<String, Object> mMemoizedValue = new HashMap();
    public final int mNodeID;
    public final b mNodesManager;
    public final d mUpdateContext;

    public m(int i, ReadableMap readableMap, b bVar) {
        this.mLastLoopID.put(C0201.m82(25040), -1L);
        this.mNodeID = i;
        this.mNodesManager = bVar;
        this.mUpdateContext = bVar.p;
    }

    private static void findAndUpdateNodes(m mVar, Set<m> set, Stack<j> stack) {
        if (!set.contains(mVar)) {
            set.add(mVar);
            List<m> list = mVar.mChildren;
            if (list != null) {
                for (m mVar2 : list) {
                    findAndUpdateNodes(mVar2, set, stack);
                }
            }
            if (mVar instanceof j) {
                stack.push((j) mVar);
            }
        }
    }

    public static void runUpdates(d dVar) {
        UiThreadUtil.assertOnUiThread();
        ArrayList<m> arrayList = dVar.c;
        HashSet hashSet = new HashSet();
        Stack stack = new Stack();
        for (int i = 0; i < arrayList.size(); i++) {
            findAndUpdateNodes(arrayList.get(i), hashSet, stack);
            if (i == arrayList.size() - 1) {
                while (!stack.isEmpty()) {
                    ((j) stack.pop()).a();
                }
            }
        }
        arrayList.clear();
        dVar.a++;
    }

    public void addChild(m mVar) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList();
        }
        this.mChildren.add(mVar);
        mVar.dangerouslyRescheduleEvaluate();
    }

    public final void dangerouslyRescheduleEvaluate() {
        this.mLastLoopID.put(this.mUpdateContext.b, -1L);
        markUpdated();
    }

    public final Double doubleValue() {
        Object value = value();
        if (value == null) {
            return ZERO;
        }
        if (value instanceof Double) {
            return (Double) value;
        }
        if (value instanceof Number) {
            return Double.valueOf(((Number) value).doubleValue());
        }
        if (value instanceof Boolean) {
            return ((Boolean) value).booleanValue() ? ONE : ZERO;
        }
        throw new IllegalStateException(C0201.m82(25041) + this + C0201.m82(25042));
    }

    public abstract Object evaluate();

    public final void forceUpdateMemoizedValue(Object obj) {
        this.mMemoizedValue.put(this.mUpdateContext.b, obj);
        markUpdated();
    }

    public void markUpdated() {
        UiThreadUtil.assertOnUiThread();
        this.mUpdateContext.c.add(this);
        this.mNodesManager.w();
    }

    public void removeChild(m mVar) {
        List<m> list = this.mChildren;
        if (list != null) {
            list.remove(mVar);
        }
    }

    public final Object value() {
        if (this.mLastLoopID.containsKey(this.mUpdateContext.b)) {
            long longValue = this.mLastLoopID.get(this.mUpdateContext.b).longValue();
            d dVar = this.mUpdateContext;
            if (longValue >= dVar.a) {
                return this.mMemoizedValue.get(dVar.b);
            }
        }
        Map<String, Long> map = this.mLastLoopID;
        d dVar2 = this.mUpdateContext;
        map.put(dVar2.b, Long.valueOf(dVar2.a));
        Object evaluate = evaluate();
        this.mMemoizedValue.put(this.mUpdateContext.b, evaluate);
        return evaluate;
    }
}
