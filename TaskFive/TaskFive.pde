void setup() {
  MethodOne(); 
  MethodTwo(); 
}


void MethodOne()
{
  int i = 1000; 

  int max = 10;

  if (i > max)
  {
    String output = "i is greater than "+max+".";   
    

    println(output);
  }
}

void MethodTwo() 

{
  int weekDay = 0; 
  boolean weekEnd = false;
  
  if (weekDay < 5)
  {
    weekEnd = false;
  }
  else 
  {
    weekEnd = true;
  } 
  
  println(weekDay);
  
  if (weekEnd) {
    println("It's the weekend!");
  } else {
    println("It's not weekend yet!");
  }
}
