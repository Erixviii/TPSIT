import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome");
        String Nome= scanner.next();
        System.out.println("Cognome");
        String Cognome= scanner.next();
        System.out.println("Sesso");
        String Sesso= scanner.next();
        System.out.println("Luogo di nascita");
        String lgnascita= scanner.next();
        System.out.println("Provincia");
        String provincia= scanner.next();
        System.out.println("Giorno di nascita");
        String ggnascita= scanner.next();

        String codice="";
        String vocali="aeiouAEIOU";
        Map<String, String> mesi = new HashMap<String, String>();
        mesi.put("01","a");
        mesi.put("02","b");
        mesi.put("03","c");
        mesi.put("04","d");
        mesi.put("05","e");
        mesi.put("06","h");
        mesi.put("07","l");
        mesi.put("08","m");
        mesi.put("09","p");
        mesi.put("10","r");
        mesi.put("11","s");
        mesi.put("12","t");

        for (int i = 0; i < Nome.length(); i++) {
            
            if (!vocali.contains(""+ Nome.charAt(i))) {
                
                codice += Nome.charAt(i);
            }
            if (codice.length()==3) {
                break;
            }
        }

        for (int i = 0; i < Cognome.length(); i++) {
            
            if (!vocali.contains(""+ Cognome.charAt(i))) {
                
                codice += Cognome.charAt(i);
            }
            if (codice.length()==6) {
                break;
            }
        }

        codice += ggnascita.substring(8, 10);

        codice+= mesi.get(ggnascita.substring(3, 5));

        if (Sesso=="F"||Sesso=="f") 
            codice += Integer.parseInt(ggnascita.substring(0, 2)) +40;
        else
            codice += Integer.parseInt(ggnascita.substring(0, 2)) +40;

        System.out.println(codice.toUpperCase());
    }
}
