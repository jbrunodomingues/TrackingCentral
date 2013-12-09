package com.brn.home.service;

import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: bruno
 * Date: 12/5/13
 * Time: 10:46 PM
 */
public interface TrackManager {
    void addPoint(PointGPS pointGPS);

    void createTrack(Track track);

    Track readTrack();

    List<Track> readAll();
}
