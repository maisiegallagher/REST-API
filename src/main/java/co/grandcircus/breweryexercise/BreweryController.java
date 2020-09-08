package co.grandcircus.breweryexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BreweryController {
	
	@Autowired
	ApiService as;

	@RequestMapping("/")
	public String showHome(Model model) {
		model.addAttribute("breweries", as.getAllBreweries());
		return "home";
	}

	@RequestMapping("/details")
	public String showDetails(Model model, @RequestParam Integer id) {
		model.addAttribute("brewery", as.getBreweryById(id));
		return "details";
	}
}


