package com.amithai.model;


import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.validator.AbstractValidator;

public class HotelValidator extends AbstractValidator {

	public void validate(ValidationContext ctx) {
		String name = (String)ctx.getProperties("name")[0].getValue();
		String website = (String)ctx.getProperties("website")[0].getValue();
		String address = (String)ctx.getProperties("address")[0].getValue();
		String address_doc = (String)ctx.getProperties("address_doc")[0].getValue();
		
		if(name == null || "".equals(name))
			this.addInvalidMessage(ctx, "name", "You must enter a name");
		
		if(website == null || "".equals(website))
			this.addInvalidMessage(ctx, "website", "You must enter a website");
		
		if(address == null || "".equals(address))
			this.addInvalidMessage(ctx, "address", "You must enter a address");
		
		if(address_doc == null || "".equals(address_doc))
			this.addInvalidMessage(ctx, "address_doc", "You must enter a address document");
		
		
//		if(priority == null || priority < 1 || priority > 10)
//			this.addInvalidMessage(ctx, "priority", "You must give a priority > 0 && < 10");
	}
}
