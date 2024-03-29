package com.collegemanagementsystem.Repository;

import com.collegemanagementsystem.Entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {
    @Query("select r from UserRole r where r.userid = :id AND r.role_name= :nm")
    UserRole checkRole(@Param("id") Integer id,@Param("nm") String nm);
    @Query("select r from UserRole r where r.userid = :id ")
    List<UserRole> getRoleById(@Param("id") Integer id);
}
