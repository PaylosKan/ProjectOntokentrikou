import java.util.*;             // eisagoume oles tis klaseis tou paketou java.util gia dieukolunsh

public class Beneficiary extends User{          //upoklash ths user

    private int noPersons = 1;
    private RequestDonationList receivedList;
    private ArrayList<Requests> requestsList = new ArrayList<>();

    public Beneficiary(String name, int phone, int noPersons) {      //constructor klashs
        super(name, phone);
        this.noPersons = noPersons;
    }



    public void addRequest(Requests re) throws Exceptions{

        boolean requested = false;
        for (Requests requests : requestsList) {
            if (requests.getRequest().getEntity() == re.getRequest().getEntity()) {
                requested = true;
                break;
            }

        }

        if(!requested)      //dhladh requested = true
            throw new Exceptions("Entity requested already");
        else
            requestsList.add(re);
    }   //sarwnoume th lista me to for loop kai an to aithma pou eishx8h uparxei hdh sth lista tote petaei exception
        //alliws an den uparxei, to pros8etoume


    public void removeRequest(Requests re) throws Exceptions{

        boolean exists = false;
            for(int i=0; i<requestsList.size(); i++){
                if(requestsList.get(i).getRequest().getEntity() == re.getRequest().getEntity())
                    requestsList.remove(requestsList.get(i));
                exists = true;          // an uparxei tote to afairei
        }
            if(exists)  //exists = false dhladh den yparxei tote den mporei kai na afaire8ei
                throw new Exceptions("Entity does not exist, thus can not be removed");
    }



    public double entitiesReceived(Entity ent){
        double received=0;
        for (Requests requests : requestsList) {
            if (requests.getRequest().getEntity() == ent)
                received += requests.getRequest().getQuantity();
        }
        return received;
    }   //sarwsh ths listas kai ka8e fora pou to entity poy 8eloume na epistre4oume uparxei sth lista, pros8etoume
        //th posothta me thn opoia yparxei se ka8e keli ths listas opou bre8hke sto received kai sto telos to epistrefoume


    public int getRequestsSize(){
        return requestsList.size();
    }

    public int GetNoPersons() {
        return noPersons;
    }


}
