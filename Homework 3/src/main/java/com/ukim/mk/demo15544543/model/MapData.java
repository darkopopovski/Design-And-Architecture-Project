package com.ukim.mk.demo15544543.model;



import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "map_skopje_banks_atms")
@NoArgsConstructor
public class MapData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String plаceUrl;
    public String title ;
    public Float rating;
    public String reviewCount ;
    public String category ;
    public String attributes ;
    @Column(name = "address")
    public String address ;

    @Column(name = "plusCode")
    public String plusCode ;
    public String website ;
    public String phoneNumber ;
    public String sunday ;
    public String monday ;
    public String tuesday ;
    public String wednesday ;
    public String thursday ;
    public String friday ;
    public String saturday ;
    public String currentStatus ;
    @Column(name = "imgurl")
    public String imgUrl ;
    public Boolean isClaimed;
    public Float latitude ;
    public Float longitude ;
    public String query ;
    public Date timestampp ;

    public MapData(Integer id, String plаceUrl, String title, Float rating, String reviewCount, String category, String attributes, String address, String plusCode, String website, String phoneNumber, String sunday, String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String currentStatus, String imgUrl, Boolean isClaimed, Float latitude, Float longitude, String query, Date timestampp) {
        this.id = id;
        this.plаceUrl = plаceUrl;
        this.title = title;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.category = category;
        this.attributes = attributes;
        this.address = address;
        this.plusCode = plusCode;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.sunday = sunday;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.currentStatus = currentStatus;
        this.imgUrl = imgUrl;
        this.isClaimed = isClaimed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.query = query;
        this.timestampp = timestampp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlаceUrl() {
        return plаceUrl;
    }

    public void setPlаceUrl(String plаceUrl) {
        this.plаceUrl = plаceUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(String reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlusCode() {
        return plusCode;
    }

    public void setPlusCode(String plusCode) {
        this.plusCode = plusCode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Boolean getClaimed() {
        return isClaimed;
    }

    public void setClaimed(Boolean claimed) {
        isClaimed = claimed;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Date getTimestampp() {
        return timestampp;
    }

    public void setTimestampp(Date timestampp) {
        this.timestampp = timestampp;
    }
}
