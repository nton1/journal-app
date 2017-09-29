package com.journal.app.rest;

import com.journal.app.model.Journal;
import com.journal.app.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by User on 25/09/2017.
 */
@RestController
@RequestMapping("/api")
public class JournalController {

    @Autowired
    private JournalRepository journalRepository;

    @RequestMapping("/journal")
    public List<Journal> getAll(){
        List<Journal> journals = this.journalRepository.findAll();
        return  journals;
    }
}
