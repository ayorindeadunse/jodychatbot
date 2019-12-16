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
import jodychatbot.org.alicebot.server.core.Bots;
import jodychatbot.org.alicebot.server.core.logging.Log;
import jodychatbot.org.alicebot.server.core.parser.StartupFileParser;
import jodychatbot.org.alicebot.server.core.parser.XMLNode;
import jodychatbot.org.alicebot.server.core.util.Toolkit;

// Referenced classes of package org.alicebot.server.core.processor.loadtime:
//            StartupElementProcessor, InvalidStartupElementException

public class BotProcessor extends StartupElementProcessor
{

    public BotProcessor()
    {
    }

    public String process(int i, XMLNode xmlnode, StartupFileParser startupfileparser)
        throws InvalidStartupElementException
    {
        String s = Toolkit.getAttributeValue("id", xmlnode.XMLAttr);
        if(!s.equals("") && Boolean.valueOf(Toolkit.getAttributeValue("enabled", xmlnode.XMLAttr)).booleanValue())
        {
            if(!Bots.knowsBot(s))
            {
                Bot bot = new Bot(s);
                Log.userinfo("Configuring bot \"" + s + "\".", Log.STARTUP);
                startupfileparser.setCurrentBot(bot);
                Bots.addBot(s, bot);
                return startupfileparser.evaluate(i++, xmlnode.XMLChild);
            } else
            {
                Log.userinfo("Bot \"" + s + "\" has already been configured.", Log.STARTUP);
                return "";
            }
        } else
        {
            return "";
        }
    }

    public static final String label = "bot";
}
