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
// Referenced classes of package org.alicebot.server.core.responder:
//            Responder, ResponderXMLLogger

public class AIMResponder
    implements Responder
{

    public AIMResponder()
    {
    }

    public String preprocess(String s, String s1)
    {
        return s;
    }

    public String append(String s, String s1, String s2)
    {
        return s2 + s1;
    }

    public void log(String s, String s1, String s2, String s3, String s4)
    {
        ResponderXMLLogger.log(s, s1, s2, s3, s4);
    }

    public String postprocess(String s)
    {
        String s1 = "";
        if(s.length() > 1024)
            s1 = "Huh?";
        else
            s1 = s;
        return s1;
    }

    private static final String EMPTY_STRING = "";
}

