package DependencyInjection.exerciseOneDI.Components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        this.myComponentName = "Ionut";
        System.out.println("Costruttore MyComponent chiamato!");
    }
    public String getMyComponentName(){
        System.out.println("Metodo getMyComponentName chiamato!");
        return myComponentName;


    }
}
