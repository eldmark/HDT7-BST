package hdt7;

public class HomeAppliances implements Comparable<HomeAppliances> {
    private String category;
    private String dateScraped;
    private String sortBy;
    private String runStartDate;
    private String subcategory;
    private String shippingLocation;
    private String sku;
    private String country;
    private String brand;
    private double priceRetail;
    private double priceCurrent;
    private String seller;
    private String productUrl;
    private String currency;
    private String breadcrumbs;
    private String department;
    private String promotion;
    private int bestsellerRank;
    private String productName;
    private String websiteUrl;
    public HomeAppliances(String category, String dateScraped, String sortBy, String runStartDate, String subcategory, String shippingLocation, String sku, 
    String country, String brand, double priceRetail, double priceCurrent, String seller, String productUrl, String 
    currency, String breadcrumbs, String department, String promotion, int bestsellerRank, String productName, String websiteUrl) {
        this.category = category;
        this.dateScraped = dateScraped;
        this.sortBy = sortBy;
        this.runStartDate = runStartDate;
        this.subcategory = subcategory;
        this.shippingLocation = shippingLocation;
        this.sku = sku;
        this.country = country;
        this.brand = brand;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.seller = seller;
        this.productUrl = productUrl;
        this.currency = currency;
        this.breadcrumbs = breadcrumbs;
        this.department = department;
        this.promotion = promotion;
        this.bestsellerRank = bestsellerRank;
        this.productName = productName;
        this.websiteUrl = websiteUrl;
    }
    public HomeAppliances() {
    }
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDateScraped() {
        return dateScraped;
    }
    public void setDateScraped(String dateScraped) {
        this.dateScraped = dateScraped;
    }
    public String getSortBy() {
        return sortBy;
    }
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
    public String getRunStartDate() {
        return runStartDate;
    }
    public void setRunStartDate(String runStartDate) {
        this.runStartDate = runStartDate;
    }
    public String getSubcategory() {
        return subcategory;
    }
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
    public String getShippingLocation() {
        return shippingLocation;
    }
    public void setShippingLocation(String shippingLocation) {
        this.shippingLocation = shippingLocation;
    }
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPriceRetail() {
        return priceRetail;
    }
    public void setPriceRetail(double priceRetail) {
        this.priceRetail = priceRetail;
    }
    public double getPriceCurrent() {
        return priceCurrent;
    }
    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }
    public String getSeller() {
        return seller;
    }
    public void setSeller(String seller) {
        this.seller = seller;
    }
    public String getProductUrl() {
        return productUrl;
    }
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getBreadcrumbs() {
        return breadcrumbs;
    }
    public void setBreadcrumbs(String breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getPromotion() {
        return promotion;
    }
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
    public int getBestsellerRank() {
        return bestsellerRank;
    }
    public void setBestsellerRank(int bestsellerRank) {
        this.bestsellerRank = bestsellerRank;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }
    @Override
    public int compareTo(HomeAppliances o) {
        return this.sku.equals(o.getSku()) ? 0: -1;
    }
    
}
