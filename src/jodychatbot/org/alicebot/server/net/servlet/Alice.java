/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodychatbot.org.alicebot.server.net.servlet;

/**
 *
 * @author ayorindeadunse
 */
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import jodychatbot.org.alicebot.server.core.responder.SmartResponder;

public class Alice extends HttpServlet
{

    public Alice()
    {
    }

    public void init()
        throws ServletException
    {
    }

    public void init(ServletConfig servletconfig)
        throws ServletException
    {
    }

    public void doGet(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        SmartResponder smartresponder = new SmartResponder(httpservletrequest, httpservletresponse);
        smartresponder.doResponse();
    }

    public void doPost(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        doGet(httpservletrequest, httpservletresponse);
    }
}

