package com.example.isi.serviceModel;

import com.example.isi.model.Goods;
import com.example.isi.model.Requests;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import java.util.concurrent.ExecutionException;

public class requestsService {
    public static String createRequest(Requests request) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture =  db.collection("Requests").document(request.getId().toString()).set(request);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String updateRequest(Requests request) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("Requests").document(request.getId().toString()).set(request);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String deleteRequest(String documentId) {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = db.collection("Requests").document(documentId).delete();
        return "Successfully deleted" + documentId;
    }

    public static Requests getRequest(String documentId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection("Requests").document(documentId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        Requests request;
        if(document.exists()) {
            request = document.toObject(Requests.class);
            return request;
        }
        return null;
    }

}
