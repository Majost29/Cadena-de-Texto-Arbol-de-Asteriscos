import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    int opcion;
    boolean salir=false;
    Scanner ejercicio=new Scanner(System.in);

  //MENÚ
    System.out.println("-------------MENÚ DE OPCIONES------------");
    System.out.println("Ingrese la opcion que desea ocupar");
    System.out.println("1.Evalue una cadena de texto ingresada e identifique si tiene parentesis o carchetes");
    System.out.println("2.Genere una árbol de asteriscos en base a un numero ingresado");
    System.out.println("3.Salir");
    System.out.println("-----------------------------------------");
    System.out.println();
    opcion= ejercicio.nextInt();
  
    switch(opcion){
      case 1 :{
        //Cadena de texto
         // System.out.println("Introduza una cadena de texto");
         // String entrada = ejercicio.nextLine();
         // ejercicio.close();
         Cadena_Texto();
      }break;
      case 2:{
        // Pirámide
        System.out.println("Ingrese la Cantidad de filas para nuestro Triángulo: ");
        int filas=ejercicio.nextInt();
        ejercicio.close();
        Piramide(filas);
      }break;
            case 3:{
              salir=true;
            }break;
        default:
              System.out.println("Opcion Desconocida");
      }
  }
  
   
  static void Piramide(int filas){
    Scanner piramide=new Scanner(System.in);
    
        System.out.println();
        for(int blancos = filas-1,asteriscos=1; blancos>=0; blancos--, asteriscos += 2){
            //Espacios en blanco
            for(int i=1;i<=blancos;i++){
                System.out.print(" ");
            } 
            //Asteriscos
            for(int j=1;j<=asteriscos;j++){
                System.out.print("*");
          }
         System.out.println();
        }
        System.out.println();
    } 
  
  static void Cadena_Texto(){
    // String entrada="Holi
    System.out.println();
    Scanner cadena = new Scanner(System.in);
    System.out.println("Introduza una cadena de texto");
    String entrada = cadena.nextLine();

    int n_par=0;
    int n_cor=0;
    
    char[] parentesis={'(',')'};
    char[] corchetes={'[',']'};
    
    String par="";
    String cor="";
    // System.out.println("Introduza una cadena de texto");
    // String entrada = cadena.nextLine();
    // System.out.println();
    for(int i=0 ; i<entrada.length(); i++){
      for(int q=0; q<parentesis.length ; q++){
        if(entrada.charAt(i)== parentesis[q]){
          n_par++;
          par+=entrada.charAt(i);
        }
      }

      for(int q=0; q<corchetes.length ; q++){
        if(entrada.charAt(i)== corchetes[q]){
          n_cor++;
          cor+=entrada.charAt(i);
        }
      }
    }
    System.out.println();
    System.out.println("Cadena de Texto Original   "+entrada);
    System.out.println("¿Cuántos paréntesis se encontro? =  "+n_par);
    System.out.println("¿Cuántos corchetes se encontro? =  "+n_cor);
  }
}


// realizar un programa con 3 opciones 
//   1 evalue una cadena de texto ingresada e identifique si tiene parentesis o corchetes 
// //   2 generar un arbol de asteriscos en base a un numero ingresado 
// 3 implementar funciones dentro de los dos puntos anteriores 
// como pasar parametros entre funciones java 
//   como retornar valor de una funcion

//   string dato ="pepito cocoina (";
// string dato2 ="pepito cocoina ";