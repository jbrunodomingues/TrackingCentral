package com.brn.home.dao;

import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: bruno
 * Date: 12/5/13
 * Time: 10:52 PM
 */
@Repository
public class TrackDAOImpl implements TrackDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void addPoint(PointGPS pointGPS) {
        this.sessionFactory.getCurrentSession().save(pointGPS);
    }

    @Override
    public void createTrack(Track track) {
        this.sessionFactory.getCurrentSession().save(track);
    }

    @Override
    public Track readTrack() {
        return null;
    }

    @Override
    public List<Track> readAll() {
        List<Track> trackList = this.sessionFactory.getCurrentSession().createCriteria(Track.class).list();
        return trackList;
    }
}
