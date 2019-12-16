/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.processor;

/**
 *
 * @author ayorindeadunse
 */

import jodychatbot.org.alicebot.server.core.PredicateMaster;
import jodychatbot.org.alicebot.server.core.parser.TemplateParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;
import jodychatbot.org.alicebot.server.core.util.Toolkit;

// Referenced classes of package org.alicebot.server.core.processor:
//            AIMLProcessor, AIMLProcessorException

public class GetProcessor extends AIMLProcessor
{

    public GetProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException
    {
        if(xmlnode.XMLType == 1)
        {
            String s = Toolkit.getAttributeValue("name", xmlnode.XMLAttr);
            if(s.equals(""))
                throw new AIMLProcessorException("<get/> must have a non-empty name attribute.");
            else
                return PredicateMaster.get(s, templateparser.getUserID(), templateparser.getBotID());
        } else
        {
            throw new AIMLProcessorException("<get/> cannot have content!");
        }
    }

    public static final String label = "get";
}

