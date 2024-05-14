package miPrincipal;
//Proposito: demostrar la clase Treeset que provee java
//           como un arbol de busqueda binaria
import java.util.TreeSet;
import java.util.Iterator;

public class DemoClaseTreeSet{
    public static void main(String[] args) {
    //crea el arbol de busqueda
    TreeSet<Integer> t = new TreeSet<Integer>();
    //Insertar algunos elementos
    t.add(5);
    t.add(3);
    t.add(9);
    t.add(2);

    //mostrar los elementos del arbol

    for(Iterator<Integer>it=t.iterator();it.hasNext();)
    {
        System.out.println(it.next());//los elementos da in orden por default
    }
    //busco elementos
    System.out.println(t.contains(5));
    System.out.println(t.contains(8));

    //eliminado algunos elementos
    t.remove(5);
    System.out.println("Muestro los elementos despues de la eliminacion");
    for(Iterator<Integer>it=t.iterator();it.hasNext();){
        System.out.println(it.next());
    }

    System.out.println("Tamaño= "+t.size());

    System.out.println(t.first());
    System.out.println(t.last());
    

    }
}
