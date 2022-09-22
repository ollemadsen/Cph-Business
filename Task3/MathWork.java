import java.util.Random;

public class MathWork{

static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

static Random myRandom = new Random();

    public static void main(String[] args)
    {

SumAfTal();
getRandom();
printInt(5);

    }


	public static void printInt(int i) {
    System.out.println(i);
    
    if(i > 0){

    printInt(i - 1);
}

}





public static void SumAfTal() {

	for(int i=1;i<100; i++){

if(i%5==0){

System.out.println(i+"");


}


}
	
}
 
 public static void getRandom() {


System.out.println(arr[myRandom.nextInt(arr.length)]);


 	
 }





}




