package application; //pacote

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Main { //classe

     public static void main(String[] args) { //metodo (main)
         Locale.setDefault(Locale.US); //para trocar a separação do ponto flutuante de , para .
         Scanner sc = new Scanner(System.in); //cria um scanner para poder ter entrada de dados

         Triangle x, y;
         x = new Triangle(); //cria as variaveis com o tipo da classe triangulo
         y = new Triangle();

         System.out.println("Tamanhos do triangulo X: ");
         x.a = sc.nextDouble();
         x.b = sc.nextDouble();
         x.c = sc.nextDouble();
         System.out.println("Tamanhos do triangulo Y: ");
         y.a = sc.nextDouble();
         y.b = sc.nextDouble();
         y.c = sc.nextDouble();

         sc.close(); // exclui a variavel que contem a função scanner

        double areaX = x.area(); //chama o metodo que calcula a area na classe triangulo
        double areaY = y.area();

         System.out.printf("Area do triangulo X: %.4f%n", areaX);
         System.out.printf("Area do triangulo Y: %.4f%n", areaY);

         if (areaX > areaY) {
             System.out.println("Maior area: X");
         }
         else{
             System.out.println("Maior area: Y");
         }
     }
 }