class Calculator {

    private double num1, num2;
    
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num2 / num1;
    }
}

class Demo {

    public static void main(String args[]) {
      Calculator obj = new Calculator(10, 94);
  
      System.out.println(obj.add());
      System.out.println(obj.subtract());
      System.out.println(obj.multiply());
      System.out.println(obj.divide());
    }
  
}
