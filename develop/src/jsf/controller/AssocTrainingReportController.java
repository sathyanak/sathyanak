package jsf.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.valueobjects.OfficeTrainingConfigs;

@ManagedBean(name = "trainingProgramReport")
@ViewScoped
public class AssocTrainingReportController implements Serializable {

	private static final long serialVersionUID = 8233457869387529125L;

	List<OfficeTrainingConfigs> workarea;
	List<OfficeTrainingConfigs> position;
	List<OfficeTrainingConfigs> followupEvents;
	List<OfficeTrainingConfigs> event;
	List<OfficeTrainingConfigs> outcome;

	Long workAreaId;
	Long positionId;
	Long followupId;
	Long shiftId;
	Long outcomeId;
	Long eventId;
	String followupCompleteId;
	Long followupEventId;
	String sortBy;
	Date eventFrom;
	Date eventTo;
	Date followupFrom;
	Date followupTo;

	@PostConstruct
	public void init() {

		// Load all the DropDowns;
	}
	
	

	
	public void onExport() {


		//Validate the data
		if (eventTo.before(eventFrom))
		{
			//Add Error
		}
		
		if (followupFrom.before(followupTo))
		{
			//Add Error
		}
		
		//Call the Get User Report 
	}
	

	public Long getFollowupEventId() {
		return followupEventId;
	}

	public void setFollowupEventId(Long followupEventId) {
		this.followupEventId = followupEventId;
	}

	public String getFollowupCompleteId() {
		return followupCompleteId;
	}

	public void setFollowupCompleteId(String followupCompleteId) {
		this.followupCompleteId = followupCompleteId;
	}

	public List<OfficeTrainingConfigs> getWorkarea() {
		return workarea;
	}

	public void setWorkarea(List<OfficeTrainingConfigs> workarea) {
		this.workarea = workarea;
	}

	public List<OfficeTrainingConfigs> getPosition() {
		return position;
	}

	public void setPosition(List<OfficeTrainingConfigs> position) {
		this.position = position;
	}

	public List<OfficeTrainingConfigs> getFollowupEvents() {
		return followupEvents;
	}

	public void setFollowupEvents(List<OfficeTrainingConfigs> followupEvents) {
		this.followupEvents = followupEvents;
	}

	public List<OfficeTrainingConfigs> getEvent() {
		return event;
	}

	public void setEvent(List<OfficeTrainingConfigs> event) {
		this.event = event;
	}

	public List<OfficeTrainingConfigs> getOutcome() {
		return outcome;
	}

	public void setOutcome(List<OfficeTrainingConfigs> outcome) {
		this.outcome = outcome;
	}

	public Long getWorkAreaId() {
		return workAreaId;
	}

	public void setWorkAreaId(Long workAreaId) {
		this.workAreaId = workAreaId;
	}

	public Long getPositionId() {
		return positionId;
	}

	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}

	public Long getFollowupId() {
		return followupId;
	}

	public void setFollowupId(Long followupId) {
		this.followupId = followupId;
	}

	public Long getShiftId() {
		return shiftId;
	}

	public void setShiftId(Long shiftId) {
		this.shiftId = shiftId;
	}

	public Long getOutcomeId() {
		return outcomeId;
	}

	public void setOutcomeId(Long outcomeId) {
		this.outcomeId = outcomeId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public Date getEventFrom() {
		return eventFrom;
	}

	public void setEventFrom(Date eventFrom) {
		this.eventFrom = eventFrom;
	}

	public Date getEventTo() {
		return eventTo;
	}

	public void setEventTo(Date eventTo) {
		this.eventTo = eventTo;
	}

	public Date getFollowupFrom() {
		return followupFrom;
	}

	public void setFollowupFrom(Date followupFrom) {
		this.followupFrom = followupFrom;
	}

	public Date getFollowupTo() {
		return followupTo;
	}

	public void setFollowupTo(Date followupTo) {
		this.followupTo = followupTo;
	}

}
