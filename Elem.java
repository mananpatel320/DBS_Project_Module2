//This class depicts each element in the bucket
public class Elem {
    
    private int value = 0;
    private boolean isFull = false;
    
    public Elem(){}
    
    //Function to set the value of element
    public void setValue(int val)
        {
            value = val;
        }

    //Function to get the value of element
    public int getValue()
        {
            return value;
        }
    
    //Function to set whether element has any value or not
    public void setIsFull(boolean val)
        {
            isFull = val;
        }

    //Function to get whether element has any value or not
    public boolean getIsFull()
        {
            return isFull;
        }
}
