package com.Airbub_clone.Airbub_Clone.Repository;

import com.Airbub_clone.Airbub_Clone.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
