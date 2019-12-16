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
import java.util.HashMap;
import jodychatbot.org.alicebot.server.core.parser.GenericReaderListener;

// Referenced classes of package org.alicebot.server.core.targeting:
//            Target, TargetingTool

public class TargetsReaderListener
    implements GenericReaderListener
{

    public void loadTarget(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7)
    {
        TargetingTool.add(new Target(s, s1, s2, s3, s4, s5, s6, s7), set);
    }

    public TargetsReaderListener(HashMap hashmap)
    {
        set = hashmap;
    }

    private static HashMap set;
}
