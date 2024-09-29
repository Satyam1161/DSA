public class question10 {
  public static void main(String arg[]) {
    int N = 4;
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int j = 1; j <= N; j++) {
      for (int i = N; i >= j; i--) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
