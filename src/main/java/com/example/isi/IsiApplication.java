package com.example.isi;

import com.example.isi.model.*;
import com.example.isi.serviceModel.*;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.apache.commons.logging.Log;
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

		// setUp
		ClassLoader classLoader = IsiApplication.class.getClassLoader();
		File file = new File(Objects.requireNonNull(classLoader.getResource("serviceAccountKey.json")).getFile());
		String decoded = URLDecoder.decode(file.getAbsolutePath(), StandardCharsets.UTF_8);
		System.out.println(decoded);
		FileInputStream serviceAccount = new FileInputStream(decoded);

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.build();

		FirebaseApp.initializeApp(options);

		/* TEST CRUD */
		// test createContract
		Contract myContract1 = new Contract(22, 2, 3, 4, 2, 2, 5, 5, 5, "21.12.2022", 2, 4, 50, "mobila", 1, 2);
		Contract myContract2 = new Contract(23, 23, 23, 23, 2, 2, 5, 5, 5, "21.12.2022", 2, 4, 50, "mobila", 1, 2);

		contractService.createContract(myContract1);

		// test deleteContract
		contractService.deleteContract("4");

		// test getContract
		Contract extractContract = contractService.getContract("1");

		// test updateContract
		String update = contractService.updateContract(myContract2);

		// get counter Contracts
		System.out.println(countersService.getCounter("countC"));

		// update counter Contracts
		// System.out.println(countersService.updateCounter("countC"));

		// createGoods
		Goods good1 = new Goods(12, "tamplarie");
		Goods good2 = new Goods(12, "caramida");
		goodsService.createGoods(good1);

		// updateGoods
		goodsService.updateGoods(good2);

		// deleteGoods
		goodsService.deleteGoods("12");

		// getGoods
		System.out.println(goodsService.getGoods("1").getType());

		// createRequest
		Requests request1 = new Requests("22/1/2022","22/1/2022", "22/1/2022", "22/1/2022", 1, 1, 2, 2, 2, 2, 2, "masini", 2, 2);
		Requests request2 = new Requests("02/1/2022","02/1/2022", "02/1/2022", "02/1/2022", 1, 1, 2, 2, 2, 2, 2, "masini", 2, 2);
		requestsService.createRequest(request1);

		// updateRequest
		requestsService.updateRequest(request2);

		// deleteRequest
		requestsService.deleteRequest("2");

		// getRequest
		System.out.println(requestsService.getRequest("1").getDateStart());

		// createSender
		Senders sender1 = new Senders(2, 2,3);
		Senders sender2 = new Senders(2, 2,5);
		sendersService.createSender(sender1);

		// updateSender
		sendersService.updateSender(sender2);

		// deleteSender
		sendersService.deleteSender("2");

		// getSender
		System.out.println(sendersService.getSender("1").getNrReq());

		// createTransporter
		Transporters trans1 = new Transporters(2, 2,3, 3);
		Transporters trans2 = new Transporters(2, 2,5, 5);
		transportersService.createTransporter(trans1);

		// updateTransporter
		transportersService.updateTransporter(trans2);

		// deleteTransporter
		transportersService.deleteTransporter("2");

		// getTransporter
		System.out.println(transportersService.getTransporter("1").getNrFreeTrucks());

		// createTransporter
		Trucks truck1 = new Trucks(2, "true","VW", 3, 1, 2, 1, 4, 4, 4, 4, 4, 4);
		Trucks truck2 = new Trucks(2, "false","AUDI", 3, 1, 2, 1, 4, 4, 4, 4, 4, 4);
		trucksService.createTruck(truck1);

		// updateTransporter
		trucksService.updateTruck(truck2);

		// deleteTransporter
		trucksService.deleteTruck("2");

		// getTransporter
		System.out.println(trucksService.getTruck("1").getBrand());

		// createUser
		Users user1 = new Users("4@yahoo.com", 4, "0765555222","transporters");
		Users user2 = new Users("5@yahoo.com", 4, "0765555111","transporters");
		usersService.createUser(user1);

		// updateUser
		usersService.updateUser(user2);

		// deleteUsers
		// usersService.deleteUsers("4");

		// getUser
		System.out.println(usersService.getUsers("1").getEmail());



		SpringApplication.run(IsiApplication.class, args);
	}

}
