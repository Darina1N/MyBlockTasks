package sk.kosickaakademia.kolesarova.tasks.mongoDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import sk.kosickaakademia.kolesarova.tasks.collection.Tasks;

import java.util.List;

public class MongoDB {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("myBlockTasks");

        public void insertTask (Tasks tasks){
            Document document = new Document();
            document.append("name", tasks.getName());
            document.append("priority", tasks.getPriority());
            document.append("price", tasks.getPrice());
            document.append("done", tasks.isDone());
            document.append("date", tasks.getDate());
            database.getCollection("tasks").insertOne(document);
            System.out.println("Document was insert");
        }

        public void setCompletedTasks ( int id){

        }

        public List<Tasks> getAllTasks () {
            return null;
        }

        public List<Tasks> getAllTasks ( boolean done){
            return null;
        }

        public List<Tasks> getPriorityTasks ( int priority){
            return null;
        }

        public List<Tasks> getAllTasksByName (String name){
            return null;
        }

        public void deleteCompeteTasks () {

        }
    }

