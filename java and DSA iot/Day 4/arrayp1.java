public class arrayp1{
    public static void main(String [] args){
        String[] name= new String[5];
        name[0]="sachin";
        name[1]="saurav";
        name[2]="virat";
        name[3]="rohit";
        name[4]="dhoni";

        for (int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }
}