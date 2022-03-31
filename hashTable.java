import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class hashTable<T extends Hashable<T>> {

    private ArrayList<LinkedList<T>> table;
    private Integer numElements = 0;
    private Double loadLimit = 0.7;
    private final Integer defaultTableSize = 256;

    private Integer maxSlotLength = 3;   //Added this bc the variable isn't in the provided interface for the display method.  Need to find the largest amount of items in a slot

    /**
     * 
     */
    public hashTable(int size, double ldLimit)
    {
        //test
    }

    /**
     * 
     */
    public boolean insert(T elem)
    {

    }


    public T find (T elem)
    {

    }

    public T remove(T elem)
    {

    }

    public void display(FileWriter fw) throws IOException 
    {
        fw.write("Number of elements: " + numElements + "\n");
        fw.write("Number of slots: " + table.size() + "\n");
        fw.write("Maximum elements in a slot: " + maxSlotLength + "\n");
        fw.write("Load limit: " + loadLimit + "\n");
        fw.write("\n");


    }

    
}