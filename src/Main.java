import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un numero da 1 - 10");

        while (true) {
            int user = scanner.nextInt();
            if (user >= 1 && user <= 10) {
                switch (user) {
                    case 1:
                        System.out.println("uno");
                        break;
                    case 2:
                        System.out.println("due");
                        break;
                    case 3:
                        System.out.println("tre");
                        break;
                    case 4:
                        System.out.println("quattro");
                        break;
                    case 5:
                        System.out.println("cinque");
                        break;
                    case 6:
                        System.out.println("sei");
                        break;
                    case 7:
                        System.out.println("sette");
                        break;
                    case 8:
                        System.out.println("otto");
                        break;
                    case 9:
                        System.out.println("nove");
                        break;
                    case 10:
                        System.out.println("dieci");
                        break;

                    }
                }else{
                System.out.println("Nome non registrato, riprova con [1 - 10]");
            }
        }
    }
}