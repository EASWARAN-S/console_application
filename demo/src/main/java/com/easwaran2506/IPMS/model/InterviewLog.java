package com.easwaran2506.IPMS.model;

public class InterviewLog {
    private int interviewlogid;
    private int interviewid;
    private int candidateid;
    private String candidatetimings;

    public int getInterviewlogid() {
        return this.interviewlogid;
    }

    public void setInterviewlogid(int interviewlogid) {
        this.interviewlogid = interviewlogid;
    }

    public int getInterviewid() {
        return this.interviewid;
    }

    public void setInterviewid(int interviewid) {
        this.interviewid = interviewid;
    }

    public int getCandidateid() {
        return this.candidateid;
    }

    public void setCandidateid(int candidateid) {
        this.candidateid = candidateid;
    }

    public String getCandidatetimings() {
        return this.candidatetimings;
    }

    public void setCandidatetimings(String candidatetimings) {
        this.candidatetimings = candidatetimings;
    }

    public String getCurrentstatus() {
        return this.currentstatus;
    }

    public void setCurrentstatus(String currentstatus) {
        this.currentstatus = currentstatus;
    }

    private String currentstatus;

}
