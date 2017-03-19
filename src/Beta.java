import java.util.Scanner;
public class Beta
{
	public static void main(String[] args) 
	{

    int zmienna;
    int a;
    int b;
    Scanner pisz2 = new Scanner (System.in);
    Scanner pisz1 = new Scanner (System.in);
    Scanner pisz = new Scanner (System.in);
    System.out.println("Wybierz znak matematyczny:");
    System.out.println("1 - Dodawanie to +");
    System.out.println("2 - Odejmowanie to -");
    System.out.println("3 - Dzielenie to /");
    System.out.println("4 - Mnozenie to *");
    zmienna = pisz.nextInt();
    switch(zmienna)
    {
      case 1:
      
      System.out.println("Wybrales dodawanie:");
      System.out.println();
      System.out.println("Podaj pierwsza liczbe ");
      a = pisz1.nextInt();
      System.out.println("Podaj druga liczbe ");
      b = pisz2.nextInt();
      System.out.println(a+"+"+b+"="+(a+b));
      break;
      
      case 2:
      
      System.out.println("Wybrales odejmowanie:");
      System.out.println();
      System.out.println("Podaj pierwsza liczbe ");
      a = pisz1.nextInt();
      System.out.println("Podaj druga liczbe ");
      b = pisz2.nextInt();
      System.out.println(a+"-"+b+"="+(a-b));
      break;
      
      case 3:
      
      System.out.println("Wybrales dzielenie:");
      System.out.println();
      System.out.println("Podaj pierwsza liczbe ");
      a = pisz1.nextInt();
      System.out.println("Podaj druga liczbe ");
      b = pisz2.nextInt();
      System.out.println(a+"/"+b+"="+(a/b));
      break;
      
      case 4:
      
      System.out.println("Wybrales mnozenie:");
      System.out.println();
      System.out.println("Podaj pierwsza liczbe ");
      a = pisz1.nextInt();
      System.out.println("Podaj druga liczbe ");
      b = pisz2.nextInt();
      System.out.println(a+"*"+b+"="+(a*b));
      break;
      
      default:
      System.out.println("Wybrales zla cyfre.");
    }
  }
}