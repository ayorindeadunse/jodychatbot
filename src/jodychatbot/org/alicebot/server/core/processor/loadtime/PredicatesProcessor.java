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
import java.io.File;
import jodychatbot.org.alicebot.server.core.Graphmaster;
import jodychatbot.org.alicebot.server.core.parser.StartupFileParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;
import jodychatbot.org.alicebot.server.core.processor.ProcessorException;
import jodychatbot.org.alicebot.server.core.util.Toolkit;
import jodychatbot.org.alicebot.server.core.util.UserError;

// Referenced classes of package org.alicebot.server.core.processor.loadtime:
//            StartupElementProcessor, InvalidStartupElementException

public class PredicatesProcessor extends StartupElementProcessor
{

    public PredicatesProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, StartupFileParser startupfileparser)
        throws InvalidStartupElementException
    {
        String s = getHref(xmlnode);
        if(s.length() > 0)
            try
            {
                return startupfileparser.processResponse(Toolkit.getFileContents(Graphmaster.getWorkingDirectory() + File.separator + s));
            }
            catch(ProcessorException processorexception)
            {
                throw new UserError(processorexception);
            }
        else
            return startupfileparser.evaluate(i++, xmlnode.XMLChild);
    }

    public static final String label = "predicates";
}

