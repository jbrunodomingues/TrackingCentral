package com.brn.home.service;

import com.brn.home.dao.TrackDAO;
import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: bruno
 * Date: 12/5/13
 * Time: 10:46 PM
 */
@Service
public class TrackManagerImpl implements TrackManager {

    @Autowired
    private TrackDAO trackDAO;

    @Override
    @Transactional
    public void addPoint(PointGPS pointGPS) {
        trackDAO.addPoint(pointGPS);
    }

    @Override
    @Transactional
    public void createTrack(Track track) {
        trackDAO.createTrack(track);
    }

    @Override
    public Track readTrack() {
        Track track = trackDAO.readTrack();
        return track;
    }

    @Override
    public List<Track> readAll() {
        return trackDAO.readAll();
    }
}
