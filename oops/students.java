package oops;

public class students {
    int roll;
    String name;
    batch enrolled_batch = new batch();

    public students(){
        this.roll = 0;
        this.name = "default";
        // this.enrolled_batch = new batch();
    }


    public students(
        int roll,
        String name,
        String batch_name,
        int cost,
        String batch_topic
    ){
        this.roll = roll;
        this.name = name;
        // enrolled_batch = new batch(
        //     batch_name,
        //     cost,
        //     batch_topic
        // );
        this.enrolled_batch.batch_name = batch_name;
        this.enrolled_batch.cost = cost;
        this.enrolled_batch.topic = batch_topic;
    }
    void study (){
        System.out.println(this.name + " is studying");
    }
}
