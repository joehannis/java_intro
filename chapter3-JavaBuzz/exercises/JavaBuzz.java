public class JavaBuzz {
  public static void main(String[] args) {
    for(int i=1; i<= 100; i++){
      if (i % 15 == 0) {
        String result = i + "JavaBuzz";
        System.out.println(result);
      }else if (i % 5 == 0) {
        String result = i + "Buzz";
        System.out.println(result);
      }else if (i % 3 == 0) {
        String result = i + "Java";
        System.out.println(result);
      }else{
        System.out.println(i);
      }
      
    }
  }
}

// "Java" if divisible by 3
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15
