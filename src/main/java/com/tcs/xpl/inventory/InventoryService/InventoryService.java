package com.tcs.xpl.inventory.InventoryService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InventoryService { 

	@Autowired
	public InventoryRepository iv;
	
	
	public String addProduct(Inventory ivt)
	{
		Inventory x=iv.save(ivt);
		if(x!=null)
		{
			return "Product created";
		}
		return null;
	}


	public ArrayList<Inventory> fetchProducts() {
		// TODO Auto-generated method stub
		return (ArrayList<Inventory>) iv.findAll();
	}

	public Inventory fetchProdcut(int id) {
		// TODO Auto-generated method stub
		return iv.findById(id).get();
	}


	public String updateProd(Inventory iv2) {
		// TODO Auto-generated method stub
		Inventory x=iv.save(iv2);
		if(x!=null)
		{
			return "Product uodated";
		}
		return null;
	}


	public String delProd(int idd) {
		iv.deleteById(idd);
		return "Product deleted";
	}
}
