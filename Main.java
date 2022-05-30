public class Main
{
    public static void main(String args[]) throws Exceptions {


        Organization or = new Organization();       //dhmiourgia organismou

        //dhmiourgia twn materials
        Material milk = new Material("Milk","Beverage",10,20,30,40);
        Material sugar = new Material("Sugar","Preparation material",55,22,32,42);
        Material rice = new Material("Rice","Side dish",189,24, 34,54);

        //dhmiourgia twn services
        Service BabySitting = new Service("Babysitting","Kids",230);
        Service MedicalSupport = new Service("MedicalSupport","Health",28);
        Service NurserySupport = new Service("NurserySupport","Daycare",57);

        //pros8hkh twn materials ston organismo
        or.addEntity(milk);
        or.addEntity(sugar);
        or.addEntity(rice);

        //pros8hkh twn services ston organismo
        or.addEntity(BabySitting);
        or.addEntity(MedicalSupport);
        or.addEntity(NurserySupport);

        Admin admin = new Admin("Paul",69626262,true);
        or.setAdmin(admin);

        Beneficiary ben1 = new Beneficiary("Helen",691122363, 2);
        Beneficiary ben2 = new Beneficiary("John",692233565, 5);

        Donator don = new Donator("George", 69636363);


        or.listDonators();
        or.listEntities();

        RequestDonation red = new RequestDonation(milk, 3);
        Requests req = new Requests(red);
        RequestDonation red2 = new RequestDonation(NurserySupport, 1);
        Requests req2 = new Requests(red2);

        ben1.addRequest(req);
        ben1.addRequest(req2);

        ben1.getRequestsSize();

        ben1.removeRequest(req);
        ben1.getRequestsSize();

    }
}