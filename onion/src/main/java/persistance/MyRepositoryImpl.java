package persistance;

import model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repositories.MyRepository;

@Repository
public class MyRepositoryImpl implements MyRepository {
    // It calls the database or whatever the data is stored.

    @Autowired
    private MyModelPersistenceToMyModelBuilder builder;

    public MyModel getModelPersistence(){
        final MyModelPersistence persistence = new MyModelPersistence();

        return builder.buildFromPersistence(persistence);
    }
}
