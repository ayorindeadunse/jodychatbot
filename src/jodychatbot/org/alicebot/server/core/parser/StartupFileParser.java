/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.parser;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.Bot;
import jodychatbot.org.alicebot.server.core.processor.loadtime.StartupElementProcessorRegistry;

// Referenced classes of package org.alicebot.server.core.parser:
//            GenericParser

public class StartupFileParser extends GenericParser
{

    public StartupFileParser()
    {
        super.processorRegistry = StartupElementProcessorRegistry.getSelf();
    }

    public void setCurrentBot(Bot bot)
    {
        currentBot = bot;
    }

    public Bot getCurrentBot()
    {
        return currentBot;
    }

    private Bot currentBot;
}