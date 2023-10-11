package BinaryTree;

public class Student {

    private int id;

    private String fullName;
    private int age;

    public Student(int id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("ID: " +id);
        System.out.println("Full name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("--------------------------------");
    }

}
