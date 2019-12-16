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
import jodychatbot.org.alicebot.server.core.util.LRUCache;
import jodychatbot.org.alicebot.server.core.util.MersenneTwisterFast;

// Referenced classes of package org.alicebot.server.core.processor:
//            AIMLProcessor, AIMLProcessorException

public class RandomProcessor extends AIMLProcessor
{

    public RandomProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException
    {
        if(xmlnode.XMLType == 0)
        {
            if(xmlnode.XMLChild == null)
                return "";
            String s = templateparser.getBotID() + templateparser.getUserID() + xmlnode.toString();
            MersenneTwisterFast mersennetwisterfast = (MersenneTwisterFast)generators.get(s);
            if(mersennetwisterfast == null)
            {
                mersennetwisterfast = new MersenneTwisterFast(System.currentTimeMillis());
                generators.put(s, mersennetwisterfast);
            }
            int j = templateparser.nodeCount("li", xmlnode.XMLChild, false);
            if(j == 0)
                return "";
            if(j == 1)
                return templateparser.evaluate(i++, templateparser.getNode("li", xmlnode.XMLChild, 1).XMLChild);
            else
                return templateparser.evaluate(i++, templateparser.getNode("li", xmlnode.XMLChild, mersennetwisterfast.nextInt(j) + 1).XMLChild);
        } else
        {
            throw new AIMLProcessorException("<random></random> must have content!");
        }
    }

    public static final String label = "random";
    private static final String LI = "li";
    private static final LRUCache generators = new LRUCache(100);

}
