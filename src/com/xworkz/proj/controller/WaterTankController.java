package com.xworkz.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.proj.dto.WaterTanDto;
import com.xworkz.proj.service.WaterTankService;


@Controller
@RequestMapping("/")
public class WaterTankController {

	public WaterTankController() {
		System.out.println("invokkng controller" + this.getClass().getCanonicalName());
	}
	
	@Autowired
	private WaterTankService service;

	

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String onSave(WaterTanDto dto, ModelMap map) {
		System.out.println("invoking controller" + dto);
		String error;
		try {
			error = service.save(dto);
			if (error == null) {
				System.out.println("saved sucessfully");
				map.addAttribute("area", dto.getArea());
				map.addAttribute("nol", dto.getNol());

				return "sucess";

			} else {
				System.out.println("could not saved");
			}

		} catch (Exception e) {
			System.out.println("error message"+e.getMessage());
		}

		return "Home";

	}

}
