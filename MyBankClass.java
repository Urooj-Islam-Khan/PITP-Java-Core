import java.util.Scanner;

public class MyBankClass {
    String bankName = "My Islamic Bank";
    String bankType = "Islamic";
    String savingAccount = "Saving Account";
    String currentAccount = "Current Account";
    int total_amount_sa = 20000;
    int total_amount_ca = 15000;
    String customer1_name = "Umama Ali";
    String customer2_name = "Meher Ikram";
    String employee1_name = "M.Zain Khan";
    String employee2_name = "M.Hussaim Khan";

    public void viewBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Bank Type: " + bankType);
    }
}

class Bank_Account_Class extends MyBankClass {
    public void viewAccount1Details() {
        viewBankDetails();
        System.out.println("Account Type: " + savingAccount);
        System.out.println("Total Balance: " + total_amount_sa);
        System.out.println("Account Holder: " + customer1_name);
    }

    public void viewAccount2Details() {
        viewBankDetails();
        System.out.println("Account Type: " + currentAccount);
        System.out.println("Total Balance: " + total_amount_ca);
        System.out.println("Account Holder: " + customer2_name);
    }
}

class Bank_Employees_Class extends MyBankClass {
    public void viewEmployee1Details() {
        System.out.println("Employee name: " + employee1_name);
        System.out.println("Position: Manager");
    }

    public void viewEmployee2Details() {
        System.out.println("Employee name: " + employee2_name);
        System.out.println("Position: Cashier");
    }
}

class Bank_Customer_Class extends Bank_Account_Class {
    int pincode1 = 1012;
    int pincode2 = 0101;

    public void viewCustomer1Details() {
        viewAccount1Details();
    }

    public void viewCustomer2Details() {
        viewAccount2Details();
    }
}

class ATM extends Bank_Customer_Class {
    Scanner sc = new Scanner(System.in);
    static String ty = "Thank you for using our ATM";

    void ATM_Transaction() {
        System.out.println("Enter your PIN");
        int pin = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (pin == pincode1 || pin == pincode2) {
            while (true) {
                System.out.println("Do you want to:");
                System.out.println("1: Cash Withdrawal");
                System.out.println("2: Balance Inquiry");
                System.out.println("3: Exit");

                int userans = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (userans) {
                    case 1:
                        System.out.println("Enter amount to withdraw:");
                        int amount = sc.nextInt();
                        sc.nextLine(); // Consume newline

                        if (pin == pincode1 && amount <= total_amount_sa) {
                            total_amount_sa -= amount;
                            System.out.println("Your Cash: " + amount);
                            printReceipt(amount, total_amount_sa);
                        } else if (pin == pincode2 && amount <= total_amount_ca) {
                            total_amount_ca -= amount;
                            System.out.println("Your Cash: " + amount);
                            printReceipt(amount, total_amount_ca);
                        } else {
                            System.out.println("Insufficient balance!");
                        }

                        System.out.println("Do you want to view balance? (Y/N)");
                        char askBal = sc.next().charAt(0);
                        if (askBal == 'Y' || askBal == 'y') {
                            if (pin == pincode1) {
                                System.out.println("Remaining Balance: " + total_amount_sa);
                            } else {
                                System.out.println("Remaining Balance: " + total_amount_ca);
                            }
                        }
                        break;

                    case 2:
                        if (pin == pincode1) {
                            viewAccount1Details();
                        } else if (pin == pincode2) {
                            viewAccount2Details();
                        }

                        System.out.println("Do you want to withdraw cash? (Y/N)");
                        char askAtm = sc.next().charAt(0);
                        if (askAtm == 'Y' || askAtm == 'y') {
                            System.out.println("Enter amount to withdraw:");
                            int amount2 = sc.nextInt();
                            sc.nextLine(); // Consume newline

                            if (pin == pincode1 && amount2 <= total_amount_sa) {
                                total_amount_sa -= amount2;
                                System.out.println("Your Cash: " + amount2);
                                printReceipt(amount2, total_amount_sa);
                            } else if (pin == pincode2 && amount2 <= total_amount_ca) {
                                total_amount_ca -= amount2;
                                System.out.println("Your Cash: " + amount2);
                                printReceipt(amount2, total_amount_ca);
                            } else {
                                System.out.println("Insufficient balance!");
                            }
                        }
                        break;

                    case 3:
                        System.out.println(ty);
                        return;

                    default:
                        System.out.println("Invalid Input");
                }
            }
        } else {
            System.out.println("Invalid PIN Code");
        }
    }

    void printReceipt(int amount, int remainingBalance) {
        System.out.println("Do you want a receipt? (Y/N)");
        char rcptAns = sc.next().charAt(0);
        if (rcptAns == 'Y' || rcptAns == 'y') {
            System.out.println("Receipt:");
            viewBankDetails();
            System.out.println("Withdrawal Amount: " + amount);
            System.out.println("Remaining Balance: " + remainingBalance);
        } else {
            System.out.println(ty);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select one:");
        System.out.println("1: View Bank and Account Details");
        System.out.println("2: Use ATM");
        System.out.println("3: Exit");

        int input = sc.nextInt();
        sc.nextLine(); // Consume newline

        ATM atm = new ATM();
        Bank_Employees_Class emp = new Bank_Employees_Class();
        Bank_Customer_Class cus = new Bank_Customer_Class();

        switch (input) {
            case 1:
                printSectionHeader("Bank Details");
                cus.viewBankDetails();

                printSectionHeader("Bank Account's Details");
                System.out.println("Account 1 Details");
                cus.viewAccount1Details();

                System.out.println("\nAccount 2 Details");
                cus.viewAccount2Details();

                printSectionHeader("Bank Employee's Details");
                System.out.println("\nEmployee 1 Details");
                emp.viewEmployee1Details();

                System.out.println("\nEmployee 2 Details");
                emp.viewEmployee2Details();

                printSectionHeader("Bank Customer's Details");
                System.out.println("\nCustomer 1 Details");
                cus.viewCustomer1Details();

                System.out.println("\nCustomer 2 Details");
                cus.viewCustomer2Details();

                System.out.println("Do you want to:");
                System.out.println("1: Use ATM");
                System.out.println("2: Exit");
                int userinput = sc.nextInt();
                sc.nextLine(); // Consume newline

                if (userinput == 1) {
                    atm.ATM_Transaction();
                } else {
                    System.out.println(ty);
                }
                break;

            case 2:
                atm.ATM_Transaction();
                break;

            case 3:
                System.out.println("Thank you for using our services.");
                break;

            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }

    static void printSectionHeader(String title) {
        System.out.println("---------- " + title + " ----------");
    }
}
