package com.brn.home.controller;

import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;
import com.brn.home.service.TrackManager;
import org.dozer.DozerBeanMapper;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bruno
 * Date: 9/15/13
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("track")
public class TrackController {

    @Autowired
    private TrackManager trackManager;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    @ResponseBody
    @Transactional
    public List<Track> readAll() {
        List<Track> trackList = trackManager.readAll();
        return trackList;
    }

    @RequestMapping(value = "track/batatas", method = RequestMethod.GET)
    @ResponseBody
    public void createTrack() {
        List<PointGPS> pointGPSList = new ArrayList<PointGPS>(5);
        pointGPSList.add(new PointGPS(2345, 3245));
        pointGPSList.add(new PointGPS(4242, 3245));
        pointGPSList.add(new PointGPS(5434, 3245));
        pointGPSList.add(new PointGPS(5423, 3245));
        pointGPSList.add(new PointGPS(9854, 3245));
        Track track = new Track();
        track.setPointGPSList(pointGPSList);
        trackManager.createTrack(track);
    }

    public void setTrackManager(TrackManager trackManager) {
        this.trackManager = trackManager;
    }
}
