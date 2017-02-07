/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estudiante
 */


public class PrimerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    java.util.Scanner lec; 
        lec = new java.util.Scanner(System.in);
        System.out.print("Ingrese tamaño del arreglo");
        int tam = lec.nextInt();
        ///Crear arreglos.
        int[] vectorA = new int[tam];
        int[] vectorB = new int[tam];
        /// Leer datos.
        for (int i = 0; i < tam; i++){
            System.out.println ("dato"+i+ "A");
            vectorA[i] = lec.nextInt ();
            System.out.println ("dato"+i+"B");
            vectorB[i] = lec.nextInt();
        }
        /// Imprimir resultados.
        int[] resultado =  sumaVectores (vectorA, vectorB);
        for (int i = 0; i < tam; i++){
            System.out.println (resultado[i]);
        }
       
    }
    static int[] sumaVectores (int[]a, int[]b){
        int[] r = new int[a.length];
        for (int i= 0; i < a.length; i++){
            r[i]=a[i]+ b[i];
        }
        return r;

}
    
}

