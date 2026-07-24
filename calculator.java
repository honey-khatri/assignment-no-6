import java.util.Scanner;

class Calculator{
  public dtatic void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no1:");
    int a=sc.nextInt();
    System.out.println("enter no2:");
    char b=sc.next();
    System.out.println("Enter op:");
    switch(op){
      case '+':
        System.out.println("Add :"+(a+b));
        break;
      case '-':
        System.out.println("sub:"+(a-b));
        break;  
      case '*':
        System.out.println("mul:"+(a*b));
        break;  
      case '/':
        if(b==0){
          System.out.println("Div by zero");
        }
        else{
         System.out.println("div:"+(a/b));
        }
        break; 
      default:
        System.out.println("Invalid op");
    }
  }

}
