/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video51;

/**
 *
 * @author eve_l
 */
public class Video51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlgoritmosDeOrdenamiento ordenar=new AlgoritmosDeOrdenamiento();
        int vector1[]={5,6,3,44,22,1);
        int vector2[]={55,4,43,44,2,10);
        int vector3[]={5,2,1,8,3,9,7);
        
        /*System.out.println("Arreglo Original");
        ordenar.MostrarArreglo(vector1);
         System.out.println("Arreglo Ordenado con burbuja1");
         ordenar.burbuja1(vector1);
         ordenar.mostrarArreglo(vector1);
          System.out.println("Arreglo Original");
        ordenar.MostrarArreglo(vector2);
         System.out.println("Arreglo Ordenado con burbuja2");
         ordenar.burbuja1(vector2);
         ordenar.mostrarArreglo(vector2);*/
        //ordenar.mostratArreglo(vector2);
          //System.out.println("Arreglo Original");
          //ordenar.MostrarArreglo(vector2);
          //ordenar.radix(vector2);
          //ordenar.mostrarArreglo(vector3);
           //System.out.println("Arreglo Ordenado con quick");
           //odenar.quick(vector3, 0, vector3.length-1);
           /*int team;
           tam=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el tamaño del areglo:"));
           int vectorcito[]=new int[tam];
           for(int i=0;i<tam;i++)
               vectorcito[i]=Integer.parseInt(JOptionPane.showInputDialog(null,
                       "ingresa el elemento del indice:"+i));
           ordenar.insercion()vectorcito, 1+1);
          */
               //System.out.println("arreglo original");
               //ordenar.mostrarArreglo(vector3);
               //ordenar.shell(vector3);
                System.out.println("Arreglo vector1 original");
                ordenar.mostrarArreglo(vector1);
                System.out.println("Arreglo vector3 original");
                ordenar.mostrarArreglo(vector3);
                ordenar.burbuja1(vector1);
                ordenar.burbuja1(vector3);
                ordenar.intercalacion(vector1,vector3);
                
    }
}
}





    
    

