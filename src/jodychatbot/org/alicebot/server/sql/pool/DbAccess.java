/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.sql.pool;

/**
 *
 * @author ayorindeadunse
 */
import java.sql.*;
import jodychatbot.org.alicebot.server.core.logging.Log;
import jodychatbot.org.alicebot.server.core.util.DeveloperError;
import jodychatbot.org.alicebot.server.core.util.UserError;

public class DbAccess
{

    public DbAccess(String s, String s1, String s2, String s3)
    {
        driver = s;
        url = s1;
        user = s2;
        password = s3;
        connect();
    }

    public DbAccess(Connection connection1)
    {
        connection = connection1;
    }

    public void connect()
    {
        if(connection == null)
        {
            try
            {
                Class.forName(driver);
            }
            catch(ClassNotFoundException classnotfoundexception)
            {
                throw new UserError("Could not find your database driver.");
            }
            try
            {
                if(user == null || password == null)
                    connection = DriverManager.getConnection(url);
                else
                    connection = DriverManager.getConnection(url, user, password);
            }
            catch(SQLException sqlexception)
            {
                throw new UserError("Could not connect to \"" + url + "\".  Please check that the parameters specified in your server properties file are correct.", sqlexception);
            }
            try
            {
                statement = connection.createStatement();
            }
            catch(SQLException sqlexception1)
            {
                throw new UserError("Could not create a SQL statement using your database.");
            }
        }
    }

    public ResultSet executeQuery(String s)
        throws SQLException
    {
        if(statement == null)
            throw new DeveloperError("Tried to execute query before creating Statement object!");
        try
        {
            return statement.executeQuery(s);
        }
        catch(SQLException sqlexception)
        {
            Log.userinfo("Problem executing a query on your database.  Check structure and availability.", new String[] {
                Log.ERROR, Log.DATABASE
            });
            throw sqlexception;
        }
    }

    public int executeUpdate(String s)
    {
        if(statement == null)
            throw new DeveloperError("Tried to execute query before creating Statement object!");
        try
        {
            return statement.executeUpdate(s);
        }
        catch(SQLException sqlexception)
        {
            throw new UserError("Problem executing an update on your database.  Check structure and availability.", sqlexception);
        }
    }

    public Connection getConnection()
    {
        return connection;
    }

    public String getDriver()
    {
        return driver;
    }

    public String getPassword()
    {
        return password;
    }

    public Statement getStatement()
    {
        return statement;
    }

    public String getUrl()
    {
        return url;
    }

    public String getUser()
    {
        return user;
    }

    public void setConnection(Connection connection1)
    {
        connection = connection1;
    }

    public void setDriver(String s)
    {
        driver = s;
    }

    public void setPassword(String s)
    {
        password = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setUser(String s)
    {
        user = s;
    }

    protected Connection connection;
    protected Statement statement;
    protected String driver;
    protected String url;
    protected String user;
    protected String password;
}

