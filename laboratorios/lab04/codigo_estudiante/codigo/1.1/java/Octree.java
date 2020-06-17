/**
 *This is our data structure, Octree. This will be responsible for positioning each bee in a specific quadrant, 
 *so you can determine if it collides or not. Its main function will be divided into eight quadrants, in 3D. 
 *If more than one bee is found in a quadrant, this quadrant will be divided into multiple subOctrees, found 
 *in the limits of this, until the bee is alone, or within a diagonal quadrant of less than 100 meters in length. 
 *This is done to ensure that all the bees within this quadrant are in danger of colliding.
 * @author: Daniel Otero Gomez, Rafael Mateus Carrion. 
 * @version: 4/7/2019/A
 * @see Octree
 * @see Bee
 */
import java.util.ArrayList;
import java.util.LinkedList;
public class Octree
{
    private double midD,midW,midH;
    /**
     * This will be the method that represents the Octree, on this method all the recursion will be done, here each bee will be assigned 
     *to its respective sector of the Octree, represented by an ArrayList of 8 spaces (each one representing each sector), where it will 
     *be stored in a LinkedList. The process of deciding which sector each bee goes to will be done by the hashing method. After each bee
     *is located in a sector it will happen to create the sub-views of the Octree with the new method Octree. Before going on to create 
     *the new subdivisions of the Octree, it is asked if the octual diagonal is less than 100 meters, if so it will start printing the 
     *bees located in the sectors where there is more than one bee.
     * @param ArrayList<Bee> abejas: ArrayList with all the bees
     * @param ArrayList<Double> mins: they are the values of the coordinates, to which they will be sumed with all others in order to determine
     * the posicion in the Octree. It can be resemble as a vertex of the Octree.
     * @param double midD: will be the value of the latitude found in the middle of the bee with the lowest latitude and the bee with the highest latitude
     * @param double midW: will be the value of the latitude found in the middle of the bee with the lowest longitude and the bee with the highest longitude
     * @param double midD: will be the value of the latitude found in the middle of the bee with the lowest altitude and the bee with the highest altitude
     * @see hashing
     * @see nuevoOct
     */
    public void octree (LinkedList<Bee> abejas,ArrayList<Double> mins,double midD,double midW,double midH) {
       
    }

    /**
     * This method will be responsible for receiving each bee that is in the octree, and place it in a certain sector of the data structure, 
     *so that it will be located in the space of the ArrayList table corresponding to the sector in which the bee is positioned. Determine the 
     *sector by comparing the minimum, that is, the vertices of the Octree, plus the average values of the Octree with which it is being worked.
     * @param Bee abeja: abeja que sera ubicada
     * @param ArrayList<Double> mins: this ArrayList will contain the minimum, that is, the vertex composed by each coordinate. This parameter 
     *is necessary to be able to make an appropriate location for each bee, because the use of this parameter will simplify the code so that only 
     *one value will have to be added to determine if a bee is in a sector or in other.
     * @return number of the sector the Bee is located in.
     */
    private int hashing(Bee abeja,ArrayList<Double> mins) {
       
    }

    /**
     * This method is responsible for making the recursion, with respect to the main octree method. Receive the parameters corresponding to 
     *the bees located in the sector, and the vertices of this, which are in the ArrayLis mins. With the paramtero sector they identify how 
     *the vertices of the next sub-octree should be redefined, since these vary by sector.
     * @param LinkedList<Bee> abejas: bees of the corresponding sector
     * @param ArrayList<Double> mins: they are the minimum values of coordinates, to which other parameters will be added to redefine the 
     *vertex of the next Octree. Take it as if it were one of the vertex of the octree.
     * @param int sector: sector in which it is located.
     */
    public void nuevoOctree(LinkedList<Bee> abejas,ArrayList<Double> mins,int sector) {
       
    }

    /**
     * This sector is in charge of printing all the coordinates of the bees of the sector, if it prints them is because
     * all these Bees are in risk of colliding.
     * @param LinkedList<Bee> abejas: bees of the sector
     */
    public void choque(LinkedList<Bee> abejas) {
        //System.out.println("Las abejas en las siguientes coordenadas estan en peligro de chocarse");
        for (Bee abeja:abejas) {
            System.out.println(abejas.poll().getLatitude()+","+abejas.poll().getLongitude()+","+abejas.poll().getAltitude());
        }
    }

}
