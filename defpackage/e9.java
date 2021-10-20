package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import vigqyno.C0201;

/* renamed from: e9  reason: default package */
public class e9 {
    private static l9 a(j9 j9Var, l9 l9Var, Node node, String str, boolean z) throws t8 {
        x8 a = w8.a();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            if (C0201.m82(8905).equals(namespaceURI)) {
                namespaceURI = C0201.m82(8906);
            }
            String a2 = a.a(namespaceURI);
            String r4 = C0201.m82(8907);
            if (a2 == null) {
                a2 = a.c(namespaceURI, node.getPrefix() != null ? node.getPrefix() : r4);
            }
            String str2 = a2 + node.getLocalName();
            x9 x9Var = new x9();
            boolean z2 = false;
            if (z) {
                l9Var = m9.i(j9Var.a(), namespaceURI, r4, true);
                l9Var.k0(false);
                if (a.d(str2) != null) {
                    j9Var.a().g0(true);
                    l9Var.g0(true);
                    z2 = true;
                }
            }
            boolean equals = C0201.m82(8908).equals(str2);
            boolean equals2 = C0201.m82(8909).equals(str2);
            l9 l9Var2 = new l9(str2, str, x9Var);
            l9Var2.c0(z2);
            if (!equals2) {
                l9Var.d(l9Var2);
            } else {
                l9Var.b(1, l9Var2);
            }
            if (equals2) {
                if (z || !l9Var.v().q()) {
                    throw new t8(C0201.m82(8910), 202);
                }
                l9Var.h0(true);
            }
            if (equals) {
                if (l9Var.v().i()) {
                    l9Var2.l0(C0201.m82(8911));
                } else {
                    throw new t8(C0201.m82(8912), 202);
                }
            }
            return l9Var2;
        }
        throw new t8(C0201.m82(8913), 202);
    }

    private static l9 b(l9 l9Var, String str, String str2) throws t8 {
        if (C0201.m82(8914).equals(str)) {
            str2 = g9.h(str2);
        }
        l9 l9Var2 = new l9(str, str2, null);
        l9Var.e(l9Var2);
        return l9Var2;
    }

    private static void c(l9 l9Var) throws t8 {
        l9 m = l9Var.m(1);
        if (m.v().h()) {
            if (!l9Var.v().h()) {
                l9 A = m.A(1);
                m.Z(A);
                l9Var.e(A);
            } else {
                throw new t8(C0201.m82(8915), 203);
            }
        }
        for (int i = 1; i <= m.E(); i++) {
            l9Var.e(m.A(i));
        }
        for (int i2 = 2; i2 <= l9Var.p(); i2++) {
            l9Var.e(l9Var.m(i2));
        }
        l9Var.h0(false);
        l9Var.v().B(false);
        l9Var.v().r(m.v());
        l9Var.o0(m.I());
        l9Var.Y();
        Iterator S = m.S();
        while (S.hasNext()) {
            l9Var.d((l9) S.next());
        }
    }

    private static int d(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        String r2 = C0201.m82(8916);
        String r3 = C0201.m82(8917);
        String r4 = C0201.m82(8918);
        if (namespaceURI == null && ((r3.equals(localName) || r2.equals(localName)) && (node instanceof Attr) && r4.equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = r4;
        }
        if (!r4.equals(namespaceURI)) {
            return 0;
        }
        if (C0201.m82(8919).equals(localName)) {
            return 9;
        }
        if (C0201.m82(8920).equals(localName)) {
            return 4;
        }
        if (C0201.m82(8921).equals(localName)) {
            return 8;
        }
        if (r3.equals(localName)) {
            return 3;
        }
        if (C0201.m82(8922).equals(localName)) {
            return 5;
        }
        if (C0201.m82(8923).equals(localName)) {
            return 1;
        }
        if (r2.equals(localName)) {
            return 2;
        }
        if (C0201.m82(8924).equals(localName)) {
            return 6;
        }
        if (C0201.m82(8925).equals(localName)) {
            return 7;
        }
        if (C0201.m82(8926).equals(localName)) {
            return 10;
        }
        if (C0201.m82(8927).equals(localName)) {
            return 11;
        }
        return C0201.m82(8928).equals(localName) ? 12 : 0;
    }

    private static boolean e(int i) {
        return 1 <= i && i <= 7;
    }

    private static boolean f(int i) {
        return 10 <= i && i <= 12;
    }

    private static boolean g(int i) {
        if (i == 8 || f(i)) {
            return false;
        }
        return !e(i);
    }

    private static boolean h(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static j9 i(Node node) throws t8 {
        j9 j9Var = new j9();
        u(j9Var, node);
        return j9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0116  */
    private static void j(j9 j9Var, l9 l9Var, Node node, boolean z) throws t8 {
        boolean z2;
        int i;
        String nodeName;
        String nodeValue;
        if (!node.hasChildNodes()) {
            Node node2 = null;
            int i2 = 0;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                int length = node.getAttributes().getLength();
                String r10 = C0201.m82(8929);
                String r14 = C0201.m82(8930);
                String r15 = C0201.m82(8931);
                if (i2 < length) {
                    Node item = node.getAttributes().item(i2);
                    if (!r15.equals(item.getPrefix()) && (item.getPrefix() != null || !r15.equals(item.getNodeName()))) {
                        int d = d(item);
                        String r152 = C0201.m82(8932);
                        if (d == 0) {
                            if (C0201.m82(8934).equals(item.getLocalName())) {
                                if (C0201.m82(8935).equals(item.getNamespaceURI())) {
                                    if (!z4) {
                                        node2 = item;
                                        z3 = true;
                                    } else {
                                        throw new t8(r152, 203);
                                    }
                                }
                            }
                            if (!r14.equals(item.getNodeName())) {
                                z5 = true;
                            }
                        } else if (d != 2) {
                            String r13 = C0201.m82(8933);
                            if (d != 5) {
                                if (d != 6) {
                                    throw new t8(r10, 202);
                                } else if (!z4) {
                                    z6 = true;
                                } else {
                                    throw new t8(r13, 202);
                                }
                            } else if (z6) {
                                throw new t8(r13, 202);
                            } else if (!z3) {
                                if (!z3) {
                                    node2 = item;
                                }
                                z4 = true;
                            } else {
                                throw new t8(r152, 203);
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                } else {
                    String r1 = C0201.m82(8936);
                    l9 a = a(j9Var, l9Var, node, r1, z);
                    if (z3 || z4) {
                        if (node2 != null) {
                            r1 = node2.getNodeValue();
                        }
                        a.o0(r1);
                        if (!z3) {
                            a.v().C(true);
                        }
                    } else if (z5) {
                        a.v().B(true);
                        z2 = true;
                        for (i = 0; i < node.getAttributes().getLength(); i++) {
                            Node item2 = node.getAttributes().item(i);
                            if (item2 != node2 && !r15.equals(item2.getPrefix()) && (item2.getPrefix() != null || !r15.equals(item2.getNodeName()))) {
                                int d2 = d(item2);
                                if (d2 == 0) {
                                    nodeName = item2.getNodeName();
                                    if (!z2) {
                                        nodeValue = item2.getNodeValue();
                                    } else if (r14.equals(nodeName)) {
                                        b(a, r14, item2.getNodeValue());
                                    } else {
                                        a(j9Var, a, item2, item2.getNodeValue(), false);
                                    }
                                } else if (d2 != 2) {
                                    if (d2 == 5) {
                                        nodeValue = item2.getNodeValue();
                                        nodeName = C0201.m82(8937);
                                    } else if (d2 != 6) {
                                        throw new t8(r10, 202);
                                    }
                                }
                                b(a, nodeName, nodeValue);
                            }
                        }
                        return;
                    }
                    z2 = false;
                    while (i < node.getAttributes().getLength()) {
                    }
                    return;
                }
            }
        } else {
            throw new t8(C0201.m82(8938), 202);
        }
    }

    private static void k(j9 j9Var, l9 l9Var, Node node, boolean z) throws t8 {
        l9 a = a(j9Var, l9Var, node, null, z);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node item = node.getAttributes().item(i);
            String prefix = item.getPrefix();
            String r3 = C0201.m82(8939);
            if (!r3.equals(prefix) && (item.getPrefix() != null || !r3.equals(item.getNodeName()))) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                String nodeName = item.getNodeName();
                String r5 = C0201.m82(8940);
                if (r5.equals(nodeName)) {
                    b(a, r5, item.getNodeValue());
                } else if (!C0201.m82(8941).equals(namespaceURI) || (!C0201.m82(8942).equals(localName) && !C0201.m82(8943).equals(localName))) {
                    throw new t8(C0201.m82(8944), 202);
                }
            }
        }
        String r9 = C0201.m82(8945);
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
            Node item2 = node.getChildNodes().item(i2);
            if (item2.getNodeType() == 3) {
                r9 = r9 + item2.getNodeValue();
            } else {
                throw new t8(C0201.m82(8946), 202);
            }
        }
        a.o0(r9);
    }

    private static void l(j9 j9Var, l9 l9Var, Node node, boolean z) throws t8 {
        int d = d(node);
        if (d != 8 && d != 0) {
            throw new t8(C0201.m82(8947), 202);
        } else if (!z || d != 0) {
            m(j9Var, l9Var, node, z);
            t(j9Var, l9Var, node, z);
        } else {
            throw new t8(C0201.m82(8948), 203);
        }
    }

    private static void m(j9 j9Var, l9 l9Var, Node node, boolean z) throws t8 {
        int i = 0;
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node item = node.getAttributes().item(i2);
            String prefix = item.getPrefix();
            String r4 = C0201.m82(8949);
            if (!r4.equals(prefix) && (item.getPrefix() != null || !r4.equals(item.getNodeName()))) {
                int d = d(item);
                if (d == 0) {
                    a(j9Var, l9Var, item, item.getNodeValue(), z);
                } else if (d != 6 && d != 2 && d != 3) {
                    throw new t8(C0201.m82(8950), 202);
                } else if (i <= 0) {
                    i++;
                    if (z && d == 3) {
                        if (l9Var.t() == null || l9Var.t().length() <= 0) {
                            l9Var.l0(item.getNodeValue());
                        } else if (!l9Var.t().equals(item.getNodeValue())) {
                            throw new t8(C0201.m82(8951), 203);
                        }
                    }
                } else {
                    throw new t8(C0201.m82(8952), 202);
                }
            }
        }
    }

    private static void n(j9 j9Var, l9 l9Var, Node node) throws t8 {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node item = node.getChildNodes().item(i);
            if (!h(item)) {
                l(j9Var, l9Var, item, true);
            }
        }
    }

    private static void o() throws t8 {
        throw new t8(C0201.m82(8953), 203);
    }

    private static void p() throws t8 {
        throw new t8(C0201.m82(8954), 203);
    }

    private static void q() throws t8 {
        throw new t8(C0201.m82(8955), 203);
    }

    private static void r(j9 j9Var, l9 l9Var, Node node, boolean z) throws t8 {
        l9 a = a(j9Var, l9Var, node, C0201.m82(8956), z);
        a.v().B(true);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node item = node.getAttributes().item(i);
            String prefix = item.getPrefix();
            String r3 = C0201.m82(8957);
            if (!r3.equals(prefix) && (item.getPrefix() != null || !r3.equals(item.getNodeName()))) {
                String localName = item.getLocalName();
                String namespaceURI = item.getNamespaceURI();
                String nodeName = item.getNodeName();
                String r5 = C0201.m82(8958);
                if (r5.equals(nodeName)) {
                    b(a, r5, item.getNodeValue());
                } else if (!C0201.m82(8959).equals(namespaceURI) || (!C0201.m82(8960).equals(localName) && !C0201.m82(8961).equals(localName))) {
                    throw new t8(C0201.m82(8962), 202);
                }
            }
        }
        t(j9Var, a, node, false);
        if (a.r()) {
            c(a);
        }
    }

    private static void s(j9 j9Var, l9 l9Var, Node node, boolean z) throws t8 {
        if (g(d(node))) {
            NamedNodeMap attributes = node.getAttributes();
            ArrayList<String> arrayList = null;
            for (int i = 0; i < attributes.getLength(); i++) {
                Node item = attributes.item(i);
                String prefix = item.getPrefix();
                String r7 = C0201.m82(8963);
                if (r7.equals(prefix) || (item.getPrefix() == null && r7.equals(item.getNodeName()))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(item.getNodeName());
                }
            }
            if (arrayList != null) {
                for (String str : arrayList) {
                    attributes.removeNamedItem(str);
                }
            }
            if (attributes.getLength() <= 3) {
                for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                    Node item2 = attributes.item(i2);
                    String localName = item2.getLocalName();
                    String namespaceURI = item2.getNamespaceURI();
                    String nodeValue = item2.getNodeValue();
                    boolean equals = C0201.m82(8964).equals(item2.getNodeName());
                    String r9 = C0201.m82(8965);
                    if (!equals || (C0201.m82(8966).equals(localName) && r9.equals(namespaceURI))) {
                        if (C0201.m82(8967).equals(localName) && r9.equals(namespaceURI)) {
                            k(j9Var, l9Var, node, z);
                            return;
                        } else if (!C0201.m82(8968).equals(localName) || !r9.equals(namespaceURI)) {
                            j(j9Var, l9Var, node, z);
                            return;
                        } else if (C0201.m82(8969).equals(nodeValue)) {
                            p();
                            throw null;
                        } else if (C0201.m82(8970).equals(nodeValue)) {
                            r(j9Var, l9Var, node, z);
                            return;
                        } else if (C0201.m82(8971).equals(nodeValue)) {
                            o();
                            throw null;
                        } else {
                            q();
                            throw null;
                        }
                    }
                }
                if (node.hasChildNodes()) {
                    for (int i3 = 0; i3 < node.getChildNodes().getLength(); i3++) {
                        if (node.getChildNodes().item(i3).getNodeType() != 3) {
                            v(j9Var, l9Var, node, z);
                            return;
                        }
                    }
                    k(j9Var, l9Var, node, z);
                    return;
                }
            }
            j(j9Var, l9Var, node, z);
            return;
        }
        throw new t8(C0201.m82(8972), 202);
    }

    private static void t(j9 j9Var, l9 l9Var, Node node, boolean z) throws t8 {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node item = node.getChildNodes().item(i);
            if (!h(item)) {
                if (item.getNodeType() == 1) {
                    s(j9Var, l9Var, item, z);
                } else {
                    throw new t8(C0201.m82(8973), 202);
                }
            }
        }
    }

    public static void u(j9 j9Var, Node node) throws t8 {
        if (node.hasAttributes()) {
            n(j9Var, j9Var.a(), node);
            return;
        }
        throw new t8(C0201.m82(8974), 202);
    }

    private static void v(j9 j9Var, l9 l9Var, Node node, boolean z) throws t8 {
        t8 t8Var;
        if (z) {
            if (C0201.m82(8975).equals(node.getNodeName())) {
                return;
            }
        }
        l9 a = a(j9Var, l9Var, node, C0201.m82(8976), z);
        int i = 0;
        while (true) {
            int length = node.getAttributes().getLength();
            String r2 = C0201.m82(8977);
            if (i < length) {
                Node item = node.getAttributes().item(i);
                String prefix = item.getPrefix();
                String r5 = C0201.m82(8978);
                if (!r5.equals(prefix) && (item.getPrefix() != null || !r5.equals(item.getNodeName()))) {
                    String localName = item.getLocalName();
                    String namespaceURI = item.getNamespaceURI();
                    String nodeName = item.getNodeName();
                    String r7 = C0201.m82(8979);
                    if (r7.equals(nodeName)) {
                        b(a, r7, item.getNodeValue());
                    } else if (!C0201.m82(8980).equals(localName) || !r2.equals(namespaceURI)) {
                    }
                }
                i++;
            } else {
                boolean z2 = false;
                for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
                    Node item2 = node.getChildNodes().item(i2);
                    if (!h(item2)) {
                        if (item2.getNodeType() == 1 && !z2) {
                            boolean equals = r2.equals(item2.getNamespaceURI());
                            String localName2 = item2.getLocalName();
                            if (equals && C0201.m82(8982).equals(localName2)) {
                                a.v().s(true);
                            } else if (equals && C0201.m82(8983).equals(localName2)) {
                                x9 v = a.v();
                                v.s(true);
                                v.v(true);
                            } else if (!equals || !C0201.m82(8984).equals(localName2)) {
                                a.v().B(true);
                                if (!equals && !C0201.m82(8985).equals(localName2)) {
                                    String namespaceURI2 = item2.getNamespaceURI();
                                    if (namespaceURI2 != null) {
                                        b(a, C0201.m82(8986), namespaceURI2 + ':' + localName2);
                                    } else {
                                        throw new t8(C0201.m82(8987), 203);
                                    }
                                }
                            } else {
                                x9 v2 = a.v();
                                v2.s(true);
                                v2.v(true);
                                v2.u(true);
                            }
                            l(j9Var, a, item2, false);
                            if (a.r()) {
                                c(a);
                            } else if (a.v().k()) {
                                m9.d(a);
                            }
                            z2 = true;
                        } else if (z2) {
                            C0201.m82(8988);
                            throw t8Var;
                        } else {
                            t8Var = new t8(C0201.m82(8989), 202);
                            throw t8Var;
                        }
                    }
                }
                if (!z2) {
                    throw new t8(C0201.m82(8990), 202);
                }
                return;
            }
        }
        throw new t8(C0201.m82(8981), 202);
    }
}
