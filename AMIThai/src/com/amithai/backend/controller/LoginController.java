package com.amithai.backend.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

public class LoginController extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;
	
	@Wire
	Textbox unameTxt,passTxt;
	
	@Wire
	Button doLoginBtn,doCancelBtn;

	
	@Listen("onClick = #doLoginBtn")
	public void doLogin(Event e) {
		Executions.sendRedirect("/listhotel.zul");
	}
}