package hdt7;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // data file path
        String filepath = "./src/main/java/hdt7/resources/home_appliances.csv";

        // binary tree
        BinaryTree<HomeAppliances> tree = new BinaryTree<>();
        Scanner scanner = new Scanner(System.in);

        ArrayList<HomeAppliances> homeAppliances = CsvController.getFromCsv(filepath);
        
        // ordenar e insertar en el arbol
        homeAppliances.sort((a, b) -> a.getSku().compareTo(b.getSku()));
        for (HomeAppliances homeAppliance : homeAppliances) {
            tree.insert(homeAppliance);
        }

        String option = "";
        while (!option.equals("2")) {
            System.out.print("""
            *******************
            MENU
            ===================
            (1) Buscar por sku
            (2) Salir
            *******************
            >>> """);

            option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.print("SKU: ");
                String skuToSearch = scanner.nextLine();

                HomeAppliances searchKey = new HomeAppliances();
                searchKey.setSku(skuToSearch);

                // busqueda si se encuentra en el arbol
                HomeAppliances result = tree.search(searchKey);

                if (result != null) {
                    System.out.println(
                        "\n> Nombre: " + result.getProductName() + "\n" +
                        "> Precio actual: " + result.getPriceCurrent() + "\n" +
                        "> Precio sin descuento: " + result.getPriceRetail() + "\n" +
                        "> Categoria: " + result.getCategory() + "\n"
                    );
                } else {
                    System.out.println("No encontrado...");
                }
            } 
        }
        scanner.close();
    }
}