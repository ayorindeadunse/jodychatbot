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
import java.util.Comparator;

// Referenced classes of package org.alicebot.server.core.targeting:
//            Target

public class TargetActivationsComparator
    implements Comparator
{

    public TargetActivationsComparator()
    {
    }

    public int compare(Object obj, Object obj1)
    {
        return ((Target)obj).getActivations() - ((Target)obj1).getActivations();
    }

    public boolean equals(Object obj)
    {
        return obj instanceof TargetActivationsComparator;
    }
}
