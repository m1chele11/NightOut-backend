package com.nightout.app.service;
import com.google.firebase.auth.FirebaseAuth;
import org.springframework.stereotype.Service;



@Service
public class FirebaseService {
    public String checkFirebase(){
        return FirebaseAuth.getInstance() != null ? "Firebase is initialized" : "Firebase is not initialized";
    }
}
