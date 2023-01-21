package Mapping.example.MappingOneToOne;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Mapping.example.MappingOneToOneEntity.Gender;
import Mapping.example.MappingOneToOneEntity.User;
import Mapping.example.MappingOneToOneEntity.UserProfile;
import Mapping.example.MappingOneToOneRepository.UserProfileRepository;
import Mapping.example.MappingOneToOneRepository.UserRepository;

@SpringBootApplication
public class MappingOneToOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MappingOneToOneApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//user Object
		User user = new User();
		user.setId(2);
		user.setName("Suvarna");
		user.setName("suva.malashe@gmail.com");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Pune");
		userProfile.setBirthOfDate(LocalDate.of(1998,03,24));
		userProfile.setGender(Gender.FEMALE);
		userProfile.setPhoneNumber("1122446677");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
		Optional<User> u = userRepository.findById(2);
		System.out.println(u);
		
		
	}

}
