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
import jodychatbot.org.alicebot.server.core.processor.ProcessorException;

public class InvalidStartupElementException extends ProcessorException
{

    public InvalidStartupElementException(String s)
    {
        super(s);
    }
}
