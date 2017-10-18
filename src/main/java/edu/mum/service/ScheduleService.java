package edu.mum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.domain.Block;
import edu.mum.domain.Entry;
import edu.mum.domain.Schedule;

public class ScheduleService  {
	
	@Autowired
    private EntryService entryService;
	private ScheduleSectionCreator sectionHelper;
    
    
    
    
	public Schedule generateSched(String entryMon) {
	Entry entry = (Entry) entryService.getEntryByMonth(entryMon);
			entry.getBlocks().forEach(sectionHelper::createSectionForBlock);
		
		
		
		
		
		
		
		
		return null;
	}
	
	

}
