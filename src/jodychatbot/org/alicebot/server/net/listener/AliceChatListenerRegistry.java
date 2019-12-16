/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.net.listener;

/**
 *
 * @author ayorindeadunse
 */
  import jodychatbot.org.alicebot.server.core.util.ClassRegistry;

public class AliceChatListenerRegistry extends ClassRegistry
{

    private AliceChatListenerRegistry()
    {
        super(jodychatbot.com.core.Constants.getVersion(), PROCESSOR_LIST, "jodychatbot.org.alicebot.server.net.listener.AliceChatListener");
    }

    public static AliceChatListenerRegistry getSelf()
    {
        return self;
    }

    private static final String PROCESSOR_LIST[] = {
        "jodychatbot.org.alicebot.server.net.listener.AliceAIM", "jodychatbot.org.alicebot.server.net.listener.AliceICQ", "jodychatbot.org.alicebot.server.net.listener.AliceIRC"
    };
    private static final String PROCESSOR_BASE_CLASS_NAME = "jodychatbot.org.alicebot.server.net.listener.AliceChatListener";
    private static final AliceChatListenerRegistry self = new AliceChatListenerRegistry();

}
        

