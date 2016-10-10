package com.amithai.backend.model;

import java.util.List;
import java.util.UUID;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import com.amithai.backend.dao.HotelDAO;

public class HotelViewModel {
	
	private HotelDAO hotelDao = new HotelDAO();
	
	private HotelItem selectedItem, newItem = new HotelItem();
	
	public HotelItem getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(HotelItem selectedItem) {
		this.selectedItem = selectedItem;
	}
	
	public HotelItem getNewItem() {
		return newItem;
	}

	public void setNewItem(HotelItem newItem) {
		this.newItem = newItem;
	}

	public List<HotelItem> getItems() {
		return hotelDao.findAll();
	}
	
	@Command("add")
	@NotifyChange("items")
	public void add() {
		this.newItem.setId(0);
		hotelDao.insert(this.newItem);
		this.newItem = new HotelItem();
	}
	
	@Command("update")
	@NotifyChange("items")
	public void update() {
		hotelDao.update(this.selectedItem);
	}
	
	@Command("delete")
	@NotifyChange({"items", "selectedItem"})
	public void delete() {
		//shouldn't be able to delete with selectedEvent being null anyway
		//unless trying to hack the system, so just ignore the request
		if(this.selectedItem != null) {
			hotelDao.delete(this.selectedItem);
			this.selectedItem = null;
		}
	}
}
