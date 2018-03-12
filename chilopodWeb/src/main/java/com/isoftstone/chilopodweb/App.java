package com.isoftstone.chilopodweb;

import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.isoftstone.chilopodweb.bean.Response;

public class App {
	
	public static String httpUrl = "http://127.0.0.1:8080/";
	
	public static void main(String[] args) {
		RestTemplate rest = new RestTemplate();
		String body = rest.getForObject(httpUrl+"/user/view/f2d4e22300374b1f9f1542b22ae2dd4f", String.class);
		System.out.println(body);
		Response res = new Gson().fromJson(body, Response.class);
		System.out.println(res);
	}
}
