package services;

import model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import use.cases.ports.primary.MyService;
import use.cases.ports.secondary.MyRepository;

public class MyServiceImpl implements MyService {
    // It implements the primary port

    // It also uses the secondary port (but it could be in another inner layer)
    // and knows nothing about the particular implementation

    @Autowired
    private MyRepository repository;

    public MyModel retrieveModel() {
        return repository.getModelPersistence();
    }
}
