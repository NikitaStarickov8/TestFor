import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.*;

public class Search {
    public static void printUserWithSkillJava() {
            BasicDBObject query = new BasicDBObject("experience.Skill", "Java");
            ArrayList<Document> myDoc = Constants.COLLECTION.find(query).into(new ArrayList<>());
            if(myDoc != null) {
                for (Document worker : myDoc)
                    System.out.println(worker.toJson());
            }
            else{
                System.out.println("Документ не найден");
            }
        }

    }

