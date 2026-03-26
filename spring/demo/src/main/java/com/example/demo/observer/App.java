package observer;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Observer Design Pattern ===");

        // ========== CASE 1: Co phieu & Nha dau tu ==========
        System.out.println("\n--- Case 1: Co phieu & Nha dau tu ---");

        Stock appleStock = new Stock("AAPL", 150.0);
        Stock googleStock = new Stock("GOOGL", 2800.0);

        Investor investor1 = new Investor("Nguyen Van A");
        Investor investor2 = new Investor("Tran Thi B");
        Investor investor3 = new Investor("Le Van C");

        // Dang ky theo doi
        appleStock.registerObserver(investor1);
        appleStock.registerObserver(investor2);
        googleStock.registerObserver(investor2);
        googleStock.registerObserver(investor3);

        // Thay doi gia co phieu
        appleStock.setPrice(155.5);
        googleStock.setPrice(2750.0);

        // Investor2 huy theo doi AAPL
        System.out.println("\n>> Nguyen Van A huy theo doi AAPL");
        appleStock.removeObserver(investor1);
        appleStock.setPrice(160.0);

        // ========== CASE 2: Task & Thanh vien nhom ==========
        System.out.println("\n\n--- Case 2: Task & Thanh vien nhom ---");

        Task task1 = new Task("Thiet ke Database", "To Do");
        Task task2 = new Task("Viet API Backend", "To Do");

        TeamMember dev1 = new TeamMember("Hoang", "Developer");
        TeamMember dev2 = new TeamMember("Minh", "Developer");
        TeamMember pm = new TeamMember("Lan", "Project Manager");

        // Dang ky theo doi task
        task1.registerObserver(dev1);
        task1.registerObserver(pm);
        task2.registerObserver(dev2);
        task2.registerObserver(pm);

        // Thay doi trang thai task
        task1.setStatus("In Progress");
        task2.setStatus("In Progress");
        task1.setStatus("Done");
    }
}
