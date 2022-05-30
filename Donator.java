public class Donator extends User{      //upoklash ths user


    private Offers offersList;


    public Donator(String name, int phone) {     //constructor klashs
        super(name, phone);
    }


    public void add(RequestDonation rd,Organization or) throws Exceptions {
        offersList.add(rd,or);
    }


    public void remove(RequestDonation rd){
        offersList.remove(rd);
    }


   public void reset(){
        offersList.reset();
   }

}
