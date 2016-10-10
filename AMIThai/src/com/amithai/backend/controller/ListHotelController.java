package com.amithai.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

import com.amithai.backend.dao.HotelDAO;
import com.amithai.backend.model.HotelItem;

public class ListHotelController extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;
	
	
	
	private List<HotelItem> items;

	public ListHotelController() {
		try{
		HotelDAO hotelDAO  = new HotelDAO();
		items = hotelDAO.findAll();
		
		System.out.println(items.size());
		
		}catch(Exception e){
			
		}
	}

	
	
	public List<HotelItem> getItems() {
		return items;
	}



	public void setItems(List<HotelItem> hotelItems) {
		this.items = hotelItems;
	}



	@Listen("onClick = #addNewBtn")
	
	/**
	 * Open Dialog for create new data
	 * @param e
	 */
	public void showModal(Event e) {

		// create component
		Window window = (Window)Executions.createComponents(
				"/widgets/window/modal_dialog/hotel_dialog.zul", null, null);
		
		
		// display modal window on screen
		window.doModal();
		
	}
	
	@Listen("onClick = #editBtn")
	
	/**
	 * Open Dialog for create new data
	 * @param e
	 */
	public void showModalEdit(Event e) {

		// create component
		Window window = (Window)Executions.createComponents(
				"/widgets/window/modal_dialog/edit_hotel_dialog.zul", null, null);
		
		
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
	

	
	
//	@Listen("onClick = #photoGalleryBtn")
//	public void showModalPhotoGallery(Event e){
//		Window window = (Window)Executions.createComponents("/widgets/window/modal_dialog/hotel_dialog.zul",null,null);
//		window.doModal();
//	}
	
	
}
