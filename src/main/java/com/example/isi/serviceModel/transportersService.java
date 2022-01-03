package com.example.isi.serviceModel;

import com.example.isi.model.Senders;
import com.example.isi.model.Transporters;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import java.util.concurrent.ExecutionException;

public class transportersService {
    public static String createTransporter(Transporters transporter) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture =  db.collection("Transporters").document(transporter.getId().toString()).set(transporter);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String updateTransporter(Transporters transporter) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("Transporters").document(transporter.getId().toString()).set(transporter);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String deleteTransporter(String documentId) {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = db.collection("Transporters").document(documentId).delete();
        return "Successfully deleted" + documentId;
    }

    public static Transporters getTransporter(String documentId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection("Transporters").document(documentId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        Transporters transporter;
        if(document.exists()) {
            transporter = document.toObject(Transporters.class);
            return transporter;
        }
        return null;
    }
}
