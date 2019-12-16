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
public class NoMatchException extends Exception
{

    public NoMatchException(String s)
    {
        path = s;
    }

    public String getMessage()
    {
        return "No match found for path \"" + path + "\".";
    }

    private static String path;
}