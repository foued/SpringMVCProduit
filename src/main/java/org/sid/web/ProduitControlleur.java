package org.sid.web;

import java.util.List;

import org.sid.entities.Produit;
import org.sid.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProduitControlleur {
	
	
	@Autowired
	private ProduitRepository pr; 
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String acceuil(Model model,@RequestParam(defaultValue="0")int page)
	{
		
		//List<Produit> pageproduits=pr.findAll(new PageRequest(page,4));
		//model.addAllAttributes("produits",pageproduits);
		model.addAttribute("data",pr.findAll(new PageRequest(page,4)));
		return "index";
	}
	@PostMapping("/save")
	public String saveproduit (Produit p)
	{ pr.save(p);
		return "redirect /";
		
	}
//	GetMappingMapping("/delete")
//	public String deleteproduit (Long id )
//	{
//		pr.deleteAll(id);
//		
//		return "redirect /";
//		
//	}
//	@GetMapping("/findone")
//	@ResponseBody
//	public String findOne (Long id )
//	{
//		return pr.findOne(id);
//		
//	}
}
