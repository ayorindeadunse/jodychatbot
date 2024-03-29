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
import jodychatbot.org.alicebot.server.core.*;
import jodychatbot.org.alicebot.server.core.logging.Log;
import jodychatbot.org.alicebot.server.core.parser.StartupFileParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;
import jodychatbot.org.alicebot.server.core.processor.ProcessorException;
import jodychatbot.org.alicebot.server.core.util.Toolkit;
import jodychatbot.org.alicebot.server.core.util.UserError;

// Referenced classes of package org.alicebot.server.core.processor.loadtime:
//            StartupElementProcessor, InvalidStartupElementException

public class SentenceSplittersProcessor extends StartupElementProcessor
{

    public SentenceSplittersProcessor()
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
        Bot bot = startupfileparser.getCurrentBot();
        int j = startupfileparser.nodeCount("splitter", xmlnode.XMLChild, true);
        for(int k = j; --k > 0;)
        {
            XMLNode xmlnode1 = startupfileparser.getNode("splitter", xmlnode.XMLChild, k);
            if(xmlnode1.XMLType == 1)
            {
                String s1 = Toolkit.getAttributeValue("value", xmlnode1.XMLAttr);
                if(s1 != null)
                    bot.addSentenceSplitter(s1);
            } else
            {
                throw new InvalidStartupElementException("<splitter/> cannot have content!");
            }
        }

        if(Globals.showConsole())
            Log.userinfo("Loaded " + j + " " + xmlnode.XMLData + ".", Log.STARTUP);
        return "";
    }

    public static final String label = "sentence-splitters";
    private static final String SPLITTER = "splitter";
}
