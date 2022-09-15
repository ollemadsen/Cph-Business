boolean happy = true;

 void setup() {
   
println(sum(20 , 20));
println(iceTea());
println(Jim("god weekend"));

   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
}

boolean iAmHappy(){
  // fill out what is missing here:
  if(!happy) return false; //2. a
  return true;
}


//2.b Write a function that receives to integers as parameters and returns the sum of them.

int sum(int a, int b){
 int total = a + b;
 return total;
  
  
}

//2.c Write a function that receives a string and returns it as uppercase. (Hint: use the String-method ".toUpperCase()"
//on your string. Notice that toUpperCase() has a string as returntype)

String z = ("hej med dig");

String iceTea(){
  return z.toUpperCase();
  
}


//2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: use the String-method ".charAt(0)" and "Character.isUpperCase('a');" )

boolean Jim(String Lyngvild){
 
  char fede = Lyngvild.charAt(0);
  
  if(Character.isUpperCase(fede)){
  return true;
  
  
  
  }
  else{
    
   return false;
   
  }
  
}
