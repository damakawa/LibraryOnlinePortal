package com.lanaebk.library.config;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.net.UnknownHostException;


/**
 * Created by Lanae on 4/24/2016.*/


public class Mongo
{
    DB database;
    MongoClientURI connectionString;
    MongoClient mongoClient;

    public Mongo() throws UnknownHostException {
        this.connectionString = new MongoClientURI("mongodb://admin:password@ds015478.mlab.com:15478");
        this.mongoClient = new MongoClient(connectionString);
        this.database = mongoClient.getDB("library385");
    }

    public DB getDB()
    {
        return database;
    }

    public DBCollection getCollection (String collName)
    {
        return database.getCollection(collName);
    }

    public Document book(MongoCollection<Document> books)
    {
        return books.find().first();
    }

}
