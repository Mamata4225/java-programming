package Mamata_XworkZ.Apti_NS.StarPattern;

public class RightAngleTriangle {
	public static void main(String[] args) {
		int num = 8;
		
		 for(int i=0; i<num; i++) {
			 for(int j=0; j<num; j++ ) {
				 if(j<=i)
					 System.out.print("* ");
			 
			 else 
				 System.out.print("");
			 
		 }
		 System.out.println();
		 } 
	}
}
