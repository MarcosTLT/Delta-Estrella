
import java.util.ArrayList;

public class Delta_Estrella {

public static ArrayList<Float> Convert(float ra, float rb, float rc){
    ArrayList<Float> Lista= new ArrayList<Float>();   

    Float r1;
    r1=(rb*rc)/(ra+rb+rc);
    System.out.println("REsultado r1: "+r1);
    Float r2;
    r2=(ra*rc)/(ra+rb+rc);
    System.out.println("REsultado r2: "+r2);
    Float r3;
    r3=(ra*rb)/(ra+rb+rc);
    System.out.println("REsultado r3: "+r3);
     
    Lista.add(r1);
    Lista.add(r2);
    Lista.add(r3);
     
     
    return Lista;
}    
    
}
