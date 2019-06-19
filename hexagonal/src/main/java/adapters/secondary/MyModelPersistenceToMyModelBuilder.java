package adapters.secondary;

import model.MyModel;
import org.springframework.stereotype.Component;

@Component
class MyModelPersistenceToMyModelBuilder {

    MyModel buildFromPersistence(MyModelPersistence persistence) {
        return new MyModel();
    }
}
