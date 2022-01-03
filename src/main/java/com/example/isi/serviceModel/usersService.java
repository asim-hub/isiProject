package com.example.isi.serviceModel;

import com.example.isi.model.Trucks;
import com.example.isi.model.Users;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import java.util.concurrent.ExecutionException;

public class usersService {

    public static String createUser(Users user) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture =  db.collection("Users").document(user.getId().toString()).set(user);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String updateUser(Users user) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("Users").document(user.getId().toString()).set(user);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String deleteUsers(String documentId) {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = db.collection("Users").document(documentId).delete();
        return "Successfully deleted" + documentId;
    }

    public static Users getUsers(String documentId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection("Users").document(documentId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        Users user;
        if(document.exists()) {
            user = document.toObject(Users.class);
            return user;
        }
        return null;
    }
}
