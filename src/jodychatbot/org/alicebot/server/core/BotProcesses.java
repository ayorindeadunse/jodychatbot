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
import jodychatbot.org.alicebot.server.core.util.Trace;

// Referenced classes of package org.alicebot.server.core:
//            BotProcess

public class BotProcesses
{

    public static void start(BotProcess botprocess, String s)
    {
        registry.put(s, botprocess);
        Thread thread = new Thread(botprocess, s);
        thread.setDaemon(true);
        thread.start();
    }

    public static Iterator getRegistryIterator()
    {
        return registry.values().iterator();
    }

    public static BotProcess get(String s)
    {
        return (BotProcess)registry.get(s);
    }

    public static void shutdownAll()
    {
        Trace.userinfo("Shutting down all BotProcesses.");
        BotProcess botprocess;
        for(Iterator iterator = registry.values().iterator(); iterator.hasNext(); botprocess.shutdown())
        {
            botprocess = (BotProcess)iterator.next();
            Trace.userinfo("Shutting down " + botprocess);
        }

        Trace.userinfo("Finished shutting down BotProcesses.");
    }

    private BotProcesses()
    {
    }

    private static HashMap registry = new HashMap();

}
