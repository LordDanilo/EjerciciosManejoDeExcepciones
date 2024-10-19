import java.io.FileReader;
import java.io.FileNotFoundException;

public class Example{
    public void sampleMethod(){
        try{
            Class.forName("com.myproject.Unicornio");
        }catch(ClassNotFoundException e){
            System.out.println("Ocurrio algo: "+e);
        }
        
    }
}
