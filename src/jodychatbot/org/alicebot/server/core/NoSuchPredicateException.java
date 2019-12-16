/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core;

/**
 *
 * @author ayorindeadunse
 */
public class NoSuchPredicateException extends Exception
{

    public NoSuchPredicateException(String s)
    {
        name = s;
    }

    public NoSuchPredicateException(String s, int i)
    {
        name = s;
        index = i;
    }

    public String getMessage()
    {
        if(index != -1)
            return "No predicate with name \"" + name + "\" with a value at index " + index + ".";
        else
            return "No predicate with name \"" + name + "\".";
    }

    private static String name;
    private static int index = -1;

}