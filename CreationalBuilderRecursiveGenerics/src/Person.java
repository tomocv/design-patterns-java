// builder inheritance with recursive generics

class Person {
    public String name;

    public String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class PersonBuilder<SELF extends  PersonBuilder<SELF>> {
    protected Person person = new Person();

    // critical to return SELF here
    public SELF withName(String name) {
        person.name = name;
        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self() {
        // unchecked cast, but actually safe
        // proof: try sticking a non-PersonBuilder
        //        as SELF parameter; it won't work!
        return (SELF) this;
    }
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAt(String position) {
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}

class Demo {
    public static void main(String[] args) {
        EmployeeBuilder pb = new EmployeeBuilder();
        Person tomislav = pb
                .withName("Tomislav")
                .worksAt("Developer")
                .build();
        System.out.println(tomislav);

    }
}