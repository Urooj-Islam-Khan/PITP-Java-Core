import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Father Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter your Batch: ");
        String batch = sc.nextLine();
        System.out.print("Enter your English marks: ");
        float eng = sc.nextFloat();
        System.out.print("Enter your Mobile App Dev marks: ");
        float mad = sc.nextFloat();
        System.out.print("Enter your Operating System marks: ");
        float os = sc.nextFloat();
        System.out.print("Enter your Project Management: ");
        float pm = sc.nextFloat();

        double total = eng + mad + os + pm;
        double percentage = (total * 100) / 400;
        String grade;

        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70 && percentage < 80) {
            grade = "A";
        } else if (percentage >= 60 && percentage < 70) {
            grade = "B";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "C";
        } else if (percentage >= 40 && percentage < 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\nName: " + name);
        System.out.println("Father Name: " + fname);
        System.out.println("Batch: " + batch);
        System.out.println("Subjects\t\t" + "Totla Marks\t" + "Obtained Marks");
        System.out.println("English\t\t\t " + " 100\t\t" + eng);
        System.out.println("Mobile App Dev\t\t " + " 100\t\t" + mad);
        System.out.println("Operating System \t " + " 100\t\t" + os);
        System.out.println("Project Management\t " + " 100\t\t" + pm);
        System.out.println("Total Marks:\t\t " + total);
        System.out.println("Grade: " + grade);

    }
}
