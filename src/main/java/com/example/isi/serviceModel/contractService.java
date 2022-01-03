package com.example.isi.serviceModel;

import com.example.isi.model.Contract;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.FirebaseDatabase;

import javax.swing.*;
import javax.swing.text.Document;
import java.util.concurrent.ExecutionException;

public class contractService {

    public static String createContract(Contract contract) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture =  db.collection("Contract").document(contract.getId().toString()).set(contract);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String updateContract(Contract contract) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("Contract").document(contract.getId().toString()).set(contract);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public static String deleteContract(String documentId) {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = db.collection("Contract").document(documentId).delete();
        return "Successfully deleted" + documentId;
    }

    public static Contract getContract(String documentId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection("Contract").document(documentId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        Contract contract;
        if(document.exists()) {
            contract = document.toObject(Contract.class);
            return contract;
        }
        return null;
    }
}
