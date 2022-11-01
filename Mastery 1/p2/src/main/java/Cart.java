import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Cart {
    private Store store;
    private List<String> items;

    public Cart(Store store) {
        this.store = store;
        items = new ArrayList<String>();
    }

    public void addItem(String barcode) {
        if (store.findSellableByBarcode(barcode) != null) {
            items.add(barcode);
        }
    }

    public double getTotal() {
        double ans = 0;
        for (String item: items) {
            try {
                Sellable current = store.findSellableByBarcode(item);
                ans += current.getAfterTaxPrice();
            } catch (ItemNotExistException e) {
                System.out.println("An item with this barcode does not exist");
            }
        }
        return ans;
    }

    public int getItemCount() {
        return items.size();
    }

    public int getUniqueItemCount() {
        HashSet<String> uniques = new HashSet<>();
        uniques.addAll(items);
        return uniques.size();
    }

}
