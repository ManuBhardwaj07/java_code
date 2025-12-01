class D {
    public static void main(String[] args) {
        System.out.println("-----start");

        Animal x = new Cat();

        Dog y = (Dog)x;

        System.out.println("-----end");
    }    
}

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }
