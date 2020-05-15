//This class depicts the key table
public class Table{

	private int globalDepth;
	//A table contains array if bucket objects
	private Bucket[] bucks;
	//Length of the table
	private int size;
	//Hash function
	private int hashValue;

	public Table(){
		globalDepth = 2;
		size = (int)(Math.pow(2, (int)globalDepth));
		bucks = new Bucket[size];
		hashValue = 4;
	}

	public Table(int globalDepth, int hashValue){
		this.globalDepth = globalDepth;
		this.hashValue = hashValue;
		size = (int)(Math.pow(2, (int)globalDepth));
		bucks = new Bucket[size];
	}

	//Function which takes in value and returns the hashed one
	public int hashMe(int k){
		return (k%hashValue);
	}

	//Function to add element to the table
	public void addElement(int value){
		int position = hashMe(value);
		//If that element of the table is null then add a new bucket to the table
		if(bucks[position] == null)
			addNewBucket(position);
		if(!bucks[position].isFull())
			bucks[position].addElementToBucket(value,true);
		else
			splitBucket(position);
	}

	//Function to add bucket to the table 
	public void addNewBucket(int position){
		Bucket b = new Bucket();
		System.out.println("New Bucket Added");
		int i = 0;
		if(position%2 != 0)
			i = 1;
		while(i < size){
			bucks[i] = b;
			i += 2;
		}
	}

	//Function to split a given bucket into two
	public void splitBucket(int position){	
	}

	//Function to show all elements of the table
	public void showTable(){
		int i = 0;
		while(i < size){
			if(bucks[i] != null){
				System.out.print(i + " : ");
				bucks[i].showBucket();
				System.out.println();
			}
			i++;
		}
	}

}