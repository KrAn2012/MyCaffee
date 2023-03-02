package kkub.mycoffee;



import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@Repository
public class UserRepository {
    
    private final EntityManager entityManager;


    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    

    @Transactional
    public void save(UserMyCoffee userMyCoffee) {
        entityManager.persist(userMyCoffee);
        
    }

    @Transactional
    public void refresh(UserMyCoffee userMyCoffee) {
        entityManager.refresh(userMyCoffee);
    }


}
