package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DocumentDao;
import com.example.demo.model.Document;
import com.example.demo.model.Phase;
@RestController
public class DocumentService {
	
	@Autowired
	DocumentDao documentDao;
	
	
	@RequestMapping(value = "/document", method = RequestMethod.POST)
	public Document saveDoc(@RequestBody Document doc) {
		documentDao.save(doc);
		return doc;
	}

	@RequestMapping(value = "/document", method = RequestMethod.PUT)
	public Document updateDoc(@RequestBody Document doc) {
		documentDao.save(doc);
		return doc;
	}

	@RequestMapping(value = "/document", method = RequestMethod.GET)
	public List<Document> getDocs() {
		return documentDao.findAll();
	}

	@RequestMapping(value = "/document/{id}", method = RequestMethod.GET)
	public Document getDoc(@PathVariable Long id) {
		return documentDao.findOne(id);
	}

	@RequestMapping(value = "/document/{id}", method = RequestMethod.DELETE)
	public void deleteDoc(@PathVariable Long id) {
		documentDao.delete(id);
	}

	}


