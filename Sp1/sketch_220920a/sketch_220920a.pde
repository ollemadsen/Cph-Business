 //Jeg har valgt at holde dette projekt simpelt og samtidig opfylde de givende krav.
 //Herunder ser vi en zoo class med aben "Max" og hans zookeeper "Alfred".
 
 ZooKeeper Alfred = new ZooKeeper("Alfred", 26, false);

 Zoo Monkey = new Zoo ("Monkey", "Max", 12, true);


void setup(){
  size(700,700);
  
 println("My name is " + Alfred.name + " and I am " + Alfred.age + "." +  " am I a female? " + Alfred.isFemale);
  
  println("I take care of " + Monkey.name + " he is a " + Monkey.race + "." + " He just turned 12 which means he is fullgrown" + "." + " Is he dangerous you ask? " + Monkey.isDangerous);  
 
 fill(#6A4D05);
 //Monkey Body
  ellipse(200,400,150,200);
  rect(250,350,120,30);
  rect(20,350,120,30);
  rect(150,470,30,120);
  rect(220,470,30,120);
  
  //Monkey Head
  ellipse(150,250,30,30);
  ellipse(250,250,30,30);
  ellipse(200,250,100,100);
  fill(#050400);
  ellipse(180,230,15,15);
  ellipse(220,230,15,15);
  fill(#E7D1FF);
  ellipse(200,280,40,40);
  fill(0);
  ellipse(200,280,30,30);
  
  
  //For loop that makes monkey say UH UH AH AH 2 times if it is dangerous. 
  for(int i=0; i < 2; i++){
  if(Monkey.isDangerous == true){ 
    println("UH UH AH AH");
  }
  }
  
}
