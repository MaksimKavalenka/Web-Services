package by.training.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;

import by.training.service.impl.SOAPServiceImpl;

@WebListener
public class AppServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent event) {
        Endpoint.publish("http://localhost:8081/server/soap", new SOAPServiceImpl());
    }

    @Override
    public void contextDestroyed(final ServletContextEvent event) {
    }

}
