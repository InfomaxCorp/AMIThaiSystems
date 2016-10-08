package com.amithai.model;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

public class ListPriceHotelController extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;
	
	@Listen("onClick = #addNewBtn")
	public void showModal(Event e) {

		Window window = (Window)Executions.createComponents(
				"/widgets/window/modal_dialog/price/hotel_price_dialog.zul", null, null);
		window.doModal();
	}
	
}