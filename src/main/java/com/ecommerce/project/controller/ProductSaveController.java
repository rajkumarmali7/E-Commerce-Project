package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.entity.Brand;
import com.ecommerce.project.entity.Category;
import com.ecommerce.project.entity.City;
import com.ecommerce.project.entity.Color;
import com.ecommerce.project.entity.Comments;
import com.ecommerce.project.entity.Country;
import com.ecommerce.project.entity.Coupon;
import com.ecommerce.project.entity.Product;
import com.ecommerce.project.entity.ProductColor;
import com.ecommerce.project.entity.ProductSize;
import com.ecommerce.project.entity.ProductTags;
import com.ecommerce.project.entity.Sales;
import com.ecommerce.project.entity.SalesDetails;
import com.ecommerce.project.entity.Shipping;
import com.ecommerce.project.entity.Size;
import com.ecommerce.project.entity.Tags;
import com.ecommerce.project.service.ProductSaveService;

@RestController
public class ProductSaveController {
	
	@Autowired
	ProductSaveService productSaveService;
	
	/** ============== Product Save ================**/
	@PostMapping("/Product/save")
	public Product productSignUp(@RequestBody Product product) {
		productSaveService.productSave(product);
		return product;
	}

//	/**============ Brand save ================*/
//	@PostMapping("/Brand/save")
//	public Brand brnSave(@RequestBody Brand brand) {
//		productSaveService.brandSave(brand);
//		return brand;
//	}
	/** =============Category Save ================**/
//	@PostMapping("/Category/save")
//	public Category categoSave(@RequestBody Category category) {
//		productSaveService.categorySave(category);
//		return category;
//	}
//	/** ============= City Save ================**/
	@PostMapping("/City/save")
	public City citySave(@RequestBody City city) {
		productSaveService.cityNameSave(city);
		return city;
	}
	/** ============= Country Save ================**/
	@PostMapping("/Country/save")
	public Country countrySignUp(@RequestBody Country country) {
		productSaveService.countryNameSave(country);
		return country;
	}
	/** ============= Color Save ================**/
	@PostMapping("/Color/save")
	public Color colorSignUp(@RequestBody Color color) {
		productSaveService.countryNameSave(color);
		return color;
	}
	/** ============= Comments Save ================**/
	@PostMapping("/Comments/save")
	public Comments commentsSignUp(@RequestBody Comments comments) {
		productSaveService.commentsSave(comments);
		return comments;
	}
	
	/** ============= Coupon Save ================**/
	@PostMapping("/Coupon/save")
	public Coupon couponSignUp(@RequestBody Coupon coupon) {
		productSaveService.couponNameSave(coupon);
		return coupon;
	}
	
	/** ============= ProductColor Save ================**/
	@PostMapping("/ProductColor/save")
	public ProductColor productColorSignUp(@RequestBody ProductColor productColor) {
		productSaveService.productColorNameSave(productColor);
		return productColor;
	}
	
	/** ============= Size Save ================**/
	@PostMapping("/Size/save")
	public Size sizeSignUp(@RequestBody Size size) {
		productSaveService.sizeNameSave(size);
		return size;
	}
	
	/** ============= Tags Save ================**/
	@PostMapping("/Tags/save")
	public Tags tagsSignUp(@RequestBody Tags tags) {
		productSaveService.tagsNameSave(tags);
		return tags;
	}
	/** ============= ProductSize Save ================**/
	@PostMapping("/ProductSize/save")
	public ProductSize productSizeSignUp(@RequestBody ProductSize productSize) {
		productSaveService.productSizeNameSave(productSize);
		return productSize;
	}
	/** ============= ProductTags Save ================**/
	@PostMapping("/ProductTags/save")
	public ProductTags productTagsSignUp(@RequestBody ProductTags productTags) {
		productSaveService.productTagsNameSave(productTags);
		return productTags;
	}
	
	/** ============= Shipping Save ================**/
	@PostMapping("/Shipping/save")
	public Shipping shippingSignUp(@RequestBody Shipping shipping) {
		
		productSaveService.shippingNameSave(shipping);
		return shipping;
	}
	
	/** ============= SalesDetails Save ================**/
	@PostMapping("/SalesDetails/save")
	public SalesDetails salesDetailsSignUp(@RequestBody SalesDetails salesDetails ) {
		
		productSaveService.salesDetailsNameSave(salesDetails);
		return salesDetails;
	}
	/** ============= Sales Save ================**/
	@PostMapping("/Sales/save")
	public Sales salesSignUp(@RequestBody Sales sales ) {
		
		productSaveService.salesNameSave(sales);
		return sales;
	}
	
}
