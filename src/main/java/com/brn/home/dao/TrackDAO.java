package com.brn.home.dao;

import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;

/**
 * Created by IntelliJ IDEA.
 * User: bruno
 * Date: 12/5/13
 * Time: 10:53 PM
 */
public interface TrackDAO {
    void addPoint(PointGPS pointGPS);

    void addTrack(Track track);
}
