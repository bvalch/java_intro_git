public class Bear {
    private String name;
    private int age;

    private double weigth;


    public Bear(String name, int age, double weigth) {
        this.name = name;
        this.age = age;
        this.weigth=weigth;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String newName) {
        this.name = newName;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return this.weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
};
