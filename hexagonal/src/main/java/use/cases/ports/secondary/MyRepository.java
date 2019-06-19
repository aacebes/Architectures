package use.cases.ports.secondary;

import model.MyModel;

public interface MyRepository {
    // It only knows about our model

    MyModel getModelPersistence();
}
