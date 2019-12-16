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
import jodychatbot.org.alicebot.server.core.parser.*;

// Referenced classes of package org.alicebot.server.core.processor:
//            Processor, ProcessorException, AIMLProcessorException

public abstract class AIMLProcessor extends Processor
{

    public AIMLProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, GenericParser genericparser)
        throws ProcessorException
    {
        try
        {
            return process(i, xmlnode, (TemplateParser)genericparser);
        }
        catch(ClassCastException classcastexception)
        {
            throw new ProcessorException("Tried to pass a non-TemplateParser to an AIMLProcessor.");
        }
    }

    public abstract String process(int i, XMLNode xmlnode, TemplateParser templateparser)
        throws AIMLProcessorException;
}
