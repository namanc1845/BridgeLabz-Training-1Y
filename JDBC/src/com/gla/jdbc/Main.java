package com.gla.jdbc;

public class Main {

    private static Object pm;

    public static void main(String[] args) {

        EmployeeManager em = new EmployeeManager();

        em.addEmployee(1, "Rahul", 45000);
        em.addEmployee(2, "Aman", 12000);
        em.addEmployee(3, "Priya", 35000);

        em.showEmployee();

        em.updateSalary(1);

        em.deleteEmployee();

        ProductManager pm = new ProductManager();

        pm.addProduct(101, "Mouse", 5);
        pm.addProduct(102, "Keyboard", 20);
        pm.addProduct(103, "Monitor", 8);

        System.out.println("Low Stock Products:");

        pm.showLowStock();

        pm.updateQty(101, 15);

        pm.deleteProduct(102);

        LibraryManager lm = new LibraryManager();

        lm.addBook(1, "Java Basics", "James", "Available");
        lm.addBook(2, "DBMS", "Navathe", "Available");

        System.out.println("Available Books:");

        lm.showAvailableBooks();

        lm.issueBook(1);

        lm.deleteBook(2);

        CustomerManager cm = new CustomerManager();

        cm.addCustomer(1, "Rahul", "9876543210");
        cm.addCustomer(2, "Priya", "9123456780");

        System.out.println("Search Result:");

        cm.searchCustomer("Rah");

        cm.updatePhone(1, "9999999999");

        cm.deleteCustomer(2);

        AccountManager am = new AccountManager();

        am.addAccount(1001, "Rahul", 25000);
        am.addAccount(1002, "Priya", 8000);

        System.out.println("Accounts with balance > 10000:");

        am.showAccounts();

        am.updateBalance(1002, 15000);

        am.deleteAccount(1001);

        MovieManager mm = new MovieManager();

        mm.addMovie(1, "Avengers", 50);
        mm.addMovie(2, "Pushpa 2", 0);

        System.out.println("Available Movies:");

        mm.showAvailableMovies();

        mm.updateSeats(1, 45);

        mm.deleteMovie(2);

        PatientManager mp = new PatientManager();

        mp.addPatient(1, "Rahul", "Fever");
        mp.addPatient(2, "Priya", "Diabetes");

        System.out.println("Patients with Fever:");

        mp.showPatientsByDisease("Fever");

        mp.updateDisease(1, "Cold");

        mp.deletePatient(2);

        VehicleManager vm = new VehicleManager();

        vm.addVehicle("RJ14AB1234", "Rahul", "Pending");
        vm.addVehicle("RJ45CD5678", "Priya", "Completed");

        System.out.println("Pending Vehicles:");

        vm.showPendingVehicles();

        vm.updateStatus("RJ14AB1234");

        vm.deleteVehicle("RJ45CD5678");

        EnrollmentManager me = new EnrollmentManager();

        me.addEnrollment(1, "Rahul", "Java");
        me.addEnrollment(2, "Priya", "Python");

        System.out.println("Students enrolled in Java:");

        me.showByCourse("Java");

        me.updateCourse(1, "DBMS");

        me.deleteEnrollment(2);

        MenuManager ma = new MenuManager();

        ma.addItem(1, "Burger", 150);
        ma.addItem(2, "Pizza", 300);

        System.out.println("Items below ₹200:");

        ma.showCheapItems();

        ma.updatePrice(2, 180);

        ma.deleteItem(1);

        MemberManager mem = new MemberManager();

        mem.addMember(1, "Rahul", "Premium", 6);
        mem.addMember(2, "Priya", "Basic", 3);

        System.out.println("Premium Members:");

        mem.showPremiumMembers();

        mem.updateMonths(2, 6);

        mem.deleteMember(1);

        SalesManager sm = new SalesManager();

        sm.addSale(1, "Java Book", 2, 450);
        sm.addSale(2, "DBMS Book", 1, 350);

        System.out.println("Sales with quantity > 1:");

        sm.showSales();

        sm.updateQuantity(2, 3);

        sm.deleteSale(1);

        TaskManager tm = new TaskManager();

        tm.addTask(1, "Complete JDBC Assignment", "Pending");
        tm.addTask(2, "Submit Project", "Completed");

        System.out.println("Pending Tasks:");

        tm.showPendingTasks();

        tm.completeTask(1);

        tm.deleteCompletedTasks();
    }
}

