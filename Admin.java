class Admin extends User{               //Ypoklash ths user

   private boolean isAdmin = true;

    public Admin(String name, int phone, boolean isAdmin) {      //constructor ths klashs
        super(name, phone);
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
