package com.example.isi.serviceModel;

import com.example.isi.model.Transporters;
import com.example.isi.model.Trucks;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import javax.sound.midi.Track;
import java.util.concurrent.ExecutionException;

public class trucksService {
    public static String createTruck(Trucks truck) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture =  db.collection("Trucks").document(truck.getId().toString()).set(truck);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String updateTruck(Trucks truck) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("Trucks").document(truck.getId().toString()).set(truck);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String deleteTruck(String documentId) {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = db.collection("Trucks").document(documentId).delete();
        return "Successfully deleted" + documentId;
    }

    public static Trucks getTruck(String documentId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection("Trucks").document(documentId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        Trucks truck;
        if(document.exists()) {
            truck = document.toObject(Trucks.class);
            return truck;
        }
        return null;
    }
}
