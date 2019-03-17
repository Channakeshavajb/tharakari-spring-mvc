package com.xworkz.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.web.dto.TharakariDTO;

@Controller
@RequestMapping("/")
public class TharakariController {

	private List<TharakariDTO> list = new ArrayList<TharakariDTO>();

	public static final String date_format="yyyy-MM-dd";
	public TharakariController() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/tharakari")
	public String onClickAdd(TharakariDTO dto, ModelMap model) {
		System.out.println("calling onClickAdd\t" + dto);
		list.add(dto);
		System.out.println(list);
		model.addAttribute("success", "Tharakari ordered successfully");
		return "Tharakari";

	}

	@RequestMapping("/display")
	public String onDisplay(ModelMap model) {
		System.out.println("invoked onDisplay");
		System.out.println(list);
		model.addAttribute("listItems", list);
		return "Display";

	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(date_format);
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));

	}

}
