import java.util.ArrayList;
import java.util.List;

public class Store {
    private int size;
    private List<Sellable> items;

    public Store() {
        size = 0;
        items = new ArrayList<>();
    }

    public void addSellable(Sellable a) throws DuplicateBarcodeException {
            for (Sellable item : items) {
                if (a.getBarcode().equals(item.getBarcode())) {
                    throw new DuplicateBarcodeException("DuplicateBarcodeException");
                }
            }
        this.items.add(a);
        size++;
    }

    public Sellable findSellableByBarcode(String barcode){
        Sellable ans = null;
        try {
            for (Sellable item: items) {
                if (item.getBarcode().equals(barcode)) {
                    ans = item;
                }
            }
        } catch (ItemNotExistException e) {
            System.out.println("An item with this barcode does not exist.");
        }
        return ans;
    }

    public int getSize() {
        return size;
    }

}
