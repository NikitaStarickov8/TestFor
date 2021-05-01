import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.*;

public class SearchMiddle {
    public static void printUsersWithMiddleJava(){
        for(int i = 0; i < 100; i++) {
            ArrayList<Document> myDoc = Constants.COLLECTION.find(and(eq("experience."+ i + ".Skill", "Java"),
                    eq("experience."+ i +".Level", "Middle"))).into(new ArrayList<>());
            if (myDoc != null) {
                for (Document worker : myDoc)
                    System.out.println(worker.toJson());
            } else {
                System.out.println("Документ не найден");
            }
        }

    }
}
