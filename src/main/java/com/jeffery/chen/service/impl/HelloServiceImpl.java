package com.jeffery.chen.service.impl;

import com.jeffery.chen.service.HelloService;

public class HelloServiceImpl implements HelloService {
	public String hello(String name) {
		return "Hello " + name;
	}

}
