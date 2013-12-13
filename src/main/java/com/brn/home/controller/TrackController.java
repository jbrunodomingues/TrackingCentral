package com.brn.home.controller;

import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;
import com.brn.home.service.TrackManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
        return trackManager.readAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    @Transactional
    public Track read(@PathVariable int id) {
        return trackManager.read(id);
    }

    @RequestMapping(value = "batatas", method = RequestMethod.PUT)
    @ResponseBody
    @Transactional
    public void create(@RequestBody Track track) {
//        List<PointGPS> pointGPSList = new ArrayList<PointGPS>(5);
//        pointGPSList.add(new PointGPS(2345, 3245));
//        pointGPSList.add(new PointGPS(4242, 3245));
//        pointGPSList.add(new PointGPS(5434, 3245));
//        pointGPSList.add(new PointGPS(5423, 3245));
//        pointGPSList.add(new PointGPS(9854, 3245));
//        Track track = new Track();
//        track.setPointGPSList(pointGPSList);
        trackManager.create(track);
    }

    @RequestMapping(value = "point", method = RequestMethod.PUT)
    @ResponseBody
    @Transactional
    public void create(@RequestBody PointGPS pointGPS) {
        System.out.println(pointGPS);
    }
}
