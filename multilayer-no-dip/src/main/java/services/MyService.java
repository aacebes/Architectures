package services;

import model.MyModel;
import model.MyModelPersistenceToMyModelConverter;
import repositories.MyModelPersistence;
import repositories.MyRepository;

public class MyService {
    //It uses the implementation of the repositories rather than an interface

    private final MyRepository repository = new MyRepository();
    private final MyModelPersistenceToMyModelConverter converter = new MyModelPersistenceToMyModelConverter();

    public MyModel retrieveModel() {
        final MyModelPersistence persistence = repository.getModelPersistence();
        return converter.buildFromPersistence(persistence);
    }
}
