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
import jodychatbot.org.alicebot.server.core.Bot;
import jodychatbot.org.alicebot.server.core.Bots;
import jodychatbot.org.alicebot.server.core.parser.TemplateParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;
import jodychatbot.org.alicebot.server.core.util.Toolkit;

// Referenced classes of package org.alicebot.server.core.processor:
//            AIMLProcessor, AIMLProcessorException

public class BotProcessor extends AIMLProcessor
{

    public BotProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException
    {
        if(xmlnode.XMLType == 1)
        {
            String s = Toolkit.getAttributeValue("name", xmlnode.XMLAttr);
            if(s.equals(""))
                return s;
            else
                return Bots.getBot(templateparser.getBotID()).getPropertyValue(s);
        } else
        {
            throw new AIMLProcessorException("<bot/> cannot contain element content!");
        }
    }

    public static final String label = "bot";
}

