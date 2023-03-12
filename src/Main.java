import java.io.File;
import java.io.IOException;

//public class Main {
   // public static void main(String[] args) {
     //   File file = new File ( "mi primer archivo.txt" );
       // try{
         //   boolean filecreated = file.createNewFile();
           // if (filecreated) {
             //   System.out.println ( " el archivo se creo correctamente" );
           // } else {
             //   System.out.println ("el archivo ya existe");
            //}
       // } catch (IOException t ) {
         //   System.out.println ("excepcion al crear el archivo" + t);//

        //}

    //}
//}
     public class  Main {
        public static void main(String[] args) {
            int division[] = new int[]{1, 58, 16,78,69};
            int resultado = 2;
            for (int i = 2; i < division.length; i++) {
                resultado = resultado / i;
            }
            System.out.println ( "el numero  " + resultado);
        }
    }