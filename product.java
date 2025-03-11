public class product {
    private int productId;
    private String productName;
    private double productPrice;
    private String productManufacturer;


    public Product(int productId, String productName, double productPrice, String productManufacturer) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productManufacturer = productManufacturer;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productManufacturer='" + productManufacturer + '\'' +
                '}';
    }
}