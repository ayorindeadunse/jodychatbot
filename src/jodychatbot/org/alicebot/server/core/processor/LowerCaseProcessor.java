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

public class LowerCaseProcessor extends AIMLProcessor
{

    public LowerCaseProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException
    {
        if(xmlnode.XMLType == 0)
            return templateparser.evaluate(i++, xmlnode.XMLChild).toLowerCase();
        else
            throw new AIMLProcessorException("<lowercase></lowercase> must have content!");
    }

    public static final String label = "lowercase";
}

