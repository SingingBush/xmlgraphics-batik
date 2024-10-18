module org.apache.xmlgraphics.batik.anim {
    requires java.desktop;
    requires java.xml;
    requires xml.apis.ext;
    requires jdk.xml.dom;

    requires org.apache.xmlgraphics.batik.awt.util;
    requires org.apache.xmlgraphics.batik.constants;
    requires org.apache.xmlgraphics.batik.css;
    requires org.apache.xmlgraphics.batik.dom;
    requires org.apache.xmlgraphics.batik.ext;
    requires org.apache.xmlgraphics.batik.i18n;
    requires org.apache.xmlgraphics.batik.parser;
    requires org.apache.xmlgraphics.batik.svgdom;
    requires org.apache.xmlgraphics.batik.util;

    exports org.apache.batik.anim;
    exports org.apache.batik.anim.dom;
    exports org.apache.batik.anim.timing;
    exports org.apache.batik.anim.values;
}