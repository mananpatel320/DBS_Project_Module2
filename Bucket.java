//This class depicts the bucket structure of hashing scheme
public class Bucket {
    
    private int localDepth;
    //Each bucket has an array of element objects
    public Elem[] elements; 
    //bfr determines the length of the elements array
    public static int bfr;
    //cluster detemines which bucket this bucket belongs to 
    private int cluster;
    
    public Bucket()
        {
            localDepth = 1;
            this.bfr = bfr;
            elements = new Elem[bfr];
            cluster = 0;
            for(int i=0;i<bfr;i++)
                elements[i] = new Elem();
        }

    public Bucket(int localDepth, int bfr){
        this.localDepth = localDepth;
        this.bfr = bfr;
        elements = new Elem[bfr];
        cluster = 0;
        for(int i=0;i<bfr;i++)
                elements[i] = new Elem();
    }

    //Function to check whether the bucket is full or not
    public boolean isFull()
        {
            for(int i=0;i<bfr;i++){
                if(!elements[i].getIsFull())
                    return false;
            }
            return true;           
        }

    //Function to check whether the bucket is empty or not
    public boolean isEmpty()
        {
            for(int i=0;i<bfr;i++){
                if(elements[i].getIsFull())
                    return false;
            }
            return true;
        }

    //Function to add element to bucket
    public void addElementToBucket(int val, boolean f){
        if(this.isFull())
            System.out.println("Full Bucket");
        else{
            for(int i=0;i<bfr;i++){
                if(!elements[i].getIsFull()){
                    elements[i].setValue(val);
                    elements[i].setIsFull(f);
                    System.out.println(val + " added to location " + i + " of bucket.");
                    break;
                }
            }
        }
    }

    //Function to view the elements of bucket
    public void showBucket(){
        if(this.isEmpty())
            System.out.print("Empty Bucket");
        else{
            for(int i=0;i<bfr;i++){
                if(elements[i].getIsFull()){
                    System.out.print(elements[i].getValue() + " ");
                }
            }
        }
    }

    //Function to manually set the local depth of bucket
    public void setLocalDepth(int val)
        {
            localDepth = val;
        }

    //Function to get the local depth of bucket
    public int getLocalDepth(){
        return localDepth;
    }

    //Function to get the bfr of bucket
    public int getBfr(){
        return bfr;
    }

    //Function to set the cluster of bucket
    public void setCluster(int cluster){
        this.cluster = cluster;
    }
    
    //Function to get the cluster of bucket
    public int getCluster(){
        return cluster;
    }
}
