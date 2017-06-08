package com.zy1401_402.oaSystem.entity;

import java.io.Serializable;

public class leave_apply implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_apply.leave_number
     *
     * @mbggenerated
     */
    private Integer leaveNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_apply.person_id
     *
     * @mbggenerated
     */
    private String personId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_apply.person_name
     *
     * @mbggenerated
     */
    private String personName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_apply.leave_information
     *
     * @mbggenerated
     */
    private String leaveInformation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_apply.leave_permission
     *
     * @mbggenerated
     */
    private String leavePermission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_apply.commitor_name
     *
     * @mbggenerated
     */
    private String commitorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave_apply.commitor_id
     *
     * @mbggenerated
     */
    private String commitorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table leave_apply
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_apply.leave_number
     *
     * @return the value of leave_apply.leave_number
     *
     * @mbggenerated
     */
    public Integer getLeaveNumber() {
        return leaveNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_apply.leave_number
     *
     * @param leaveNumber the value for leave_apply.leave_number
     *
     * @mbggenerated
     */
    public void setLeaveNumber(Integer leaveNumber) {
        this.leaveNumber = leaveNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_apply.person_id
     *
     * @return the value of leave_apply.person_id
     *
     * @mbggenerated
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_apply.person_id
     *
     * @param personId the value for leave_apply.person_id
     *
     * @mbggenerated
     */
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_apply.person_name
     *
     * @return the value of leave_apply.person_name
     *
     * @mbggenerated
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_apply.person_name
     *
     * @param personName the value for leave_apply.person_name
     *
     * @mbggenerated
     */
    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_apply.leave_information
     *
     * @return the value of leave_apply.leave_information
     *
     * @mbggenerated
     */
    public String getLeaveInformation() {
        return leaveInformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_apply.leave_information
     *
     * @param leaveInformation the value for leave_apply.leave_information
     *
     * @mbggenerated
     */
    public void setLeaveInformation(String leaveInformation) {
        this.leaveInformation = leaveInformation == null ? null : leaveInformation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_apply.leave_permission
     *
     * @return the value of leave_apply.leave_permission
     *
     * @mbggenerated
     */
    public String getLeavePermission() {
        return leavePermission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_apply.leave_permission
     *
     * @param leavePermission the value for leave_apply.leave_permission
     *
     * @mbggenerated
     */
    public void setLeavePermission(String leavePermission) {
        this.leavePermission = leavePermission == null ? null : leavePermission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_apply.commitor_name
     *
     * @return the value of leave_apply.commitor_name
     *
     * @mbggenerated
     */
    public String getCommitorName() {
        return commitorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_apply.commitor_name
     *
     * @param commitorName the value for leave_apply.commitor_name
     *
     * @mbggenerated
     */
    public void setCommitorName(String commitorName) {
        this.commitorName = commitorName == null ? null : commitorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave_apply.commitor_id
     *
     * @return the value of leave_apply.commitor_id
     *
     * @mbggenerated
     */
    public String getCommitorId() {
        return commitorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave_apply.commitor_id
     *
     * @param commitorId the value for leave_apply.commitor_id
     *
     * @mbggenerated
     */
    public void setCommitorId(String commitorId) {
        this.commitorId = commitorId == null ? null : commitorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_apply
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        leave_apply other = (leave_apply) that;
        return (this.getLeaveNumber() == null ? other.getLeaveNumber() == null : this.getLeaveNumber().equals(other.getLeaveNumber()))
            && (this.getPersonId() == null ? other.getPersonId() == null : this.getPersonId().equals(other.getPersonId()))
            && (this.getPersonName() == null ? other.getPersonName() == null : this.getPersonName().equals(other.getPersonName()))
            && (this.getLeaveInformation() == null ? other.getLeaveInformation() == null : this.getLeaveInformation().equals(other.getLeaveInformation()))
            && (this.getLeavePermission() == null ? other.getLeavePermission() == null : this.getLeavePermission().equals(other.getLeavePermission()))
            && (this.getCommitorName() == null ? other.getCommitorName() == null : this.getCommitorName().equals(other.getCommitorName()))
            && (this.getCommitorId() == null ? other.getCommitorId() == null : this.getCommitorId().equals(other.getCommitorId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_apply
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLeaveNumber() == null) ? 0 : getLeaveNumber().hashCode());
        result = prime * result + ((getPersonId() == null) ? 0 : getPersonId().hashCode());
        result = prime * result + ((getPersonName() == null) ? 0 : getPersonName().hashCode());
        result = prime * result + ((getLeaveInformation() == null) ? 0 : getLeaveInformation().hashCode());
        result = prime * result + ((getLeavePermission() == null) ? 0 : getLeavePermission().hashCode());
        result = prime * result + ((getCommitorName() == null) ? 0 : getCommitorName().hashCode());
        result = prime * result + ((getCommitorId() == null) ? 0 : getCommitorId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leave_apply
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", leaveNumber=").append(leaveNumber);
        sb.append(", personId=").append(personId);
        sb.append(", personName=").append(personName);
        sb.append(", leaveInformation=").append(leaveInformation);
        sb.append(", leavePermission=").append(leavePermission);
        sb.append(", commitorName=").append(commitorName);
        sb.append(", commitorId=").append(commitorId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}