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
public interface AIMLReaderListener
    extends GenericReaderListener
{

    public abstract void newCategory(String s, String s1, String s2, String s3);
}
