/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.responder;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.PredicateMaster;
import jodychatbot.org.alicebot.server.core.logging.Log;
import jodychatbot.org.alicebot.server.core.util.Toolkit;

public class ResponderStandardLogger
{

    public ResponderStandardLogger()
    {
    }

    public static void log(String s, String s1, String s2, String s3, String s4)
    {
        String as[] = Toolkit.breakLines(s);
        String s5 = PredicateMaster.get(Globals.getClientNamePredicate(), s3, s4);
        for(int i = 0; i < as.length; i++)
            Log.log(s5 + "> " + as[i], Log.CHAT);

        as = Toolkit.breakLines(s1);
        for(int j = 0; j < as.length; j++)
            Log.log(s4 + "> " + as[j], Log.CHAT);

    }

    protected static final String PROMPT = "> ";
}