package oops;

class cat {
    String name;
    String colour;
    String breed;


    public cat(){
        this.name = "tom";
        this.colour = "grey";
        this.breed = "pixie bob"; 
    }


    public cat(
        String cat_name,
        String cat_colour,
        String cat_breed
    ){
        this.name = cat_name;
        this.colour = cat_colour;
        this.breed = cat_breed;
    }


    void catcall(){
        System.out.println(this.name + " bhaag ja");
    }
}

