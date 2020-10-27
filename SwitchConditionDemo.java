class SwitchConditionDemo{

public static void main(String args[]){

int num = 8;

switch(num){

case 1 : System.out.println("1st day of the week is sunday");
         break;
case 2 : System.out.println("2nd day of the week is monday");
         break;
case 3 : System.out.println("3rd day of the week is tuesday");
         break;
case 4 : System.out.println("4th day of the week is wednesday");
         break;
case 5 : System.out.println("5th day of the week is thursday");
         break;
case 6 : System.out.println("6th day of the week is friday");
         break;
case 7 : System.out.println("7th day of the week is saturday");
         break;
default: System.out.println("invalid, please select number between 1-7");
         break;
}
}
}