package com.rkritchat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rkritchat.soapclient.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ConvertController {
	
	@Autowired
	private SoapClient soapClient;
	
	@RequestMapping(value="/convert", method=RequestMethod.POST)
	public ModelAndView convertNumber(HttpServletRequest request, HttpServletResponse response) {
		String number = request.getParameter("number");
		String result = soapClient.convertNumberToWord(number);
		ModelAndView view = new ModelAndView();
		view.setViewName("result");
		view.addObject("word", result);
		return view;
	}

}
