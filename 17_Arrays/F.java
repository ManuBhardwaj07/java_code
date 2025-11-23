class City {
    String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public String toString() {
        return cityName;
    }
}

class State {
    String stateName;

    State(String stateName) {
        this.stateName = stateName;
    }

    public String toString() {
        return stateName;
    }
}

class Address {
    String addr;
    City city;
    State state;

    Address(String addr, City city, State state) {
        this.addr = addr;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return addr + " - " + city + " - " + state;
    }
}

class Employee {
    String name;
    int age;
    Address address;

    Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return name + " - " + age + " - " + address;
    }
}

class F {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee("Gopal", 32,
                new Address("House No. 234", new City("Jabalpur"), new State("MP"))),
            new Employee("Sarvesh", 38,
                new Address("Plot No. A/32", new City("Jaipur"), new State("RJ"))),
            new Employee("Binson", 27,
                new Address("Lemon Street", new City("Pune"), new State("MH")))
        };

        System.out.println(emps[0]); // ✅ prints full details
    }
}
