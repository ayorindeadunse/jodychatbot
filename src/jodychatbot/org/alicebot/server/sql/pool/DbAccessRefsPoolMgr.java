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
// Referenced classes of package org.alicebot.server.sql.pool:
//            ObjectPool, DbAccess

public class DbAccessRefsPoolMgr extends ObjectPool
{

    public DbAccessRefsPoolMgr(String s, String s1, String s2, String s3)
    {
        driver = s;
        url = s1;
        user = s2;
        password = s3;
    }

    protected Object create()
    {
        return new DbAccess(driver, url, user, password);
    }

    public void populate(int i)
    {
        for(int j = i; --j >= 0;)
            super.checkIn(create());

    }

    public void returnDbaRef(DbAccess dbaccess)
    {
        super.checkIn(dbaccess);
    }

    public DbAccess takeDbaRef()
    {
        return (DbAccess)super.checkOut();
    }

    protected boolean validate(Object obj)
    {
        return true;
    }

    protected void expire(Object obj)
    {
    }

    protected String driver;
    protected String url;
    protected String user;
    protected String password;
}

