package controllers;

import model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import services.MyService;

@RestController
public class Controller {
    // Implementation of the controllers layer that uses the services layer
    // (maybe with an interface, but the architecture says nothing about that)

    @Autowired
    private MyService service;

    @Autowired
    private MyModelToMyModelWebResponseConverter converter;

    public MyModelWebResponse retrieveModel(){
        final MyModel model = service.retrieveModel();
        return converter.convert(model);
    }
}
