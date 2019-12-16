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
import jodychatbot.org.alicebot.server.core.Bot;
import jodychatbot.org.alicebot.server.core.Graphmaster;
import jodychatbot.org.alicebot.server.core.parser.StartupFileParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;

// Referenced classes of package org.alicebot.server.core.processor.loadtime:
//            StartupElementProcessor, InvalidStartupElementException

public class LearnProcessor extends StartupElementProcessor
{

    public LearnProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, StartupFileParser startupfileparser)
        throws InvalidStartupElementException
    {
        if(xmlnode.XMLType == 0)
        {
            Graphmaster.load(startupfileparser.evaluate(i++, xmlnode.XMLChild), startupfileparser.getCurrentBot().getID());
            return "";
        } else
        {
            throw new InvalidStartupElementException("<learn></learn> must have content!");
        }
    }

    public static final String label = "learn";
}

