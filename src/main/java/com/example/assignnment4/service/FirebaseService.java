package com.example.assignnment4.service;

import com.example.assignnment4.model.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FirebaseService {




public FirebaseUser authenticate(String idToken) throws IOException, FirebaseAuthException {

   String uid= FirebaseAuth.getInstance().verifyIdToken(idToken).getUid();
    String email= FirebaseAuth.getInstance().verifyIdToken(idToken).getEmail();
    String name= FirebaseAuth.getInstance().verifyIdToken(idToken).getName();
    return  new FirebaseUser(uid,name,email);
}
}
