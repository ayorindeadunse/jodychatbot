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
import jodychatbot.org.alicebot.server.core.parser.TemplateParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;

// Referenced classes of package org.alicebot.server.core.processor:
//            AIMLProcessor, AIMLProcessorException

public class SentenceProcessor extends AIMLProcessor
{

    public SentenceProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException
    {
        if(xmlnode.XMLType == 0)
        {
            String s = templateparser.evaluate(i++, xmlnode.XMLChild);
            if(s.equals(""))
                return s;
            if(s.trim().length() > 1)
                return s.substring(0, 1).toUpperCase() + s.substring(1);
            else
                return s;
        } else
        {
            throw new AIMLProcessorException("<sentence></sentence> must have content!");
        }
    }

    public static final String label = "sentence";
}

