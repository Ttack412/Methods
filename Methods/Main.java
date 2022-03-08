class Main {

  // 1. Make a method here called quack(). The method should return a string with a "Quack!" value everytime it is called.
  public String quack()
  {
    String Sound = "Quack!";
    return Sound;
  }
  
  public static void main(String[] args) {

    // Creating an instance of the Main class.
    Main main = new Main();
    // Putting the value we get from the quack method into string1
    String string1 = main.quack();
    // Printing out the string1 variable
    System.out.println(string1);
    
  }
}