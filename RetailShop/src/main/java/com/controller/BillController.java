package com.controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.model.Order;

//use appropriate annotation to configure BillController as Controller
public class BillController {
	
	//invoke the service class - calculateTotalCost method.
	public String calculateTotalCost(@ModelAttribute("order") Order order, 
			BindingResult result,ModelMap model) {
		//fill the code
		return null;
	}

}
