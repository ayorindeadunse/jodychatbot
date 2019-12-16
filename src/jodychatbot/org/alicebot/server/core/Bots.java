/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayorindeadunse
 */
package jodychatbot.org.alicebot.server.core;

import java.util.*;
import jodychatbot.org.alicebot.server.core.util.DeveloperError;
/**
 *
 * @author ayorindeadunse
 */
public class Bots extends HashMap 
{
    private Bots()
    {
    }
    public static boolean knowsBot(String s)
    {
        return myself.get(s) != null;
    }
    
      public static void addBot(String s, Bot bot)
    {
        myself.put(s, bot);
    }
    public static Bot getBot(String s)
    {
       Bot bot;
        try
        {
            bot = (Bot)myself.get(s);
        }
        catch(ClassCastException classcastexception)
        {
            throw new DeveloperError("Something other than a Bot stored in Bots!");
        }
        if(bot == null)
            throw new DeveloperError("Tried to get unknown bot \"" + s + "\".");
        else
            return bot; 
    }
    
    public static Bot getFirstBot()
    {
        if(myself.size() > 0)
            return (Bot)myself.values().iterator().next();
        else
            return null;
    }
    
      public static int getCount()
    {
        return myself.size();
    }
        public static String getNiceList()
    {
        if(myself.size() == 0)
            return "";
        StringBuffer stringbuffer = new StringBuffer();
        for(Iterator iterator = myself.keySet().iterator(); iterator.hasNext(); stringbuffer.append((String)iterator.next()))
            if(stringbuffer.length() > 0)
                stringbuffer.append(' ');

        return stringbuffer.toString();
    }
  public static Set getIDs()
    {
        return myself.keySet();
    }

    public static Iterator keysIterator()
    {
        return myself.keySet().iterator();
    }
    private static final Bots myself = new Bots();
}
