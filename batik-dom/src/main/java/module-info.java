module org.apache.xmlgraphics.batik.dom {
    requires java.desktop;
    requires xml.apis.ext;
    requires jdk.xml.dom;

    requires org.apache.xmlgraphics.batik.constants;
    requires org.apache.xmlgraphics.batik.css;
    requires org.apache.xmlgraphics.batik.ext;
    requires org.apache.xmlgraphics.batik.i18n;
    requires org.apache.xmlgraphics.batik.util;
    requires org.apache.xmlgraphics.batik.xml;

    exports org.apache.batik.dom;
    exports org.apache.batik.dom.events;
    exports org.apache.batik.dom.traversal;
    exports org.apache.batik.dom.util;
    exports org.apache.batik.dom.xbl;
}