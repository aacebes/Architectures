package services;

import model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.MyRepository;

@Service
public class MyService {
    //It uses the interface of the repository and knows nothing about the particular implementation

    @Autowired
    private MyRepository repository;

    public MyModel retrieveModel() {
        return repository.getModelPersistence();
    }
}
