/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.processor.loadtime;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.Bot;
import jodychatbot.org.alicebot.server.core.parser.StartupFileParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;
import jodychatbot.org.alicebot.server.core.util.Toolkit;

// Referenced classes of package org.alicebot.server.core.processor.loadtime:
//            StartupElementProcessor, InvalidStartupElementException

public class PropertyProcessor extends StartupElementProcessor
{

    public PropertyProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, StartupFileParser startupfileparser)
        throws InvalidStartupElementException
    {
        if(xmlnode.XMLType == 1)
        {
            String s = Toolkit.getAttributeValue("name", xmlnode.XMLAttr);
            if(!s.equals(""))
            {
                String s1 = Toolkit.getAttributeValue("value", xmlnode.XMLAttr);
                startupfileparser.getCurrentBot().setPropertyValue(s, s1);
            }
        } else
        {
            throw new InvalidStartupElementException("<property/> cannot have contents!");
        }
        return "";
    }

    public static final String label = "property";
}

