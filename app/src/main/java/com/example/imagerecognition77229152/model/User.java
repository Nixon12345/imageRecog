package com.example.imagerecognition77229152.model;

public class User {
    String profilePicture,uId, firstName, LastNam, email, phoneNum, password,lastMessage;




    public User(String profilePicture, String uId, String firstName, String lastNam, String email, String phoneNum, String password, String lastMessage) {
        this.profilePicture = profilePicture;
        this.uId = uId;
        this.firstName = firstName;
        this.LastNam = lastNam;
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;
        this.lastMessage = lastMessage;
    }


    //Registering new user
    public User(){};

    public User(String firstName,String lastNam, String email, String phoneNum,String password) {

        this.firstName = firstName;
        LastNam = lastNam;
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;


    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNam() {
        return LastNam;
    }

    public void setLastNam(String lastNam) {
        LastNam = lastNam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

