package use.cases.interactors;

import entities.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import use.cases.ports.input.MyService;
import use.cases.ports.output.MyRepository;

public class MyServiceImpl implements MyService {
    // It implements the use case input port

    // It also uses the use case output port (but it could be in another inner layer)
    // and knows nothing about the particular implementation

    @Autowired
    private MyRepository repository;

    public MyModel retrieveModel() {
        return repository.getModelPersistence();
    }
}
