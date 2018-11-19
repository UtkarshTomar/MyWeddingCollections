package 
com.frontend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onlineshop.backendproject.Category;
import com.onlineshop.backendproject.Supplier;
import com.onlineshop.backendproject.Daos.SupplierDao;

@Controller
public class SupplierController {
	
	@Autowired
	SupplierDao supplierDaoObj;

	@RequestMapping(value="/admin/addsupplier",method=RequestMethod.GET) 
	public ModelAndView getAddsupplierForm(){
			ModelAndView mv= new ModelAndView("SupplierForm");
				
			mv.addObject("heading", "Add Supllier Form");
			mv.addObject("button", "Add Button");
			mv.addObject("supplierObj",new Supplier());
			return mv;
			
	}
	
	@RequestMapping(value="/admin/a3",method=RequestMethod.POST)
	public ModelAndView addSupplier(@ModelAttribute("supplierobj")Supplier supplierobj){
			supplierDaoObj.addSupplier(supplierobj);
				
					
					ModelAndView mv= new ModelAndView("ViewSuppliers");
					if(supplierobj.getSupplierid()==0){
						mv.addObject("msgToDisplay","Supplier Added Succesfully");	
					}
				
					else {
						mv.addObject("msgToDisplay","Supplier Updated Succesfully");
					}
					supplierDaoObj.addSupplier(supplierobj);
					
					mv.addObject("supplierList",supplierDaoObj.getAllSupplier());
					return mv;
			
		
	}
	
	
	@RequestMapping(value="/admin/viewsupplier",method=RequestMethod.GET)
	public ModelAndView fetchsupliers(){
		
		ModelAndView mv=new ModelAndView("ViewSuppliers");
		List<Supplier> suppList=supplierDaoObj.getAllSupplier();
		mv.addObject("supplierlist",suppList);
	
		return mv;
		
		
	}
	@RequestMapping(value="/admin/deleteSupplier/{sID}" ,method=RequestMethod.GET)
	public ModelAndView deleteSupplier(@PathVariable("sID")int supplierid) {
		
		Supplier obj=supplierDaoObj.getSupplierById(supplierid);
		supplierDaoObj.deleteSupplier(obj);
		
		ModelAndView mv= new ModelAndView("ViewSuppliers");
		mv.addObject("msgToDisplay", "Supplier Deleted Sucessfully ");
		mv.addObject("supplierlist", supplierDaoObj.getAllSupplier());
	
		return mv;
	
		
	}
	@RequestMapping(value="/admin/updateSupplier/{sID}" ,method=RequestMethod.GET)
	public ModelAndView updateSupplier(@PathVariable("sID")int supplierid){
		Supplier suppobj= supplierDaoObj.getSupplierById(supplierid);
		
		ModelAndView mv =new ModelAndView("SupplierForm");
		mv.addObject("supplierObj",suppobj);
		mv.addObject("heading","Update Suplier Form");
		mv.addObject("button","Update Supplier");
		return mv;
		
	}
	
}
