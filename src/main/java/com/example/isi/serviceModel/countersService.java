package com.example.isi.serviceModel;
import com.example.isi.model.Contract;
import com.example.isi.model.Counters;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.concurrent.ExecutionException;

public class countersService {

    public static String updateCounter(String documentId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        Counters count = new Counters(getCounter(documentId) + 1);
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("Counters").document(documentId).set(count);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static Integer getCounter(String documentId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection("Counters").document(documentId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        Counters counter;
        if(document.exists()) {
            counter = document.toObject(Counters.class);
            return counter.getNr();
        }
        return -1;
    }
}
