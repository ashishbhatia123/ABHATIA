package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;

public class ProductService implements IProductService{
	IProductDAO daoObj =new ProductDAO();
	@Override
	public Product getProductDetail(int productCode) {
		// TODO Auto-generated method stub
		Product prodDetObj =daoObj.getProductDetails(productCode);
		if(prodDetObj !=null)
		{
			return prodDetObj;
		}
		
	
	
	
		return null;
	}

}
