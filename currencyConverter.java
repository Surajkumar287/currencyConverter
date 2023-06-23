import java.util.*;
import java.text.DecimalFormat;
public class currencyConverter {
    public static void main(String[] args) {
        double rupee, dollar, pound, code, euro, KWD;
        DecimalFormat f = new DecimalFormat( "##.###");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Currency code \n1: Rupees \n2: Dollar \n3: Pound \n4: Euro \n5: KWD ");
       System.out.println("Enter Currency code ");
        code = s.nextInt();
        if(code == 1){
            System.out.println("Enter amount in rupee");
            rupee = s.nextDouble();
            dollar = rupee / 81.94;
            System.out.println("Dollar : " +f.format(dollar));
            pound = rupee / 94.46;
            System.out.println("Pound : " +f.format(pound));
            euro = rupee / 80.36;
            System.out.println( "Euro : " +f.format(euro));
            KWD = rupee / 251.92;
            System.out.println("KWD : " +f.format(KWD));
        }
        else if(code == 2){
            System.out.println("Enter amount in dollar");
            dollar = s.nextDouble();
            rupee = dollar * 77.34;
            System.out.println("Rupees : " +f.format(rupee));
            pound = dollar * 0.82;
            System.out.println("Pound : " +f.format(pound));
            euro = dollar * 0.96;
            System.out.println( "Euro : " +f.format(euro));
            KWD = dollar * 0.31;
            System.out.println("KWD : " +f.format(KWD));
        }
        else if(code == 3){
            System.out.println("Enter amount in Pound");
            pound = s.nextDouble();
            dollar = pound * 1.22;
            System.out.println("Dollar : " +f.format(dollar));
            rupee = pound * 94.43;
            System.out.println("Pound : " +f.format(rupee));
            euro = pound * 1.17;
            System.out.println( "Euro : " +f.format(euro));
            KWD = pound * 0.3748;
            System.out.println("KWD : " +f.format(KWD));
        }
        else if(code == 4){
            System.out.println("Enter amount in Euro");
            euro = s.nextDouble();
            dollar = euro * 1.04;
            System.out.println("Dollar : " +f.format(dollar));
            rupee = euro * 80.43;
            System.out.println("Pound : " +f.format(rupee));
            pound = euro * 0.85;
            System.out.println( "Euro : " +f.format(euro));
            KWD = euro * 0.318949;
            System.out.println("KWD : " +f.format(KWD));
        }
        else if(code == 5){
            System.out.println("Enter amount in KWD");
            KWD = s.nextDouble();
            dollar = KWD * 3.26;
            System.out.println("Dollar : " +f.format(dollar));
            rupee = KWD * 251.96;
            System.out.println("Pound : " +f.format(rupee));
            euro = KWD * 3.13;
            System.out.println( "Euro : " +f.format(euro));
            pound = KWD * 2.67;
            System.out.println("KWD : " +f.format(KWD));
        }
        else {
            System.out.println("Invalid Code");
        }
    }
}