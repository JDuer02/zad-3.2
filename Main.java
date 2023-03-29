import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String napis = scanner.nextLine();
    int licznik=0;
    int i;
    for (i =0; i < napis.length(); i++ )
      {
        if (napis.charAt(i)>= 'a' && napis.charAt(i) <='z')
          licznik++;
      }
    String nowyNapis = napis.toUpperCase();
    System.out.println("Ilosc zliczen: "+licznik);
  
      
  }   
  }