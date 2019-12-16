/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.processor.loadtime;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.util.ClassRegistry;

public class StartupElementProcessorRegistry extends ClassRegistry
{

    private StartupElementProcessorRegistry()
    {
        super("4.1.8", PROCESSOR_LIST, "jodychatbot.org.alicebot.server.core.processor.loadtime.StartupElementProcessor");
    }

    public static StartupElementProcessorRegistry getSelf()
    {
        return self;
    }

    private static final String VERSION = "4.1.8";
    private static final String PROCESSOR_LIST[] = {
        "jodychatbot.org.alicebot.server.core.processor.loadtime.BotProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.BotsProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.GenderProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.InputProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.LearnProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.ListenerProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.ListenersProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.PersonProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.Person2Processor", "jodychatbot.org.alicebot.server.core.processor.loadtime.PredicateProcessor", 
        "jodychatbot.org.alicebot.server.core.processor.loadtime.PredicatesProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.PropertiesProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.PropertyProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.SentenceSplittersProcessor", "jodychatbot.org.alicebot.server.core.processor.loadtime.SubstitutionsProcessor"
    };
    private static final String PROCESSOR_BASE_CLASS_NAME = "jodychatbot.org.alicebot.server.core.processor.loadtime.StartupElementProcessor";
    private static final StartupElementProcessorRegistry self = new StartupElementProcessorRegistry();

}
