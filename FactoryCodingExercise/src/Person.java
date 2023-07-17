class Person {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class PersonFactory {
    private int id = 0;

    public Person createPerson(String name) {
        return new Person(id++, name);
    }
}

class Demo {
    public static void main(String[] args) {
        PersonFactory pf = new PersonFactory();
        Person mirko = pf.createPerson("Mirko");
        Person slavko = pf.createPerson("Slavko");
        System.out.println(mirko);
        System.out.println(slavko);
    }
}