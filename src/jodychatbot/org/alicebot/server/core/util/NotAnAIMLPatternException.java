/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.util;

/**
 *
 * @author ayorindeadunse
 */
public class NotAnAIMLPatternException extends Exception
{

    public NotAnAIMLPatternException(String s, String s1)
    {
        super(s);
        pattern = s1;
    }

    public String getMessage()
    {
        return "Not an AIML pattern: \"" + pattern + "\" - " + super.getMessage();
    }

    private String pattern;
    private static final String MSG_PART_ONE = "Not an AIML pattern: \"";
    private static final String MSG_PART_TWO = "\" - ";
}
