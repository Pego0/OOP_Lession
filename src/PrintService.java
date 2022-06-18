public class PrintService {
    public void print(Person[] people) {
        System.out.println("List size: " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Name: " + person.getName() +
                    "; Age: " + person.getAge() +
                    "; Phone Number: " + person.getPhoneNumber());
        }
        System.out.println();
    }

    public void print(Customer[] customers) {
        System.out.println("Size list of customers: " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Name: " + customer.getName() +
                    "; Age: " + customer.getAge() +
                    "; Phone Number: " + customer.getPhoneNumber());
        }
        System.out.println();
    }

    public void print(Gamer[] gamers) {
        System.out.println("Size list of gamers: " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamer gamer = gamers[i];
            System.out.println("Name: " + gamer.getName() +
                    "; Age: " + gamer.getAge() +
                    "; Phone Number: " + gamer.getPhoneNumber());
        }
        System.out.println();
    }
}

