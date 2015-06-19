package demo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author edwardsbean
 * @date 15-6-19
 */
public interface UserRepository extends MongoRepository<User, String> {
}
