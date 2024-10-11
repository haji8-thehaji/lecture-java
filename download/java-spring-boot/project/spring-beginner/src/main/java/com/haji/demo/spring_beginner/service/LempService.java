package com.haji.demo.spring_beginner.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haji.demo.spring_beginner.model.Lemp2;
import com.haji.repository.LempRepository;
@Service
public class LempService {	

    // @Autowired
	// LempRepository lempRepository;

    public LempService(){
        // lemps.add(new Lemp("1", "ON", ON.getInstance()));
        Lemp2 Lemp2 = new Lemp2("2", "OFF");
        lemps.add(Lemp2);
        lempMap.put(Lemp2.getLempId(), Lemp2);
        // lemps.add(new Lemp("3", "ON", ON.getInstance()));
        Lemp2 Lemp4 = new Lemp2("4", "OFF");
        lemps.add(Lemp4);
        lempMap.put(Lemp4.getLempId(), Lemp4);
        
		// model.addAttribute("allLemps", lemps);

    }
    List<Lemp2> lemps = new ArrayList<Lemp2>();
    // public List<Lemp> init(){
    //     return this.lemps;
    // }
    public List<Lemp2> getLemps(){
        return lemps;
    }
    Map<String, Lemp2> lempMap = new HashMap<String, Lemp2>();
    public Lemp2 getLemp(String lempId){
        if(lempMap.containsKey(lempId)){

            return lempMap.get(lempId);
        }
        return null;
    }


}
