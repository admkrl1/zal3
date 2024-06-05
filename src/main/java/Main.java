// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int liczby[] = new int[4];
    int n=0;
    

    
    for(int i=0; i<4; i++) {
      System.out.println("Podaj liczbę: ");
      liczby[n] = scanner.nextInt();
        if(liczby[n]<0) {
         System.out.println("Liczba ujemna");
        }
        else if(liczby[n]>0){
            System.out.println("Liczba dodatnia");
          }
        else {
            System.out.println("Liczba równa 0");
          }
      
        
      n++;
    }
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}