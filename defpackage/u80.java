package defpackage;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: u80  reason: default package */
/* compiled from: DraweeEventTracker */
public class u80 {
    private static final u80 b = new u80();
    private static boolean c = true;
    private final Queue<a> a = new ArrayBlockingQueue(20);

    /* renamed from: u80$a */
    /* compiled from: DraweeEventTracker */
    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private u80() {
    }

    public static u80 a() {
        return c ? new u80() : b;
    }

    public void b(a aVar) {
        if (c) {
            if (this.a.size() + 1 > 20) {
                this.a.poll();
            }
            this.a.add(aVar);
        }
    }

    public String toString() {
        return this.a.toString();
    }
}
