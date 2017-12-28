/**
 * 
 */
package com.alisha.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alisha.shoppingbackend.dao.CategoryDAO;
import com.alisha.shoppingbackend.dto.Category;

/**
 * @author psin82
 *
 */

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickHome",true);
		mv.addObject("title","Home");
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickHome",false);
		mv.addObject("userClickAbout",true);
		mv.addObject("title","About Us");
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickHome",false);
		mv.addObject("userClickContact",true);
		mv.addObject("title","Contact Us");
		return mv;
	}
	
	/**
	 * load all products page
	 */
	
	@RequestMapping(value= {"/show/all/products"})
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickAllProducts",true);
		mv.addObject("title","All Products");
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	/**
	 * load products specific to category
	 */
	
	@RequestMapping(value= {"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category = null;
		category = categoryDAO.get(id);
		mv.addObject("userClickCategoryProduct",true);
		mv.addObject("title",category.getName());
		mv.addObject("category",category);
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
}
