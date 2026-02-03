package Game;

public class main_test {

    public static void main(String[] args) {
        String headline1 = "███████╗███████╗██╗         ██████╗ ██╗   ██╗███╗   ██╗███╗   ██╗███████╗██████╗ ";
        String headline2 = "██╔════╝██╔════╝██║         ██╔══██╗██║   ██║████╗  ██║████╗  ██║██╔════╝██╔══██ ";
        String headline3 = "█████╗  █████╗  ██║         ██████╔╝██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝";
        String headline4 = "██╔══╝  ██╔══╝  ██║         ██╔══██╗██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗";
        String headline5 = "███████╗███████╗███████╗    ██║  ██║╚██████╔╝██║ ╚████║██║ ╚████║███████╗██║  ██║";
        String headline6 = "╚══════╝╚══════╝╚══════╝    ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═ ";

        int delay = 7;

        for (int i = 0; i< headline1.length(); i++) {
            System.out.print(headline1.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        for (int i = 0; i< headline1.length(); i++) {
            System.out.print(headline2.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        for (int i = 0; i< headline1.length(); i++) {
            System.out.print(headline3.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        for (int i = 0; i< headline1.length(); i++) {
            System.out.print(headline4.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        for (int i = 0; i< headline1.length(); i++) {
            System.out.print(headline5.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
        for (int i = 0; i< headline1.length(); i++) {
            System.out.print(headline6.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");

    }
}