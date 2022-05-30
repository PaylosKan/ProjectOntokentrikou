import java.util.*;

class RequestDonationList {

    private ArrayList<RequestDonation> rdEntities = new ArrayList<>();


    public RequestDonation get(int id){             //sarwsh ths listas me ta RequestDonations kai an uparxei to entity
                                                    //tou opoiou to id exoume 8esei sto orisma ths me8odou tote to epistrefei
        for (RequestDonation rdEntity : rdEntities) {
            if (rdEntity.getEntity().getId() == id)
                return rdEntity;
            else
                System.out.println("The Entity you want to get does not exist.");
        }
        return null;
    }


    public void add(RequestDonation rd, Organization or) throws Exceptions
    {

        boolean requested = false;
        boolean exists = false;
        double quantity = rd.getQuantity();

        for (RequestDonation rdEntity : rdEntities) {
            if (rd.getEntity() == rdEntity.getEntity()) {
                quantity++;
                rdEntity.setQuantity(quantity);
                requested = true;
            }   // to rd afora entity p hdh yparxei se kapoio rd ths sulloghs k ginetai enhmerwsh quantity
        }

        if(requested)       //requested = false, dhladh den uparxei opote mporw na to pros8esw
            rdEntities.add(rd);

        for(int i=0; i<or.EntityListSize(); i++) {
            if (rd.getEntity().getName().equals(or.getEntityInsideList(i).getName()))
                exists = true;
        }

        if(exists)  //exists == false
            throw new Exceptions("This entity is not provided by the organization");

    }


    public void remove(RequestDonation i){
        try {
            rdEntities.remove(i);
        }
        catch(Exception e){
            System.out.println("The Entity you want to remove does not exist.");
        }
    }


    public void modify(int position, double quant){     //tropopoiei ena antikeimeno sth 8esh position
        rdEntities.get(position).setQuantity(quant);    //allazontas tou to quantity
    }



    public void monitor(){          //emfanizei to plh8os twn eidwn ths rdEntities

        for (RequestDonation rdEntity : rdEntities) {
            System.out.println(rdEntity.getEntity().getName() + ", "
                    + rdEntity.getQuantity());
        }
    }


    public void reset(){
        rdEntities.clear();
    }

    public RequestDonation getRdObject(int i){
        return rdEntities.get(i);
    }

}
