package miPrincipal;
import java.util.Scanner;
import grafos.GrafoMatriz;
public class AppGrafos{
    public static void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("       GRAFOS                    ");
        System.out.println("********************************");
        System.out.println("1) Matriz de Adyacencia         ");
        System.out.println("2) Lista de Adyacencia          ");

        System.out.println("0) SALIR                        ");
        System.out.print("Selecciona opción:");
        opc = entrada.nextInt();
        switch (opc) {
            case 1:
                matrizAdyaencia();
                break;
            case 2:
                listaAdyacencia();
                break;
            case 0:
                System.out.println("Hasta luego");
                break;
        
            default:
                System.out.println("opcion invalida");
        }
        

    }
}