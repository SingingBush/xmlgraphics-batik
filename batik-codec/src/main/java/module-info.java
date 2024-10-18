module org.apache.xmlgraphics.batik.codec {
    requires java.desktop;

    requires org.apache.xmlgraphics.batik.awt.util;
    requires org.apache.xmlgraphics.batik.bridge;
    requires org.apache.xmlgraphics.batik.util;
    requires org.apache.xmlgraphics.batik.transcoder;
    requires org.apache.xmlgraphics.batik.i18n;

    exports org.apache.batik.ext.awt.image.codec.imageio;
    exports org.apache.batik.ext.awt.image.codec.png;
    exports org.apache.batik.ext.awt.image.codec.util;

    provides org.apache.batik.ext.awt.image.spi.ImageWriter with
            org.apache.batik.ext.awt.image.codec.imageio.ImageIOPNGImageWriter,
            org.apache.batik.ext.awt.image.codec.imageio.ImageIOTIFFImageWriter,
            org.apache.batik.ext.awt.image.codec.imageio.ImageIOJPEGImageWriter;

    provides org.apache.batik.ext.awt.image.spi.RegistryEntry with
            org.apache.batik.ext.awt.image.codec.png.PNGRegistryEntry,
            org.apache.batik.ext.awt.image.codec.imageio.ImageIOJPEGRegistryEntry,
            org.apache.batik.ext.awt.image.codec.imageio.ImageIOPNGRegistryEntry,
            org.apache.batik.ext.awt.image.codec.imageio.ImageIOTIFFRegistryEntry;
}