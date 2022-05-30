public class Requests extends RequestDonationList{      //upoklash ths RequestDonationList

    private RequestDonation request;

    public Requests(RequestDonation request) {      //constructor klashs
        this.request = request;
    }

    public RequestDonation getRequest() {
        return request;
    }

    public boolean validRequestDonation(Beneficiary b, RequestDonation rd, Organization or){

        if(this.getRequest().getEntity().getDetails().equals("Material")) {

            try {

                double persons = this.getRequest().getEntity().getPeople(b.GetNoPersons());
                double quantity = this.getRequest().getQuantity();
                double requested = b.entitiesReceived(this.getRequest().getEntity());

                if (quantity>persons)
                    return false;
                else return !(quantity + requested > persons);      //an isxuei h e3iswsh epsitrefei false alliws true;
            }
            catch (Exception e){
                System.out.println("An error has occured.");
            }
        }

        else if(this.getRequest().getEntity().getDetails().equals("Service")) {
            return true;
        }

    }



    public void add(Beneficiary b, Organization or) throws Exceptions
    {

        RequestDonation req = this.getRequest();
        boolean exists = false;

        for(int i=0; i<b.getRequestsSize(); i++){    //Prwta elegxos an prosferetai to entity k meta
            if(super.getRdObject(i).getEntity() == this.getRequest().getEntity() &&
                    super.getRdObject(i).getQuantity() >= this.getRequest().getQuantity())  // an uparxei k se arketi posothta
                exists = true;
        }

        if(!validRequestDonation(b, req, or))
            throw new Exceptions("You have requested more entities than  available");

        if(exists)  //exists = false, dhladh den uparxei
            throw new Exceptions("You have requested more entities than  available");

        else
            b.addRequest(this);

    }

    public void modify(Beneficiary b, Organization or) throws Exceptions
    {

        RequestDonation req = this.getRequest();
        boolean item = false;

        for(int i=0; i<b.getRequestsSize(); i++){    //Prwta elegxos an prosferetai to entity k meta gia posothta
            if(super.getRdObject(i).getEntity() == this.getRequest().getEntity() &&
                    super.getRdObject(i).getQuantity() >= this.getRequest().getQuantity())
                item = true;
        }

        if(!validRequestDonation(b, req, or))
            throw new Exceptions("You have requested more entities than  available");

        if(item)
            throw new Exceptions("You have requested more entities than  available");

    }


}
