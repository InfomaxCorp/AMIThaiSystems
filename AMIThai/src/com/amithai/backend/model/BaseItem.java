package com.amithai.model;
import java.util.Date;
public class BaseItem {
	int id;
	String name;
	String website;
	String address;
	String address_doc;
	String remark; 
	String flag_sheet;
	String tel;
	String fax;
	String email;
	String contact_person;
	Date created_date;
	String created_by;
	Date updated_date;
	String updated_by;
	String flag_status;
	public BaseItem(int id, String name, String website, String address,
			String address_doc, String remark, String flag_sheet, String tel,
			String fax, String email, String contact_person,
			Date created_date, String created_by, Date updated_date,
			String updated_by,String flag_status) {
		super();
		this.id = id;
		this.name = name;
		this.website = website;
		this.address = address;
		this.address_doc = address_doc;
		this.remark = remark;
		this.flag_sheet = flag_sheet;
		this.tel = tel;
		this.fax = fax;
		this.email = email;
		this.contact_person = contact_person;
		this.created_date = created_date;
		this.created_by = created_by;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.flag_status = flag_status;
	}
	
	public BaseItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress_doc() {
		return address_doc;
	}

	public void setAddress_doc(String address_doc) {
		this.address_doc = address_doc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag_sheet() {
		return flag_sheet;
	}

	public void setFlag_sheet(String flag_sheet) {
		this.flag_sheet = flag_sheet;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	
	public String getFlag_status(){
		return this.flag_status;
	}
	
	public void setFlag_status(String flag_status) {
		this.flag_status = flag_status;
	}
	
	
}
