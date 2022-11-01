public class IntList_exercise {

    int head;
    IntList_exercise rest;

    public IntList_exercise(int head, IntList_exercise rest){
        this.head = head;
        this.rest = rest;
    }

    public String iterativeToString(){
        IntList_exercise current = this;
        String str = "";

        while (current != null){
            str = "" + this.head + ", " + this.rest;
            current = current.rest;
        }

        return str;
    }

    public IntList_exercise incrList(int delta) {
        if (this.rest == null)
            return new IntList_exercise(this.head + delta, null);
        else
            return new IntList_exercise(this.head + delta, this.rest.incrList(delta));
    }
}
