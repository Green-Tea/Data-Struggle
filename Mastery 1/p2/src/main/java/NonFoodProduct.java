// TODO
public class NonFoodProduct implements Sellable{
    private String barcode;
    private double price;
    private double taxRate;

    public NonFoodProduct(String barcode, double price, double taxRate) {
        this.barcode = barcode;
        this.price = price;
        this.taxRate = taxRate;
    }

    @Override
    public String getBarcode() {
        return barcode;
    }

    @Override
    public double getAfterTaxPrice() {
        return price + (price * taxRate);
    }
}
