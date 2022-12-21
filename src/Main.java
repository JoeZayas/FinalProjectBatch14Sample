public class Main {
    public static void main(String[] args) {

        SolarSystem solar = new SolarSystem();
        solar.moon=2;
        solar.planets=2;
        solar.sun=1;

        FeatureSun sun = new FeatureSun();
        sun.color="greenred";
        sun.size="23493r234857";
        sun.temp="2353245243";

        Planet1 planet = new Planet1();
        planet.color="red";
        planet.size=34;
        planet.temp="3546";
        planet.rings="4";

    }

}