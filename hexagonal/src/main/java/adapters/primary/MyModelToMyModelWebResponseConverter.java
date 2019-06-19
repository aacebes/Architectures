package adapters.primary;

import model.MyModel;
import org.springframework.stereotype.Component;

@Component
class MyModelToMyModelWebResponseConverter {

    MyModelWebResponse convert(MyModel model) {
        return new MyModelWebResponse();
    }
}
