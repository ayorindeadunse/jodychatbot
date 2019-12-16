/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.processor.loadtime;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.parser.*;
import jodychatbot.org.alicebot.server.core.processor.Processor;
import jodychatbot.org.alicebot.server.core.processor.ProcessorException;
import jodychatbot.org.alicebot.server.core.util.Toolkit;

// Referenced classes of package org.alicebot.server.core.processor.loadtime:
//            InvalidStartupElementException

public abstract class StartupElementProcessor extends Processor
{

    public StartupElementProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, GenericParser genericparser)
        throws ProcessorException
    {
        try
        {
            return process(i, xmlnode, (StartupFileParser)genericparser);
        }
        catch(ClassCastException classcastexception)
        {
            throw new ProcessorException("Tried to pass a non-StartupFileParser to a StartupElementProcessor.");
        }
    }

    public abstract String process(int i, XMLNode xmlnode, StartupFileParser startupfileparser)
        throws InvalidStartupElementException;

    protected String getHref(XMLNode xmlnode)
    {
        return Toolkit.getAttributeValue("href", xmlnode.XMLAttr);
    }

    protected static final String HREF = "href";
}

