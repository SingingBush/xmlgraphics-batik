/*****************************************************************************
 * Copyright (C) The Apache Software Foundation. All rights reserved.        *
 * ------------------------------------------------------------------------- *
 * This software is published under the terms of the Apache Software License *
 * version 1.1, a copy of which has been included with this distribution in  *
 * the LICENSE file.                                                         *
 *****************************************************************************/

package org.apache.batik.dom.svg;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.batik.css.engine.CSSEngine;
import org.apache.batik.css.engine.CSSStyleSheetNode;
import org.apache.batik.css.engine.StyleSheet;

import org.apache.batik.dom.AbstractDocument;
import org.apache.batik.dom.util.XMLSupport;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.stylesheets.LinkStyle;
import org.w3c.dom.css.DOMImplementationCSS;
import org.w3c.dom.svg.SVGStyleElement;

/**
 * This class implements {@link SVGStyleElement}.
 *
 * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a>
 * @version $Id$
 */
public class SVGOMStyleElement
    extends    SVGOMElement
    implements CSSStyleSheetNode,
               SVGStyleElement,
               LinkStyle {

    /**
     * The attribute initializer.
     */
    protected final static AttributeInitializer attributeInitializer;
    static {
        attributeInitializer = new AttributeInitializer(1);
        attributeInitializer.addAttribute(null,
                                          null,
                                          "xml:space",
                                          "preserve");
    }

    /**
     * The style sheet.
     */
    protected org.w3c.dom.stylesheets.StyleSheet sheet;

    /**
     * The style-sheet.
     */
    protected StyleSheet styleSheet;

    /**
     * Creates a new SVGOMStyleElement object.
     */
    protected SVGOMStyleElement() {
    }

    /**
     * Creates a new SVGOMStyleElement object.
     * @param prefix The namespace prefix.
     * @param owner The owner document.
     */
    public SVGOMStyleElement(String prefix, AbstractDocument owner) {
        super(prefix, owner);

    }

    /**
     * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getLocalName()}.
     */
    public String getLocalName() {
        return SVG_STYLE_TAG;
    }

    /**
     * Returns the associated style-sheet.
     */
    public StyleSheet getCSSStyleSheet() {
        if (styleSheet == null) {
            if (getType().equals("text/css")) {
                SVGOMDocument doc = (SVGOMDocument)getOwnerDocument();
                CSSEngine e = doc.getCSSEngine();
                String text = "";
                Node n = getFirstChild();
                if (n != null) {
                    StringBuffer sb = new StringBuffer();
                    while (n != null) {
                        sb.append(n.getNodeValue());
                        n = n.getNextSibling();
                    }
                    text = sb.toString();
                }
                URL burl = null;
                try {
                    String bu = XMLBaseSupport.getCascadedXMLBase(this);
                    if (bu != null) {
                        burl = new URL(bu);
                    }
                } catch (MalformedURLException ex) {
                    // !!! TODO
                    ex.printStackTrace();
                    throw new InternalError();
                }
                String  media = getAttributeNS(null, SVG_MEDIA_ATTRIBUTE);
                styleSheet = e.parseStyleSheet(text, burl, media);
            }
        }
        return styleSheet;
    }

    /**
     * <b>DOM</b>: Implements {@link
     * org.w3c.dom.stylesheets.LinkStyle#getSheet()}.
     */
    public org.w3c.dom.stylesheets.StyleSheet getSheet() {
        throw new InternalError("Not implemented.");
    }

    /**
     * Returns the URI of the referenced stylesheet.
     */
    public String getStyleSheetURI() {
        return XMLBaseSupport.getCascadedXMLBase(this);
    }

    /**
     * <b>DOM</b>: Implements {@link SVGStyleElement#getXMLspace()}.
     */
    public String getXMLspace() {
        return XMLSupport.getXMLSpace(this);
    }

    /**
     * <b>DOM</b>: Implements {@link SVGStyleElement#setXMLspace(String)}.
     */
    public void setXMLspace(String space) throws DOMException {
        setAttributeNS(XMLSupport.XML_NAMESPACE_URI,
                       XMLSupport.XML_SPACE_ATTRIBUTE,
                       space);
    }

    /**
     * <b>DOM</b>: Implements {@link SVGStyleElement#getType()}.
     */
    public String getType() {
        return getAttributeNS(null, SVG_TYPE_ATTRIBUTE);
    }

    /**
     * <b>DOM</b>: Implements {@link SVGStyleElement#setType(String)}.
     */
    public void setType(String type) throws DOMException {
        setAttributeNS(null, SVG_TYPE_ATTRIBUTE, type);
    }

    /**
     * <b>DOM</b>: Implements {@link SVGStyleElement#getMedia()}.
     */
    public String getMedia() {
        return getAttribute(SVG_MEDIA_ATTRIBUTE);
    }

    /**
     * <b>DOM</b>: Implements {@link SVGStyleElement#setMedia(String)}.
     */
    public void setMedia(String media) throws DOMException {
        setAttribute(SVG_MEDIA_ATTRIBUTE, media);
    }

    /**
     * <b>DOM</b>: Implements {@link SVGStyleElement#getTitle()}.
     */
    public String getTitle() {
        return getAttribute(SVG_TITLE_ATTRIBUTE);
    }

    /**
     * <b>DOM</b>: Implements {@link SVGStyleElement#setTitle(String)}.
     */
    public void setTitle(String title) throws DOMException {
        setAttribute(SVG_TITLE_ATTRIBUTE, title);
    }

    /**
     * Returns the AttributeInitializer for this element type.
     * @return null if this element has no attribute with a default value.
     */
    protected AttributeInitializer getAttributeInitializer() {
        return attributeInitializer;
    }

    /**
     * Returns a new uninitialized instance of this object's class.
     */
    protected Node newNode() {
        return new SVGOMStyleElement();
    }
}
