package com.brn.home.service;

import com.brn.home.dao.TrackDAO;
import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
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
    public void create(Track track) {
        trackDAO.createTrack(track);
    }

    @Override
    public List<Track> readAll() {
        List<Track> trackList = trackDAO.readAll();
        return trackList;
    }

    @Override
    public Track read(int id) {
        return trackDAO.readTrack(id);
    }
}
