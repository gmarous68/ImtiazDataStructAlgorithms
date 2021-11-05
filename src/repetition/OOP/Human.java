package repetition.OOP;

public class Human {
    private String name;
    private int age;
    private String eyeColor;

    public Human(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }

    public void speak() {
        System.out.println(name + " speaking..");
    }

    public void eat() {
        System.out.println(name + " eating..");
    }

    public void sleep() {
        System.out.println(name + " sleeping..");
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

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}