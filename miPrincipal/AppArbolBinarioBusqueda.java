package miPrincipal;

import java.util.Scanner;

public class AppArbolBinarioBusqueda{
    public static void menu(){
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
        System.out.println("********************************");
        System.out.println("       ARBOLES BINARIOS         ");
        System.out.println("********************************");
        System.out.println("1) Insertar nodo                ");
        System.out.println("2) Buscar nodo                  ");
        System.out.println("3) Eliminar nodo                ");
        System.err.println();
        System.out.println("0) SALIR                       ");
        System.out.print("Selecciona opción:");
        opc=consola.nextInt();
        switch (opc) {
            case 1:
                insertarNodo();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 0:
            System.out.println("Hasta luego");
                break;
            default:
            System.out.println("Opcion invalida");
        }
    }while(opc !=0);

    public static void insetarNodo(){
        AppArbolBinarioBusqueda arbol = new AppArbolBinarioBusqueda();
        try{
            arbol.insertarNodo(new Entero(10))

        }catch (Exception e){
            System.out.println("Error :"+e.getMessage());
        }
    }
    }
}