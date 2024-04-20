import java.util.ArrayList;
import java.util.Scanner;

public class InventorySystem {
    private static ArrayList<ElectronicItem> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("1. Añadir producto.");
            System.out.println("2. Modificar producto.");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción > ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    modifyItem();
                    break;
                case 3:
                    displayInventory();
                    break;
                case 4:
                    System.out.println("Saliendo del programa, adios...");
                    break;
                default:
                    System.out.println("Opción invalida, por favor ingrese un dato valido.");
            }
        } while (choice != 4);
    }

    private static void addItem() {
        System.out.println("Selecciona el item a añadir:");
        System.out.println("1. Telefono movil.");
        System.out.println("2. Laptop.");
        System.out.println("> ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addMobilePhone();
                break;
            case 2:
                addLaptop();
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }

    private static void addMobilePhone() {
        scanner.nextLine();
        System.out.println("Ingresa el nombre: ");
        String name = scanner.nextLine();
        System.out.println("Ingresa el modelo: ");
        String model = scanner.nextLine();
        System.out.println("Ingresa descripcion: ");
        String description = scanner.nextLine();
        System.out.println("Ingresa precio: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter marca: ");
        String brand = scanner.nextLine();
        System.out.println("Enter diseñador: ");
        String designer = scanner.nextLine();

        MobilePhone mobilePhone = new MobilePhone(name, model, description, price, brand, designer);
        inventory.add(mobilePhone);
        System.out.println("Telefono movil añadido exitosamente...");
    }

    private static void addLaptop() {
        scanner.nextLine();
        System.out.println("Ingresa nombre: ");
        String name = scanner.nextLine();
        System.out.println("Ingresa modelo: ");
        String model = scanner.nextLine();
        System.out.println("Ingresa descripción: ");
        String description = scanner.nextLine();
        System.out.println("Ingresa el precio: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingresa generación: ");
        String generation = scanner.nextLine();
        System.out.println("Ingresa proveedor: ");
        String supplier = scanner.nextLine();

        Laptop laptop = new Laptop(name, model, description, price, generation, supplier);
        inventory.add(laptop);
        System.out.println("Laptop añadida exitosamente...");
    }

    private static void modifyItem() {
        displayInventory();
        System.out.println("Ingresa el numero del item a cambiar: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < inventory.size()) {
            ElectronicItem item = inventory.get(index);
            scanner.nextLine();
            System.out.println("Añade nueva descripción: ");
            String description = scanner.nextLine();
            System.out.println("Añade nuevo precio: ");
            double price = scanner.nextDouble();

            item.setDescription(description);
            item.setPrice(price);
            System.out.println("Producto actualizado exitosamente...");
        } else {
            System.out.println("Item no encontrado...");
        }
    }

    private static void displayInventory() {
        System.out.println("Inventory:");
        for (int i = 0; i < inventory.size(); i++) {
            ElectronicItem item = inventory.get(i);
            System.out.println("Numero: " + i);
            System.out.println("Nombre: " + item.getName());
            System.out.println("Modelo: " + item.getModel());
            System.out.println("Descripción: " + item.getDescription());
            System.out.println("Precio: " + item.getPrice());
            if (item instanceof MobilePhone) {
                MobilePhone mobilePhone = (MobilePhone) item;
                System.out.println("Marca: " + mobilePhone.getBrand());
                System.out.println("Diseñador: " + mobilePhone.getDesigner());
            } else if (item instanceof Laptop) {
                Laptop laptop = (Laptop) item;
                System.out.println("Generación: " + laptop.getGeneration());
                System.out.println("proveedor: " + laptop.getSupplier());
            }
            System.out.println();
        }
    }
}

