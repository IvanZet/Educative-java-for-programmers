class Rectangle {
    // Implement the Rectangle Class Using Encapsulation

    private int length;
    private int width;
    
    public Rectangle() {
        length = 0;
        width = 0;
    }
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
  
    public int getArea() {
      return this.length * this.width; 
    }
    
  }

class DemoRectangle {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(2, 3);
        int area = obj.getArea();
        System.out.print(area);
    }
}
  