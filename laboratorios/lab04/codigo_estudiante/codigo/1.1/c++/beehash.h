#pragma once

/*class Bee - representation of the data to be analysed
 */
class Bee {
public:
  /*Bee - construct a new Bee object
   *Parameters - x, y, and z coordinates of the bee
   *Example - Bee(-74.3445, 4.2353, 1707.44);
   */
  Bee(double bx, double by, double bz);
  /*Bee - construcs a new Bee object
   *Parameters - Reference to another bee object
   */
  Bee(const Bee& b);
  /*Instance variables
   *x - x coordinate of the bee in meters from the greenwich meridian stored as a double
   *y - y coordinate of the bee in meters from the equatorial line stored as a double
   *z - z coordinate of the bee in meters above see level stored as a double
   *previous - link to previous bee in 
   *following - link to following bee in
   */
  double x;
  double y;
  double z;
  Bee* previous = nullptr;
  Bee* following = nullptr;
};

/*class BeeList - auxiliar linked list for storing bees in risk of collision
 */
class BeeList {
public:
  /*add_bee - adds a bee to the begenning of the bee list.
   *Parameters - Bee b to be added
   */
  void add_bee(Bee* b);
  /*add_bee - adds the first bee to the list.        
   *Parameters - Bee b to be added                                                                                
   */
  void add_first_bee(Bee* b);
  /*concatenate_beelist_end - adds a new bee to the end of the bee list
   */
  void concatenate_beelist_end(BeeList* bl);
  /*Instace variabels
   *first - head of the bee linked list stored as a pointer to a type Bee 
   *last - tail of the bee linked list stored as a pointer to a type Bee
   */
  Bee* first = nullptr;
  Bee* last = nullptr;
  int size = 0;
};

/*class Cube - Reperesentation of the spatial hash building blocks
 */
class Cube {
public:
  /*Cube - construct a new Cube object
   *Parameters - x, y, and z space distributions of space Cube takes up
   *Example - Cube(23, 56, 134);
   */
  Cube(int x, int y, int z);
  /*x, y, z - x, y, and z space of cube in meters stored as an ints
   */
  int x;
  int y;
  int z;
};

/*find_cube_key - generates a key for the spatial hash by using the x, y, and z coordinates provided by the .txt divides each coordinate 
 *by 57.735... in order to achieve cubes with diagonals of 100 meters rounds each divided coordinate to an int, which is then parsed to a 
 *string. These strings containing each coordinate are then concatenated by assignation operations into a single key
 *Parameters - x, y, and z coordinates of a Bee instance stored as doubles
*/
std::string find_cube_key(double x, double y, double x);

/*parse_file - using an ifstream from the c++ standar library this method reads a given file line by line. While there are still lines to
 *be read, the data from each line of the file is split and stored in a previously declared vector. A new bee is created using the extracted 
 *coordinates. The coordinates assigned to the generated bee are used to generate a key in order to store said bee in the unordered map. Then
 *it will check if the unordered map is free in said key. If this is the case it inserts the new bee together with a false boolean value onto
 *the unordered map and the key is stored int the last position of the parameter vector. Otherwise it will set a boolean flag to true and 
 *insert the bee into the hash.
 *Parameters - file name, a vector of strings that will contain the keys and the unordered map that represents the beeHash.
 */
void parse_file(std::string input_file, std::vector<std::string>& v, boost::unordered_map<std::string, Pair>& um);


/*find_for_uniquie_bee - this function is triggered when a Cube contains only one Bee in order to detect if it is at risk of collision. In
 *order to do this it wil find the 26 adjacent cubes by their keys. Then it will iterate over the cubes obtained and verify the distance 
 *between the bee corresponding to the key passed and the bees in the adjacent cubes. If it detects the any of the distances between keys to
 *be lower than 100 meters, it will consider the current bee at risk of collision.
 */
inline void find_for_unique_bee(std::string unique_bee_key, boost::unordered_map<std::string, Pair>& cubes);
