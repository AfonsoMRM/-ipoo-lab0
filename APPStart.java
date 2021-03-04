
/**
 * Write a description of class APPStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class APPStart
{
    static Scanner scanner = new Scanner(System.in);
    public static void  main(String args[]){
    System.out.println("1: Pequeno");
    System.out.println("2: Medio");
    System.out.println("3: Grande");
    int menuOption = scanner.nextInt();
    Size size = Size.MEDIUM;
    switch(menuOption){
        case 1:
        size = Size.SMALL;
        break;
        case 2:
        size = Size.MEDIUM;
        break;
        case 3:
        size = Size.LARGE;
        break;
    }
        System.out.println("Name:"+size.name());
        System.out.println("toString():\""+size.toString()+"\"");
        System.out.println("Ordem:"+size.ordinal());
        System.out.println("Valor minimo:"+size.getMinValue());
        System.out.println("Valor maximo:"+size.getMaxValue());
        System.out.println("Código:\'"+size.getCode()+"\''");
    }
}
