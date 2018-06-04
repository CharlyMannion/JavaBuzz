public class JavaBuzz {
  public static void main(String[] args) {
    for (int i=1; i<100; i++) {
      if (i%3==0 && i%5==0) {
        System.out.println("JavaBuzz");
      }
      else if (i%3==0) {
        System.out.println("Java");
      }
      else if (i%5==0) {
        System.out.println("Buzz");
      }
      else {
        System.out.println(i);
      }
    }
  }
}
