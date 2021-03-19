package sunshine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "restaurant")
public class RestaurantController {
	@RequestMapping(value = "restaurantMain")
	public String restaurantMain() {
		return "restaurant/index";
	}
	
	@RequestMapping(value = "restaurantBookMg")
	public String restaurantBookMg() {
		return "restaurant/restaurantBookMg";
	}
	
	@RequestMapping(value = "restaurantMenuMg")
	public String restaurantMenuMg() {
		return "restaurant/restaurantMenuMg";
	}
	
	@RequestMapping(value = "restaurantRsMg")
	public String restaurantRsMg() {
		return "restaurant/restaurantRsMg";
	}


}
