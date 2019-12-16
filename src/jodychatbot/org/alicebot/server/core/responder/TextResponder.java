/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.responder;

import jodychatbot.org.alicebot.server.core.Globals;
/**
 *
 * @author ayorindeadunse
 */
public class TextResponder implements Responder
{
    public TextResponder()
    {
    }
    
    public String preprocess(String s, String s1)
    {
        return s;
    }
    
    public String append(String s, String s1, String s2)
    {
        if(s2.length() > 0)
            return s2 + " " + s1;
        else
            return s2 + s1;
    }
    
    public void log(String s, String s1, String s2, String s3, String s4)
    {
        if(LOG_CHAT_TO_DATABASE)
            ResponderDatabaseLogger.log(s, s1, s2, s3, s4);
        if(LOG_CHAT_TO_XML)
            ResponderXMLLogger.log(s, s1, s2, s3, s4);
    }
    
      public String postprocess(String s)
    {
        return s;
    }
      
    protected static final String SPACE = " ";
    private static final boolean LOG_CHAT_TO_DATABASE = Boolean.valueOf(Globals.getProperty("programd.logging.to-database.chat", "false")).booleanValue();
    private static final boolean LOG_CHAT_TO_XML = Boolean.valueOf(Globals.getProperty("programd.logging.to-xml.chat", "true")).booleanValue();
}
