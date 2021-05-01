import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Constants {
    public final static String dbConnectionString = "mongodb://127.0.0.1:27017/";
    public final static String dbName = "mylib";
    public final static MongoClient client = new MongoClient(new MongoClientURI(dbConnectionString));
    public final static MongoDatabase database = client.getDatabase(dbName); ;
    public final static MongoCollection<Document> COLLECTION = database.getCollection("workers");
}
