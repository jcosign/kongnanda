package ac.kr.kongdesert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ac.kr.kongdesert.model.Point;
import ac.kr.kongdesert.service.PointService;

@Controller
@RequestMapping("/Point")
public class PointController {

	final String path = "point/";
	
	@Autowired
	PointService service;
	
	@GetMapping("/list")
	String list(Model model) {
		List<Point> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	@GetMapping("/add")
	String add() {
		
		return path + "add";
	}
	@PostMapping("/add")
	String add(Point item) {
		service.add(item);
		
		return "redirect:../list";
	}
	
	@GetMapping("/update")
	String update(int pointnum, Model model) {
		Point item = service.item(pointnum);
		
		model.addAttribute("item", pointnum);
		
		return path + "update";
	}
	@PostMapping("/update")
	String update(int pointnum, Point item) {
		service.update(item);
		
		return "redirect:../list";
	}
	
	@GetMapping("/delete")
	String delete(int pointnum) {
		service.delete(pointnum);
		
		return "redirect:../list";
	}
}
