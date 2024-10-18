module org.apache.xmlgraphics.batik.awt.util {
    requires java.desktop;

    requires org.apache.xmlgraphics.batik.i18n;
    requires org.apache.xmlgraphics.batik.util;
    requires org.apache.xmlgraphics.commons;

    exports org.apache.batik.ext.awt;
    exports org.apache.batik.ext.awt.color;
    exports org.apache.batik.ext.awt.font;
    exports org.apache.batik.ext.awt.g2d;
    exports org.apache.batik.ext.awt.geom;
    exports org.apache.batik.ext.awt.image;
    exports org.apache.batik.ext.awt.image.renderable;
    exports org.apache.batik.ext.awt.image.rendered;
    exports org.apache.batik.ext.awt.image.spi;
    exports org.apache.batik.ext.swing;
}