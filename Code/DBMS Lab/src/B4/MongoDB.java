package B4;

import com.mongodb.*; 

public class MongoDB {
 public static void main( String args[] ) { 
	 try{ 
		 	//create connection
			MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
			
			//create database
			DB db = mongo.getDB( "dbms" ); 
			System.out.println("Connect to database successfully"); 
			
			//create collection
			DBCollection col1=db.getCollection("jdbc"); 
			System.out.println("collection created"); 
			
			//insert document
			//creating object
			BasicDBObject doc1 = new BasicDBObject(); 
			doc1.put("name", "shraddha"); 
			doc1.put("website", "google.com"); 
			//creating object
			BasicDBObject doc2 = new BasicDBObject(); 
			doc2.put("addressLine1", "Sweet Home"); 
			doc2.put("addressLine2", "Karol Bagh"); 
			doc2.put("addressLine3", "New Delhi, India"); 

			//inserting objects in collection
			col1.insert(new BasicDBObject[] {doc1,doc2});
			
			
	  }catch(Exception e){ 
			System.err.println( e.getClass().getName() + ": " + e.getMessage() ); 
	  } 
   } 
}
