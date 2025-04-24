

package calculadora;

import java.util.Scanner;


public class Calculadora {

    //Creamos la funcion Para enseñar el menu
    static void menu(){
        System.out.println("Menu calculadora");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Raiz Cuadrada");
        System.out.println("6.Potencia");
        System.out.println("7.Salir");
        System.out.println("Elige una opcion");
    }
    
    //Creamos la funcion para realizar la suma
    static void suma(){
        int valor1,valor2,valor3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        valor1= entrada.nextInt();
        System.out.println("Introduce el segundo valor");
        valor2=entrada.nextInt();
        valor3=valor1 + valor2;
        System.out.println("La suma es "+ valor3);
    }
    
    //Creamos la funcion para realizar la resta
    static void resta(){
        int valor1,valor2,valor3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        valor1= entrada.nextInt();
        System.out.println("Introduce el segundo valor");
        valor2=entrada.nextInt();
        valor3=valor1-valor2;
        System.out.println("La resta es "+valor3);
    }
    
    //Creamo la funcion para realizar la multiplicacion
    static void multiplicar(){
        int valor1,valor2,valor3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        valor1= entrada.nextInt();
        System.out.println("Introduce el segundo valor");
        valor2=entrada.nextInt();
        valor3 = valor1 * valor2;
        System.out.println("La mulriplicacion es "+ valor3);
    }
    
    
    //Creamos la funcion para realizar la division
    static void dividir(){
        int valor1,valor2,valor3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        valor1= entrada.nextInt();
        System.out.println("Introduce el segundo valor");
        valor2=entrada.nextInt();
        valor3= valor1/valor2;
        System.out.println("La division es "+ valor3);
    }
    
    //Creamos la funcion para realizar la raiz cuadrada
    static void raiz(){
        double valor1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el valor");
        valor1=entrada.nextDouble();
        System.out.println("La raiz cuadrada del numero es "+ Math.sqrt(valor1));
    }
    
    //Creamos la funcion para realizar la potencia
    static void cuadrado(){
        int valor1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el valor");
        valor1=entrada.nextInt();
        System.out.println("El cuadrado del numero es "+ Math.pow(valor1, 2));
    }
    
    public static void main(String[] args) {
        
        //Declaramos el Scanner para meter variables por pantalla
        Scanner entrada=new Scanner(System.in);
        //Declaramos la variable de navegacion por el menu
        int op;
        //Metemos el menu en un bucel do-while
        do{
            menu();//Llamamos la funcion del menu
            op = entrada.nextInt();
            
            switch(op){
                case 1 -> suma();//Llamamos la funcion de la suma
                    
                case 2 -> resta();//Llamamos la funcion de la resta
                    
                case 3 -> multiplicar();//Llamamos la funcion de la multiplicacion
                    
                case 4 -> dividir();//Llamamos la funcion de la division
                    
                case 5 -> raiz();//Llamamos la funcion de la raiz
                    
                case 6 -> cuadrado();//Llamamos la funcion de la potencia
                    
                case 7 -> System.out.println("Gracias por su visita");
            }
        }while (op !=7);
        
        
    }
    
}
