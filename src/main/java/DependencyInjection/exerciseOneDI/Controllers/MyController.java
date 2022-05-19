package DependencyInjection.exerciseOneDI.Controllers;

import DependencyInjection.exerciseOneDI.Services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService){
        this.myService = myService;
        System.out.println("Costruttore MyController chiamato!");


    }
    @GetMapping("/getName")
    public String getName(){

        return myService.getName();
    }
    @GetMapping
    public void getMessage(){
        System.out.println("Benvenuto!");
    }


}
