public class FoodProduct{
    private String barcode;
    private double price;

    public FoodProduct(String barcode, double price) {
        this.barcode = barcode;
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public double getAfterTaxPrice() {
        return price;
    }

    public static void main(String[] args) {
        FoodProduct item1 = new FoodProduct("123", 5.6);
        System.out.println(item1.getBarcode());
        System.out.println(item1.getAfterTaxPrice());
    }
}
