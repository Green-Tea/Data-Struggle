public class OffByN implements CharacterComparator{

    private int offBy;

    public OffByN(int N) {
        offBy = N;
    }

    @Override
    public boolean equalChars(char x, char y) {
        return (int) x - (int) y == offBy || (int) x - (int) y == -offBy;
    }
}