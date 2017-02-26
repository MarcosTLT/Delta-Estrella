import java.util.ArrayList;

public class Estrella_Delta {

public static ArrayList<Float> Convert(float r1, float r2, float r3){
    ArrayList<Float> Lista= new ArrayList<Float>();   

    Float ra;
    ra=((r1*r2)+(r2*r3)+(r1*r3))/(r1);
    System.out.println("REsultado ra: "+ra);
    Float rb;
    rb=((r1*r2)+(r2*r3)+(r1*r3))/(r2);
    System.out.println("REsultado rb: "+rb);
    Float rc;
    rc=((r1*r2)+(r2*r3)+(r1*r3))/(r3);
    System.out.println("REsultado rc: "+rc);
     
    Lista.add(ra);
    Lista.add(rb);
    Lista.add(rc);
     
     
    return Lista;
}    
    
}//Listo, ¿Ahora qué?