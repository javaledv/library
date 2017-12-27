package ml.ledv.library.db.nosql.repository;

import ml.ledv.library.db.nosql.document.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDocument, String> {

    void deleteById(String id);

}
