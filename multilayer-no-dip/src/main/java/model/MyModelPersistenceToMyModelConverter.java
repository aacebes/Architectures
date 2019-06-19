package model;

import repositories.MyModelPersistence;

public class MyModelPersistenceToMyModelConverter {

    public MyModel buildFromPersistence(MyModelPersistence persistence) {
        return new MyModel();
    }
}
