package com.example.isi.serviceModel;

import com.example.isi.model.Requests;
import com.example.isi.model.Senders;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import java.util.concurrent.ExecutionException;

public class sendersService {
    public static String createSender(Senders sender) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture =  db.collection("Senders").document(sender.getId().toString()).set(sender);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String updateSender(Senders sender) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("Senders").document(sender.getId().toString()).set(sender);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String deleteSender(String documentId) {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = db.collection("Senders").document(documentId).delete();
        return "Successfully deleted" + documentId;
    }

    public static Senders getSender(String documentId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection("Senders").document(documentId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        Senders sender;
        if(document.exists()) {
            sender = document.toObject(Senders.class);
            return sender;
        }
        return null;
    }
}
