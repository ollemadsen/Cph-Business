public class København{

public static void main(String[] args) {

printPartOfWord("København", 1, 5);


	
}

public static void printPartOfWord(String str,int a, int b) {
	
	String by = str;
	String substr = by.substring(0);
	System.out.println(substr);
	String substr2 = by.substring(a,b);
	System.out.println(substr2);

}



}