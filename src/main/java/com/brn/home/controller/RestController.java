package com.brn.home.controller;

import com.brn.home.entity.EmployeeEntity;
import com.brn.home.entity.PointGPS;
import com.brn.home.entity.Track;
import com.brn.home.service.EmployeeManager;
import com.brn.home.service.TrackManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("api")
public class RestController {

    @Autowired
    private EmployeeManager employeeManager;

    @Autowired
    private TrackManager trackManager;

    @RequestMapping("employee/{id}")
    @ResponseBody
    public List<EmployeeEntity> getEmployeById(@PathVariable Long id) {
        return employeeManager.getAllEmployees();
    }

    @RequestMapping("track/batatas")
    @ResponseBody
    public void addPoint() {
        List<PointGPS> pointGPSList = new ArrayList<PointGPS>(5);
        pointGPSList.add(new PointGPS(2345, 3245));
        pointGPSList.add(new PointGPS(4242, 3245));
        pointGPSList.add(new PointGPS(5434, 3245));
        pointGPSList.add(new PointGPS(5423, 3245));
        pointGPSList.add(new PointGPS(9854, 3245));
        Track track = new Track();
        track.setPointGPSList(pointGPSList);
        trackManager.addTrack(track);
    }

    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    public void setTrackManager(TrackManager trackManager) {
        this.trackManager = trackManager;
    }
}
