/*
*	Angel Basegoda 13256
*	Sergio Cancinos 13062
*	Collection.java 
* 	Bibliograf�a: http://dept.cs.williams.edu/~bailey/JavaStructures/Software.html
*/

// An interface for the basic store operations.
// (c) 1998 McGraw-Hill

//package structure;
package Lab9;
public interface Collection extends Store
{
    public boolean contains(Object value);
    // pre: value is non-null
    // post: returns true iff the collection contains the value
    
    public void add(Object value);
    // pre: value is non-null
    // post: the value is added to the collection
    //       the replacement policy is not specified.

    public Object remove(Object value);
    // pre: value is non-null
    // post: removes an object "equal" to value within collection.

    public Iterator elements();
    // post: returns an iterator for traversing collection
}
