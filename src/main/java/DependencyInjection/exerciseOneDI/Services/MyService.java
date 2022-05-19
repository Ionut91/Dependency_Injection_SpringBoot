package DependencyInjection.exerciseOneDI.Services;

import DependencyInjection.exerciseOneDI.Components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

   private MyComponent myComponent;

   @Autowired
    public MyService (MyComponent myComponent){
       this.myComponent = myComponent;
       System.out.println("Costruttore MyService chiamato!");
   }
   public String getName(){
       System.out.println("Metodo getName chiamato!");
       return myComponent.getMyComponentName();
   }

}
