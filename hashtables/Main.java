package HashTables;

public class Main {
    public static void main(String args[]){
    HashTables myHashTable = new HashTables();

        myHashTable.printTable();
        System.out.println( myHashTable.hash("paint") );
        System.out.println( myHashTable.hash("bolts") );
        System.out.println( myHashTable.hash("nails") );
        System.out.println( myHashTable.hash("stuff") );
        System.out.println( myHashTable.hash("lumber") );
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);
        myHashTable.printTable();
        System.out.println("\nBolts:");
        System.out.println( myHashTable.get("bolts") );
        System.out.println( myHashTable.keys() );

    }}
