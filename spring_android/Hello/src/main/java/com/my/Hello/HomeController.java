package com.my.Hello;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// 안드로이드 요청(id, pw 받아서 db연동)
		@RequestMapping(value= "/android", method = RequestMethod.POST)
		public String androidPage(HttpServletRequest request, Model model) {
			System.out.println("서버에서 안드로이드 접속 요청함");
			try{
					String androidID = request.getParameter("id");
					String androidPW = request.getParameter("pw");
					System.out.println("안드로이드에서 받아온 id : " + androidID);
					System.out.println("안드로이드에서 받아온 pw : " + androidPW);
					model.addAttribute("android", androidID);
					return "android";
			}catch (Exception e){
					e.printStackTrace();
					return "null";
			}
		}
//		
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
}
