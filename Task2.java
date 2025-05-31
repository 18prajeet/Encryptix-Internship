import java.util.Scanner;
public class Task2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of subjects:");
    int sub = sc.nextInt();
    int totalmarks=0;
    for(int i =1;i<=sub;i++){
        System.out.println("Enter the marks obtained in subject" +" " + i +":");
        int marks = sc.nextInt();
        totalmarks+=marks;
    }
    float average= (float)(totalmarks/sub);
    char Grade;
    if(average>90){
        Grade='O';
    }
    else if(average>80){
        Grade ='A';
    }
    else if(average>70){
        Grade='B';
    }
    else if(average>60){
        Grade='C';
    }
    else if(average>50){
        Grade='D';
    }
    else{
        Grade = 'F';
    }
    System.out.println("The total marks is:"+totalmarks);
    System.out.println("The percentage is:"+average+" "+"%");
    System.out.println("The grade obtained is:"+Grade);
     sc.close();
  }
}
