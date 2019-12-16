/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.util;

/**
 *
 * @author ayorindeadunse
 */
public class IAmAlivePulse
    implements Pulse
{

    public IAmAlivePulse()
    {
    }

    public void emit()
    {
        Trace.userinfo("I am alive!");
    }
}
