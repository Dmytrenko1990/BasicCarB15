public class Main {
    public static void main(String[] args) {

        BasicStructure audi=new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="5000cc";

        Engine x=new Engine();
        x.cylinders="8";
        x.size="SUV";
        x.weight="2545";

        Lights neon=new Lights();
        neon.color="white";
        neon.size="15watt";
        neon.intensity="8000 lumin";
    }
}