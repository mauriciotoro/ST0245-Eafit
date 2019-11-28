#include<bits/stdc++.h>
/**
* @file point1
* @version 1.0
* @author Miguel Ángel Correa Manrique && Pablo Buitrago
* @title Point 1
*/

using namespace std;


typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
template <class T> string toStr(const T &x){stringstream s;s<<x;return s.str();}
template <class T> int toInt(const T &x){stringstream s;s<<x;int r;s>>r;return r;}

/**
* A struct to represent a File
*/
struct File{
    /*@{*/
    double w;/**<the weigth of the file */
    string name;/**<the name of the file*/      
    /*@}*/

};

/**
* class Directory
* brief Implementation of a directory 
* 
* details This implementation of directory has different attributes such as which files it contains and other directories as Map Tables, also each directoy
*       has a name and a weigth.
*/
class Directory{

    public:

        map<string, vector<File>> files;
        map<string, Directory> directories;
        string name;
        string owner;
        double w;


/**
* @brief It splits a route into a vector of strings every '/' character
* @param[d] The given route
* @return Vector of strings of the given route
*/
vector<string> splitDirectory(string d){
    
            ...
        }


/**
* @brief It finds the directory given the route
* @param[d] The given route
* @return Directory
*/
        Directory findDirectory(string d){

           ...

        }

        
/**
* @brief Given a directory route it prints out all the directories and files on that directory route
* @param[d] The given route
* @return Void
*/
    void query1(string d){
            
        ...

    }

/**
* @brief Helper method to print out all the files in certein directory that belongs to a given user.
* @param[user] Given user.
* @param[tempD] Given directory.
* @return Void
*/
    void printFilesUser(string user, Directory tempD){

       ...


    }

/**
* @brief Helper method to print out all the directories and files that belongs to a given user, it searchs recursively into every directory found
* @param[user] Given user
* @param[tempD] Given directory
* @return Void
*/ 
    void printDirectoriesUser(string user, Directory tempD){

        ...
    }

/**
* @brief Helper method to print out all the files in certein directory that are greater than a weigth given
* @param[tempD] Given directory
* @param[wg] Given weigth
* @return Void
*/
    void printFilesWeigth(Directory tempD, double wg){

       ...

    }

/**
* @brief Helper method to print out all the directories and files that are greater than a weigth given, it searchs recursively into every directory found
* @param[tempD] Given directory
* @param[wg] Given weigth
* @return Void
*/
    void printDirectoriesWeigth(Directory tempD, double wg){

        ...

    }

/*
* @brief Given a route and a user it prints out all the directories and files that belongs to the respective user.
* @param[d] Given route
* @param[user] Given user
* @return Void
*/
    void query2(string d, string user){

       ...

    }

/*
* @brief Given a route and a weigth it prints out all the directories and files are greater than the weigth given.
* @param[d] Given route
* @param[wg] Given weigth
* @return Void
*/
    void query3(string d, double wg){

       ...

    }

        

};


int main(){

    ...
    
}








