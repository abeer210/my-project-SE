package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

public interface Dns {
    public static final Dns SYSTEM = new Dns() {
        /* class okhttp3.Dns.AnonymousClass1 */

        @Override // okhttp3.Dns
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(C0201.m82(28986) + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException(C0201.m82(28987));
            }
        }
    };

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
