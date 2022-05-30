class Material extends Entity {         //upoklash ths Entity

    private double level1, level2, level3;


    public Material(String name, String description, int id, double level1 , double level2, double level3) {
        super(name, description, id);
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
    }       //Constructor klashs

    @Override
    public String getDetails(){     //kanoume override thn methodo getDetails ths klashs Entity
                                    //kai epistrefoume ena mhnuma me ta levels kai oti to antikeimeno einai Material
        return "level1: " + level1 + ", level2: " + level2 + ", level3: " + level3 + ", Material";
    }

    public double getPeople(int people)
    {
        if(people == 1)
            return level1;
        if(people>=2 && people<=4)
            return level2;
        else
            return level3;
    }
            //methodos h opoia pairnei enan ari8mo atomwn kai epistrefei analoga me ton ari8mo auto se poio level anhkoun
}
