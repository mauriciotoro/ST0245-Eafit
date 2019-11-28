/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios;

/**
 *
 * @author isabellaqv
 */
import java.util.ArrayList;
public class Laboratory4 {
    public static NodeDirectory root;
    
    public Laboratory4(NodeDirectory r){
        Laboratory4.root = r;
    }
    
    public void addFile(NodeDirectory d, NodeDirectory n){
        ...
    }
    private void addFileAux(NodeDirectory n, NodeDirectory toAdd){
       ...
    }
    
    public void search(String name){
       ...
    }
    public NodeDirectory searchAux(NodeDirectory n, String name){
       ...
    }
    
    public ArrayList<String> searchByAuthor(NodeDirectory n, String a){
        ...
    }
    
    public ArrayList<String> searchBySize(NodeDirectory n, double s){
        ...
    }
    
    public void printFiles(NodeDirectory a){
        ...
    }
}
