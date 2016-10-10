package com.amithai.backend.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

public class ListTransportController extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;
	
	@Listen("onClick = #addNewBtn")
	public void showModal(Event e) {

		Window window = (Window)Executions.createComponents(
				"/widgets/window/modal_dialog/transport_dialog.zul", null, null);
		window.doModal();
	}
	
//	@Listen("onClick = #photoGalleryBtn")
//	public void showModalPhotoGallery(Event e){
//		Window window = (Window)Executions.createComponents("/widgets/window/modal_dialog/hotel_dialog.zul",null,null);
//		window.doModal();
//	}
	

@Listen("onClick = #editBtn")
	
	/**
	 * Open Dialog for create new data
	 * @param e
	 */
	public void showModalEdit(Event e) {

		// create component
		Window window = (Window)Executions.createComponents(
				"/widgets/window/modal_dialog/edit_transport_dialog.zul", null, null);
		
		
		// display modal window on screen
		window.doModal();
		
	}


@Listen("onClick = #addPic")
	
	/**
	 * Open Dialog for create new data
	 * @param e
	 */
	public void showModalPicture(Event e) {

		// create component
		Window window = (Window)Executions.createComponents(
				"/widgets/window/modal_dialog/add_picture_dialog.zul", null, null);
		
		
		// display modal window on screen
		window.doModal();
		
	}
	
	
}
