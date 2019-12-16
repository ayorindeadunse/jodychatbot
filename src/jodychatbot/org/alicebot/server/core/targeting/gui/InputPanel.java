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

public class InputPanel extends Tabulator
{

    public InputPanel(TargetingGUI targetinggui)
    {
        super(new String[] {
            "<input>", "<pattern>", "<that>", "<topic>"
        });
        guiparent = targetinggui;
    }

    public void updateFromTargets()
    {
        List list = TargetingTool.getSortedTargets();
        Iterator iterator = list.iterator();
        ArrayList arraylist = new ArrayList();
        while(iterator.hasNext()) 
        {
            Target target = (Target)iterator.next();
            String s = target.getMatchPattern();
            String s1 = target.getMatchThat();
            String s2 = target.getMatchTopic();
            ListIterator listiterator = target.getInputTexts().listIterator();
            ArrayList arraylist1 = new ArrayList();
            while(listiterator.hasNext()) 
            {
                String s3 = (String)listiterator.next();
                if(!arraylist1.contains(s3))
                {
                    arraylist.add(((Object) (new Object[] {
                        s3, s, s1, s2, target, new Integer(listiterator.previousIndex() + 1)
                    })));
                    arraylist1.add(s3);
                }
            }
        }
        Object aobj[][] = new Object[0][];
        aobj = (Object[][])arraylist.toArray(((Object []) (aobj)));
        if(aobj.length > 0)
            reloadData(aobj);
    }
}
