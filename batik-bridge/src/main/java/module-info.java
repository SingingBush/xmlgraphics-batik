module org.apache.xmlgraphics.batik.bridge {
    requires java.desktop;
    requires java.xml;
    requires xml.apis.ext;
    requires jdk.xml.dom;

    requires org.mozilla.rhino;

    requires org.apache.xmlgraphics.batik.anim;
    requires org.apache.xmlgraphics.batik.awt.util;
    requires org.apache.xmlgraphics.batik.constants;
    requires org.apache.xmlgraphics.batik.css;
    requires org.apache.xmlgraphics.batik.dom;
    requires org.apache.xmlgraphics.batik.ext;
    requires org.apache.xmlgraphics.batik.gvt;
    requires org.apache.xmlgraphics.batik.i18n;
    requires org.apache.xmlgraphics.batik.parser;
    requires org.apache.xmlgraphics.batik.script;
    requires org.apache.xmlgraphics.batik.svgdom;
    requires org.apache.xmlgraphics.batik.util;
    requires org.apache.xmlgraphics.batik.xml;

    exports org.apache.batik.bridge;
    exports org.apache.batik.bridge.svg12;

    provides org.apache.batik.script.InterpreterFactory with org.apache.batik.bridge.RhinoInterpreterFactory;
}