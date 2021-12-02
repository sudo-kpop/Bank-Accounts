package Main;

public class Main {
    public static void main(String[] args){
        Account account1 = new Account(1,
                "Checkings",
                500);
        Account account2 = new Account(2,
                "Checkings",
                1000);
        Account account3 = new Account(3,
                "Savings",
                500);
        Account account4 = new Account(4,
                "Checkings",
                2000);

        Customer customer1 = new Customer("101 89th S", "Joe Smith");
        Customer customer2 = new Customer("#4 Grand Central", "Amy Dalton");
        Customer customer3 = new Customer("PO Box 4823", "Bob Pennyworth");

        System.out.println(customer1);
        System.out.println(account1);
        System.out.println(customer2);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(customer3);
        System.out.println(account4);
        account1.withdraw(100);
        account2.deposit(500);
        account2.transfer(300,account3);
        account4.transfer(200,account1);
        System.out.println();
        System.out.println(customer1);
        System.out.println(account1);
        System.out.println(customer2);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(customer3);
        System.out.println(account4);;



    }

}
