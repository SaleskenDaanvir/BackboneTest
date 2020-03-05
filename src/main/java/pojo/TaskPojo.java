package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TaskPojo {

@SerializedName("actor")
@Expose
private String actor;
@SerializedName("profile_image")
@Expose
private String profileImage;
@SerializedName("stage_id")
@Expose
private String stageId;
@SerializedName("stage_name")
@Expose
private String stageName;
@SerializedName("company_name")
@Expose
private String companyName;
@SerializedName("id")
@Expose
private String id;
@SerializedName("task_type")
@Expose
private String taskType;
@SerializedName("client_name")
@Expose
private String clientName;
@SerializedName("lead_id")
@Expose
private String leadId;
@SerializedName("client_id")
@Expose
private String clientId;
@SerializedName("status")
@Expose
private String status;
@SerializedName("start_date")
@Expose
private String startDate;






public TaskPojo(String actor, String profileImage, String stageId, String stageName, String companyName, String id,
		String taskType, String clientName, String leadId, String clientId, String status, String startDate) {
	super();
	this.actor = actor;
	this.profileImage = profileImage;
	this.stageId = stageId;
	this.stageName = stageName;
	this.companyName = companyName;
	this.id = id;
	this.taskType = taskType;
	this.clientName = clientName;
	this.leadId = leadId;
	this.clientId = clientId;
	this.status = status;
	this.startDate = startDate;
}

public TaskPojo() {
	super();
	// TODO Auto-generated constructor stub
}

public String getActor() {
return actor;
}

public void setActor(String actor) {
this.actor = actor;
}

public String getProfileImage() {
return profileImage;
}

public void setProfileImage(String profileImage) {
this.profileImage = profileImage;
}

public String getStageId() {
return stageId;
}

public void setStageId(String stageId) {
this.stageId = stageId;
}

public String getStageName() {
return stageName;
}

public void setStageName(String stageName) {
this.stageName = stageName;
}

public String getCompanyName() {
return companyName;
}

public void setCompanyName(String companyName) {
this.companyName = companyName;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getTaskType() {
return taskType;
}

public void setTaskType(String taskType) {
this.taskType = taskType;
}

public String getClientName() {
return clientName;
}

public void setClientName(String clientName) {
this.clientName = clientName;
}

public String getLeadId() {
return leadId;
}

public void setLeadId(String leadId) {
this.leadId = leadId;
}

public String getClientId() {
return clientId;
}

public void setClientId(String clientId) {
this.clientId = clientId;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getStartDate() {
return startDate;
}

public void setStartDate(String startDate) {
this.startDate = startDate;
}

}