class ContinueStatementDemo{

public static void main(String args[]){

 System.out.println("Even numbers between 1-10 ");

for( int i=1; i<10; i++ ){
  if( i%2==1){
continue;
}
System.out.println(i);
}
}
}