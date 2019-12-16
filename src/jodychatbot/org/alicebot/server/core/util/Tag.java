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
public class Tag
{

    public Tag(String s)
    {
        name = s;
        toString = "<" + s + ">";
    }

    public String toString()
    {
        return toString;
    }

    public String getName()
    {
        return name;
    }

    private static final String LEFT_ANGLE_BRACKET = "<";
    private static final String RIGHT_ANGLE_BRACKET = ">";
    private String name;
    private String toString;
}

