class ReturnStatementDemo{

public static void main(String args[]){

int result = add(2,3);
System.out.println(result);
}

static int add(int a, int b){
int c=a+b;
return c;
}
}