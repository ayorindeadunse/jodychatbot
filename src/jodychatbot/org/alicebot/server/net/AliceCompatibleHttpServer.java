/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.net;

/**
 *
 * @author ayorindeadunse
 */
import java.io.IOException;
import jodychatbot.org.alicebot.server.core.BotProcess;

public interface AliceCompatibleHttpServer
    extends BotProcess
{

    public abstract void configure(String s)
        throws IOException;

    public abstract void run();
}

