package com.brn.home.dao;

import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: bruno
 * Date: 12/5/13
 * Time: 10:53 PM
 */
public interface TrackDAO {
    void addPoint(PointGPS pointGPS);

    void createTrack(Track track);

    List<Track> readAll();

    Track readTrack(int id);
}
