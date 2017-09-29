package com.journal.app.config;

import com.journal.app.model.Journal;
import com.journal.app.repository.JournalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 25/09/2017.
 */
@Component
public class DbSeeder implements CommandLineRunner{

    private JournalRepository journalRepository;

    public DbSeeder(JournalRepository journalRepository){
        this.journalRepository = journalRepository;
    }


    @Override
    public void run(String... strings) throws Exception {
        Journal firstJournal = new Journal("Get to know Spring Boot","01/02/2016","Today I will learn Spring Boot");
        Journal secondJournal = new Journal("Spring Boot Reading","02/04/2016","Read more about Spring Boot");
        Journal thirdJournal = new Journal("Spring Boot in the Cloud","03/06/2016","Spring Boot using Cloud Foundry");

        //drop all Journals
        this.journalRepository.deleteAll();
        List<Journal> journals = Arrays.asList(firstJournal,secondJournal,thirdJournal);
        this.journalRepository.save(journals);

    }
}
