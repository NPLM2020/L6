public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat("Oliver");
        Animal shepherd = new Shepherd("Sam");
        Animal pekingese = new Pekingese("Sophie");

        System.out.println(cat);
        cat.run(300);
        cat.swim(1);
        cat.jump(1.5f);
        System.out.println();

        System.out.println(shepherd);
        shepherd.run(1000);
        shepherd.swim(5);
        shepherd.jump(1.5f);
        System.out.println();

        System.out.println(pekingese);
        pekingese.run(1000);
        pekingese.swim(5);
        pekingese.jump(1.5f);
        System.out.println();

    }
}
