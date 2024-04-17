package com.openclassrooms.tourguide.dto;

import java.util.ArrayList;
import java.util.List;

import com.openclassrooms.tourguide.service.TourGuideService;
import com.openclassrooms.tourguide.user.User;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

	//  To be Returned as a JSON object that contains:
// Name of Tourist attraction, 
// Tourist attractions lat/long, 
// The user's location lat/long, 
// The distance in miles between the user's location and each of the attractions.
// The reward points for visiting each Attraction.
public class AttractionsNearUser {
	
	private String user;
	private double latitude;
	private double longitude;
	private List<AttractionDto> attractions;

	public AttractionsNearUser(User user, VisitedLocation visitedLocation, 
			List<Attraction> attractions, TourGuideService tourGuideService) {
		this.setUser(user.getUserName());
		this.setLatitude(visitedLocation.location.latitude);
		this.setLongitude(visitedLocation.location.longitude);
		this.setAttractions(new ArrayList<>());
		attractions.forEach(a -> this.getAttractions().add(new AttractionDto(a, 
				tourGuideService.getDistance(a, visitedLocation.location), 
				tourGuideService.getRewardPoints(a, user))));
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public List<AttractionDto> getAttractions() {
		return attractions;
	}

	public void setAttractions(List<AttractionDto> attractions) {
		this.attractions = attractions;
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
