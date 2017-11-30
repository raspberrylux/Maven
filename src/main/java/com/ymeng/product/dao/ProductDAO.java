package com.ymeng.product.dao;

import com.ymeng.product.dto.Product;

public interface ProductDAO {

	public void create(Product product);
	public Product read(int id);
	public void update(Product product);
	public void delete(int id);
}
