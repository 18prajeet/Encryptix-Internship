import java.util.Scanner;
public class Task4 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to this Currency Convertor! The Target currency selection is given here:");
    System.out.println("1.USD to Rupee");
    System.out.println("2.Euro to Rupee");
    System.out.println("3.Yen to Rupee");
    System.out.println("4.Australian Dollar to Rupee");
    System.out.println("5.Rupee to paise");
    
     boolean convertmore= true;

    while(convertmore){
        System.out.println("Do Enter your Choice Please![1|2|3|4|5]");
        int userchoice = sc.nextInt();
    if(userchoice==1){
        System.out.println("Enter the amount in USD:");
        double USD = sc.nextDouble();
        double rupee = USD*83.61;  //as per (21/06/2024)
        String amt = String.format("%.2f", rupee);//rounding off to two decimal places
        System.out.println("The converted currency is:"+ amt+" "+ "Rupee");
    }
    else if(userchoice==2){
        System.out.println("Enter the amount in Euro:");
        double Euro = sc.nextDouble();
        double rupee1= Euro*89.43;//as per (21/06/2024)
        String amt1 = String.format("%.2f", rupee1);//rounding off to two decimal places
        System.out.println("The converted currency is:"+ amt1 +" "+ "Rupee");
    }
    else if(userchoice == 3){
        System.out.println("Enter the amount in Yen:");
        double Yen = sc.nextDouble();
        double rupee2= Yen*0.53;//as per (21/06/2024)
        String amt2 = String.format("%.2f", rupee2);//rounding off to two decimal places
        System.out.println("The converted currency is:"+amt2+" "+"Rupee");
    }
    else if(userchoice==4){
        System.out.println("Enter the amount in Australian Dollar:");
        double AustralianDollar = sc.nextDouble();
        double rupee3= AustralianDollar*55.63;//as per (21/06/2024)
        String amt3= String.format("%.2f", rupee3);
        System.out.println("The converted currency is:"+amt3+" "+"Rupee");
    }
    else if(userchoice==5){
        System.out.println("Enter the amount in Rupees:");
        double ruppein= sc.nextDouble();
        double paise= ruppein*100;
        String amt4= String.format("%.2f", paise);
        System.out.println("The converted currency is:"+amt4+" "+"Paise");
    }
    else{
        System.out.println("Invalid Choice: Please select 1|2|3|4");
    }
    System.out.println("Want to convert again (Yes/No)");
     String check = sc.next();
     convertmore=check.equalsIgnoreCase("Yes");
    }
    sc.close();
 }
}
