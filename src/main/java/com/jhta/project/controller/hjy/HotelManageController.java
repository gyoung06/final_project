package com.jhta.project.controller.hjy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jhta.project.service.hjy.HotelManageService;

@Controller
public class HotelManageController {
	@Autowired HotelManageService service;
	@GetMapping("hjy/hotelInsert1")
	public String hotelInsertForm1() {
		return "user/hjy/hotelManage/hotelInsert1";
	}
	@GetMapping("hjy/hotelInsert2")
	public String hotelInsertForm2(String type) {
		return "user/hjy/hotelManage/hotelInsert2_"+type;
	}
}
