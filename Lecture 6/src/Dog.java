public class Dog extends Animal{

    public int height; // variable with the same name as the parent

    public void status(int height) {
        System.out.println(height); // local variable
        System.out.println(this.height);    // this class' height
        System.out.println(super.height);   // superclass' (parent) height
    }

    public void bite() {
        // String myName = this.name; // name is private in Animal so it will be an error
        String myName = getName();
        System.out.println(myName + " bite!");
    }

    @Override
    public void play() {
        System.out.println("Play fetch!");
    }

}
