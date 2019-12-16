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
import jodychatbot.org.alicebot.server.core.util.StringTriple;
import jodychatbot.org.alicebot.server.core.util.StringTripleMatrix;

public class TargetInputs extends StringTripleMatrix
{

    public TargetInputs(String s, String s1, String s2)
    {
        add(new StringTriple(s, s1, s2));
    }

    public LinkedList getTexts()
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
