package vehicleselection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductSelection {
	@RequestMapping(value = "selection", method = RequestMethod.GET)
	public String displayproduct() {

		System.out.println("Hi, select the options of the vehicle");

		return "selection";

	}
}
