package com.ymeng.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ymeng.product.dto.Product;

public class ProductDAOImplTest {

	private static final String IPAD = "ipad";
	private static final String IPHONE = "iphone";

	@Test
	public void createShouldCreateProduct() {

		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		
		product.setId(1);
		product.setName(IPHONE);
		product.setDescription("it's awesome");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals(IPAD, result.getName());
	}

}
