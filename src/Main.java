public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person[] people = {
                new Person("Sarah", 30, 112),
                new Person("John", 12, 123),
                new Person("Tom", 39, 124),
                new Person("Rayan", 34, 114),
        };
        Customer[] customers = {
                new Customer("Sarah", 30, 112, 1234),
                new Customer("Tom", 39, 124, 283947),
                new Customer("Rayan", 34, 114, 120349),
        };
        Gamer[] gamers = {
                new Gamer("John", 12, 123, "x"),
                new Gamer("Tom", 39, 124, "ps"),
        };
        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);


    }
}