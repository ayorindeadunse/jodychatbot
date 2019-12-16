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
import java.util.HashMap;
import jodychatbot.org.alicebot.server.core.*;
import jodychatbot.org.alicebot.server.core.parser.TemplateParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;
import jodychatbot.org.alicebot.server.core.util.Substituter;

// Referenced classes of package org.alicebot.server.core.processor:
//            AIMLProcessor, ProcessorException, AIMLProcessorException

public class GenderProcessor extends AIMLProcessor
{

    public GenderProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException
    {
        if(xmlnode.XMLType == 0)
            try
            {
                return templateparser.processResponse(applySubstitutions(templateparser.evaluate(i++, xmlnode.XMLChild), templateparser.getBotID()));
            }
            catch(ProcessorException processorexception)
            {
                throw (AIMLProcessorException)processorexception;
            }
        if(xmlnode.XMLType == 1)
        {
            if(!Globals.supportDeprecatedTags())
                return templateparser.shortcutTag(i, "gender", 0, "", "star", 1);
            else
                return templateparser.shortcutTag(i, "bot", 1, "name=\"gender\"", "", 1);
        } else
        {
            throw new AIMLProcessorException("Invalid gender element!");
        }
    }

    public static String applySubstitutions(String s, String s1)
    {
        return Substituter.applySubstitutions(Bots.getBot(s1).getGenderSubstitutionsMap(), s);
    }

    public static void addSubstitution(String s, String s1)
    {
        if(s != null && s1 != null)
            substitutionMap.put(s.toUpperCase(), s1);
    }

    public static final String label = "gender";
    private static HashMap substitutionMap = new HashMap();

}