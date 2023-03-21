public class Array {
    String [] names;
    int count;

    //constructor to initialize length of the array
    public Array(int length){
        names = new String[length];
        count = 0;
    }

    public void insertName(String name){
        names[count++] = name;
    }

    public void display(){
       for(int i = 0;i < count;i++){
           System.out.println(names[i]);
       }
    }



}
