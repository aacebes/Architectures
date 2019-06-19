package controllers;

import model.MyModel;
import services.MyService;

public class Controller {
    // Implementation of the presentation layer that uses the services layer

    private final MyService service = new MyService();
    private final MyModelToMyModelWebResponseConverter converter = new MyModelToMyModelWebResponseConverter();

    public MyModelWebResponse retrieveModel(){
        final MyModel model = service.retrieveModel();
        return converter.convert(model);
    }
}
