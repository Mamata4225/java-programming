class ReturnStatementDemo1{

public static void main(String args[]){
 
add(2,3);
}

static void add(int a, int b){
int c = a+b;
System.out.println(c);
return;
}
}