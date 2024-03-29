package com.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaystoreController {

    @Autowired
    private IPlaystoreService playstoreService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Playstore> listplaystore() {

        return playstoreService.findAll();
    }

    @RequestMapping(value = "/all/{id}", method = RequestMethod.GET)
    public List<Playstore> listplay(@PathVariable String id) {

        return playstoreService.findAll(id);
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<Playstore> category() {

        return playstoreService.findByCategory();
    }

    @RequestMapping(value = "/category/{name}", method = RequestMethod.GET)
    public List<Playstore> categoryall(@PathVariable String name) {

        return playstoreService.findAll(name);
    }

    @RequestMapping(value = "/all/paid", method = RequestMethod.GET)
    public List<Playstore> allPaid() {

        return playstoreService.findAllPaid();
    }

    @RequestMapping(value = "/all/free", method = RequestMethod.GET)
    public List<Playstore> allFree() {

        return playstoreService.findAllFree();
    }

    @RequestMapping(value = "/top10/free", method = RequestMethod.GET)
    public List<Playstore> installfree() {

        return playstoreService.findByInstallsFree();
    }

    @RequestMapping(value = "/top10/paid", method = RequestMethod.GET)
    public List<Playstore> installpaid() {

        return playstoreService.findByInstallsPaid();
    }

    @RequestMapping(value = "/reviews/top10", method = RequestMethod.GET)
    public List<Playstore> topreviews() {

        return playstoreService.find10Reviews();
    }

    @RequestMapping(value = "/app/{name}", method = RequestMethod.GET)
    public ArrayList<Playstore> app(@PathVariable String name) {

        return playstoreService.findByAppname(name);
    }

    @RequestMapping(value = "/app/reviews/{name}", method = RequestMethod.GET)
    public ArrayList<Reviews> reviews(@PathVariable String name) {

        return playstoreService.findByReviewsAppname(name);
    }

    @RequestMapping(value = "/top10/free/{name}", method = RequestMethod.GET)
    public ArrayList<Playstore> freetenname(@PathVariable String name) {

        return playstoreService.findByTop10Free(name);
    }

    @RequestMapping(value = "/rating/5", method = RequestMethod.GET)
    public List<Playstore> rating5() {

        return playstoreService.findByRating5();
    }

    @RequestMapping(value = "/rating/4", method = RequestMethod.GET)
    public List<Playstore> rating4() {

        return playstoreService.findByRating4();
    }

    @RequestMapping(value = "/rating/3", method = RequestMethod.GET)
    public List<Playstore> rating3() {

        return playstoreService.findByRating3();
    }

    @RequestMapping(value = "/rating/2", method = RequestMethod.GET)
    public List<Playstore> rating2() {

        return playstoreService.findByRating2();
    }

    @RequestMapping(value = "/rating/1", method = RequestMethod.GET)
    public List<Playstore> rating1() {

        return playstoreService.findByRating1();
    }
}
