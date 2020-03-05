package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboardPojo {

@SerializedName("profile_image")
@Expose
private String profileImage;
@SerializedName("name")
@Expose
private String name;
@SerializedName("id")
@Expose
private String id;
@SerializedName("email")
@Expose
private String email;

public DashboardPojo() {
	super();
	// TODO Auto-generated constructor stub
}

public DashboardPojo(String profileImage, String name, String id, String email) {
	super();
	this.profileImage = profileImage;
	this.name = name;
	this.id = id;
	this.email = email;
}

public String getProfileImage() {
return profileImage;
}

public void setProfileImage(String profileImage) {
this.profileImage = profileImage;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}
}