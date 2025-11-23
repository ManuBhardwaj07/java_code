class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

class C {
    public static void main(String[] args) {
        Student[] x = {
            new Student("om", 25), 
            new Student("ram", 18), 
            new Student("shyam", 23)
        };

        System.out.println(x); // prints array reference
        System.out.println("------------");

        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]); // prints student details
    }
}