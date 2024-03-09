package co.edu.sena.miscelanea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner in = new Scanner(System.in);
        boolean permitido = true;

        while (permitido) {
            System.out.println("=== Menu De Ejercicios Matemáticos By Daniel Junco===");
            System.out.println("1. OPERADORES");
            System.out.println("2. CONDICIONALES");
            System.out.println("0. SALIR");

            int opc = in.nextInt();

            switch (opc) { 
                case 1:
                    menuoperadores(in);
                    break;
                case 2:
                  menucondicionales(in);
                break;
                case 0:
                permitido = false;
                System.out.println("Cerrando El Programa, ¡Hasta Luego!");
                    break;
                default:
                    System.out.println("Escoja una opcion valida por favor.");
                    break;
            }
        }
        in.close();
    }

    public static void menuoperadores(Scanner in) {
        boolean permitido = true;

        while (permitido) {
            System.out.println("===MENU DE OPERADORES===");
            System.out.println("1. Area de un triangulo");
            System.out.println("2. Suma de dos numeros");
            System.out.println("3. Elevacion al cuadrado");
            System.out.println("4. Euros a dolares");
            System.out.println("5. Area y perimetro de un cuadrado");
            System.out.println("6. Area y volumen de un cilindro");
            System.out.println("7. Longitud y area de un circulo");
            System.out.println("8. Promedio de tres numeros");
            System.out.println("0. Volver al menu principal");

            int opc = in.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el valor correspondiente a la base del triángulo:");
                    double basetriangulo = in.nextDouble();
                    System.out.println("Ingrese el valor correspondiente a la altura del triángulo:");
                    double alturatriangulo = in.nextDouble();
                    System.out.println(
                        "El area de este triangulo es de: " + ejerciciosjunco.operadores.atriangulojunco(basetriangulo, alturatriangulo));
                    break;



                case 2:
                    System.out.println("Digite el primer numero a sumar:");
                    double primernumero = in.nextDouble();
                    System.out.println("Digite el segundo numero a sumar:");
                    double segundonumero = in.nextDouble();
                    System.out.println("La suma de estos dos numeros es: " + ejerciciosjunco.operadores.bsumadosnumerosjunco(primernumero, segundonumero));
                    break;

                case 3:
                System.out.println("Ingrese un numero que desee elevar al cuadrado:");
                double numeroalcuadrado = in.nextDouble();
                System.out.println("El resultado de elevar " + numeroalcuadrado + " al cuadrado es: "
                        + ejerciciosjunco.operadores.celevacionalcuadradojunco(numeroalcuadrado));
                break;

                case 4:
                System.out.println("Ingrese la cantidad de euros que quiere convertir a dolares:");
                double euros = in.nextDouble();
                System.out.println(euros + " euros son igual a " + ejerciciosjunco.operadores.dconversioneurosadolaresjunco(euros)
                        + " dolares.");
                break;

                case 5:
                System.out.println("Digite el valor correspondiente al lado del cuadrado ");
                double lado = in.nextDouble();
                System.out.println(
                    "El area del cuadrado es " + ejerciciosjunco.operadores.eladoareaperimetrocuadradojunco(lado));
                break;

                case 6:
                System.out.println("Digite el radio del cilindro:");
                double radiocilindro = in.nextDouble();
                System.out.println("Digite la altura del cilindro:");
                double alturacilindro = in.nextDouble();
                System.out.println("El volumen de este cilindro es: "
                     + ejerciciosjunco.operadores.fareavolumencilindrojunco(radiocilindro, alturacilindro));
                break;

                case 7:
                System.out.println("Digite el radio de la circunferencia: ");
                    double areadelcirculo = in.nextDouble();
                    System.out.println("El area del círculo inscrito es de: "
                            + ejerciciosjunco.operadores.gcircunferenciacirculojunco(areadelcirculo));
                    break;    
 
                  case 8:
                  System.out.println("Ingrese tres números separados por espacio:");
                    double primernume = in.nextDouble();
                    double segundonume = in.nextDouble();
                    double tercernume = in.nextDouble();
                    System.out.println("El promedio de los tres números es: "
                            + ejerciciosjunco.operadores.hpromtresnumerosjunco(primernume, segundonume, tercernume));
                    break;

                case 0:
                permitido = false;
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }

    public static void menucondicionales(Scanner in) {
        boolean permitido = true;

        while (permitido) {
            System.out.println("===MENU DE EJERCICIOS DE CONDICIONALES===");
            System.out.println("1. Verificar si un numero es positivo o negativo");
            System.out.println("2. Saber cual numero es mayor y cual es menor ");
            System.out.println("3. Leer 3 numeros enteros e imprimir el menor y el mayor.");
            System.out.println("4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos");
            System.out.println("5. Dados dos números A y B encontrar el cociente entre A y B");
            System.out.println("6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos.");
            System.out.println("7. Determinar si un año es bisiesto o no");
            System.out.println("0. Volver al menu principal");
        
            int opc = in.nextInt();

            switch (opc) {
                case 1:
                System.out.println("Digite un numero porfavor:");
                double resultadopositivoonegativo = in.nextDouble();
                System.out.println(ejerciciosjunco.condicionales.numeropositivoonegativo(resultadopositivoonegativo)); 
                break;


                case 2:
                System.out.println("Digite un numero:");
                double prnum = in.nextDouble();
                System.out.println("Digite el otro numero:");
                double sgnum = in.nextDouble();
                System.out.println(ejerciciosjunco.condicionales.nummaymen(prnum,sgnum)); 
                break;
                

                case 3:
                System.out.println("Digite el primer numero");
                double firstnum = in.nextDouble();
                System.out.println("Digite el segundo numero");
                double secondnum= in.nextDouble();
                System.out.println("Digite el tercer numero");
                double thirdnum= in.nextDouble();
                System.out.println(ejerciciosjunco.condicionales.tresnumunomayoryunomenos(firstnum, secondnum, thirdnum));
                break;

                case 4:
                System.out.println("Digite el primer numero");
                double A = in.nextDouble();
                System.out.println("Digite el segundo numero");
                double B = in.nextDouble();
                System.out.println(ejerciciosjunco.condicionales.sumaoresta(A, B));
                
                break;

                case 5:
                System.out.println("Digite el primer numero");
                double numA = in.nextDouble();
                System.out.println("Digite el segundo numero");
                double numB = in.nextDouble();
                System.out.println(ejerciciosjunco.condicionales.dividir(numA, numB));

                
                break;

                case 6:
                System.out.println("Digite el primer numero ");
                double primnumA = in.nextDouble();
                System.out.println("Digite el segundo numero");
                double segunnumB = in.nextDouble();
                System.out.println(ejerciciosjunco.condicionales.sumaomultiplicar(primnumA, segunnumB));
                break;

                case 7:
                System.out.println("Ingrese el año deseado para determinar si es bisiesto o no");
                double year = in.nextDouble();
                System.out.println(ejerciciosjunco.condicionales.aniobisiesto(year));
                break;

                case 0:
                permitido = false;
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;

}}
            }
            private static void menu(Scanner in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menu'");
    }
        }

    

    