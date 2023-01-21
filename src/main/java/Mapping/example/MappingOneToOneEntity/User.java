package Mapping.example.MappingOneToOneEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USers")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="up_id")
	private UserProfile UserProfile;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public UserProfile getUserProfile() {
		return UserProfile;
	}


	public void setUserProfile(UserProfile userProfile) {
		this.UserProfile = userProfile;
	}


	public User(int id, String name, String email, UserProfile userProfile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		UserProfile = userProfile;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
