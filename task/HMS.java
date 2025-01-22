import java.util.Scanner;

public class HMS {
    // Step: 01 Add Patient
    // 1 lab 2 consult

    // Step: 02
    // if select lab take's user information and then select consult
    // add doctor and then give view the patient's slip

    // Step: 03
    // select the patient give options of doctor for consult then give option view
    // the lab

    // then show consult name and his patient
    // after that give option to see full receipt or exit

    static Scanner sc = new Scanner(System.in);

    // Step 1: add patient
    public static void addPatient() {
        System.out.print("Enter you Name: ");
        String pname = sc.nextLine();

        System.out.print("Enter you Father Name: ");
        String fname = sc.nextLine();

        System.out.print("Enter you Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Select gender \nPress \"M\" for male and \"F\" for Female: ");
        String gender = sc.nextLine();

        System.out.println("\nChoose an option");
        System.out.println("1: Take lab test");
        System.out.println("2: Take consultation");
        System.out.println("3: Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                takeLabTest(pname, fname, age, gender);
                break;

            case 2:
                takeConsultation(pname, fname, age, gender);
                break;

            case 3:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("irrelevant input!");
                break;
        }

    }

    // labtest
    public static void takeLabTest(String pname, String fname, int age, String gender) {
        System.out.println("Enter your Blood Group:  ");
        System.out.println("1: A+");
        System.out.println("2: A-");
        System.out.println("3: B+");
        System.out.println("4: B-");
        System.out.println("5: O+");
        System.out.println("6: O-");
        System.out.println("7: AB+");
        System.out.println("8: AB-");
        int bg = sc.nextInt();
        String bloodgroup = "";
        switch (bg) {
            case 1:
                bloodgroup = "A+";
                break;
            case 2:
                bloodgroup = "A-";
                break;
            case 3:
                bloodgroup = "B+";
                break;
            case 4:
                bloodgroup = "B-";
                break;
            case 5:
                bloodgroup = "O+";
                break;
            case 6:
                bloodgroup = "O-";
                break;
            case 7:
                bloodgroup = "AB+";
                break;
            case 8:
                bloodgroup = "AB-";
                break;

            default:
                break;
        }

        System.out.println("Select type of lab test:");
        System.out.println("1: Blood Test");
        System.out.println("2: Infectious Disease Test");
        System.out.println("3: Hormone Test");
        System.out.println("4: Allergy Test");
        System.out.println("5: ECG Test");
        int labtype = sc.nextInt();
        sc.nextLine();

        String lab = "";
        switch (labtype) {
            case 1:
                lab = "Blood Test";
                break;
            case 2:
                lab = "Infectious Disease Test";
                break;
            case 3:
                lab = "Hormone Test";
                break;
            case 4:
                lab = "Allergy Test";
                break;
            case 5:
                lab = "ECG Test";
                break;

            default:
                System.out.println("Irrelevent Input");
                break;
        }

        System.out.println("\nChoose an option");
        System.out.println("1: Take Consultation");
        System.out.println("2: View Lab Test");
        System.out.println("3: Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                takeConsultationAfterLab(pname, fname, age, gender, labtype, lab, bloodgroup);
                break;

            case 2:
                viewLabTest(pname, fname, age, gender, lab, bloodgroup);
                break;

            case 3:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("ok");
                break;
        }

    }

    // view lab
    public static void viewLabTest(String pname, String fname, int age, String gender, String lab, String bloodgroup) {

        System.out.println();
        int labno = (int) (Math.random() * 10000);

        System.out.println("\n\t\t\t\t LAB TEST");
        System.out.println(" Name: " + pname + "\t\t\t\t\t Lab no:" + labno);
        if (gender.equals("M") || gender.equals("m")) {
            System.out.println(" S/o: " + fname + "\t\t\t\t\t Blood Group: " + bloodgroup);
        } else if (gender.equals("F") || gender.equals("f")) {
            System.out.println(" D/o: " + fname + "\t\t\t\t\t Blood Group: " + bloodgroup);
        }
        System.out.println(" Age/Gender: " + age + "/" + gender.toUpperCase());
        System.out.println("\n\t\t\t Lab Type: " + lab);

        for (int i = 0; i <= 80; i++) {
            System.out.print("_");

        }
        System.out.println("\n|  Test/Parameters\t\tResult\t\tUnits\t\tReference Range  |");
        for (int i = 0; i <= 80; i++) {
            System.out.print("_");
        }
        System.out.println("\n\n|  RBC\t\t\t\t4.3\t\tm/ul\t\t3.8-5.2\t\t |");
        System.out.println("|  MCV\t\t\t\t37.4\t\tfl\t\t80-100\t\t |");
        System.out.println("|  WBC\t\t\t\t6.1\t\tK/ul\t\t4.0-11.0\t |");
        System.out.println("|  Neutrophills%^\t\t50.8\t\t%\t\t44.0-74.0\t |");
        System.out.println("|  Monocytes%^\t\t\t6.3\t\t%\t\t2.0-10.0\t |");
        System.out.print("|\t\t\t\t\t\t\t\t\t\t |");
        System.out.println("\n|\t\t\t***** End of Report *****\t\t\t\t |");
        System.out.print("|\t\t\t\t\t\t\t\t\t\t |\n");
        for (int i = 0; i <= 80; i++) {
            System.out.print("_");
        }

        System.out.println("\nChoose an option");
        System.out.println("1: Take Consultation");
        System.out.println("2: Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                takeConsultationAfterLab(pname, fname, age, gender, labno, lab, bloodgroup);
                break;

            case 2:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("ok");
                break;
        }

    }

    // consultantation
    public static void takeConsultation(String pname, String fname, int age, String gender) {
        sc.nextLine();
        System.out.print("Enter Doctor name: ");
        String dr1 = sc.nextLine();
        System.out.print("Enter Second Doctor name: ");
        String dr2 = sc.nextLine();
        System.out.print("Enter Third Doctor name: ");
        String dr3 = sc.nextLine();

        System.out.println("\nPateint name: " + pname);
        System.out.println("\nSelect the doctor for pateint: " + pname);
        System.out.println("1. Dr. " + dr1 + " (Child specialist)");
        System.out.println("2. Dr. " + dr2 + " (Dermatologist)");
        System.out.println("3. Dr. " + dr3 + " (Cardiologist)");
        int drNo = sc.nextInt();
        switch (drNo) {
            case 1:
                System.out.println("Consultant: Dr." + dr1 + ", Pateint " + pname);
                break;
            case 2:
                System.out.println("Consultant: Dr." + dr2 + ", Pateint " + pname);
                break;
            case 3:
                System.out.println("Consultant: Dr." + dr3 + ", Pateint " + pname);
                break;
            default:
                break;
        }

        System.out.println("\nChoose an option");
        System.out.println("1: Take Lab Test");
        System.out.println("2: Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                takeLabTest(pname, fname, age, gender);
                break;

            case 2:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("ok");
                break;
        }
    }

    // lab andconsultantation
    public static void takeConsultationAfterLab(String pname, String fname, int age, String gender, int labno,
            String lab, String bloodgroup) {
        sc.nextLine();
        System.out.print("Enter Doctor name: ");
        String dr1 = sc.nextLine();
        System.out.print("Enter Second Doctor name: ");
        String dr2 = sc.nextLine();
        System.out.print("Enter Third Doctor name: ");
        String dr3 = sc.nextLine();

        System.out.println("\nPateint name: " + pname);
        System.out.println("\nSelect the doctor for pateint: " + pname);
        System.out.println("1. Dr. " + dr1 + " (Child specialist)");
        System.out.println("2. Dr. " + dr2 + " (Dermatologist)");
        System.out.println("3. Dr. " + dr3 + " (Cardiologist)");
        int drNo = sc.nextInt();
        switch (drNo) {
            case 1:
                System.out.println("Consultant: Dr." + dr1 + " Pateint " + pname);
                break;
            case 2:
                System.out.println("Consultant: Dr." + dr2 + " Pateint " + pname);
                break;
            case 3:
                System.out.println("Consultant: Dr." + dr3 + " Pateint " + pname);
                break;
            default:
                break;
        }

        System.out.println("\nChoose an option");
        System.out.println("1: View Full Lab Test");
        System.out.println("2: Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                viewLabTest(pname, fname, age, gender, lab, bloodgroup);
                System.out.println("\n");
                switch (drNo) {
                    case 1:
                        System.out.println("Consultant: Dr. " + dr1 + " Pateint " + pname);
                        break;
                    case 2:
                        System.out.println("Consultant: Dr. " + dr2 + " Pateint " + pname);
                        break;
                    case 3:
                        System.out.println("Consultant: Dr. " + dr3 + " Pateint " + pname);
                        break;
                    default:
                        break;
                }
                break;

            case 2:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("ok");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hospital Management System\n");
        System.out.println("Do you want to add patient \nPress \"Y\" for yes and \"N\" ");
        String ans = sc.nextLine();

        if (ans.equals("Y") || ans.equals("y")) {
            addPatient();
        } else if (ans.equals("N") || ans.equals("n")) {
            System.out.println("Exit...");
        } else {
            System.out.println("Exit...");
        }

    }
}
