package use.cases.ports.output;

import entities.MyModel;

public interface MyRepository {
    // It only knows about our model

    MyModel getModelPersistence();
}
