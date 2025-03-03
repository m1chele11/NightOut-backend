package com.nightout.app.security;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import com.google.firebase.auth.FirebaseAuth;
import org.springframework.stereotype.Service;


@Service
public class FirebaseAuthService {
    public FirebaseToken verifyToken(String idToken) throws FirebaseAuthException {
        // Verify the ID token
        return FirebaseAuth.getInstance().verifyIdToken(idToken);
    }
}
