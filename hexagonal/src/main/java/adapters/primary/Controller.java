package adapters.primary;

import model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import use.cases.ports.primary.MyService;

@RestController
public class Controller {

    // The primary adapter uses the primary port, not knowing the implementation.
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
