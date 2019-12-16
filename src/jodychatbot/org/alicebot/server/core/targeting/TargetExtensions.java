/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.targeting;

/**
 *
 * @author ayorindeadunse
 */
import java.util.LinkedList;
import jodychatbot.org.alicebot.server.core.util.StringTripleMatrix;

public class TargetExtensions extends StringTripleMatrix
{

    public TargetExtensions()
    {
    }

    public LinkedList getPatterns()
    {
        return getFirsts();
    }

    public LinkedList getThats()
    {
        return getSeconds();
    }

    public LinkedList getTopics()
    {
        return getThirds();
    }
}

