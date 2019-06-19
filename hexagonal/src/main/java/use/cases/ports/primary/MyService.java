package use.cases.ports.primary;

import model.MyModel;

public interface MyService {
    // It only knows about our model

    MyModel retrieveModel();
}
