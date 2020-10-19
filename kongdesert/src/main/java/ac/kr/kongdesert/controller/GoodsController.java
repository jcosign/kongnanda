package ac.kr.kongdesert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ac.kr.kongdesert.model.Goods;
import ac.kr.kongdesert.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	final String path = "goods/";
	@Autowired
	GoodsService service;
	
	@GetMapping("/list")
	String list(Model model) {
		
		List<Goods> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	@GetMapping("/add")
	String add() {
		
		return path + "add";
	}
	@PostMapping("/add")
	String add(Goods item) {
		service.add(item);
		
		return "redirect:../add";
	}
	
	@GetMapping("/update")
	String update(int goodsid, Model model) {
		
		Goods item = service.item(goodsid);
		
		model.addAttribute("item", item);
		
		return path + "update";
	}
	@PostMapping("/update")
	String update(int goodsid, Goods item) {
		service.update(item);
		
		return "redirect:../list";
	}
	
	@GetMapping("/delete")
	String delete(int goodsid) {
		service.delete(goodsid);
		
		return "redirect:../list";
	}
}
