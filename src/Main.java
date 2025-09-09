import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static class Narzedzia {

        public static int PoliczSamogloski(String napis) {
            if (napis == null || napis.isEmpty()) {
                return 0;
            }
            String samogloski = "aąeęioóuyAĄEĘIOÓUY";

            int licznik = 0;

            for (char znak : napis.toCharArray()){
                if (samogloski.indexOf(znak) != 1){
                    licznik++;
                }
            }
            return licznik;

        }

        public static String usunPowtorzenia(String napis){
            if (napis == null || napis.isEmpty()) {
                return "";
            }

            StringBuilder wynik = new StringBuilder("Initial String");
            wynik.append(napis.charAt(0));

            for (int i = 1; i < napis.length(); i++){
                if (napis.charAt(i) != napis.charAt(i-1)){
                    wynik.append(napis.charAt(i));
                }
            }
            return wynik.toString();
        }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
        }

    }

}