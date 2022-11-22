package com.accenture.fers.webapp.listener;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


@WebListener
public class ServletListener implements ServletContextListener{
	


	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		//AQUI HAY QUE GUARDAR LOS EVENTOS
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
	 
}
