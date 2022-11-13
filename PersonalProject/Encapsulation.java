// on main.java :

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        // TODO auto-generate method stub

        Student s = new Student(); // we are creating an obj that calls the class student
        s.setName("Susan");
        s.setAge(24);
        System.out.println(s.name);
        System.out.println(s.getAge());

        //TODO this is not a good practice:
        //s.name = "tom";
        //s.age = 17;
        //System.out.println(s.name);
        //System.out.println(s.age);
    }
}

// on student.java

public class Student {

    String name;
    int age;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return age;
    }
}
