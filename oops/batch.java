package oops;
public class batch {
    String batch_name;
    int cost;
    String topic;
    
    //constructor
    public batch(){ //default constructor
        this.batch_name = "default_batch";
        this.cost = 20000;
        this.topic = "java";
    }

    //custom constructor
    public batch(
        String name,
        int cost,
        String topic 
        ){
            this.batch_name = name;
            this.cost = cost;
            this.topic = topic;
        }
}
