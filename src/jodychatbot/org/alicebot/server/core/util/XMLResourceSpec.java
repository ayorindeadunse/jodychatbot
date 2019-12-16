/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.util;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.Globals;

public class XMLResourceSpec
    implements Cloneable
{

    public XMLResourceSpec()
    {
        rolloverAtMax = false;
        rolloverAtRestart = false;
    }

    public Object clone()
    {
        XMLResourceSpec xmlresourcespec = new XMLResourceSpec();
        xmlresourcespec.description = description != null ? new String(description) : null;
        xmlresourcespec.path = path != null ? new String(path) : null;
        xmlresourcespec.root = root != null ? new String(root) : null;
        xmlresourcespec.stylesheet = stylesheet != null ? new String(stylesheet) : null;
        xmlresourcespec.encoding = encoding != null ? new String(encoding) : null;
        xmlresourcespec.dtd = dtd != null ? new String(dtd) : null;
        xmlresourcespec.backlink = backlink != null ? new String(backlink) : null;
        xmlresourcespec.starttime = starttime != null ? new String(starttime) : null;
        xmlresourcespec.rolloverAtMax = rolloverAtMax;
        xmlresourcespec.rolloverAtRestart = rolloverAtRestart;
        return xmlresourcespec;
    }

    public String description;
    public String path;
    public String root;
    public String stylesheet;
    public String encoding;
    public String dtd;
    public String backlink;
    public String starttime;
    public boolean rolloverAtMax;
    public boolean rolloverAtRestart;
    private static final String RESOURCE_BASE = Globals.getProperty("programd.logging.xml.resource-base", "../resources/");
    public static final String HTML_ENTITIES_DTD = "<!DOCTYPE ALLOW_HTML_ENTITIES [ <!ENTITY % HTMLlat1 PUBLIC \"-//W3C//ENTITIES Latin1//EN//HTML\"   \"" + RESOURCE_BASE + "DTD/xhtml-lat1.ent\">" + " %HTMLlat1;" + " <!ENTITY % HTMLsymbol PUBLIC" + "   \"-//W3C//ENTITIES Symbols//EN//HTML\"" + "   \"" + RESOURCE_BASE + "DTD/xhtml-symbol.ent\">" + " %HTMLsymbol;" + " <!ENTITY % HTMLspecial PUBLIC" + "   \"-//W3C//ENTITIES Special//EN//HTML\"" + "   \"" + RESOURCE_BASE + "DTD/xhtml-special.ent\">" + " %HTMLspecial;" + " ]>";

}

