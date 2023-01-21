package Mapping.example.MappingOneToOneRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Mapping.example.MappingOneToOneEntity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
