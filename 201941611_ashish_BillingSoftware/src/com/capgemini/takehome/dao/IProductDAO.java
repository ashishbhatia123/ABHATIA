package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;

public interface IProductDAO {
public abstract Product getProductDetails(int productCode);
}
