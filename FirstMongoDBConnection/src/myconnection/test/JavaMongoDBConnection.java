package myconnection.test;


 
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
 
public class JavaMongoDBConnection {
 
    public static void main(String[] args) {
    	MongoClient mongoClient = new MongoClient("localhost", 27017);		 
		List<String> databases = mongoClient.getDatabaseNames();
		 
		
		JavaMongoDBConnection connection=new JavaMongoDBConnection();
		
		connection.showDatabases(mongoClient);
		Scanner sc=new Scanner(System.in);
		/*
		String database=sc.nextLine();
		connection.showCollectionsname(mongoClient,database);
		System.out.println("Enter database name\n");
		String database1=sc.nextLine();
		System.out.println("enter commection name\n");
		String collectionName=sc.nextLine();
		
		
		connection.getCollection(mongoClient,database1,collectionName);*/
		
		System.out.println("We are going to insert value in collection\n");
		System.out.println("Enter database name\n");
		String database2=sc.nextLine();
		System.out.println("enter collction name\n");
		
		String collectionName2=sc.nextLine();
		connection.insertIntoCollection(mongoClient,database2,collectionName2);
		
		/*for(String dbname:databases)
		{
			DB database=mongoClient.getDB(dbname);
			Set<String> collections= database.getCollectionNames();
			int i=0;
			for(String collection: collections)
			{
				i++;
				
				System.out.println("Collection "+i+":"+collection+"/n");
			}
		
		}
		 
		for (String dbName : databases) {
		    System.out.println("- Database: " + dbName);
		     
		    DB db = mongoClient.getDB(dbName);
		     
		    Set<String> collections = db.getCollectionNames();
		    for (String colName : collections) {
		        System.out.println("\t + Collection: " + colName);
		    }
		}*/
		 
		mongoClient.close();
	   
    }

	private void insertIntoCollection(MongoClient mongoClient, String database2, String collectionName2) {
		// TODO Auto-generated method stub
		
		DB db=mongoClient.getDB(database2);
		DBCollection collection=db.getCollection(collectionName2);
		BasicDBObject document=new BasicDBObject();
		document.put("name", "riya");
		document.put("age", 21);
		document.put("createdDate", new Date());
		
		BasicDBObject addressDetail=new BasicDBObject();
		addressDetail.put("country","india");
		addressDetail.put("state", "Madhya Pradesh");
		addressDetail.put("District", "Seoni");
		document.put("Address details", addressDetail);
		collection.insert(document);
		DBCursor cursor=collection.find();
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}
		
		
		
		
		
	}

	private void getCollection(MongoClient mongoClient, String database1, String collectionName) {
		// TODO Auto-generated method stub
		
		DB db=mongoClient.getDB(database1);
		DBCollection table=db.getCollection(collectionName);
		System.out.println(table);
		
		
	}

	private void showCollectionsname(MongoClient mongoClient, String database) {
		// TODO Auto-generated method stub
		DB db=mongoClient.getDB(database);
		Set<String> collections=db.getCollectionNames();
		for(String s:collections)
		{
			System.out.println(s);
		}
		
		
	}

	private void showDatabases(MongoClient mongoClient) 
	{
		// TODO Auto-generated method stub
		
		List<String> databases=mongoClient.getDatabaseNames();
		int i=0;
		for(String database:databases)
		{
			i++;
			System.out.println(i+":  database is "+database);
		}
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
}