package edu.mum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.Block;
import edu.mum.domain.Entry;
import edu.mum.repository.BlockRepository;



@Service
public class BlockService{
	
	@Autowired
	private BlockRepository blockRepository;
	@Autowired
	private EntryService entryService;
	

	public void saveBlock(Block block) {
		Entry currentEntry = entryService.getEntry(new Long(8));
		System.out.println(currentEntry.getEntryMonth());
		block.setEntry(currentEntry);
		currentEntry.getBlocks().add(block);
		entryService.saveEntry(currentEntry);
		blockRepository.save(block);
	}

	
	public Block getBlock(String blockMonth) {
		return blockRepository.findBlockByBlockMonth(blockMonth);
	}

	
	public List<Block> getAllBlock() {
		return (List<Block>) blockRepository.findAll();
	}

	public Block getBlockById(Long id) {
		return blockRepository.findOne(id);
	}

	
	public void deleteBlock(Long id) {
		blockRepository.delete(id);
	}

	
	public void updateBlock(Block block) {
		blockRepository.save(block);
		
	}
}
