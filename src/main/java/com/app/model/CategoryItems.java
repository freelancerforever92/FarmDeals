package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CATEGORY_ITEMS")
public class CategoryItems {

	private int productId;
	private String productName;
	private String productGroupCode;
	private String productkeyCode;
	private String productReferenceCode;
	private int productShowVisibility;
	private Set<ProductDetails> productDetails = new HashSet<ProductDetails>();
	// private String imageName;
	/*
	 * private String imageName; private String productShortDescription; private
	 * String productDescription; private Float productStandardPrice; private
	 * Float productSellingPrice; private Float vatPercentage; private Float
	 * vatValue; private Float productDiscountPercentage; private Float
	 * productDiscPerValue; private Float productUnitMeasure; private Float
	 * productInStock;
	 */
	private Date createdOn;
	private Date updatedOn;

	public CategoryItems() {

	}

	public CategoryItems(int productId, String productName,
			String productGroupCode, String productkeyCode,
			String productReferenceCode, int productShowVisibility,
			Set<ProductDetails> productDetails, Date createdOn, Date updatedOn) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productGroupCode = productGroupCode;
		this.productkeyCode = productkeyCode;
		this.productReferenceCode = productReferenceCode;
		this.productShowVisibility = productShowVisibility;
		this.productDetails = productDetails;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Column(name = "PRODUCT_NAME")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PRODUCT_GROUPCODE")
	public String getProductGroupCode() {
		return productGroupCode;
	}

	public void setProductGroupCode(String productGroupCode) {
		this.productGroupCode = productGroupCode;
	}

	@Column(name = "PRODUCT_KEYCODE")
	public String getProductkeyCode() {
		return productkeyCode;
	}

	public void setProductkeyCode(String productkeyCode) {
		this.productkeyCode = productkeyCode;
	}

	@Column(name = "PRODUCT_REFERCODE")
	public String getProductReferenceCode() {
		return productReferenceCode;
	}

	public void setProductReferenceCode(String productReferenceCode) {
		this.productReferenceCode = productReferenceCode;
	}

	@Column(name = "PRODUCT_SHOWVISIBILITY")
	public int getProductShowVisibility() {
		return productShowVisibility;
	}

	public void setProductShowVisibility(int productShowVisibility) {
		this.productShowVisibility = productShowVisibility;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "PROD_ITEM_DETAIL", joinColumns = @JoinColumn(name = "CATEGORY_ITEM_ID"), inverseJoinColumns = @JoinColumn(name = "PROD_ITEM_ID"))
	public Set<ProductDetails> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(Set<ProductDetails> productDetails) {
		this.productDetails = productDetails;
	}

	/*
	 * @Column(name = "PRODUCT_IMAGENAME") public String getImageName() { return
	 * imageName; }
	 * 
	 * public void setImageName(String imageName) { this.imageName = imageName;
	 * }
	 * 
	 * @Column(name = "PRODUCT_DESCRIPTION") public String
	 * getProductDescription() { return productDescription; }
	 * 
	 * public void setProductDescription(String productDescription) {
	 * this.productDescription = productDescription; }
	 * 
	 * @Column(name = "PRODUCT_SHORTDESCRIPTION") public String
	 * getProductShortDescription() { return productShortDescription; }
	 * 
	 * public void setProductShortDescription(String productShortDescription) {
	 * this.productShortDescription = productShortDescription; }
	 * 
	 * @Column(name = "PRODUCT_STANDARDPRICE") public Float
	 * getProductStandardPrice() { return productStandardPrice; }
	 * 
	 * public void setProductStandardPrice(Float productStandardPrice) {
	 * this.productStandardPrice = productStandardPrice; }
	 * 
	 * @Column(name = "PRODUCT_SELLINGPRICE") public Float
	 * getProductSellingPrice() { return productSellingPrice; }
	 * 
	 * public void setProductSellingPrice(Float productSellingPrice) {
	 * this.productSellingPrice = productSellingPrice; }
	 * 
	 * @Column(name = "PRODUCT_VATPERCENTAGE") public Float getVatPercentage() {
	 * return vatPercentage; }
	 * 
	 * public void setVatPercentage(Float vatPercentage) { this.vatPercentage =
	 * vatPercentage; }
	 * 
	 * @Column(name = "PRODUCT_VATVALUE") public Float getVatValue() { return
	 * vatValue; }
	 * 
	 * public void setVatValue(Float vatValue) { this.vatValue = vatValue; }
	 * 
	 * @Column(name = "PRODUCT_DISCOUNTPERCENTAGE") public Float
	 * getProductDiscountPercentage() { return productDiscountPercentage; }
	 * 
	 * public void setProductDiscountPercentage(Float productDiscountPercentage)
	 * { this.productDiscountPercentage = productDiscountPercentage; }
	 * 
	 * @Column(name = "PRODUCT_DISCOUNTPERCENTAGEVALUE") public Float
	 * getProductDiscPerValue() { return productDiscPerValue; }
	 * 
	 * public void setProductDiscPerValue(Float productDiscPerValue) {
	 * this.productDiscPerValue = productDiscPerValue; }
	 * 
	 * @Column(name = "PRODUCT_UNITMEASURE") public Float
	 * getProductUnitMeasure() { return productUnitMeasure; }
	 * 
	 * public void setProductUnitMeasure(Float productUnitMeasure) {
	 * this.productUnitMeasure = productUnitMeasure; }
	 * 
	 * @Column(name = "PRODUCT_INSTOCK") public Float getProductInStock() {
	 * return productInStock; }
	 * 
	 * public void setProductInStock(Float productInStock) { this.productInStock
	 * = productInStock; }
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRODUCT_CREATEDON", length = 19)
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRODUCT_UPDATEDON", length = 19)
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
