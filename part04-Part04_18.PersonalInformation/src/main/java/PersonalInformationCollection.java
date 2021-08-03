
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String fname = scanner.nextLine();
            if (fname.isEmpty()) {
                break;
            }
            String lname = scanner.nextLine();
            String id = scanner.nextLine();
            PersonalInformation val = new PersonalInformation(fname, lname, id);
            infoCollection.add(val);
        }
        for (PersonalInformation p : infoCollection) {
            System.out.println(p.getFirstName()+" "+p.getLastName());
        }
    }
}
