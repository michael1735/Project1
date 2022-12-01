package NestedClassesDemo;

// Inner Class Example
public class DataStructure {
    // create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure(){
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++){
            arrayOfInts[i] = i;
        }
    }

    public void printEven(){

        // Print out values of even indices in the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer>{}

    // Inner class implements the DataStructureIterator interface
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator{

        // start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext(){
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next(){
            // record a value of the even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        // Fill the array with integer values and print out only values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
// use inner classes as helper classes
/*
Two additional types of inner classes:
1. local classes: within the body of a method
2. anonymous classes: an inner classes within the body of a method without name
 */
