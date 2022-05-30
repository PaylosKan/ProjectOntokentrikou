import java.util.*;

public class Organization {

    private String name;
    private Admin admin;
    private ArrayList<Entity> entityList = new ArrayList<>();
    private ArrayList<Donator> donatorList = new ArrayList<>();
    private ArrayList<Beneficiary> beneficiaryList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }


    public void addEntity(Entity en) throws Exceptions {            //an to ID kapoiou entity einai idio me to ID toy
                                                                    //entity poy pros8etw tote yparxei hdh sth lista
        boolean exists = false;
        for (Entity entity : entityList) {
            if (entity.getId() == en.getId()) {
                exists = true;
                break;
            }
        }

        if(exists)      //exists = false , dhladh den yparxei opote mporw na to pros8esw
            entityList.add(en);
        else
            throw new Exceptions("Entity already exists");
    }


    public void removeEntity(Entity en) throws Exceptions{          // idia logikh me thn add

        boolean exists = false;
        for (Entity entity : entityList) {
            if (entity.getId() == en.getId()) {
                exists = true;
                break;
            }
        }

        if(exists)      //exists=false, dhladh den uparxei opote den mporw na to afairesw
            throw new Exceptions("Entity dose not exist");
        else
            entityList.remove(en);
    }




    public void insertDonator (Donator don){
        try{
            donatorList.add(don);
        }
        catch (Exception e){
            System.out.println("Donator is already in the list");
        }
    }

    public void removeDonator (Donator don){
        try{
            donatorList.remove(don);
        }
        catch (Exception e){
            System.out.println("Donator does not exist");
        }
    }



    public void insertBeneficiary (Beneficiary ben){
        try{
            beneficiaryList.add(ben);
        }
        catch (Exception e){
            System.out.println("Beneficiary is already in the list");
        }
    }


    public void removeBeneficiary (Beneficiary ben){
        try{
            beneficiaryList.remove(ben);
        }
        catch (Exception e){
            System.out.println("Beneficiary does not exist");
        }
    }


    public void listEntities(){

        System.out.println("Material: ");
        for (Entity entity : entityList) {
            if (entity.getDetails().equals("Material"))
                System.out.println(entity.getName());
        }

        System.out.println("Services: ");
        for (Entity entity : entityList) {
            if (entity.getDetails().equals("Service"))
                System.out.println(entity.getName());
        }
}

    public void listDonators(){
        for (Donator donator : donatorList)
            System.out.println(donator.getName());
    }



    public int EntityListSize(){
        return   entityList.size();
    }

    public  Entity getEntityInsideList(int i){
        return entityList.get(i);
    }


    public Beneficiary getBeneficiaryPhone(int phone) throws Exceptions {

        for (Beneficiary beneficiary : beneficiaryList) {
            if (beneficiary.GetPhone() == phone)
                return beneficiary;
        }
        throw new Exceptions ("Beneficiary does not exist");
    }


    public Donator getDonatorPhone(int phone) throws Exceptions {

        for (Donator donator : donatorList) {
            if (donator.GetPhone() == phone)
                return donator;
        }
        throw new Exceptions ("Donator does not exist");
    }




}


