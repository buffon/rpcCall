package com.jeffery.chen.server;

import com.jeffery.chen.core.RpcFramework;
import com.jeffery.chen.service.HelloService;
import com.jeffery.chen.service.impl.HelloServiceImpl;

public class Server {
	public static void main(String []args) throws Exception {
		HelloService service = new HelloServiceImpl();
		RpcFramework.export(service, 1234);
	}
}
