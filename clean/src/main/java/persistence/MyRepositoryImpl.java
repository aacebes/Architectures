package persistence;

import entities.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import use.cases.ports.output.MyRepository;

@Repository
public class MyRepositoryImpl implements MyRepository {
    // It implements de use case output port, calls the database or whatever the data is stored
    // and transform the result.

    @Autowired
    private MyModelPersistenceToMyModelBuilder builder;

    public MyModel getModelPersistence(){
        final MyModelPersistence persistence = new MyModelPersistence();

        return builder.buildFromPersistence(persistence);
    }
}
