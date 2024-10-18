module org.apache.xmlgraphics.batik.parser {
    requires java.desktop;
    requires xml.apis.ext;

    requires org.apache.xmlgraphics.batik.awt.util;
    requires org.apache.xmlgraphics.batik.i18n;
    requires org.apache.xmlgraphics.batik.util;
    requires org.apache.xmlgraphics.batik.xml;

    exports org.apache.batik.parser;
}