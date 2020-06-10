package com.ritesh.practise;

import javax.naming.event.NamingEvent;
import javax.naming.event.NamingExceptionEvent;
import javax.naming.event.ObjectChangeListener;

public class ChangeHandler implements ObjectChangeListener {

	public void objectChanged(NamingEvent evt) {
		System.out.println(evt.getNewBinding());
	}

	public void namingExceptionThrown(NamingExceptionEvent evt) {
		System.out.println(evt.getException());
	}

}
