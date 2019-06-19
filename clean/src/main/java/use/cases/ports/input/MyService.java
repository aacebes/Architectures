package use.cases.ports.input;

import entities.MyModel;

public interface MyService {
    // It only knows about our model

    MyModel retrieveModel();
}
