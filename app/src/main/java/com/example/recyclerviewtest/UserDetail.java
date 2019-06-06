package com.example.recyclerviewtest;

import android.os.Parcel;
import android.os.Parcelable;

//
//
//
public class UserDetail implements Parcelable {
    public String userName;
    public String name;
    public String pwd;
    public String dob;

    protected UserDetail(Parcel in) {
        userName = in.readString();
        name = in.readString();
        pwd = in.readString();
        dob = in.readString();
        country = in.readString();
        genre = in.readString();
        zipCode = in.readString();
    }

    public UserDetail() {
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userName);
        dest.writeString(name);
        dest.writeString(pwd);
        dest.writeString(dob);
        dest.writeString(country);
        dest.writeString(genre);
        dest.writeString(zipCode);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<UserDetail> CREATOR = new Creator<UserDetail>() {
        @Override
        public UserDetail createFromParcel(Parcel in) {
            return new UserDetail(in);
        }

        @Override
        public UserDetail[] newArray(int size) {
            return new UserDetail[size];
        }
    };

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", dob='" + dob + '\'' +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String country;
    public String genre;
    public String zipCode;
}
