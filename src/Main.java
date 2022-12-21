public class Main {
    public static void main(String[] args) {

        SolarSystem solar = new SolarSystem();
        solar.moon=2;
        solar.planets=2;
        solar.sun=1;

        FeatureSun sun = new FeatureSun();
        sun.color="green";
        sun.size="2349857";
        sun.temp="235";

        Planet1 planet = new Planet1();
        planet.color="red";
        planet.size=34;
        planet.temp="3546";
        planet.rings="4";

        Planet2 planet2 = new Planet2();
        planet2.color="red";
        planet2.size=45;
        planet2.temp="3483794";
        planet2.rings="5";

    }

}