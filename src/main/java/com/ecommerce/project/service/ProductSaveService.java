package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

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
import com.ecommerce.project.entity.User;
import com.ecommerce.project.exceptions.CustomException;
import com.ecommerce.project.repository.BrandRepository;
import com.ecommerce.project.repository.CategoryRepository;
import com.ecommerce.project.repository.CityRepository;
import com.ecommerce.project.repository.ColorRepository;
import com.ecommerce.project.repository.CommentsRepository;
import com.ecommerce.project.repository.CountryRepository;
import com.ecommerce.project.repository.CouponRepository;
import com.ecommerce.project.repository.ProductColorRepository;
import com.ecommerce.project.repository.ProductRepository;
import com.ecommerce.project.repository.ProductSizeRepository;
import com.ecommerce.project.repository.ProductTagsRepository;
import com.ecommerce.project.repository.SalesDetailsRepository;
import com.ecommerce.project.repository.SalesRepository;
import com.ecommerce.project.repository.ShippingRepository;
import com.ecommerce.project.repository.SizeRepository;
import com.ecommerce.project.repository.TagsRepository;
import com.ecommerce.project.repository.UserRepository;

@Service
public class ProductSaveService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	BrandRepository brandRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	CityRepository cityRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	ColorRepository colorRepository;

	@Autowired
	CommentsRepository commentsRepository;

	@Autowired
	CouponRepository couponRepository;

	@Autowired
	ProductColorRepository productColorRepository;

	@Autowired
	SizeRepository sizeRepository;

	@Autowired
	TagsRepository tagsRepository;
	
	@Autowired
	ProductSizeRepository productSizeRepository;
	
	@Autowired
	ProductTagsRepository productTagsRepository;

	@Autowired
	ShippingRepository shippingRepository;
	
	@Autowired
	SalesDetailsRepository salesDetailsRepository;
	
	@Autowired
	SalesRepository salesRepository;
//	/** ============ Brand save ================ */
//	public void brandSave(Brand brand) {
//		brandRepository.save(brand);
//	}
//
//	/** =============Category Save ================ **/
//	public void categorySave(Category category) {
//		categoryRepository.save(category);
//
//	}

	/** ============= City Save ============== **/
	public void cityNameSave(City city) {

		Country country = countryRepository.findById(city.getCountryid()).orElse(null);
		if (country == null)
			throw new CustomException("Country is not present");

		city.setCountry(country);
		cityRepository.save(city);
	}

	/** ============= Country Save ============== **/
	public void countryNameSave(Country country) {
		countryRepository.save(country);
	}

	/** ============= Color Save ============== **/
	public void countryNameSave(Color color) {
		colorRepository.save(color);
	}

	/** ============= Comments Save ============== **/
	public void commentsSave(Comments comments) {

		User user = userRepository.findById(comments.getUserrid()).orElseThrow(()-> new CustomException("User is not present"));
		Product product = productRepository.findById(comments.getProdid()).orElseThrow(()-> new CustomException("Product is not present"));
//		if (user == null)
//			throw new CustomException("User is not present");
//		else if (product==null)
//			throw new CustomException("Product is not present");
		comments.setUser(user);
		comments.setProduct(product);
		commentsRepository.save(comments);

	}

	/** ============= Coupon Save ============== **/
	public void couponNameSave(Coupon coupon) {
		couponRepository.save(coupon);
	}

	/** ============= Product Save ============== **/
	public void productSave(Product product) {
		productRepository.save(product);

	}

	/** ============ productColorNameSave Save ============== **/
	public void productColorNameSave(ProductColor productColor) throws UsernameNotFoundException {
		
	 productRepository.findById(productColor.getProductduplicateid()).orElseThrow(()-> new CustomException("ProductId is not present"));
	 colorRepository.findById(productColor.getColorduplicateid()).orElseThrow(()-> new CustomException("ColorId is not present"));
	 productColor.setProductid(productColor.getProductduplicateid());
	 productColor.setColorid(productColor.getColorduplicateid());
	 
		productColorRepository.save(productColor);

	}

	/** ============ sizeNameSave Save ============== **/
	public void sizeNameSave(Size size) {
		sizeRepository.save(size);
	}

	/** ============ Tags Save ============== **/
	public void tagsNameSave(Tags tags) {
		tagsRepository.save(tags);
	}

	/** ============ productTagsNameSave Save ============== **/
	public void productTagsNameSave(ProductTags productTags) {
		 productRepository.findById(productTags.getProductduplicateid()).orElseThrow(()-> new CustomException("ProductId is not present"));
		 tagsRepository.findById(productTags.getTagesduplicateid()).orElseThrow(()-> new CustomException("TagsId is not present"));
		 productTags.setProductid(productTags.getProductduplicateid());
		 productTags.setTagsid(productTags.getTagesduplicateid());
		productTagsRepository.save(productTags);
	}
	/** ============ productSizeNameSave Save ============== **/
	public void productSizeNameSave(ProductSize productSize) {
		 productRepository.findById(productSize.getProductduplicateid()).orElseThrow(()-> new CustomException("ProductId is not present"));
		 sizeRepository.findById(productSize.getSizeduplicateid()).orElseThrow(()-> new CustomException("SizeId is not present"));
		 productSize.setProductid(productSize.getProductduplicateid());
		 productSize.setSizeid(productSize.getSizeduplicateid());
		productSizeRepository.save(productSize);
		
	}
	/** ============ Shipping Save ============== **/
	public void shippingNameSave(Shipping shipping) {
		cityRepository.findById(shipping.getCityduplicateid()).orElseThrow(()-> new CustomException("CityId is not present"));
		shipping.setCityid(shipping.getCityduplicateid());
		shippingRepository.save(shipping);
	}
	
	/** ============ SalesDetails Save ============== **/
	public void salesDetailsNameSave(SalesDetails salesDetails) {
		salesRepository.findById(salesDetails.getSalesduplicateid()).orElseThrow(()-> new CustomException("SalesId is not present"));
		productRepository.findById(salesDetails.getProductduplicateid()).orElseThrow(()-> new CustomException("ProductId is not present"));
		salesDetails.setSalesid(salesDetails.getSalesduplicateid());
		salesDetails.setProductid(salesDetails.getProductduplicateid());
		salesDetailsRepository.save(salesDetails);
	}
	/** ============ Sales Save ============== **/
	public void salesNameSave(Sales sales) {
		userRepository.findById(sales.getUsersduplicateid()).orElseThrow(()-> new CustomException("UserId is not present"));
		shippingRepository.findById(sales.getShippingduplicateid()).orElseThrow(()-> new CustomException("ShippingId is not present"));
		sales.setUsersid(sales.getUsersduplicateid());
		sales.setShippingid(sales.getShippingduplicateid());
		salesRepository.save(sales);
	
		
	}

	
}
