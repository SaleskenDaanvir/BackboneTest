package pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeadPojo {

@SerializedName("profile_image")
@Expose
private String profileImage;
@SerializedName("teams")
@Expose
private String teams;
@SerializedName("last_task_id")
@Expose
private String lastTaskId;
@SerializedName("last_task_type")
@Expose
private String lastTaskType;
@SerializedName("company_name")
@Expose
private String companyName;
@SerializedName("lead_source")
@Expose
private String leadSource;
@SerializedName("name")
@Expose
private String name;
@SerializedName("actor_name")
@Expose
private String actorName;
@SerializedName("phone_number")
@Expose
private String phoneNumber;
@SerializedName("id")
@Expose
private String id;
@SerializedName("last_task_status")
@Expose
private String lastTaskStatus;
@SerializedName("email")
@Expose
private String email;









public LeadPojo() {
	super();
	// TODO Auto-generated constructor stub
}

public LeadPojo(String profileImage, String teams, String lastTaskId, String lastTaskType, String companyName,
		String leadSource, String name, String actorName, String phoneNumber, String id, String lastTaskStatus,
		String email) {
	super();
	this.profileImage = profileImage;
	this.teams = teams;
	this.lastTaskId = lastTaskId;
	this.lastTaskType = lastTaskType;
	this.companyName = companyName;
	this.leadSource = leadSource;
	this.name = name;
	this.actorName = actorName;
	this.phoneNumber = phoneNumber;
	this.id = id;
	this.lastTaskStatus = lastTaskStatus;
	this.email = email;
}

public String getProfileImage() {
return profileImage;
}

public void setProfileImage(String profileImage) {
this.profileImage = profileImage;
}

public String getTeams() {
return teams;
}

public void setTeams(String teams) {
this.teams = teams;
}

public String getLastTaskId() {
return lastTaskId;
}

public void setLastTaskId(String lastTaskId) {
this.lastTaskId = lastTaskId;
}

public String getLastTaskType() {
return lastTaskType;
}

public void setLastTaskType(String lastTaskType) {
this.lastTaskType = lastTaskType;
}

public String getCompanyName() {
return companyName;
}

public void setCompanyName(String companyName) {
this.companyName = companyName;
}

public String getLeadSource() {
return leadSource;
}

public void setLeadSource(String leadSource) {
this.leadSource = leadSource;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getActorName() {
return actorName;
}

public void setActorName(String actorName) {
this.actorName = actorName;
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getLastTaskStatus() {
return lastTaskStatus;
}

public void setLastTaskStatus(String lastTaskStatus) {
this.lastTaskStatus = lastTaskStatus;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

}