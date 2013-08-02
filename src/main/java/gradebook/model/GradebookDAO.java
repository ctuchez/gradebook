package gradebook.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This makes a data transfer objects to be changed
 * in the event that an arraylist is no longer wanted
 *
 * @author Christian Tuchez
 */

public class GradebookDAO {

    private ArrayList<Object> gradebookList;

    public GradebookDAO() {
        gradebookList = new ArrayList<Object>();
    }

    public Iterator iterator() {
        return gradebookList.iterator();
    }

    public void add(Object object) {
        gradebookList.add(object);
    }

     public void remove(Object object) {
        gradebookList.remove(object);
    }

     public Object get(int index) {
        return gradebookList.get(index);
    }

     public int size() {
        return gradebookList.size();
    }
}

