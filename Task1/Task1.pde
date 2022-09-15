// 1.a Create a sketch and name it Task1. Write a void setup()-function in the sketch.
void setup() {
  size(400,400);
 printEmptyLine();
printString("MonkeyHead"); 
 fedtmule("Oliver" , 21);
} 

// 1.b a function that prints an emptyline..
void printEmptyLine()  {
  println("");



}
///1.c Write a function that receives a string as a parameter and prints it. call this function from setup()
void printString(String MonkeyHead) {
  println("MonkeyHead");

} 

// 1.d Write a function that receives a string called "name" and an integer called "age" and call it from setup with your own name and age. Have the function print the text "My name is <name>, I am years old".

void fedtmule(String name, int age) {
  println("My name is " + name + ", I am " + age + " years old");


}
