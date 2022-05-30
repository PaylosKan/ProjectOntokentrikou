public class Service extends Entity{          //upoklash ths Entity

    public Service(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public String getDetails() {            //kanoume override thn methodo getDetails ths abstract klashs Entity
        return "Service";                   //kai thn tropopoioume gia na epistrefei oti to antikeimeno einai Service
    }
}

