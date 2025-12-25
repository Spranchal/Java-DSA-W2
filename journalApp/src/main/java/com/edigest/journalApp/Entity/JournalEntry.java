package com.edigest.journalApp.Entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "journal_entries")
public class JournalEntry {

    @Id
    private ObjectId id;

    public ObjectId getId() {return id;}

    public void setId(ObjectId id) {this.id = id;}

    private String title;

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    private String content;

    public String getContent() {return content;}

    public void setContent(String content) {this.content = content;}

    private LocalDateTime date;
    
    public LocalDateTime getDate() {return date;}

    public void setDate(LocalDateTime date) {this.date = date;}
    

}
