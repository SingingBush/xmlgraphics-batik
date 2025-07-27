module org.apache.xmlgraphics.batik.transcoder {
    requires java.desktop;
    requires java.xml;
    requires xml.apis.ext;

    requires org.apache.xmlgraphics.batik.anim;
    requires org.apache.xmlgraphics.batik.awt.util;
    requires org.apache.xmlgraphics.batik.bridge;
    requires org.apache.xmlgraphics.batik.dom;
    requires org.apache.xmlgraphics.batik.gvt;
    requires org.apache.xmlgraphics.batik.i18n;
    requires org.apache.xmlgraphics.batik.svggen;
    requires org.apache.xmlgraphics.batik.util;
    requires org.apache.xmlgraphics.batik.xml;

    exports org.apache.batik.transcoder;
    exports org.apache.batik.transcoder.image;
//    exports org.apache.batik.transcoder.keys;
//    exports org.apache.batik.transcoder.print;
    exports org.apache.batik.transcoder.svg2svg;
    exports org.apache.batik.transcoder.wmf;
}