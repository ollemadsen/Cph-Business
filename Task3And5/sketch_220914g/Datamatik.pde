Teacher Jorg = new Teacher ("Jorg", 38, false);
Student Oliver = new Student("Oliver", 21, false, 'B');
Student Marcus = new Student("Marcus aka Guffe", 24, false, 'B');

//5.a In your tab Datamatik add an array of Students with 10 elements in it. This should be a global variable. From the setup() method, add 10 student instances to the array
Student[] arr_student = new Student[10];

  

void setup(){
 
// 5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it (the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the setup() of Datamatik.
  arr_student[0] = new Student("Mikkel", 23, false, 'B');
  arr_student[1] = new Student("Tim", 23, false,'B');
  arr_student[2] = new Student("Julius", 23, false, 'B');
  arr_student[3] = new Student("Jack", 23, false, 'B');
  arr_student[4] = new Student("Morten", 23, false, 'B');
  arr_student[5] = new Student("Hans", 23, false, 'B');
  arr_student[6] = new Student("Nicky", 23, false, 'B');
  arr_student[7] = new Student("Brian", 23, false, 'B');
  arr_student[8] = new Student("lars", 23, false, 'B');
  arr_student[9] = new Student("Jacob", 23, false, 'B'); 

println(get_Names(arr_student, 10));

println(Jorg.name); 
 //println(Jorg.age); 
 //println(Jorg.isFemale);
 
 println(Oliver.name);
 //println(Oliver.age);
 //println(Oliver.isFemale);
 println(Oliver.datamatikerTeam);
 
 println(Marcus.name);
 //println(Marcus.age);
 //println(Marcus.isFemale);
 println(Marcus.datamatikerTeam);
  

} 

String[] get_Names(Student[] students, int a) {
      String[] names = new String[a];
      for(int i = 0; i < a; i++) {

        names[i] = students[i].name;

       }
       return names;
}
 
  
  
  
 
 
 
  
