import java.util.Random;

public class Main32 {
  public static void main(String[] args) {
    
    Random rndm = new Random();
    
    int x = rndm.nextInt(100);
    int y = rndm.nextInt(100);
    int z = rndm.nextInt(100);

    System.out.println(x + " " + y + " " + z);

    if (x > y && x > z) {
        System.out.println(x);
    } else if (y > x && y > z) {
        System.out.println(y);
    } else if (z > x && z > y) {
        System.out.println(z);
    };
    
  };
};