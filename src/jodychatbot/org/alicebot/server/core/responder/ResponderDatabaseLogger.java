/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.core.responder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.SQLException;
import jodychatbot.org.alicebot.server.core.Globals;
import jodychatbot.org.alicebot.server.core.PredicateMaster;
import jodychatbot.org.alicebot.server.core.logging.Log;
import jodychatbot.org.alicebot.server.core.util.DeveloperError;
import jodychatbot.org.alicebot.server.core.util.UserError;
import jodychatbot.org.alicebot.server.sql.pool.DbAccess;
import jodychatbot.org.alicebot.server.sql.pool.DbAccessRefsPoolMgr;

/**
 *
 * @author ayorindeadunse
 */
public class ResponderDatabaseLogger {
    private ResponderDatabaseLogger()
    {
        Log.devinfo("Opening database pool.", new String[] {
            Log.DATABASE, Log.STARTUP
        });
        dbManager = new DbAccessRefsPoolMgr(Globals.getProperty("programd.database.driver", ""), Globals.getProperty("programd.database.url", ""), Globals.getProperty("programd.database.user", ""), Globals.getProperty("programd.database.password", ""));
        Log.devinfo("Populating database pool.", new String[] {
            Log.DATABASE, Log.STARTUP
        });
        dbManager.populate(Integer.parseInt(Globals.getProperty("programd.database.connections", "")));
    }
  
      public static void log(String s, String s1, String s2, String s3, String s4)
    {
        String s5 = PredicateMaster.get(Globals.getClientNamePredicate(), s3, s4);
        DbAccess dbaccess = null;
        try
        {
            dbaccess = dbManager.takeDbaRef();
        }
        catch(Exception exception)
        {
            throw new UserError("Could not get database reference when logging.", exception);
        }
        try
        {
//            dbaccess.executeQuery("insert into chatlog (userid, clientname, botid, input, response) values ('" + URLEncoder.encode(s3, "utf-8") + "', '" + URLEncoder.encode(PredicateMaster.get(Globals.getClientNamePredicate(), s3, s4), "utf-8") + "', '" + URLEncoder.encode(s4, "utf-8") + "', '" + URLEncoder.encode(s, "utf-8") + "', '" + URLEncoder.encode(s1, "utf-8") + "')");
            dbaccess.executeQuery("insert into chatlog (userid, clientname, botid, input, response) values ('" + URLEncoder.encode(s3) + "', '" + URLEncoder.encode(PredicateMaster.get(Globals.getClientNamePredicate(), s3, s4)) + "', '" + URLEncoder.encode(s4) + "', '" + URLEncoder.encode(s) + "', '" + URLEncoder.encode(s1) + "')");
        }
        catch(SQLException sqlexception)
        {
            Log.userinfo("Database error: " + sqlexception, new String[] {
                Log.DATABASE, Log.ERROR
            });
        }
//        catch(UnsupportedEncodingException unsupportedencodingexception)
        catch(Exception unsupportedencodingexception)
        {
            throw new DeveloperError("This platform does not support UTF-8!");
        }
/*        catch(SQLException sqlexception)
        {
            Log.userinfo("Database error: " + sqlexception, new String[] {
                Log.DATABASE, Log.ERROR
            });
        }*/
        dbManager.returnDbaRef(dbaccess);
    }
     private static DbAccessRefsPoolMgr dbManager;
    private static final ResponderDatabaseLogger self = new ResponderDatabaseLogger();
    private static final String ENC_UTF8 = "utf-8";
}
