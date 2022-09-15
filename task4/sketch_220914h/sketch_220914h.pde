void setup(){
  int[] numbs = new int[10];
  String[]words = new String[10];
  boolean[] SF = new boolean[10];
   
  numbs[0]= 5;
  numbs[4]= 5;
  numbs[3]= 8;
  numbs[6]= 21;
  
  //4.b Write a function that takes in an array of strings as parameter and prints each string.
  words[3]= "Cat";
  words[5]= "Dog";
  
  
  
  
  
  
  int sum = getSum(numbs);
  println(sum);
  
}

//4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array
int getSum(int[] numbs){ 
  int sum = 0;
  for (int i = 0; i < numbs.length; i++){
    sum += numbs [i];
    
    
    
    
  }
  
  return sum;
  
  }
