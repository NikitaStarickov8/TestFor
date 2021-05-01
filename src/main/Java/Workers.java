import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static java.util.Arrays.asList;

public class Workers {
    public static void main(String[] args) throws IllegalStateException{
        //метод для создания нового юзера
        NewUser user = new NewUser("Tolya","tolya@mail.ru","teacher",
                "Java","Middle","R","Junior");
        user.createNewProgrammer();

        //метод для поиска людей с навыком Java
        Search.printUserWithSkillJava();

        ////метод, вызывающий всех с Java Middle
        SearchMiddle.printUsersWithMiddleJava();

        //метод, обновляющий данные по скиллам
        //имейл и скилл для идентификации, левел для замены.
        Update update = new Update("tolya@mail.ru", "Trainee","C#");
        update.setNewSkill();



    }

}
