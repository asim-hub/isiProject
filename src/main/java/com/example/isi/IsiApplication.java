package com.example.isi;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class IsiApplication {

	public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
		ClassLoader classLoader = IsiApplication.class.getClassLoader();

		File file = new File(Objects.requireNonNull(classLoader.getResource("serviceAccountKey.json")).getFile());
		String decoded = URLDecoder.decode(file.getAbsolutePath(), StandardCharsets.UTF_8);
		System.out.println(decoded);
		FileInputStream serviceAccount = new FileInputStream(decoded);

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.build();

		FirebaseApp.initializeApp(options);

		// extract data
		Firestore db = FirestoreClient.getFirestore();
		CollectionReference users = db.collection("Users");
		Query query = users.whereEqualTo("type", "admin");
		// retrieve  query results asynchronously using query.get()
		ApiFuture<QuerySnapshot> querySnapshot = query.get();

		Map<String, Object> my_map = null;
		for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
			System.out.println(document.getData().get("email"));
			my_map = new HashMap<String, Object>(document.getData());
		}

		// insert data
		Map<String, Object> docData = new HashMap<>();
		docData.put("email", my_map.get("email"));
		docData.put("id", "1");
		docData.put("telefon", "0758712345");
		docData.put("type", "admin");
//		docData.put("regions", Arrays.asList("west_coast", "socal"));
		// Add a new document (asynchronously) in collection "cities" with id "LA"
		ApiFuture<WriteResult> future = db.collection("Users").document("1").set(docData);

		SpringApplication.run(IsiApplication.class, args);
	}

}
