package hdt7;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        BinaryTree<HomeAppliances> tree = new BinaryTree<HomeAppliances>();
        CsvController csvController = new CsvController();
        ArrayList<HomeAppliances> homeAppliances = csvController
                .getFromCsv("./bst/src/main/java/hdt7/resources/home_appliances.csv");
        System.out.println("Home Appliances: " + homeAppliances.size());
        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println(tree);
        homeAppliances.sort((a, b) -> Long.compare(a.getSku(), b.getSku()));
        for (HomeAppliances homeAppliance : homeAppliances) {
            tree.insert(homeAppliance);
        }
        while (flag) {
            System.out.println("1. Search by SKU");
            System.out.println("2. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Ingrese el SKU a buscar: ");
                    long skuToSearch = scanner.nextLong();
                    scanner.nextLine();
                    HomeAppliances homeAppliance = new HomeAppliances();
                    homeAppliance.setSku(skuToSearch);
                    HomeAppliances result = tree.search(homeAppliance);
                    if (result != null) {
                        System.out.println("Producto encontrado: " + result.getProductName() +
                                " Precio actual: " + result.getPriceCurrent() +
                                " Precio sin descuento: " + result.getPriceRetail() +
                                " categoria: " + result.getCategory());
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 2:
                    flag = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        scanner.close();
    }

}
