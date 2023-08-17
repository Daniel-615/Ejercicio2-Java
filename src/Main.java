package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int opcion = 0;

       System.out.println("Bienvenido!");
       System.out.println("Ingresa una opcion:");
       System.out.println("1. Crear tabla");
       System.out.println("2. Select");
       System.out.println("3. Insert");
       System.out.println("4. Update");
       System.out.println("5. Delete");
       System.out.println("Ingrese la opcion: ");
       opcion = scanner.nextInt();

       switch (opcion) {
        case 1:
            CreateTable.Table();
            break;
        case 2: 
            Select.displayCompanyData();
            break;
        case 3:
            Insert.insertRecords();
            break;
        case 4: 
            Update.displayAndUpdateData();
            break;
        case 5: 
            Delete.deleteAndDisplayData();
            break;
        default:
            System.out.println("Esa opcion no existe!");
            break;
       }
       scanner.close();
    }
}
