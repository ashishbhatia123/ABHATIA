package com.capgemini.takehome.dao;

import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.IdNotMatchException;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {
	CollectionUtil utilObj = new CollectionUtil();
	@Override
	public Product getProductDetails(int productCode) {
		// TODO Auto-generated method stub
		Map<Integer, Product> map =CollectionUtil.getProducts();
		try {
		if(!(map.keySet() .contains(productCode)))
		{
			throw new IdNotMatchException(productCode);
		}
		}
		catch(IdNotMatchException e)
		{
			System.out.println();
			return null;
		}
	
		
		return map.get(productCode);

}
}
