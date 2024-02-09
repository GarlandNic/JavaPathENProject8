package com.openclassrooms.tourguide.dto;

import gpsUtil.location.Attraction;

public class AttractionDto {
	
	private String name;
	private double latitude;
	private double longitude;
	private double distance;
	private int rewardsPoints;
	
	public AttractionDto(Attraction attraction, double distance, int rewardsPoints) {
		this.setName(attraction.attractionName);
		this.setLatitude(attraction.latitude);
		this.setLongitude(attraction.longitude);
		this.setDistance(distance);
		this.setRewardsPoints(rewardsPoints);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getRewardsPoints() {
		return rewardsPoints;
	}

	public void setRewardsPoints(int rewardsPoints) {
		this.rewardsPoints = rewardsPoints;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
