package com.bawei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bawei.service.ShopService;

@Controller
public class ShopController {

	@Autowired
	private ShopService service;
}
