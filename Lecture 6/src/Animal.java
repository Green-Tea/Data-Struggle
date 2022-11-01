public class Animal {
    private String name;
    private int age;
    public int height;  // accessible by everyone
    int weight; // accessible by subclass and anyone in the same package

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void play() {
        System.out.println(name + " play!");
    }

}
