package com.brn.home.service;

import com.brn.home.dao.TrackDAO;
import com.brn.home.dao.TrackDAOImpl;
import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void addTrack(Track track) {
        trackDAO.addTrack(track);
    }
}
