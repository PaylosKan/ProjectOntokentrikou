import java.util.Scanner;

public class Menu {

    private Beneficiary ben;
    private Organization or;
    private Admin ad;
    private Donator don;


    public Menu(Organization or) {
        this.or = or;
    }

    public void InitialMenu() throws Exceptions {
        boolean admin = false;
        boolean donator = false;
        boolean beneficiary = false;
        String name;
        int familyMembers;
        int phoneNumber;
        int choice;

        System.out.println("Hello, please type your phone number: ");
        Scanner sc = new Scanner(System.in);
        phoneNumber = sc.nextInt();

        if(phoneNumber == or.getAdmin().GetPhone())
            admin = true;
        else if(or.getDonatorPhone(phoneNumber).GetPhone() == phoneNumber)
            donator = true;
        else
            beneficiary = true;

        System.out.println();

        if(admin)
            this.adminCommands(phoneNumber);
        else if(donator)
            this.donatorCommands(phoneNumber);
        else if(beneficiary)
            this.beneficiaryCommands(phoneNumber);

        else {
            System.out.println("1) Donator");
            System.out.println("2) Beneficiary");
            System.out.println("Enter your choice: ");

            do {
                choice = sc.nextInt();
            } while (choice < 1 || choice > 2);

            switch (choice) {

                case 1:                                         //8elei donator
                    System.out.println("Enter your name: ");
                    name = sc.nextLine();

                    Donator don = new Donator(name, phoneNumber);   //dhmiourgia antikeimenou donator
                    or.insertDonator(don);                          //kai eisagwghs tou ston organismo
                    this.donatorCommands(phoneNumber);              //metabash sto menu tou donator


                case 2:                                         //8elei Beneficiary
                    System.out.println("Enter your name: ");
                    name = sc.nextLine();
                    System.out.println("Enter the number of your family members: ");
                    familyMembers = sc.nextInt();

                    Beneficiary ben = new Beneficiary(name, phoneNumber, familyMembers);       //opws case 1
                    or.insertBeneficiary(ben);
                    this.beneficiaryCommands(phoneNumber);
            }
        }
    }




    public void beneficiaryCommands(int phone) throws Exceptions{

        ben = or.getBeneficiaryPhone(phone);
        int choice;

        System.out.println("Hello Beneficiary!");
        System.out.println("Name: " + ben.getName() + "Organization's name: " + or.getName());
        System.out.print(" Phone: " + ben.GetPhone());

        System.out.println("Choose from the following menu: ");
        System.out.println("1) Add Request");
        System.out.println("2) Show Requests");
        System.out.println("3) Commit");
        System.out.println("4) Back");
        System.out.println("5) Logout");
        System.out.println("6) Exit");

        Scanner sc = new Scanner(System.in);




            case 4:
                this.InitialMenu();
            case 5:
                this.InitialMenu();
            case 6:
                System.exit(0);
        }



    public void donatorCommands(int phone) throws Exceptions{

        ben = or.getBeneficiaryPhone(phone);
        int choice;

        System.out.println("Hello Beneficiary!");
        System.out.println("Name: " + don.getName() + "Organization's name: " + or.getName());
        System.out.print(" Phone: " + don.GetPhone());

        System.out.println("Choose from the following menu: ");
        System.out.println("1) Add Offers");
        System.out.println("2) Show Offers");
        System.out.println("3) Commit");
        System.out.println("4) Back");
        System.out.println("5) Logout");
        System.out.println("6) Exit");

        Scanner sc = new Scanner(System.in);




        case 4:
        this.InitialMenu();
        case 5:
        this.InitialMenu();
        case 6:
        System.exit(0);
    }



}
