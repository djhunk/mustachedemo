package com.example.mustachedemo.Cars;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CarsController {

	@GetMapping("/cars")
	public ModelAndView cars(Map<String, Object> model) {

		List<Car> carsList = new LinkedList<>();
		carsList.add(new Car(1, "Honda", "City", "Black"));
		carsList.add(new Car(2, "Maruti", "WagonR", "White"));
		carsList.add(new Car(3, "Kia", "Seltos", "Red"));

		model.put("cars", carsList);
		model.put("title", "List of cars");

		return new ModelAndView("cars", model);
	}
}
