package com.stylepopz.app.shopstyle;


public class Product {
	
	private int id;
	private String name;
	private String currency;
	private double price;
	private String priceLabel;
	private boolean inStock;
	private Retailer retailer;
	private String locale;
	private String description;
	private Brand brand;
	private String clickUrl;
	private Image images[];
	private Color colors[];
	private Size sizes[];
	private Category categories[];
	private String seeMoreLabel;
	private String seeMoreUrl;
	private String extractDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPriceLabel() {
		return priceLabel;
	}
	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getClickUrl() {
		return clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}
	public Image[] getImages() {
		return images;
	}
	public void setImages(Image[] images) {
		this.images = images;
	}
	public Color[] getColors() {
		return colors;
	}
	public void setColors(Color[] colors) {
		this.colors = colors;
	}
	public Size[] getSizes() {
		return sizes;
	}
	public void setSizes(Size[] sizes) {
		this.sizes = sizes;
	}
	public Category[] getCategories() {
		return categories;
	}
	public void setCategories(Category[] categories) {
		this.categories = categories;
	}
	public String getSeeMoreLabel() {
		return seeMoreLabel;
	}
	public void setSeeMoreLabel(String seeMoreLabel) {
		this.seeMoreLabel = seeMoreLabel;
	}
	public String getSeeMoreUrl() {
		return seeMoreUrl;
	}
	public void setSeeMoreUrl(String seeMoreUrl) {
		this.seeMoreUrl = seeMoreUrl;
	}
	public String getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(String extractDate) {
		this.extractDate = extractDate;
	}
	
}
