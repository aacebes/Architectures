package controllers;

import entities.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import use.cases.ports.input.MyService;

@RestController
public class Controller {

    // As an external source, it uses the use case input port without caring about the implementation.
    // It calls the system and transform the data to match the domain and the exterior.

    @Autowired
    private MyService service;

    @Autowired
    private MyModelToMyModelWebResponseConverter converter;

    public MyModelWebResponse retrieveModel(){
        final MyModel model = service.retrieveModel();
        return converter.convert(model);
    }
}
