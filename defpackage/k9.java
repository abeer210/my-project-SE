package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import vigqyno.C0201;

/* renamed from: k9  reason: default package */
public class k9 {
    private static final Object a = new Object();
    private static DocumentBuilderFactory b = a();

    private static DocumentBuilderFactory a() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        try {
            newInstance.setFeature(C0201.m82(23742), true);
            newInstance.setFeature(C0201.m82(23743), true);
            newInstance.setFeature(C0201.m82(23744), false);
            newInstance.setFeature(C0201.m82(23745), false);
            newInstance.setFeature(C0201.m82(23746), false);
            newInstance.setFeature(C0201.m82(23747), false);
            newInstance.setFeature(C0201.m82(23748), false);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
        } catch (Exception unused) {
        }
        return newInstance;
    }

    private static Object[] b(Node node, boolean z, Object[] objArr) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (7 == item.getNodeType()) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) item;
                if (C0201.m82(23749).equals(processingInstruction.getTarget())) {
                    if (objArr != null) {
                        objArr[2] = processingInstruction.getData();
                    }
                }
            }
            if (!(3 == item.getNodeType() || 7 == item.getNodeType())) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if ((C0201.m82(23750).equals(localName) || C0201.m82(23751).equals(localName)) && C0201.m82(23752).equals(namespaceURI)) {
                    return b(item, false, objArr);
                }
                if (z || !C0201.m82(23753).equals(localName) || !C0201.m82(23754).equals(namespaceURI)) {
                    Object[] b2 = b(item, z, objArr);
                    if (b2 != null) {
                        return b2;
                    }
                } else {
                    if (objArr != null) {
                        objArr[0] = item;
                        objArr[1] = a;
                    }
                    return objArr;
                }
            }
        }
        return null;
    }

    public static v8 c(Object obj, w9 w9Var) throws t8 {
        d9.b(obj);
        if (w9Var == null) {
            w9Var = new w9();
        }
        Object[] b2 = b(e(obj, w9Var), w9Var.l(), new Object[3]);
        if (b2 == null || b2[1] != a) {
            return new j9();
        }
        j9 i = e9.i((Node) b2[0]);
        i.b((String) b2[2]);
        if (!w9Var.k()) {
            n9.h(i, w9Var);
        }
        return i;
    }

    private static Document d(InputSource inputSource) throws t8 {
        try {
            DocumentBuilder newDocumentBuilder = b.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(null);
            return newDocumentBuilder.parse(inputSource);
        } catch (SAXException e) {
            throw new t8(C0201.m82(23757), 201, e);
        } catch (ParserConfigurationException e2) {
            throw new t8(C0201.m82(23756), 0, e2);
        } catch (IOException e3) {
            throw new t8(C0201.m82(23755), 204, e3);
        }
    }

    private static Document e(Object obj, w9 w9Var) throws t8 {
        return obj instanceof InputStream ? g((InputStream) obj, w9Var) : obj instanceof byte[] ? f(new z8((byte[]) obj), w9Var) : h((String) obj, w9Var);
    }

    private static Document f(z8 z8Var, w9 w9Var) throws t8 {
        InputSource inputSource = new InputSource(z8Var.f());
        try {
            if (w9Var.i()) {
                try {
                    b.setFeature(C0201.m82(23758), true);
                } catch (Throwable unused) {
                }
            }
            return d(inputSource);
        } catch (t8 e) {
            if (e.a() == 201 || e.a() == 204) {
                if (w9Var.h()) {
                    z8Var = c9.a(z8Var);
                }
                if (!w9Var.j()) {
                    return d(new InputSource(z8Var.f()));
                }
                try {
                    return d(new InputSource(new a9(new InputStreamReader(z8Var.f(), z8Var.g()))));
                } catch (UnsupportedEncodingException unused2) {
                    throw new t8(C0201.m82(23759), 9, e);
                }
            } else {
                throw e;
            }
        }
    }

    private static Document g(InputStream inputStream, w9 w9Var) throws t8 {
        if (!w9Var.h() && !w9Var.j()) {
            return d(new InputSource(inputStream));
        }
        try {
            return f(new z8(inputStream), w9Var);
        } catch (IOException e) {
            throw new t8(C0201.m82(23760), 204, e);
        }
    }

    private static Document h(String str, w9 w9Var) throws t8 {
        new InputSource(new StringReader(str));
        try {
            if (w9Var.i()) {
                try {
                    b.setFeature(C0201.m82(23761), true);
                } catch (Throwable unused) {
                }
            }
            return d(new InputSource(new StringReader(str)));
        } catch (t8 e) {
            if (e.a() == 201 && w9Var.j()) {
                return d(new InputSource(new a9(new StringReader(str))));
            }
            throw e;
        }
    }
}
