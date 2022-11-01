// TODO
public class FoodProduct implements Sellable{
    private String barcode;
    private double price;

    public FoodProduct(String barcode, double price) {
        this.barcode = barcode;
        this.price = price;
    }

    @Override
    public String getBarcode() {
        return barcode;
    }

    @Override
    public double getAfterTaxPrice() {
        return price;
    }
}
