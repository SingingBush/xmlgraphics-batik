module org.apache.xmlgraphics.batik.css {
    requires java.desktop;
    requires xml.apis.ext;
    requires jdk.xml.dom;

    requires org.apache.xmlgraphics.batik.constants;
    requires org.apache.xmlgraphics.batik.i18n;
    requires org.apache.xmlgraphics.batik.util;

    requires org.apache.xmlgraphics.commons;

    exports org.apache.batik.css.dom;
    exports org.apache.batik.css.engine;
//    exports org.apache.batik.css.engine.sac;
    exports org.apache.batik.css.engine.value;
    exports org.apache.batik.css.engine.value.css2;
    exports org.apache.batik.css.engine.value.svg;
    exports org.apache.batik.css.engine.value.svg12;
    exports org.apache.batik.css.parser;
}