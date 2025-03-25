package hdt7;

public class HomeAppliances implements Comparable<HomeAppliances> {
    private String category;
    private String sku;
    private double priceRetail;
    private double priceCurrent;
    private String productName;

    public HomeAppliances(
        String category,
        String sku, 
        double priceRetail, 
        double priceCurrent, 
        String productName
    ) {
        // propiedades
        this.category = category;
        this.sku = sku;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
    }

    public HomeAppliances() {}

    /**
     * @return String this.category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param String category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return String this.sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku String
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return double this.priceRetail
     */
    public double getPriceRetail() {
        return this.priceRetail;
    }

    /**
     * @param double priceRetail
     */
    public void setPriceRetail(double priceRetail) {
        this.priceRetail = priceRetail;
    }

    /**
     * @return double this.priceCurrent
     */
    public double getPriceCurrent() {
        return this.priceCurrent;
    }

    /**
     * @param priceCurrent double
     */
    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    /**
     * @return double this.productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @param String productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public int compareTo(HomeAppliances o) {
        return this.sku.equals(o.getSku()) ? 1: 0;
    }
    
}
