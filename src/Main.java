import java.util .Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Main {
    public static void main(String[] args) {

        int currentYear=LocalDate.now().getYear();
        int currentMonth=LocalDate.now().getMonthValue();
        int currentDay=LocalDate.now().getDayOfMonth();
        LocalDate birthDate = LocalDate.of(currentYear, currentMonth, currentDay);
        LocalDate today = LocalDate.now();

//input from user about name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String fname= scanner.next();
        System.out.println("Enter your second name : ");
        String lname= scanner.next();
//input from user about birth year,month,day
        System.out.println("Enter your Birth Year :");
        int BirthYear= scanner.nextInt();

        System.out.println("Enter your Birth Month :");
        int BirthMonth =scanner.nextInt();


        System.out.println("Enter your Birth Day :");
//To calculate age by day, month and year
        int BirthDay =scanner.nextInt();

        int birthy =(currentYear -BirthYear);
        int birthM=(currentMonth-BirthMonth);

        if(birthM<0) {
            birthy= birthy-1;
            birthM =birthM+12;
        }

        int birthD=(currentDay-BirthDay);
        if(birthD<0) {
            birthM =birthM -1;
            birthD= birthD+30;
        }

        int nextbirth=  currentYear+1;

        long hours = ChronoUnit.HOURS.between(birthDate.atStartOfDay(), today.atStartOfDay());
        System.out.println("----------------------------------");
        System.out.println("your name is : "+fname +" "+lname );
        System.out.println("and your age is : " +birthy +" year ,"+birthM+" month ,"+birthD +" day ," + hours +"hours");
        System.out.println("Your next birthday :"+BirthDay +"/"+BirthMonth +"/"+nextbirth);
        System.out.println("----------------------------------");
    }
}