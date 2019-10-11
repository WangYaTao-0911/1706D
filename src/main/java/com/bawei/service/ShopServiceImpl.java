package com.bawei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.ShopMapper;

@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	private ShopMapper mapper;
	
}
