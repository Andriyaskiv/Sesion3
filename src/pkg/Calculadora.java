package pkg;

public class Calculadora {
	
	public class Matematicas { 
		 public static int suma (int a, int b) { 
		 return a+b; 
		 } 
		 public static int resta (int a,int b) {
			 
			 return a-b;
		 }
		 public static int multiplica (int a,int b) {
			 return a*b;
		 }
		 public static int divide (int a,int b) {
			 if(a!=0) 
			 return a/b;
			 else
		     return -1;
		 }
		} 
	
}
