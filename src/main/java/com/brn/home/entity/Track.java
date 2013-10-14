package com.brn.home.entity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bruno
 * Date: 9/12/13
 * Time: 8:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Track {

    private List<PointGPS> pointGPSList;

    public Track() {

    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public void setPointGPSList(List<PointGPS> pointGPSList) {
        this.pointGPSList = pointGPSList;
    }

    public List<PointGPS> getPointGPSList() {
        return pointGPSList;
    }

    public long calculateAcumulatedDistance() {
        long acumulatedDistance = 0;
        if (pointGPSList.size() > 1) {
            for (int i = 1; i < pointGPSList.size(); i++) {
                acumulatedDistance += calculateDistanceBetween2PointsGPS(pointGPSList.get(i - 1), pointGPSList.get(i));
            }
        }
        return acumulatedDistance;
    }

    private long calculateDistanceBetween2PointsGPS(PointGPS pointGPS1, PointGPS pointGPS2) {
        return calculateHaversineDistanceMeters(pointGPS1.getLatitude(), pointGPS1.getLongitude(), pointGPS2.getLatitude(), pointGPS2.getLongitude());
    }

    public long calculateHaversineDistanceMeters(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Radious of the earth
        Double latDistance = toRad(lat2 - lat1);
        Double lonDistance = toRad(lon2 - lon1);
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) +
                Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) *
                        Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        Double distance = R * c;
        return Math.round(distance*Math.pow(10,6));
    }

    private static Double toRad(Double value) {
        return value * Math.PI / 180;
    }
}
