package adapters.secondary;

import model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import use.cases.ports.secondary.MyRepository;

@Repository
public class MyRepositoryImpl implements MyRepository {
    // The secondary adapter implements de secondary port, calls the database or whatever the data is stored
    // and transform the result.

    @Autowired
    private MyModelPersistenceToMyModelBuilder builder;

    public MyModel getModelPersistence(){
        final MyModelPersistence persistence = new MyModelPersistence();

        return builder.buildFromPersistence(persistence);
    }
}
