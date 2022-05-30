abstract class Entity {         //abstract ka8ws den mporei na exei stigmiotupa

        private String name;
        private String description;
        private int id;

        public Entity(String name, String description, int id) {        //constructor klashs
            this.name = name;
            this.description = description;
            this.id = id;
        }

    //Getters metablhtwn
        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getId() {
            return id;
        }

        public String getEntityInfo(){
          return name + ", " + description + ", " + id;
        }

        public abstract String getDetails();            //abstract giati 8a thn kanw override



    @Override
    public String toString() {      //epistrefoume mia sumboloshra apeikonishs tou antikeimenou
        return getEntityInfo() + ", " + getDetails();
    }


    public double getPeople(Object getNoPersons) {
        return 0;
    }
}


