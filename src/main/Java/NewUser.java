import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static java.util.Arrays.asList;

public class NewUser {
    private String name;
    private String email;
    private String job;
    private String skill;
    private String level;
    private String secondSkill;
    private String secondLevel;

    public void createNewProgrammer(){
        //создаем новых юзеров
        Document nUser = new Document("name ", this.name);
        nUser.append("email", this.email)
                .append("job", this.job)
                .append("experience", asList(new Document("Skill", this.skill).append("Level", this.level),
                        new Document("Skill",this.secondSkill).append("Level",this.secondLevel)));

        Constants.COLLECTION.insertOne(nUser);
    }


    public NewUser(String name, String email, String job, String skill, String level, String secondSkill, String secondLevel) {
        this.name = name;
        this.email = email;
        this.job = job;
        this.skill = skill;
        this.level = level;
        this.secondSkill = secondSkill;
        this.secondLevel = secondLevel;

    }

}
