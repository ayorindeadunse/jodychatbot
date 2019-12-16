/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.processor;

/**
 *
 * @author ayorindeadunse
 */
import jodychatbot.org.alicebot.server.core.util.ClassRegistry;

public class AIMLProcessorRegistry extends ClassRegistry
{

    public AIMLProcessorRegistry()
    {
        super("1.0.1", PROCESSOR_LIST, "jodychatbot.org.alicebot.server.core.processor.AIMLProcessor");
    }

    public static AIMLProcessorRegistry getSelf()
    {
        return self;
    }

    private static final String VERSION = "1.0.1";
    private static final String PROCESSOR_LIST[] = {
        "jodychatbot.org.alicebot.server.core.processor.BotProcessor", "jodychatbot.org.alicebot.server.core.processor.ConditionProcessor", "jodychatbot.org.alicebot.server.core.processor.DateProcessor", "jodychatbot.org.alicebot.server.core.processor.FormalProcessor", "jodychatbot.org.alicebot.server.core.processor.GenderProcessor", "jodychatbot.org.alicebot.server.core.processor.GetProcessor", "jodychatbot.org.alicebot.server.core.processor.GossipProcessor", "jodychatbot.org.alicebot.server.core.processor.IDProcessor", "jodychatbot.org.alicebot.server.core.processor.InputProcessor", "jodychatbot.org.alicebot.server.core.processor.JavaScriptProcessor", 
        "jodychatbot.org.alicebot.server.core.processor.LearnProcessor", "jodychatbot.org.alicebot.server.core.processor.LowerCaseProcessor", "jodychatbot.org.alicebot.server.core.processor.Person2Processor", "jodychatbot.org.alicebot.server.core.processor.PersonProcessor", "jodychatbot.org.alicebot.server.core.processor.RandomProcessor", "jodychatbot.org.alicebot.server.core.processor.SentenceProcessor", "jodychatbot.org.alicebot.server.core.processor.SetProcessor", "jodychatbot.org.alicebot.server.core.processor.SizeProcessor", "jodychatbot.org.alicebot.server.core.processor.SRAIProcessor", "jodychatbot.org.alicebot.server.core.processor.SRProcessor", 
        "jodychatbot.org.alicebot.server.core.processor.StarProcessor", "jodychatbot.org.alicebot.server.core.processor.SystemProcessor", "jodychatbot.org.alicebot.server.core.processor.ThatProcessor", "jodychatbot.org.alicebot.server.core.processor.ThatStarProcessor", "jodychatbot.org.alicebot.server.core.processor.ThinkProcessor", "jodychatbot.org.alicebot.server.core.processor.TopicStarProcessor", "jodychatbot.org.alicebot.server.core.processor.UpperCaseProcessor", "jodychatbot.org.alicebot.server.core.processor.VersionProcessor"
    };
    private static final String PROCESSOR_BASE_CLASS_NAME = "jodychatbot.org.alicebot.server.core.processor.AIMLProcessor";
    private static final AIMLProcessorRegistry self = new AIMLProcessorRegistry();

}
