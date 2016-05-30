
/**
 * The program prog54h calculates the area of donut island with a circular lake in the middle
 * 
 * @Nicholas Rudd
 * @prog54h
 * What Ive learned: How to use a static variable type
 * Troubles: None
 */

public class prog54h
{
    public static final double pi=3.14159;
    public static void main (String[] args)
    {
        double donut_island_radius=4.16/2.0; //raduis of donut island
        double circular_lake_radius=.96;  //raduis of circular lake
        double area_donut = pi*(donut_island_radius*donut_island_radius); //area of donut island without the lake
        double circular_lake_area = pi*(circular_lake_radius*circular_lake_radius); //area of circular lake
        area_donut=(int)(area_donut*1000+.5)/1000.0; //keeps the decimal to the 1000th place
        circular_lake_area=(int)(circular_lake_area*1000+.5)/1000.0; //keeps the decimal to the 1000th place
        double total = area_donut-circular_lake_area; //area of the donut island with the circular lake
        total=(int)(total*1000+.5)/1000.0; //keeps the decimal to the 1000th place
        System.out.println("Donut island with a diameter of 4.16 miles (or a radius of " +donut_island_radius+" miles ) that contains a circular lake of " +circular_lake_radius+" miles has " + total +" square miles of cultivatable land."); //prints answer to user
    }
}
/**Sample Output
 * Donut island with a diameter of 4.16 miles (or a radius of 2.08 miles ) that contains a circular lake of 0.96 miles has 10.697 square miles of cultivatable land.
 */