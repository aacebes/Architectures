package repositories;

import model.MyModel;

public interface MyRepository {
    // It only knows about our model

    MyModel getModelPersistence();
}
