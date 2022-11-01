package histogram;

import java.util.Iterator;

// TODO: Uncomment this and make sure to implement all the methods
public class SimpleHistogram<DT> implements Histogram<DT>, Iterable<DT> {
    private static class HistogramNode<DT> {
        DT item;
        int freq;
        HistogramNode next;
        HistogramNode prev;

        public HistogramNode(DT item, int freq, HistogramNode next, HistogramNode prev) {
            this.item = item;
            this.freq = freq;
            this.next = next;
            this.prev = prev;
        }
    }
    private HistogramNode sentinel;
    private int totalFreq;
    private HistogramNode last;

    // constructs an empty histogram (with no information)
    public SimpleHistogram() {
        sentinel = new HistogramNode(-1, 0, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        totalFreq = 0;
    }
    // constructs a histogram from a list of items given by the parameter items
    public SimpleHistogram(DT items[]) {
        SimpleHistogram histogram = new SimpleHistogram();
        for (DT item: items) {
            histogram.addItem(item);
        }
        totalFreq = items.length;
    }
    // constructs a (new) histogram from an existing histogram, sharing nothing
// internally
    public SimpleHistogram(Histogram hist) {

    }

    // checks if this item is unique
    public boolean checkUnique(DT item) {
        HistogramNode current = sentinel.next;
        while (current != sentinel) {
            if (current.item.equals(item)) {
                return false;
            }
        }
        return true;
    }

    // adds a new item to the histogram, or increases its frequency if the item is not new
    public void addItem(DT item) {
        if (checkUnique(item)) {
            last = new HistogramNode(item, 1, sentinel, sentinel.prev);
            last.prev.next = last;
            sentinel.prev = last;
        } else {
            // loop through the histogram to find the item, then increment its frequency
            HistogramNode current = sentinel.next;
            while (current != sentinel) {
                if (current.item.equals(item)) {
                    current.freq++;
                    break;
                }
                current = current.next;
            }
        }
    }

    @Override
    public int getTotalCount() {
        return totalFreq;
    }

    @Override
    public int getCount(DT item) {
        HistogramNode current = sentinel.next;
        while (current != sentinel) {
            if (current.item.equals(item)) {
                return current.freq;
            } else {
                current = current.next;
            }
        }
        return 0;
    }

    @Override
    public void setCount(DT item, int count) {
        if (checkUnique(item)) {
            for (int i = 0; i < count; i++) {
                addItem(item);
            }
        } else {
            HistogramNode current = sentinel.next;
            while (current != sentinel) {
                if (current.item.equals(item)) {
                    current.freq = count;
                    break;
                }
                current = current.next;
            }
        }
    }

    @Override
    public Iterator<DT> iterator() {
        return (Iterator<DT>) new SimpleHistogram<DT>(this);
    }
}
