package com.journal.app.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 25/09/2017.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "Journals")
public class Journal {

    @Id
    private String id;

    private String title;
    private Date date_created;
    private String short_date_created;
    private String summary;

    @JsonIgnore
    @Transient
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    public Journal(String title,String date_created, String summary) throws ParseException{
        this.title = title;
        this.date_created = formatDate.parse(date_created);
        this.short_date_created = date_created;
        this.summary = summary;
    }
}
