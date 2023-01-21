package Mapping.example.MappingOneToOneRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Mapping.example.MappingOneToOneEntity.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long>{
	

}
