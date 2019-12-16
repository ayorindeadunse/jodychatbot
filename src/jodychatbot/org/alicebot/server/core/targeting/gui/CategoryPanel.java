/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.targeting.gui;

/**
 *
 * @author ayorindeadunse
 */
import java.util.*;
import jodychatbot.org.alicebot.server.core.targeting.Target;
import jodychatbot.org.alicebot.server.core.targeting.TargetingTool;

// Referenced classes of package org.alicebot.server.core.targeting.gui:
//            Tabulator, TargetingGUI

public class CategoryPanel extends Tabulator
{

    public CategoryPanel(TargetingGUI targetinggui)
    {
        super(new String[] {
            "activations", "<pattern>", "<that>", "<topic>"
        });
        guiparent = targetinggui;
    }

    public void updateFromTargets()
    {
        List list = TargetingTool.getSortedTargets();
        Iterator iterator = list.iterator();
        ArrayList arraylist = new ArrayList();
        Target target;
        for(; iterator.hasNext(); arraylist.add(((Object) (new Object[] {
    new Integer(target.getActivations()), target.getMatchPattern(), target.getMatchThat(), target.getMatchTopic(), target, new Integer(1)
}))))
            target = (Target)iterator.next();

        Object aobj[][] = new Object[0][];
        aobj = (Object[][])arraylist.toArray(((Object []) (aobj)));
        if(aobj.length > 0)
            reloadData(aobj);
    }
}
