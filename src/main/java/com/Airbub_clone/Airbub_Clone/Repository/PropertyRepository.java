package com.Airbub_clone.Airbub_Clone.Repository;

import com.Airbub_clone.Airbub_Clone.Entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
