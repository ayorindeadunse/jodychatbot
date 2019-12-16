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
import jodychatbot.org.alicebot.server.core.util.Substituter;

// Referenced classes of package org.alicebot.server.core.processor:
//            AIMLProcessor, ProcessorException

public class PersonProcessor extends AIMLProcessor
{

    public PersonProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
    {
        if(xmlnode.XMLType == 0)
            try
            {
                return templateparser.processResponse(applySubstitutions(templateparser.evaluate(i++, xmlnode.XMLChild), templateparser.getBotID()));
            }
            catch(ProcessorException processorexception)
            {
                return "";
            }
        else
            return templateparser.shortcutTag(i, "person", 0, "", "star", 1);
    }

    public static String applySubstitutions(String s, String s1)
    {
        return Substituter.applySubstitutions(Bots.getBot(s1).getPersonSubstitutionsMap(), s);
    }

    public static final String label = "person";
}

