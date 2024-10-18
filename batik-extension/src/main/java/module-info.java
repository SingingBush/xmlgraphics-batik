module org.apache.xmlgraphics.batik.extension {
    requires java.desktop;
    requires java.xml;
    requires jdk.xml.dom;
    requires xml.apis.ext;

    requires org.apache.xmlgraphics.batik.anim;
    requires org.apache.xmlgraphics.batik.awt.util;
    requires org.apache.xmlgraphics.batik.bridge;
    requires org.apache.xmlgraphics.batik.constants;
    requires org.apache.xmlgraphics.batik.dom;
    requires org.apache.xmlgraphics.batik.gvt;
    requires org.apache.xmlgraphics.batik.parser;
    requires org.apache.xmlgraphics.batik.svgdom;
    requires org.apache.xmlgraphics.batik.css;
    requires org.apache.xmlgraphics.batik.util;

    exports org.apache.batik.extension;
    exports org.apache.batik.extension.svg;

    provides org.apache.batik.bridge.BridgeExtension with org.apache.batik.extension.svg.BatikBridgeExtension;
    provides org.apache.batik.dom.DomExtension with org.apache.batik.extension.svg.BatikDomExtension;
}