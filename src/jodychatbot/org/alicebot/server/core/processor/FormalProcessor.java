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
import java.util.StringTokenizer;
import jodychatbot.org.alicebot.server.core.parser.TemplateParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;

// Referenced classes of package org.alicebot.server.core.processor:
//            AIMLProcessor, AIMLProcessorException

public class FormalProcessor extends AIMLProcessor
{

    public FormalProcessor()
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
            StringTokenizer stringtokenizer = new StringTokenizer(s, " ");
            StringBuffer stringbuffer = new StringBuffer(s.length());
            String s1;
            for(; stringtokenizer.hasMoreTokens(); stringbuffer.append(s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase()))
            {
                s1 = stringtokenizer.nextToken();
                if(stringbuffer.length() > 0)
                    stringbuffer.append(" ");
            }

            return stringbuffer.toString();
        } else
        {
            throw new AIMLProcessorException("<formal></formal> must have content!");
        }
    }

    public static final String label = "formal";
    private static final String SPACE = " ";
}

