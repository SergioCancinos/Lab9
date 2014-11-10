/*
*	Angel Basegoda 13256
*	Sergio Cancinos 13062
*	Store.java 
* 	Bibliograf�a: http://dept.cs.williams.edu/~bailey/JavaStructures/Software.html
*/
// Interface for classes that store multiple values.
// (c) 1998 McGraw-Hill

//package structure;
package Lab9;
public interface Store
{
    public int size();
    // post: returns the number elements contained in the store.

    public boolean isEmpty();
    // post: returns true iff store is empty

    public void clear();
    // post: clears the store
}
