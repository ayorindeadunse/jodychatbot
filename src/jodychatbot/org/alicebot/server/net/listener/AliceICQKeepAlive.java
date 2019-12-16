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
import java.io.IOException;

// Referenced classes of package org.alicebot.server.net.listener:
//            AliceICQ

class AliceICQKeepAlive extends Thread
{

    public AliceICQKeepAlive(AliceICQ aliceicq)
    {
        parent = aliceicq;
    }

    public void run()
    {
        while(true) 
            try
            {
                parent.send(parent.header((short)1070));
                Thread.sleep(0x0L);
            }
            catch(IOException ioexception) { }
            catch(InterruptedException interruptedexception) { }
    }

    AliceICQ parent;
}

