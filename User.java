abstract public class User {            //einai abstract kathws den mporei na exei stigmiotupa

    private String name;
    private int phone;

    public User(String name, int phone) {       //constructor klashs
        this.name = name;
        this.phone = phone;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int GetPhone() {
        return phone;
    }
}

