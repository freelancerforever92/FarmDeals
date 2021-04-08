package com.app.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_DETAILS")
public class ProductDetails {

	private int id;
	private String prodName;
	private String referenceKey;
	private String keyCode;

	private int prodVisibility;
	private byte[] productImage;
	private String imageName;
	private String productDescr;
	private String prodCategory;
	private Float standardPrice;
	private Float discPercentage;
	private Float discPerValue;
	private Float vatPercentage;
	private Float vatValue;
	private Float gstPercentage;
	private Float gstValue;
	private Float sellingPrice;
	private String unitMeasure;
	private Float kgPerBag;
	private Float stock;
	/* private int bidding; */
	private int createdBy;
	private Date createdOn;
	private int updatedBy;
	private Date updatedOn;
	
	private int auctionFlag;
	private int auctionId;																// NEED TO ASSING DEFAULT VALUE WHILE CREATING PRODUCT - 11/11/2016
	private Float auctionStock; 														// NEED TO ASSING DEFAULT VALUE WHILE CREATING PRODUCT - 11/11/2016
	private Date auctionEndDate;														// NEED TO ASSING DEFAULT VALUE WHILE CREATING PRODUCT - 11/11/2016
	private Date auctionCreatedOn;
	private int auctionCreatedBy;
	private Date auctionUpdatedOn;
	private int auctionUpdatedBy;

	public ProductDetails(){
		
	}
	
	/*public ProductDetails(int id, String prodName, String referenceKey, String keyCode, int prodVisibility, String imageName,
			String productDescr, String prodCategory, Float standardPrice,Float discPercentage, Float discPerValue, Float vatPercentage,
			Float vatValue, Float sellingPrice, String unitMeasure, Float stock, int createdBy, Date createdOn, int updatedBy,
			Date updatedOn, int auctionFlag, int auctionId, Float auctionStock, Date auctionEndDate, Date auctionCreatedOn,
			int auctionCreatedBy,Date auctionUpdatedOn, int auctionUpdatedBy)*/ 
	
	/*public ProductDetails(int id, String prodName, String referenceKey, String keyCode, int prodVisibility, String imageName,
			String productDescr, String prodCategory, Float standardPrice,Float discPercentage, Float discPerValue, Float vatPercentage,
			Float vatValue, Float sellingPrice, String unitMeasure, Float kgPerBag,Float stock, int createdBy, Date createdOn, int updatedBy,
			Date updatedOn, int auctionFlag, int auctionId, Float auctionStock,	Date auctionEndDate, Date auctionCreatedOn, int auctionCreatedBy,
			Date auctionUpdatedOn, int auctionUpdatedBy,Float gstPercentage, Float gstValue)*/ 
	
	
	public ProductDetails(int id, String prodName, String referenceKey, String keyCode, int prodVisibility, byte[] productImage, 
			String imageName, String productDescr, String prodCategory, Float standardPrice, Float discPercentage, Float discPerValue,
			Float vatPercentage, Float vatValue, Float gstPercentage, Float gstValue, Float sellingPrice, String unitMeasure,
			Float kgPerBag, Float stock, int createdBy, Date createdOn, int updatedBy, Date updatedOn, int auctionFlag, int auctionId,
			Float auctionStock, Date auctionEndDate, Date auctionCreatedOn, int auctionCreatedBy, Date auctionUpdatedOn, int auctionUpdatedBy) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.referenceKey = referenceKey;
		this.keyCode = keyCode;
		this.prodVisibility = prodVisibility;
		this.productImage = productImage;
		this.imageName = imageName;
		this.productDescr = productDescr;
		this.prodCategory = prodCategory;
		this.standardPrice = standardPrice;
		this.discPercentage = discPercentage;
		this.discPerValue = discPerValue;
		this.vatPercentage = vatPercentage;
		this.vatValue = vatValue;
		this.gstPercentage = gstPercentage;
		this.gstValue = gstValue;
		this.sellingPrice = sellingPrice;
		this.unitMeasure = unitMeasure;
		this.kgPerBag = kgPerBag;
		this.stock = stock;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.auctionFlag = auctionFlag;
		this.auctionId = auctionId;
		this.auctionStock = auctionStock;
		this.auctionEndDate = auctionEndDate;
		this.auctionCreatedOn = auctionCreatedOn;
		this.auctionCreatedBy = auctionCreatedBy;
		this.auctionUpdatedOn = auctionUpdatedOn;
		this.auctionUpdatedBy = auctionUpdatedBy;
	}

	@Id
	@Column(name = "PROD_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "PROD_REFKEY")
	public String getReferenceKey() {
		return referenceKey;
	}

	public void setReferenceKey(String referenceKey) {
		this.referenceKey = referenceKey;
	}

	@Column(name = "PROD_KEYCODE")
	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	@Column(name = "PROD_VISIBILITY")
	public int getProdVisibility() {
		return prodVisibility;
	}

	public void setProdVisibility(int prodVisibility) {
		this.prodVisibility = prodVisibility;
	}

	@Column(name = "PROD_PHOTO")
	@Lob @Basic(fetch = FetchType.LAZY)
	public byte[] getProductImage() {
		return productImage;
	}
	
	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	@Column(name = "PROD_IMAGENAME")
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Column(name = "PROD_DESCRIPTION")
	public String getProductDescr() {
		return productDescr;
	}

	public void setProductDescr(String productDescr) {
		this.productDescr = productDescr;
	}

	@Column(name = "PROD_NAME")
	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	@Column(name = "PROD_CATEGORY")
	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	@Column(name = "PROD_STANDARDPRICE")
	public Float getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(Float standardPrice) {
		this.standardPrice = standardPrice;
	}

	@Column(name = "PROD_DISCPERCENTAGE")
	public Float getDiscPercentage() {
		return discPercentage;
	}

	public void setDiscPercentage(Float discPercentage) {
		this.discPercentage = discPercentage;
	}

	@Column(name = "PROD_DISCVALUE")
	public Float getDiscPerValue() {
		return discPerValue;
	}

	public void setDiscPerValue(Float discPerValue) {
		this.discPerValue = discPerValue;
	}

	@Column(name = "PROD_VATPERCENTAGE")
	public Float getVatPercentage() {
		return vatPercentage;
	}

	public void setVatPercentage(Float vatPercentage) {
		this.vatPercentage = vatPercentage;
	}

	@Column(name = "PROD_VATVALUE")
	public Float getVatValue() {
		return vatValue;
	}

	public void setVatValue(Float vatValue) {
		this.vatValue = vatValue;
	}
	
	@Column(name="GST_PERCENTAGE")
	public Float getGstPercentage() {
		return gstPercentage;
	}

	public void setGstPercentage(Float gstPercentage) {
		this.gstPercentage = gstPercentage;
	}

	@Column(name="GST_VALUE")
	public Float getGstValue() {
		return gstValue;
	}

	public void setGstValue(Float gstValue) {
		this.gstValue = gstValue;
	}

	@Column(name = "PROD_SELLINGPRICE")
	public Float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	@Column(name = "PROD_UNITMEASURE")
	public String getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(String unitMeasure) {
		this.unitMeasure = unitMeasure;
	}
	
	@Column(name="KG_PER_BAG")
	public Float getKgPerBag() {
		return kgPerBag;
	}

	public void setKgPerBag(Float kgPerBag) {
		this.kgPerBag = kgPerBag;
	}

	@Column(name = "PROD_STOCK")
	public Float getStock() {
		return stock;
	}

	public void setStock(Float stock) {
		this.stock = stock;
	}
	
	@Column(name = "PROD_CREATEDBY")
	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PROD_CREATEDON")
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "PROD_UPDATEDBY")
	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PROD_UPDATEDON")
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	@Column(name = "AUCTION_FLAG")
	public int getAuctionFlag() {
		return auctionFlag;
	}

	public void setAuctionFlag(int auctionFlag) {
		this.auctionFlag = auctionFlag;
	}
	
	@Column(name="AUCTION_ID")
	public int getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}

	@Column(name = "AUCTION_STOCK")
	public Float getAuctionStock() {
		return auctionStock;
	}

	public void setAuctionStock(Float auctionStock) {
		this.auctionStock = auctionStock;
	}
	
	@Column(name = "AUCTION_ENDDATE")
	@Temporal(TemporalType.DATE)
	public Date getAuctionEndDate() {
		return auctionEndDate;
	}

	public void setAuctionEndDate(Date auctionEndDate) {
		this.auctionEndDate = auctionEndDate;
	}

	
	@Column(name = "AUCTION_CREATEDON")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getAuctionCreatedOn() {
		return auctionCreatedOn;
	}

	public void setAuctionCreatedOn(Date auctionCreatedOn) {
		this.auctionCreatedOn = auctionCreatedOn;
	}

	@Column(name = "AUCTION_CREATEDBY")
	public int getAuctionCreatedBy() {
		return auctionCreatedBy;
	}

	public void setAuctionCreatedBy(int auctionCreatedBy) {
		this.auctionCreatedBy = auctionCreatedBy;
	}

	@Column(name = "AUCTION_UPDATEDON")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getAuctionUpdatedOn() {
		return auctionUpdatedOn;
	}

	public void setAuctionUpdatedOn(Date auctionUpdatedOn) {
		this.auctionUpdatedOn = auctionUpdatedOn;
	}

	@Column(name = "AUCTION_UPDATEDBY")
	public int getAuctionUpdatedBy() {
		return auctionUpdatedBy;
	}

	public void setAuctionUpdatedBy(int auctionUpdatedBy) {
		this.auctionUpdatedBy = auctionUpdatedBy;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", prodName=" + prodName
				+ ", referenceKey=" + referenceKey + ", keyCode=" + keyCode
				+ ", prodVisibility=" + prodVisibility + ", productImage="
				+ Arrays.toString(productImage) + ", imageName=" + imageName
				+ ", productDescr=" + productDescr + ", prodCategory="
				+ prodCategory + ", standardPrice=" + standardPrice
				+ ", discPercentage=" + discPercentage + ", discPerValue="
				+ discPerValue + ", vatPercentage=" + vatPercentage
				+ ", vatValue=" + vatValue + ", gstPercentage=" + gstPercentage
				+ ", gstValue=" + gstValue + ", sellingPrice=" + sellingPrice
				+ ", unitMeasure=" + unitMeasure + ", kgPerBag=" + kgPerBag
				+ ", stock=" + stock + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", updatedBy=" + updatedBy
				+ ", updatedOn=" + updatedOn + ", auctionFlag=" + auctionFlag
				+ ", auctionId=" + auctionId + ", auctionStock=" + auctionStock
				+ ", auctionEndDate=" + auctionEndDate + ", auctionCreatedOn="
				+ auctionCreatedOn + ", auctionCreatedBy=" + auctionCreatedBy
				+ ", auctionUpdatedOn=" + auctionUpdatedOn
				+ ", auctionUpdatedBy=" + auctionUpdatedBy + "]";
	}

		
}
