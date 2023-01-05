public class Calculator {
    private double result = 0;

    public double getResult() {
        return result;
    }

    public Calculator(){

        result = 0;
}
    public void add(double x){
        result += x;
    }
    public void substract(double x){
        result -= x;
    }

    public void clear(){
        result = 0;
    }

    public void add(double[] numbers){
         for(double x: numbers){
             result += x;
         }
    }
}
