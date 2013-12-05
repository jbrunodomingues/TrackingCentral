package com.brn.home.dao;

import com.brn.home.entity.PointGPS;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
