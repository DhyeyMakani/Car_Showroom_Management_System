import java.util.*;
import javax.lang.model.util.ElementScanner14;

// create the car object
class vehicles {
    String colour;
    String company;
    int price;
    int quantity;

    vehicles() {
        this.colour = null;
        this.company = null;
        this.price = 0;
        this.quantity = 0;
    }

    vehicles(String colour, String company, int price, int quantity) {
        this.colour = colour;
        this.company = company;
        this.price = price;
        this.quantity = quantity;
    }
}

class car extends vehicles {
    Scanner sc = new Scanner(System.in);
    int engine_cc;
    String fuel_type;

    car() {
        super();
        this.engine_cc = 0;
        this.fuel_type = null;
    }

    car(String company, String colour, String fuel_type, int price, int quantity, int engine_cc) {
        super(colour, company, price, quantity);
        this.engine_cc = engine_cc;
        this.fuel_type = fuel_type;
    }

    car getter() {

        System.out.println("Enter the company name          :");
        String company = sc.nextLine();
        System.out.println("Enter the colour of car         :");
        String colour = sc.nextLine();
        System.out.println("Enter the type of car fuel_type :");
        String fuel_type = sc.nextLine();
        System.out.println("Enter the capacity of car engine:");
        int engine_cc = sc.nextInt();
        System.out.println("Enter the quantity of car       :");
        int quantity = sc.nextInt();
        System.out.println("Enter the price of car          :");
        int price = sc.nextInt();

        return new car(company, colour, fuel_type, price, quantity, engine_cc);

    }

    void info_display() {
        System.out.println("car name is         :" + company);
        System.out.println("car colour          :" + colour);
        System.out.println("car fuel type       :" + fuel_type);
        System.out.println("car price           :" + price);
        System.out.println("car quantity        :" + quantity);
        System.out.println("car engine capacity :" + engine_cc);

    }
}

// inherite the class car in Information class
class bike extends vehicles {

    Scanner sc = new Scanner(System.in);

    bike() {
        super();
    }

    bike(String company, String colour, int price, int quantity) {
        super(colour, company, price, quantity);
    }

    // System.out.println("Enter the name of car :");
    bike getter() {

        System.out.println("Enter the name of bike     :");
        String company = sc.nextLine();
        System.out.println("Enter the colour of bike   :");
        String colour = sc.nextLine();
        System.out.println("Enter the quantity of bike :");
        int quantity = sc.nextInt();
        System.out.println("Enter the price of bike    :");
        int price = sc.nextInt();
        return new bike(company, colour, price, quantity);

    }

    void info_display() {
        System.out.println("Bike name is  :" + company);
        System.out.println("Bike colour   :" + colour);
        System.out.println("Bike price    :" + price);
        System.out.println("Bike quantity :" + quantity);

    }

}

class cycle extends vehicles {
    cycle() {
        super();
    }

    cycle(String company, String colour, int price, int quantity) {
        super(colour, company, price, quantity);
    }

    Scanner sc = new Scanner(System.in);
    // String name;
    // String colour;

    // System.out.println("Enter the name of car :");
    cycle getter() {

        System.out.println("Enter the name of comapany  :");
        String company = sc.nextLine();
        System.out.println("Enter the colour of cycle   :");
        String colour = sc.nextLine();
        System.out.println("Enter the quantity of cycle :");
        int quantity = sc.nextInt();
        System.out.println("Enter the price of cycle    :");
        int price = sc.nextInt();

        return new cycle(company, colour, price, quantity);
    }

    void info_display() {
        System.out.println("cycle name is  :" + company);
        System.out.println("cycle colour   :" + colour);
        System.out.println("cycle price    :" + price);
        System.out.println("cycle quantity :" + quantity);

    }

}

class bill {

    String customer_name;
    String sell_vehicle;
    String sell_date;
    int quantity_vehicle;
    int price_vehicle;

    bill() {
        this.customer_name = null;
        this.sell_vehicle = null;
        this.sell_date = null;
        this.quantity_vehicle = 0;
        this.price_vehicle = 0;
    }

    bill(String name, String vehicle, String date, int quantity, int price) {
        this.customer_name = name;
        this.sell_vehicle = vehicle;
        this.sell_date = date;
        this.quantity_vehicle = quantity;
        this.price_vehicle = price;

    }

    bill getter(String name, String date, String vehicle, int quantity, int price) {
        bill b = new bill(name, vehicle, date, quantity, price);
        return b;
    }

}
// for creating the car object many time

class company {

    public static void main(String args[]) {
        // c1.getter();
        Scanner sc = new Scanner(System.in);
        ArrayList<car> car_link = new ArrayList<>();
        ArrayList<bike> bike_link = new ArrayList<>();
        ArrayList<cycle> cycle_link = new ArrayList<>();
        ArrayList<bill> car_bill = new ArrayList<>();
        ArrayList<bill> bike_bill = new ArrayList<>();
        ArrayList<bill> cycle_bill = new ArrayList<>();
        // Vector<Object> v = new Vector<Object>();
        System.out.println("\033[H\033[2J");
        // System.out.flush();
        // initially added
        car a1 = new car("swift", "blue", "petrol", 500000, 5, 1197);
        car a2 = new car("BMW", "black", "petrol", 6500000, 7, 4050);
        car a3 = new car("Audi", "white", "petrol", 4500000, 6, 6500);
        car_link.add(a1);
        car_link.add(a2);
        car_link.add(a3);

        bike b1 = new bike("hero-honda", "blue", 50000, 4);
        bike b2 = new bike("Dream-yuga", "black", 48000, 4);
        bike b3 = new bike("passion", "white", 80000, 9);
        bike_link.add(b1);
        bike_link.add(b2);
        bike_link.add(b3);

        cycle c1 = new cycle("TATA_with_gear", "blue", 5000, 4);
        cycle c2 = new cycle("HERO_without_gear", "black", 4800, 4);
        cycle c3 = new cycle("JUICE_with_disk_break", "white", 8000, 9);
        cycle_link.add(c1);
        cycle_link.add(c2);
        cycle_link.add(c3);

        int x = 1;
        label: {

            while (x != 4) {
                label2: {
                    System.out.println("\033[H\033[2J");
                    System.out.println("\t\t\t----------------------------------------");
                    System.out.println("\t\t\t|    WELCOME TO BHARAT LTD. COMPANY    |");
                    System.out.println("\t\t\t----------------------------------------");
                    System.out.println("1.car \n2.Bike \n3.Cycle  \n4.Exit");
                    System.out.println("Enter the choice :");
                    x = sc.nextInt();
                    if (x == 4)
                        break label;
                    if (x == 1) {

                        int c = 1;

                        while (c != 7) {
                            System.out.println("\npress 1 : Add");
                            System.out.println("press 2 : show all car");
                            System.out.println("press 3 : Information of  car");
                            System.out.println("press 4 : show stock");
                            System.out.println("press 5 : Generate the bill");
                            System.out.println("press 6 : history of selling");
                            System.out.println("press 7 : Home");
                            System.out.println("Enter  your choice :");
                            c = sc.nextInt();
                            System.out.println("\033[H\033[2J");
                            if (c == 7)
                                break label2;
                            switch (c) {
                                case 1: {
                                    car new_car = new car();
                                    new_car = new_car.getter();
                                    car_link.add(new_car);
                                    break;

                                }
                                case 2: {
                                    int index = 1;
                                    for (car Car : car_link) {
                                        System.out.println(index + ") :" + Car.company);
                                        index++;
                                    }
                                    break;

                                }
                                case 3: {
                                    String car_name;
                                    System.out.println("Enter the name of car : ");
                                    car_name = sc.next();
                                    // System.out.println(bicycle_name);
                                    int check = 0;
                                    for (car Car : car_link) {
                                        if (car_name.equalsIgnoreCase(Car.company)) {
                                            Car.info_display();
                                            check = 1;
                                            break;
                                        }
                                    }
                                    if (check == 0) {
                                        System.out.println("Sorry,car does not exist!!!");
                                    }
                                    break;

                                }
                                case 4: {
                                    System.out.println("car name   :   quantity");
                                    for (car Car : car_link) {
                                        System.out.println(Car.company + "  : " + Car.quantity);
                                    }
                                    break;
                                }
                                case 5: {
                                    String car_name;
                                    int quantity;
                                    String customer_name;
                                    String date;
                                    System.out.println("Enter the name of customer         : ");
                                    customer_name = sc.next();
                                    System.out.println("Enter the name of car              : ");
                                    car_name = sc.next();
                                    System.out.println("Enter the Date(DD/MM/YYYY) of sell : ");
                                    date = sc.next();
                                    // quantity = sc.nextInt();

                                    System.out.println("Enter the quantity of car          : ");
                                    quantity = sc.nextInt();
                                    int check = 0;
                                    for (car Car : car_link) {
                                        if (Car.company.equalsIgnoreCase(car_name)) {
                                            Car.quantity = Car.quantity - quantity;
                                            System.out.println("Customer name : " + customer_name);
                                            System.out.println("Date of sell  : " + date);
                                            System.out.println("name of car   : " + Car.company);
                                            System.out.println("Total amount  : " + Car.price * quantity);

                                            bill b = new bill();
                                            b = b.getter(customer_name, date, Car.company, Car.quantity,
                                                    Car.price * quantity);
                                            car_bill.add(b);
                                            check = 1;
                                            break;
                                        }
                                    }
                                    if (check == 0) {
                                        System.out.println("please enter valid car name!!!");
                                    }
                                    break;
                                }
                                case 6: {
                                    System.out.println("*****  History  *****");
                                    int count = 0;
                                    for (bill Bill : car_bill) {
                                        count += Bill.price_vehicle;
                                        System.out.print("Customer name   : " + Bill.customer_name);
                                        System.out.print("Car             : " + Bill.sell_vehicle);
                                        System.out.print("Date of sell    : " + Bill.sell_date);
                                        System.out.print("Total amount    : " + Bill.price_vehicle + "\n");
                                    }
                                    System.out.println("Total selling : " + count);
                                    break;
                                }
                            }

                        }
                    } else if (x == 2) {

                        int c = 1;

                        while (c != 7) {
                            System.out.println("\npress 1 : Add");
                            System.out.println("press 2 : show all bike");
                            System.out.println("press 3 : Information of  bike");
                            System.out.println("press 4 : show stock");
                            System.out.println("press 5 : Generate the bill");
                            System.out.println("press 6 : history of selling");
                            System.out.println("press 7 : Home");
                            System.out.println("Enter your choice :");
                            c = sc.nextInt();
                            System.out.println("\033[H\033[2J");
                            switch (c) {
                                case 1: {
                                    bike new_bike = new bike();
                                    new_bike = new_bike.getter();
                                    bike_link.add(new_bike);
                                    break;
                                }
                                case 2: {
                                    int index = 1;
                                    for (bike Bike : bike_link) {
                                        System.out.println(index + ") :" + Bike.company);
                                        index++;
                                    }
                                    break;
                                }
                                case 3: {
                                    String bike_name;
                                    System.out.println("Enter the name of Bike : ");
                                    bike_name = sc.next();
                                    // System.out.println(bicycle_name);
                                    int check = 0;
                                    for (bike Bike : bike_link) {
                                        if (bike_name.equalsIgnoreCase(Bike.company)) {
                                            Bike.info_display();
                                            check = 1;
                                            break;
                                        }
                                    }
                                    if (check == 0) {
                                        System.out.println("Bike does not exist!!!");
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("Bike name   :   quantity");
                                    for (bike Bike : bike_link) {
                                        System.out.println(Bike.company + "   :   " + Bike.quantity);
                                    }
                                    break;
                                }
                                case 5: {
                                    String bike_name;
                                    int quantity;
                                    String date;
                                    String customer_name;
                                    System.out.println("Enter the name of customer         : ");
                                    customer_name = sc.next();
                                    System.out.println("Enter the name bike                : ");
                                    bike_name = sc.next();
                                    System.out.println("Enter the Date(DD/MM/YYYY) of sell : ");
                                    date = sc.next();
                                    System.out.println("Enter the quantity bike            : ");
                                    quantity = sc.nextInt();
                                    int check = 0;
                                    for (bike Bike : bike_link) {
                                        if (Bike.company.equalsIgnoreCase(bike_name)) {
                                            Bike.quantity = Bike.quantity - quantity;
                                            System.out.println("Customer name : " + customer_name);
                                            System.out.println("name of  bike : " + Bike.company);
                                            System.out.println("Total amount  : " + Bike.price * quantity);
                                            bill b = new bill();
                                            b = b.getter(customer_name, date, Bike.company, Bike.quantity,
                                                    Bike.price * quantity);
                                            bike_bill.add(b);
                                            check = 1;
                                            break;
                                        }

                                    }
                                    if (check == 0) {
                                        System.out.println("Please,Enter valid car name!!!");
                                    }
                                    break;

                                }
                                case 6: {
                                    System.out.println("****  History  ****");
                                    int count = 0;
                                    for (bill Bill : bike_bill) {
                                        count += Bill.price_vehicle;
                                        System.out.print("Customer name   : " + Bill.customer_name);
                                        System.out.print("Bike            : " + Bill.sell_vehicle);
                                        System.out.print("Date of sell    : " + Bill.sell_date);
                                        System.out.print("Total amount    : " + Bill.price_vehicle + "\n");
                                    }
                                    System.out.println("Total selling :" + count);
                                    break;
                                }
                            }
                        }
                    } else if (x == 3) {

                        int c = 1;

                        while (c != 7) {
                            System.out.println("\npress 1 :Add");
                            System.out.println("press 2 :show all bicycle");
                            System.out.println("press 3 :Information of  bicycle");
                            System.out.println("press 4 :show stock");
                            System.out.println("press 5:Generate the bill");
                            System.out.println("press 6: history of selling");
                            System.out.println("press 7 :Home");
                            System.out.println("Enter your choice :");
                            c = sc.nextInt();
                            System.out.println("\033[H\033[2J");
                            switch (c) {

                                case 1: {

                                    cycle new_cycle = new cycle();
                                    new_cycle = new_cycle.getter();
                                    cycle_link.add(new_cycle);
                                    break;
                                }
                                case 2: {
                                    int index = 1;
                                    for (cycle Cycle : cycle_link) {
                                        System.out.println(index + ") :" + Cycle.company);
                                        index++;
                                    }
                                    break;
                                }
                                case 3: {
                                    String bicycle_name;
                                    System.out.println("Enter the name of Bicycle : ");
                                    bicycle_name = sc.next();
                                    int check = 0;
                                    for (cycle Cycle : cycle_link) {
                                        if (bicycle_name.equalsIgnoreCase(Cycle.company)) {
                                            Cycle.info_display();
                                            check = 1;
                                            break;
                                        }
                                    }
                                    if (check == 0) {
                                        System.out.println("Bicycle does not exist!!!");
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("Bike name    :   quantity");
                                    for (cycle Cycle : cycle_link) {
                                        System.out.println(Cycle.company + "    :    " + Cycle.quantity);
                                    }
                                    break;
                                }
                                case 5: {
                                    String cycle_name;
                                    int quantity;
                                    String customer_name;
                                    String date;
                                    System.out.println("Enter the name of customer         : ");
                                    customer_name = sc.next();
                                    System.out.println("Enter the name of cycle            : ");
                                    cycle_name = sc.next();
                                    System.out.println("Enter the Date(DD/MM/YYYY) of sell : ");
                                    date = sc.next();
                                    System.out.println("Enter the quantity of cycle        : ");
                                    quantity = sc.nextInt();
                                    int check = 0;
                                    for (cycle Cycle : cycle_link) {
                                        if (Cycle.company.equalsIgnoreCase(cycle_name)) {
                                            Cycle.quantity = Cycle.quantity - quantity;
                                            System.out.println("Customer name   : " + customer_name);
                                            System.out.println("Name of bicycle : " + Cycle.company);
                                            System.out.println("Total amount    : " + Cycle.price * quantity);
                                            bill b = new bill();
                                            b = b.getter(customer_name, date, Cycle.company, Cycle.quantity,
                                                    Cycle.price * quantity);
                                            cycle_bill.add(b);
                                            check = 1;
                                            break;
                                        }
                                    }
                                    if (check == 0) {
                                        System.out.println("Please,Enter valid car name!!!");
                                    }
                                    break;

                                }
                                case 6: {
                                    System.out.println("****  History  ****");
                                    int count = 0;
                                    for (bill Bill : cycle_bill) {
                                        count += Bill.price_vehicle;
                                        System.out.print("Customer name   : " + Bill.customer_name);
                                        System.out.print("Cycle           : " + Bill.sell_vehicle);
                                        System.out.print("Date of sell    : " + Bill.sell_date);
                                        System.out.print("Total amout     : " + Bill.price_vehicle + "\n");
                                    }
                                    System.out.println("Total selling : " + count);
                                    break;
                                }

                            }
                        }
                    } else {
                        System.out.println("Please,Enter the valid choice!!!");
                    }
                }
            }

        }
        System.out.println("::::::: Thanks for visiting :::::::");
        sc.close();
    }
}