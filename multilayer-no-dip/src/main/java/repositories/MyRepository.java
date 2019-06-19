package repositories;

public class MyRepository {
    // It calls the database or wherever the data is stored.

    public MyModelPersistence getModelPersistence(){
        return new MyModelPersistence();
    }
}
