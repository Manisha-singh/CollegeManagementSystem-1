package com.collegemanagementsystem.Repository;

import com.collegemanagementsystem.Entity.NonTeachingStaff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonTeachingStaffRepository extends CrudRepository<NonTeachingStaff, Long> {
}
