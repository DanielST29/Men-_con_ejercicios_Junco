package co.edu.sena.miscelanea;

public class ejerciciosjunco {
    public class operadores {
        public static double atriangulojunco(double basetriangulo, double alturatriangulo) {
            double areatriangulo = (basetriangulo * alturatriangulo) / 2;
            return areatriangulo;
        }

        public static double bsumadosnumerosjunco(double primernumero, double segundonumero) {
            double resultadossuma = primernumero + segundonumero;
            return resultadossuma;
        }

        public static double celevacionalcuadradojunco(double numeroalcuadrado) {
            double resultadonumeroalcuadrado = Math.pow(numeroalcuadrado, 2);
            return resultadonumeroalcuadrado;
        }

        public static double dconversioneurosadolaresjunco(double euros) {
            double diferencia = 1.8;
            double dolares = euros * diferencia;
            return dolares;

        }

        public static double eladoareaperimetrocuadradojunco(double lado) {
            double areacuadrado = lado * lado;
            double perimetrocuadrado = 4 * lado;
            System.out.println("El perímetro del cuadrado es: " + perimetrocuadrado);
            return (areacuadrado);

        }
        public static double fareavolumencilindrojunco(double radiocilindro, double alturacilindro) {

            double arealateralcilindro = 2 * Math.PI * radiocilindro * alturacilindro;
            double areatotalcilindro = 2 * Math.PI * radiocilindro * (radiocilindro + alturacilindro);
            double volumencilindro = Math.PI * Math.pow(radiocilindro, 2) * alturacilindro;

            System.out.println("El area 'lateral' del cilindro es: " + arealateralcilindro);
            System.out.println("El area total del cilindro es: " + areatotalcilindro);
            return (volumencilindro);

        }
        public static double gcircunferenciacirculojunco(double radiocircunferencia) {

            double medidacircunferencia = 2 * Math.PI * radiocircunferencia;
            double areadelcirculo = Math.PI * Math.pow(radiocircunferencia, 2);
            System.out.println("La longitud de la circunferencia es de: " + medidacircunferencia);
            return (areadelcirculo);
        
        }
        public static double hpromtresnumerosjunco(double primernume, double segundonume, double tercernume) {

            double promedionumeros = (primernume + segundonume + tercernume) / 3;
            return promedionumeros;

        }
    

    }

    
        

    public class condicionales {
        public static String numeropositivoonegativo(double resultadopositivoonegativo) {
            String valor;

            if (resultadopositivoonegativo > 0) {
                valor = "El numero " +resultadopositivoonegativo + " es positivo.";
            } else {
                valor = "El numero " +resultadopositivoonegativo + " es negativo.";
            }

            return valor;
        }

        public static String nummaymen(double prnum, double sgnum) {
            String resmayomen;
            if (prnum < sgnum) {
                resmayomen ="El numero " +prnum + " es menor,  el " + sgnum + " es el mayor";
            }else{
                resmayomen ="El numero " +sgnum + " es menor, el "  + prnum + " es el mayor";
            }
            return resmayomen;
        }

        public static String tresnumunomayoryunomenos(double firstnum, double secondnum, double thirdnum) {
            String resultado;
        
            if (Double.isNaN(firstnum) || Double.isNaN(secondnum) || Double.isNaN(thirdnum) || firstnum < 0 || secondnum < 0 || thirdnum < 0) {
                System.out.println("Por favor siga las instrucciones dadas para que el programa funcione.");
                return null;
            } else {
                double nmay = firstnum;
                if (secondnum > nmay) {
                    nmay = secondnum;
                }
                if (thirdnum > nmay) {
                    nmay = thirdnum;
                }
        
                double nmen = firstnum;
                if (secondnum < nmen) {
                    nmen = secondnum;
                }
                if (thirdnum < nmen) {
                    nmen = thirdnum;
                }
        
                resultado = "El mayor numero es el " + nmay + " y el menor es el " + nmen + ".";
                return resultado;}
            }

            public static double sumaoresta(double A, double B) {
                double resultado;
            
                if (A < B) {
                    resultado = A + B;
                } else {
                    resultado = B - A;
                }
            System.out.println("El resultado es: ");
            return resultado;
                
            }
            public static double dividir(double numA, double numB) {
                double resultado;
            
                if (numB == 0) {
                    System.out.println("No se puede dividir entre 0, la división no es posible");
                    resultado = Double.NaN;
                } else {
                    resultado = numA / numB;
                    System.out.println("El cociente entre estos dos numeros es: ");    
                }
                return resultado;
            }
            public static double sumaomultiplicar(double primnumA, double segunnumB) {
                double resultado;
            
                if (primnumA < 0 || segunnumB < 0) {
                    resultado = primnumA + segunnumB;        
                    System.out.println("La suma entre estos dos numeros es: "); 
                } else {
                    resultado = primnumA * segunnumB;
                    System.out.println("La multiplicacion entre estos dos numeros da: "); 
                }
            
                return resultado;
            }
            public static String aniobisiesto(Double year) {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            return "El año " + year + " si es bisiesto.";
                        } else {
                            return "El año " + year + " no es bisiesto.";
                        }
                    } else {
                        return "El año " + year + " es bisiesto.";
                    }
                } else {
                    return "El año " + year + " no es bisiesto.";
                }
            }
        }
    }
        


