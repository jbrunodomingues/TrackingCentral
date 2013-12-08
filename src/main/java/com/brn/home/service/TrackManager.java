package com.brn.home.service;

import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;

/**
 * Created by IntelliJ IDEA.
 * User: bruno
 * Date: 12/5/13
 * Time: 10:46 PM
 */
public interface TrackManager {
    void addPoint(PointGPS pointGPS);

    void addTrack(Track track);
}
