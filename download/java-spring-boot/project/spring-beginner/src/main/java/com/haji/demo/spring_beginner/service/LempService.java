package com.haji.demo.spring_beginner.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.haji.demo.spring_beginner.common.OFF;
import com.haji.demo.spring_beginner.model.Lemp;
@Service
public class LempService {
    LempService(){
        // lemps.add(new Lemp("1", "ON", ON.getInstance()));
        Lemp Lemp2 = new Lemp("2", "OFF", OFF.getInstance());
        lemps.add(Lemp2);
        lempMap.put(Lemp2.getLempId(), Lemp2);
        // lemps.add(new Lemp("3", "ON", ON.getInstance()));
        Lemp Lemp4 = new Lemp("4", "OFF", OFF.getInstance());
        lemps.add(Lemp4);
        lempMap.put(Lemp4.getLempId(), Lemp4);
        
		// model.addAttribute("allLemps", lemps);

    }
    List<Lemp> lemps = new ArrayList<Lemp>();
    // public List<Lemp> init(){
    //     return this.lemps;
    // }
    public List<Lemp> getLemps(){
        return lemps;
    }
    Map<String, Lemp> lempMap = new HashMap<String, Lemp>();
    public Lemp getLemp(String lempId){
        if(lempMap.containsKey(lempId)){

            return lempMap.get(lempId);
        }
        return null;
    }


}
