
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import org.bson.Document;


import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

public class Update {
    private String email;
    private String skill;
    private String level;

    public Update(String email, String level, String skill) {
        this.email = email;
        this.skill = skill;
        this.level = level;
    }

    public void setNewSkill() {

                for (int i = 0; i <= 100; i++) {
                    if (i<100) {
                    Constants.COLLECTION.updateOne(and(eq("email", this.email),
                            (eq("experience." + i + ".Skill", this.skill))), set("experience." + i + ".Level", this.level));
                }
                    else {
                        System.out.println("Не верный скилл");}

                }
            }
}

