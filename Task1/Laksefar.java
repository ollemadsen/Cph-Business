class Main {
  public static void main(String[] args) {

    String str = "den laks skal ned", reverseStr = "";
     

    for (int i = str.length() - 1; i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str);
    }
    
    }

  }
