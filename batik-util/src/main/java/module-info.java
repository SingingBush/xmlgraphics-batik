
module org.apache.xmlgraphics.batik.util {
    requires java.desktop;

    requires org.apache.xmlgraphics.batik.constants;
    requires org.apache.xmlgraphics.batik.i18n;

    exports org.apache.batik;
    exports org.apache.batik.util;
    exports org.apache.batik.util.io;
    exports org.apache.batik.util.resources;
}