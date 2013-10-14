package com.brn.home.entity;

/**
 * Created with IntelliJ IDEA.
 * User: bruno
 * Date: 9/12/13
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class PointGPS {

    private double latitude;
    private double longitude;

    public PointGPS() {
    }

    public PointGPS(double latitude, double longitude) {

        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PointGPS pointGPS = (PointGPS) o;

        if (Double.compare(pointGPS.latitude, latitude) != 0) return false;
        if (Double.compare(pointGPS.longitude, longitude) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
