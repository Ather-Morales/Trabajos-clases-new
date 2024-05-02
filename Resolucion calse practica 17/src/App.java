import java.util.Scanner;
/*Ather Daniel Morales Solano
 * 1M1-S 2024-1384U*/
public class App {

    public static int a=0;
    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);
    

    public static void main(String[] args) throws Exception {


        //Estructura general
        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        

        int[] array= llenado();

        int[] inverso= inversa(array);
        
        System.out.println("Mostrar");

        
        Mostrar(array);
        
        System.out.println("Su invertido es");

        invertido(inverso);



    }

    //Llenar la matriz
    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valor [" + (1+i) + "]");
            arreglo[i] = leer.nextInt();
            
        
        }
       
        return arreglo;
    }

    //muestra del array
    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

        

    }

    public static int[] inversa(int[] a){

        int[] arrinvertido= new int[a.length];

        for (int i=0; i< a.length; i++) {
            arrinvertido[i]= a[a.length-1-i];
        }
        return arrinvertido;
    }

    public static void invertido(int[] a){
        for ( int i : a) {
            System.out.println(i);
        }
    }


}
