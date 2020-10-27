class NestedIfCondition{

public static void main(String args[]){

int num = 600;
if(num > 0 && num < 100){
System.out.println("The given number present between 0-100");

   if(num > 0 && num < 50){
   System.out.println("The given number present between 0-50");
}
}
}
}