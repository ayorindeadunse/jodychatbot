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
//            IndexedPredicateProcessor, AIMLProcessorException

public class ThatStarProcessor extends IndexedPredicateProcessor
{

    public ThatStarProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException
    {
        if(xmlnode.XMLType == 1)
            return super.process(i, xmlnode, templateparser, templateparser.getThatStars(), 1);
        else
            throw new AIMLProcessorException("<thatstar/> cannot have content!");
    }

    public static final String label = "thatstar";
}