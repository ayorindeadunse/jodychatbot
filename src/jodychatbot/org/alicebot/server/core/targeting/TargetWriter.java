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
import java.io.File;
import java.util.*;
import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.util.*;

// Referenced classes of package org.alicebot.server.core.targeting:
//            Targeting, Target

public class TargetWriter extends Targeting
{

    public TargetWriter()
    {
    }

    public static void rewriteTargets(HashMap hashmap, File file)
    {
        if(!file.canWrite())
        {
            Trace.userinfo("Cannot write targets.");
            return;
        }
        file.delete();
        XMLResourceSpec xmlresourcespec = new XMLResourceSpec();
        xmlresourcespec.description = "Targeting Data";
        xmlresourcespec.path = file.getAbsolutePath();
        xmlresourcespec.root = "targets";
        xmlresourcespec.dtd = XMLResourceSpec.HTML_ENTITIES_DTD;
        xmlresourcespec.encoding = Globals.getProperty("programd.targeting.data.encoding", "UTF-8");
        Iterator iterator = hashmap.values().iterator();
        if(iterator.hasNext())
            for(; iterator.hasNext(); write((Target)iterator.next(), xmlresourcespec));
        else
            write(null, xmlresourcespec);
    }

    public static void write(Target target, XMLResourceSpec xmlresourcespec)
    {
        if(target != null)
            XMLWriter.write("    <target>" + Targeting.LINE_SEPARATOR + "    " + "    " + "<input>" + Targeting.LINE_SEPARATOR + "    " + "    " + "    " + "<text>" + target.getLastInputText() + "</text>" + Targeting.LINE_SEPARATOR + "    " + "    " + "    " + "<that>" + target.getLastInputThat() + "</that>" + Targeting.LINE_SEPARATOR + "    " + "    " + "    " + "<topic>" + target.getLastInputTopic() + "</topic>" + Targeting.LINE_SEPARATOR + "    " + "    " + "</input>" + Targeting.LINE_SEPARATOR + "    " + "    " + "<match>" + Targeting.LINE_SEPARATOR + "    " + "    " + "    " + "<pattern>" + target.getMatchPattern() + "</pattern>" + Targeting.LINE_SEPARATOR + "    " + "    " + "    " + "<that>" + target.getMatchThat() + "</that>" + Targeting.LINE_SEPARATOR + "    " + "    " + "    " + "<topic>" + target.getMatchTopic() + "</topic>" + Targeting.LINE_SEPARATOR + "    " + "    " + "    " + "<template>" + target.getMatchTemplate() + "</template>" + Targeting.LINE_SEPARATOR + "    " + "    " + "</match>" + Targeting.LINE_SEPARATOR + "    " + "    " + "<reply>" + target.getLastReply() + "</reply>" + Targeting.LINE_SEPARATOR + "    " + "</target>" + Targeting.LINE_SEPARATOR, xmlresourcespec);
        else
            XMLWriter.write("", xmlresourcespec);
    }
}
