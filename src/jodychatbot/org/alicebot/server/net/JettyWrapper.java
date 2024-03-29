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
import java.util.Collection;
import java.util.Iterator;
import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.util.DeveloperError;
import org.mortbay.http.SocketListener;
import org.mortbay.jetty.Server;
import org.mortbay.util.Log;
import org.mortbay.util.MultiException;
import org.mortbay.util.OutputStreamLogSink;

// Referenced classes of package org.alicebot.server.net:
//            AliceCompatibleHttpServer

public class JettyWrapper
    implements AliceCompatibleHttpServer
{

    public JettyWrapper()
    {
    }

    public void configure(String s)
        throws IOException
    {
        jetty = new Server();
        OutputStreamLogSink outputstreamlogsink = new OutputStreamLogSink("./logs/jetty.log");
        Log.instance().add(outputstreamlogsink);
        jetty.configure(s);
        jetty.setStatsOn(true);
        int i = 0;
        for(Iterator iterator = jetty.getListeners().iterator(); iterator.hasNext();)
        {
            Object obj = iterator.next();
            if(obj.getClass().getName().equals("org.mortbay.http.SocketListener"))
                i = ((SocketListener)obj).getPort();
        }

        Globals.setHttpPort(i);
    }

    public void run()
    {
        try
        {
            jetty.start();
        }
        catch(MultiException multiexception)
        {
            throw new DeveloperError(multiexception.getMessage());
        }
    }

    public void shutdown()
    {
        try
        {
            jetty.stop();
        }
        catch(InterruptedException interruptedexception)
        {
            jodychatbot.org.alicebot.server.core.logging.Log.devinfo("Jetty was interrupted while stopping.", jodychatbot.org.alicebot.server.core.logging.Log.ERROR);
        }
    }

    public Server getServer()
    {
        return jetty;
    }

    private static Server jetty;
}

