class Bird
{
    public int age;

    public String fly()
    {
        return age < 10 ? "flying" : "too old";
    }
}

class Lizard
{
    public int age;

    public String crawl()
    {
        return (age > 1) ? "crawling" : "too young";
    }
}

class Dragon
{
    private Bird bird;
    private Lizard lizard;
    private int age;

    public Dragon() {
        bird = new Bird();
        lizard = new Lizard();
        setAge(0);
    }

    public void setAge(int age)
    {
        this.age = bird.age = lizard.age = age;
    }
    public String fly()
    {
        return bird.fly();
    }
    public String crawl()
    {
        return lizard.crawl();
    }
}

class Demo {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon.fly());
        System.out.println(dragon.crawl());

        dragon.setAge(20);

        System.out.println(dragon.fly());
        System.out.println(dragon.crawl());
    }
}