package singletonClass;

public class Database {
    private static Database database;

    private Database(){}

    public static synchronized Database getDatabase(){
        if(database == null)
            database = new Database();
        return database;
    }

    public void dbConnection(){
        System.out.println("You are now connected to the database.");
    }

    public static void main(String[] args) {
        Database db;
        db = Database.getDatabase();
        db.dbConnection();
    }
}
