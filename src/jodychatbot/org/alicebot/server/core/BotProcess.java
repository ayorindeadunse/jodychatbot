/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core;

/**
 *
 * @author ayorindeadunse
 */
public interface BotProcess extends Runnable
{
      public abstract void shutdown();
}
