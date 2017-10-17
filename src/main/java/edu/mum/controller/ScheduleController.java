package edu.mum.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ScheduleController {

	// inject via application.properties
	//@Autowired
	//EntryService entryService;
	//ScheduleService scheduleService;
	
	@RequestMapping("/schedule/list")
	public String scheduleList(Map<String, Object> model) {
		
		//model.put("schedules", scheduleService.getAllSchedule());
		return "schedules";
	}
	
	@RequestMapping("/schedule/create")
	public String createSchedule(Map<String, Object> model) {
		// entryService.getAllEntry()
		//model.put("entries", entryService.getAllEntry());
		return "generateSched";
	}
	@RequestMapping(value="/schedule/create", method = RequestMethod.POST)
	//,@ModelAttribute("newEntry") Entry entry
	public String generateSchedule(Map<String, Object> model) {
		// Schedule schedule = scheduleService.generateSched(entry)
		//model.put("entries", entryService.getAllEntry());
		return "schedules";
	}
	@RequestMapping(value="/schedule/edit", method = RequestMethod.POST)
	//,@ModelAttribute("newEntry") Entry entry
	public String editSchedule(Map<String, Object> model) {
		// Schedule schedule = scheduleService.generateSched(entry)
		//model.put("entries", entryService.getAllEntry());
		return "schedules";
	}
	


}

