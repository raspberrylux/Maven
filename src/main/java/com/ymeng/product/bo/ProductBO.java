package com.ymeng.product.bo;

import com.ymeng.product.dto.Product;

public interface ProductBO {

	public void create(Product product);
	public Product findProduct(int id);
}
