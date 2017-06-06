package com.scopes;


import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ServletListener implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println(arg0.getName());
		System.out.println(arg0.getValue());
		System.out.println(arg0.getSource());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
