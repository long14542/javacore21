package ontap_oop.products.Service.lab3.entities;

import ontap_oop.products.Service.lab3.entities.service.WorkerService;
import ontap_oop.products.Service.lab3.entities.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkerService service = new WorkerService();
        ArrayList<Worker> workers= new ArrayList<>();
        ArrayList<History> histories = new ArrayList<>();
        Menu menu = new Menu();
        menu.handleUserSelect(scanner, service, workers, histories);
    }
}
