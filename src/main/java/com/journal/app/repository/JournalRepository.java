package com.journal.app.repository;

import com.journal.app.model.Journal;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by User on 25/09/2017.
 */
public interface JournalRepository extends MongoRepository<Journal,String>{
}
