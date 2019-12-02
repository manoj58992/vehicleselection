package vehicleselection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.VehicleDto;
import com.vehicleservice.VehicleService;

@Controller
public class VehicleController {
	private VehicleService vehicleservice;

	@RequestMapping(value = "vehicle", method = RequestMethod.GET)
	public ModelAndView showpage() {
		System.out.println("I am inside the vehicle API");
		VehicleDto v = vehicleservice.giveDemoVehicle();
		System.out.println(v.toString());

		ModelAndView mv = new ModelAndView("vehicle");
		mv.addObject("veh", v);
		mv.addObject("username", " *Manoj*");
		return mv;
	}

	@RequestMapping(value = "vehicle-form", method = RequestMethod.GET)
	public ModelAndView showVehiclePage() {
		VehicleDto v = new VehicleDto();

		ModelAndView mv = new ModelAndView("vehicle-form");
		mv.addObject("vehicleObj", v);
		return mv;
	}

	@RequestMapping(value = "login-vehicle", method = RequestMethod.POST)
	public ModelAndView saveVehicle(VehicleDto vehicle) {
		System.out.println("i am receiving product from user");
		System.out.println(vehicle.toString());

		ModelAndView mv = new ModelAndView("vehicle");
		mv.addObject("pp", vehicle);
		return mv;
	}

	public VehicleService getVehicleservice() {
		return vehicleservice;
	}

	public void setVehicleservice(VehicleService vehicleservice) {
		this.vehicleservice = vehicleservice;
	}

}
