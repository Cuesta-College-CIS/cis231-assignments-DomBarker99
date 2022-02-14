import java.util.Random;

public class Main33 {
  public static void main(String[] args) {
    
    Random rndm = new Random();
    
    int x = rndm.nextInt(100);
    int y = rndm.nextInt(100);
    int z = rndm.nextInt(100);

    if ( x < y && y < z) {
        System.out.println(x + " " + y + " " + z);
    
    } else if ( x < z && z < y) {
        System.out.println(x + " " + z + " " + y);
    
    } else if ( y < z && z < x) {
        System.out.println(y + " " + z + " " + x);
    
    } else if ( y < x && x < z) {
        System.out.println(y + " " + x + " " + z);
    
    } else if ( z < x && x < y) {
        System.out.println(z + " " + x + " " + y);
    
    } else if ( z < y && y < x) {
        System.out.println(z + " " + y + " " + x);
    }

  }
}