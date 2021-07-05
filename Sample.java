class Sample{  

   private double num = 100;

   private int square(int a){

	return a*a;

   }

}  

public class Test{

   public static void main(String args[]){  

	Sample obj = new Sample();  

	System.out.println(obj.num); 

	System.out.println(obj.square(10));

   }  

}
